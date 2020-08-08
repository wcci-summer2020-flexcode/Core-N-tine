package corentine.demo.controllers;

import corentine.demo.EmailConfig;
import corentine.demo.models.FeedBack;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.xml.bind.ValidationException;


@RestController
public class FeedbackController {

    private EmailConfig emailConfig;

    public FeedbackController(EmailConfig emailConfig) {
        this.emailConfig = emailConfig;
    }

    @PostMapping(value = "/contactUs/feedback")
    public RedirectView sendFeedback(@RequestParam String name, @RequestParam String email, @RequestParam String feedback) throws ValidationException {
        FeedBack object = new FeedBack(name, email, feedback);

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(this.emailConfig.getHost());
        mailSender.setPort(this.emailConfig.getPort());
        mailSender.setUsername(this.emailConfig.getUsername());
        mailSender.setPassword(this.emailConfig.getPassword());

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(object.getEmail());
        mailMessage.setTo("9b8d8251f9-bc349d@inbox.mailtrap.io");
        mailMessage.setSubject("New feedback from " + object.getName());
        mailMessage.setText(object.getFeedback());

        mailSender.send(mailMessage);

        return new RedirectView("http://localhost:8080/home.html");

        }

    }

