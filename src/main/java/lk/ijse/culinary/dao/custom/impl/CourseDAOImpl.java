package lk.ijse.culinary.dao.custom.impl;

import lk.ijse.culinary.dao.custom.CourseDAO;
import lk.ijse.culinary.entity.Course;
import org.hibernate.Session;
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
        String hql = "FROM Course";
        Query<Course> query = session.createQuery(hql, Course.class);
        return query.list();
    }

    @Override
    public void save(Course entity) {

    }

    @Override
    public void update(Course entity) {

    }

    @Override
    public void delete(Course entity) {

    }

    @Override
    public Course search(String id) {
        return session.get(Course.class, id);
    }


}
