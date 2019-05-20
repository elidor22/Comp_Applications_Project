package com.example.Elidor_Varosi.Trade_Like_A_Pro;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import GUI_Package.GUI;

@SpringBootApplication
public class TradeLikeAProApplication {

	private static final Logger log = LoggerFactory.getLogger(TradeLikeAProApplication.class);

	public static void doit(String[] args) {

		//Declares the class as a Spring configuration
		SpringApplication.run(TradeLikeAProApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		Fixer_Data fixerIo = restTemplate.getForObject("http://data.fixer.io/api/latest?access_key=d8489e03562e6045941235c32b628436&symbols=ALL,CAD,USD,GBP,AUD,JPY,CHF", Fixer_Data.class);
		System.out.println(fixerIo.toString());
		GUI.thisString=fixerIo.toString();//Gets the data from this package to GUI


	}

}

