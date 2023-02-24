//package com.cg.ecom.ecomapp;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Optional;
//import java.sql.Date;
//import java.time.LocalDate;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.cg.ecom.dto.PaymentDTO;
//import com.cg.ecom.entity.Cart;
//import com.cg.ecom.entity.Payment;
//import com.cg.ecom.entity.ProductItems;
//import com.cg.ecom.exceptions.ItemNotAvailableException;
//import com.cg.ecom.exceptions.PaymentNotFoundException;
//import com.cg.ecom.repository.CartRepository;
//import com.cg.ecom.repository.OrdersRepository;
//import com.cg.ecom.repository.PaymentRepository;
//import com.cg.ecom.repository.ProductItemsRepository;
//import com.cg.ecom.serviceimpl.PaymentServiceImpl;
//
//import org.junit.Before;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.BeanUtils;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//import static org.junit.Assert.*;
//
//@RunWith(MockitoJUnitRunner.class)
//public class PaymentServiceImplTest {
//
//    @Mock
//    private PaymentRepository paymentRepository;
//
//    @InjectMocks
//    private PaymentServiceImpl paymentService;
//
//    @Test
//    public void testDeletePayment() {
//        PaymentDTO paymentDTO = new PaymentDTO();
//        paymentDTO.setPaymentId(1);
//        Payment payment = new Payment();
//        payment.setPaymentId(1);
//        doNothing().when(paymentRepository).delete(payment);
//        boolean result = paymentService.deletePayment(paymentDTO);
//        assertTrue(result);
//    }
//
//    @Test
//    public void testGetById() {
//        int paymentId = 1;
//        Payment payment = new Payment();
//        payment.setPaymentId(paymentId);
//        Optional<Payment> optionalPayment = Optional.of(payment);
//        when(paymentRepository.findById(paymentId)).thenReturn(optionalPayment);
//        PaymentDTO expected = new PaymentDTO();
//        expected.setPaymentId(paymentId);
//        PaymentDTO result = paymentService.getById(paymentId);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testGetByIdNotFound() {
//        int paymentId = 1;
//        Optional<Payment> optionalPayment = Optional.empty();
//        when(paymentRepository.findById(paymentId)).thenReturn(optionalPayment);
//        paymentService.getById(paymentId);
//    }
//
//    @Test
//    public void testFindAll() {
//        List<Payment> paymentList = new ArrayList<>();
//        Payment payment1 = new Payment();
//        payment1.setPaymentId(1);
//        Payment payment2 = new Payment();
//        payment2.setPaymentId(2);
//        paymentList.add(payment1);
//        paymentList.add(payment2);
//        when(paymentRepository.findAll()).thenReturn(paymentList);
//        List<PaymentDTO> expected = new ArrayList<>();
//        PaymentDTO expected1 = new PaymentDTO();
//        expected1.setPaymentId(1);
//        PaymentDTO expected2 = new PaymentDTO();
//        expected2.setPaymentId(2);
//        expected.add(expected1);
//        expected.add(expected2);
//        List<PaymentDTO> result = paymentService.findAll();
//        assertEquals(expected, result);
//    }
//}
