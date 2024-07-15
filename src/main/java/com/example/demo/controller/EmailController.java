package com.example.demo.controller;

import com.example.demo.service.EmailService;
import jakarta.mail.MessagingException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-15
 **/
@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @GetMapping("/simple")
    public ResponseEntity<String> simple() {
        emailService.sendSimpleMail();
        return ResponseEntity.ok("Simple email sent");
    }

    @GetMapping("/att")
    public ResponseEntity<String> attachment() throws MessagingException {
        emailService.sendMailWithAttachment();
        return ResponseEntity.ok("Attachment email sent");
    }

    @GetMapping("/html")
    public ResponseEntity<String> html() throws MessagingException {
        emailService.sendHtmlMail();
        return ResponseEntity.ok("Html email sent");
    }
}
