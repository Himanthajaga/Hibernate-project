package lk.ijse.culinary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_ID")
    private String paymentID;

    @ManyToOne
    @JoinColumn(name = "student_course_id")
    private StudentCourse studentCourseid;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @Column(name = "payment")
    private Double payment;

    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "status")
    private String status;
    @Column(name = "upfront_amount")
    private double upfront_amount;
    @Column(name = "balance_amount")
    private double balance_amount;

}
