package lk.ijse.culinary.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "courseID",length = 30)
    private String courseID;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseType")
    private String courseType;
    @Column(name = "courseDuration")
    private String courseDuration;
    @Column(name = "courseFee")
    private String courseFee;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER ,mappedBy = "courses")
    private List<Student> students = new ArrayList<>();


    public Course() {
    }

    public Course(String courseID, String courseName, String courseType, String courseDuration, String courseFee) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                '}';
    }
}
