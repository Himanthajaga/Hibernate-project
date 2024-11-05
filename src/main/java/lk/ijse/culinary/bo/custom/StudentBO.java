package lk.ijse.culinary.bo.custom;

import lk.ijse.culinary.bo.SuperBO;
import lk.ijse.culinary.dto.AdminDto;
import lk.ijse.culinary.dto.StudentDto;

import java.util.List;

public interface StudentBO extends SuperBO {
    boolean saveStudent(StudentDto dto);
    boolean updateStudent(StudentDto dto);
    boolean deleteStudent(String id);
    List<StudentDto> getAllStudent();
    boolean isStudentExist(StudentDto dto);
}
