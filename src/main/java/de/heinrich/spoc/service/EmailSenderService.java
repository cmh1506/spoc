package de.heinrich.spoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;
    public void sendEmail(String adresse, String body, String subject){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("claus.m.heinrich@gmail.com");
        mailMessage.setTo(adresse);
        mailMessage.setText(body);
        mailMessage.setSubject(subject);
        javaMailSender.send(mailMessage);
    }
}
