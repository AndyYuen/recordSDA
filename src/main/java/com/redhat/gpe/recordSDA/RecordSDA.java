package com.redhat.gpe.recordSDA;

import java.util.Random;

import javax.jws.WebService;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@WebService(targetNamespace="urn:com.redhat.gpe.recordSDA:1.0", serviceName="RecordSDA", portName="RecordSDAPort")
public class RecordSDA implements IRecordSDA {
    
    private Logger log = LoggerFactory.getLogger("RecordSDA");
    
    private Random random = new Random();


    public String recordSDA() {
        log.info("recordSDA invoked!");
        String result = "OK";
        if (random.nextInt(10) >= 3) {
        	if (random.nextInt(3) >=1) {
//        		log.info("RetryableError...");
        		result = "RetryableError";
        	} else {
//        		log.info("NonRetryableError...");
        		result = "NonRetryableError";
        	}
        }
        log.info("recordSDA result: " + result);
        return result;
    }


}
