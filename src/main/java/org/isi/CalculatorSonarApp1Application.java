package org.isi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorSonarApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorSonarApp1Application.class, args);
        String master = "Master ISI Promo 19/22";
        double n1 = 8;
        double res = n1 * 3;
        System.out.println(res);
    }

}
