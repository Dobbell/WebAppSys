package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private String message;

    private static final Logger log = LoggerFactory.getLogger(MessageService.class); // versuch


    public String getMessage() {
        return message ;// log.debug(MessageService.getMessage(message)) ;
    }
    public   void setMessage(String message) {
        this.message = message;
    }
}
