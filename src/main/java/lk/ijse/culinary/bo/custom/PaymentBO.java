package lk.ijse.culinary.bo.custom;

import lk.ijse.culinary.bo.SuperBO;
import lk.ijse.culinary.dto.PaymentDto;
import lk.ijse.culinary.dto.StudentDto;
import lk.ijse.culinary.entity.Payment;

import java.sql.SQLException;
import java.util.List;

public interface PaymentBO extends SuperBO {
    boolean savePayment(PaymentDto dto);

    boolean updatePayment(PaymentDto dto);

    boolean deletePayment(String id);

    List<PaymentDto> getAllPayment();

    boolean isPaymentExist(PaymentDto dto);

    Payment searchById(String id) throws SQLException, ClassNotFoundException;

    public String generateNextId() throws SQLException, ClassNotFoundException;

}
