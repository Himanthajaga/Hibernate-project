package lk.ijse.culinary.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id", length = 30)
    private String id;
    @Column(name = "student_email")
    private String email;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_address")
    private String address;
    @Column(name = "student_course")
    private String course;
    @Column(name = "student_contact")
    private String contact;
    @Column(name = "student_dob")
    private String dob;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
    private List<StudentCourse> studentCourses = new ArrayList<>();


    public Student(String id, String email, String name, String address, String course, String dob, String contact) {
    }
}