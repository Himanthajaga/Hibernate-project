package lk.ijse.culinary.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "course_ID",length = 30)
    private String courseID;
    @Column(name = "course_Name")
    private String courseName;
    @Column(name = "course_Duration")
    private String courseDuration;
    @Column(name = "course_Fee")
    private String courseFee;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER ,mappedBy = "course")
    private List<StudentCourse> students = new ArrayList<>();



}
