package lk.ijse.culinary.dao.custom;

import lk.ijse.culinary.dao.CrudDAO;
import lk.ijse.culinary.entity.Course;

public interface CourseDAO extends CrudDAO<Course> {
    Course searchByCourseName(String courseName) throws Exception;
}
