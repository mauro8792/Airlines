package com.UTN.TP_N5;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.ModelsTP5.Model")
public class
TpN5Application {
	public static ModelMapper modelMapper;
	public static void main(String[] args) {
		modelMapper = new ModelMapper();
		SpringApplication.run(TpN5Application.class, args);

	}

}
