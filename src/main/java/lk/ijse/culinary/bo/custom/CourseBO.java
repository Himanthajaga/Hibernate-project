package lk.ijse.culinary.bo.custom;

import lk.ijse.culinary.bo.SuperBO;
import lk.ijse.culinary.dto.CourseDto;

import java.util.List;

public interface CourseBO extends SuperBO {
    boolean saveCourse(CourseDto dto);
    boolean updateCourse(CourseDto dto);
    boolean deleteCourse(String id);
    List<CourseDto> getAllCourse();
    boolean isCourseExist(CourseDto dto);
}
