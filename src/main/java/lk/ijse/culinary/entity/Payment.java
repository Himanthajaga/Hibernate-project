package lk.ijse.culinary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    private Long paymentID;

    @ManyToOne
    @JoinColumn(name = "student_course_id")
    private StudentCourse studentCourse;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "payment")
    private Double payment;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "status")
    private String status;

    @Column(name = "upfront_amount")
    private double upfrontAmount;

    @Column(name = "balance_amount")
    private double balanceAmount;

}
