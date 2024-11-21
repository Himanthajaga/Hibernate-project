package lk.ijse.culinary.dto;

import lk.ijse.culinary.entity.Student;
import lk.ijse.culinary.entity.StudentCourse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDto {
    private String paymentID;
    private StudentCourse studentCourseid;
    private Student studentId;
    private Double payment;
    private Date paymentDate;
    private String status;
    private double upfront_amount;
    private double balance_amount;
}
