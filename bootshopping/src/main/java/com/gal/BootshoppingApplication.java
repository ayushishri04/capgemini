package com.gal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gal.model.Anorder;
import com.gal.service.AnorderService;

@SpringBootApplication
public class BootshoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootshoppingApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AnorderService service) {
        return args -> {

            System.out.println("add");
            Anorder o = new Anorder();
            o.setOrderid(201);
            o.setCustid(24);
            o.setPaymentid(10);  
            o.setNumberItems(5);
            service.add(o);

            System.out.println("find");

            Anorder order = service.find(200);
            if(order != null) {
                System.out.println(order);
            } else {
                System.out.println("Order not found");
            }


            System.out.println("update");

            Anorder update = service.find(201);

            if(update != null) {
                update.setCustid(24);
                update.setPaymentid(10);
                update.setNumberItems(8);

                service.add(update);
                System.out.println("Order updated");
            } else {
                System.out.println("Order not found for update");
            }

            System.out.println("findall");

            service.findAll().forEach(System.out::println);


            System.out.println("delete");

            service.delete(101);
            
        };
    }
}