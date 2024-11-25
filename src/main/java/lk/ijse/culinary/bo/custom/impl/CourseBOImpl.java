package lk.ijse.culinary.bo.custom.impl;

import lk.ijse.culinary.bo.custom.CourseBO;
import lk.ijse.culinary.dao.DAOFactory;
import lk.ijse.culinary.dao.custom.CourseDAO;
import lk.ijse.culinary.dao.custom.UserDAO;
import lk.ijse.culinary.dto.AdminDto;
import lk.ijse.culinary.dto.CourseDto;
import lk.ijse.culinary.entity.Course;
import lk.ijse.culinary.entity.User;
import lk.ijse.culinary.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseBOImpl implements CourseBO {
    private Session session;

    CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    @Override
    public boolean saveCourse(CourseDto dto) {
        session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            courseDAO.setSession(session);
            courseDAO.save(new Course(dto.getCourseID(),dto.getCourseName(),dto.getCourseDuration(),dto.getCourseFee()));
            transaction.commit();
            return true;
        }catch (Exception e){
            transaction.rollback();
            return false;
        }finally {
            session.close();
        }
    }

    @Override
    public boolean updateCourse(CourseDto dto) {
        return false;
    }

    @Override
    public boolean deleteCourse(String id) {
        return false;
    }

    @Override
    public List<CourseDto> getAllCourse() {
        return null;
    }

    @Override
    public boolean isCourseExist(CourseDto dto) {
        return false;
    }
}
