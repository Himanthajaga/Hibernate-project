package lk.ijse.culinary.dao.custom.impl;

import lk.ijse.culinary.dao.custom.CourseDAO;
import lk.ijse.culinary.entity.Course;
import lk.ijse.culinary.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }
    @Override
    public List<Course> getAll() {
        session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "FROM Course";
            List<Course> courses = session.createQuery(hql, Course.class).list();
            transaction.commit();
            return courses;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public void save(Course entity) {

      session.save(entity);
    }

    @Override
    public void update(Course entity) {

       session.update(entity);
    }

    @Override
    public void delete(Course entity) {

        session.delete(entity);
    }

    @Override
    public Course search(String id) {
        return session.get(Course.class, id);
    }

    @Override
    public String generateNextId() {
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        String nextId = "";

        try {
            Object item = session.createQuery("SELECT courseID FROM Course ORDER BY courseID DESC").setMaxResults(1).uniqueResult();

            if (item != null) {
                String itemCode = item.toString();


                if (itemCode.startsWith("CA") && itemCode.length() > 2) {

                    int idNum = Integer.parseInt(itemCode.substring(2));
                    nextId = "CA" + String.format("%04d", ++idNum);
                } else {

                    nextId = "CA1001";
                }
            } else {
                nextId = "CA1001";
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return nextId;
    }

    @Override
    public List<String> getIds() {
        return null;
    }


    @Override
    public Course searchByCourseName(String courseName) throws Exception {
        return null;
    }
}
