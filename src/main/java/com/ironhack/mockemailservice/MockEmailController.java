package com.ironhack.mockemailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class MockEmailController {

  @Autowired
  private MockEmailService mockEmailService;

  @PostMapping
  public NotificationMessageDTO sendEmail(@RequestBody NotificationMessageDTO notificationMessageDTO){
    mockEmailService.sendMessage(notificationMessageDTO);
    return notificationMessageDTO;
  }

}
