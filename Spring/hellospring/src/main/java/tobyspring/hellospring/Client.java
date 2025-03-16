package tobyspring.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) throws IOException {
        //PaymentService paymentService = new WebApiExRatePaymentService();
        //PaymentService paymentService = new PaymentService(new WebApiExRateProvider());

        //ObjectFactory objectFactory = new ObjectFactory();
        //PaymentService paymentService = objectFactory.paymentService();

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ObjectFactory.class);
        PaymentService paymentService = beanFactory.getBean(PaymentService.class);

        Payment payment = paymentService.prepare(100L,"USD", BigDecimal.valueOf(50.7));
        System.out.println(payment);


    }
}
