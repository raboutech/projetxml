package urouen.sepaClient.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import urouen.sepaClient.model.SEPA;


public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        SEPA sepa= restTemplate.getForObject("http://localhost:8080/sepa/resume", SEPA.class);
        log.info(sepa.toString());
    }
}
