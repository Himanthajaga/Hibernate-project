package lk.ijse.culinary.dao.custom.impl;

import lk.ijse.culinary.dao.custom.StudentDAO;
import lk.ijse.culinary.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public List<Student> getAll() {
        String hql = "FROM Student";
        Query<Student> query = session.createQuery(hql, Student.class);
        return query.list();
    }

    @Override
    public boolean save(Student entity) {
        session.save(entity);
        return false;
    }

    @Override
    public void update(Student entity) {
        session.update(entity);
    }

    @Override
    public void delete(Student entity) {
        session.delete(entity);
    }

    @Override
    public Student search(String id) {
        return session.get(Student.class, id);
    }

    @Override
    public List<Student> getStudentsWithOverdueBooks() {
        return null;
    }

    @Override
    public int updateStudentEmail(String email, String oldEmail) {
        String hql = "UPDATE Student set email = :email WHERE email = :oldEmail";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        query.setParameter("oldEmail", oldEmail);
        int result = query.executeUpdate();
        return result;
    }
}