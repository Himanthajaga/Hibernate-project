package lk.ijse.culinary.bo.custom;

import lk.ijse.culinary.bo.SuperBO;
import lk.ijse.culinary.dto.StudentCourseDto;

import java.sql.SQLException;
import java.util.List;

public interface StudentCourseBO extends SuperBO {
    public boolean saveStudenetCourse(StudentCourseDto dto) throws Exception;

    public boolean StudenetCourse(StudentCourseDto dto) throws Exception;

    public boolean StudenetCourse(String ID)throws Exception;

    List<StudentCourseDto>StudenetCourse() throws SQLException, ClassNotFoundException;

    public String generateNextId() throws SQLException, ClassNotFoundException;
}
