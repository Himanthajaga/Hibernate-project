package lk.ijse.culinary.bo.custom.impl;

import lk.ijse.culinary.bo.custom.CourseBO;
import lk.ijse.culinary.dto.AdminDto;
import lk.ijse.culinary.dto.CourseDto;

import java.util.List;

public class CourseBOImpl implements CourseBO {
    @Override
    public boolean saveCourse(CourseDto dto) {
        return false;
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
    public List<AdminDto> getAllCourse() {
        return null;
    }

    @Override
    public boolean isCourseExist(CourseDto dto) {
        return false;
    }
}
