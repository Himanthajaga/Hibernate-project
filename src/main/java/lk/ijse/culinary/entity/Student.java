package lk.ijse.culinary.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
    private List<StudentCourse> courses = new ArrayList<>();


}