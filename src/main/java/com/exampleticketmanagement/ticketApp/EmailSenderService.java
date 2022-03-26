package com.exampleticketmanagement.ticketApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService
{
    @Autowired
    private JavaMailSender javaMailSender;

    public void _sendEmail(String toEmail, String emailBody, String subject)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("odcgescabinet@gmail.com");
        message.setTo(toEmail);
        message.setText(emailBody);
        message.setSubject(subject);
        javaMailSender.send(message);
    }
}
