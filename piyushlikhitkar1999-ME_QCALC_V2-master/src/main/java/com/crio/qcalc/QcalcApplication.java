package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calc = new StandardCalculator();
		calc.add(Double.MAX_VALUE, 1);
		System.out.println(calc.getResult());
		//System.out.println("Piyush Likhitkar is having package of 20 cr at age of 25");
	}

}
