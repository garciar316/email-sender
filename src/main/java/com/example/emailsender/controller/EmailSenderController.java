package com.example.emailsender.controller;

import com.example.emailsender.model.Email;
import com.example.emailsender.service.MailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmailSenderController {

    MailSenderService senderService;

    public EmailSenderController(MailSenderService senderService) {
        this.senderService = senderService;
    }
    @PostMapping
    public ResponseEntity<String> sedEmail(@RequestBody Email email) {
        senderService.sendSimpleEmail(email);
        return ResponseEntity.ok().build();
    }
}
