package lk.ijse.culinary.entity;

import lombok.*;

import javax.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_ID")
    private String courseID;


    @Column(name = "course_Name")
    private String courseName;

    @Column(name = "course_Duration")
    private String courseDuration;
    @Column(name = "course_Fee")
    private Double courseFee;

}
