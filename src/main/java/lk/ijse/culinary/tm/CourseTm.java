package lk.ijse.culinary.tm;

public class CourseTm {
    private String courseID;
    private String courseName;
    private String courseType;
    private String courseDuration;
    private String courseFee;

    public CourseTm() {
    }

    public CourseTm(String courseID, String courseName, String courseType, String courseDuration, String courseFee) {
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
        return "CourseTm{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                '}';
    }
}
