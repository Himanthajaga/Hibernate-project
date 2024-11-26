package lk.ijse.culinary.entity;

import io.github.palexdev.materialfx.controls.MFXButton;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@ToString
@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "course_ID",length = 10)
    private String courseID;


    @Column(name = "course_Name")
    private String courseName;

    @Column(name = "course_Duration")
    private String courseDuration;
    @Column(name = "course_Fee")
    private Double courseFee;


}
