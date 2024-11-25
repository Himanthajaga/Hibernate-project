package lk.ijse.culinary.bo.custom.impl;

import lk.ijse.culinary.bo.custom.StudentBO;
import lk.ijse.culinary.dao.DAOFactory;
import lk.ijse.culinary.dao.custom.CourseDAO;
import lk.ijse.culinary.dao.custom.StudentDAO;
import lk.ijse.culinary.dto.AdminDto;
import lk.ijse.culinary.dto.StudentDto;
import lk.ijse.culinary.entity.Course;
import lk.ijse.culinary.entity.Student;
import lk.ijse.culinary.entity.User;
import lk.ijse.culinary.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentBOImpl implements StudentBO {
    private Session session;

    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public boolean saveStudent(StudentDto dto) {
        session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            studentDAO.setSession(session);
            studentDAO.save(new Student(dto.getId(),dto.getEmail(),dto.getName(),dto.getAddress(),dto.getCourse(),dto.getDob(),dto.getContact()));
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
    public boolean updateStudent(StudentDto dto) {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) {
        return false;
    }

    @Override
    public List<StudentDto> getAllStudent() {
        return null;
    }

    @Override
    public boolean isStudentExist(StudentDto dto) {
        return false;
    }
}