package com.ironhack.mockemailservice;

import org.springframework.stereotype.Service;

@Service
public class MockEmailService {

  public void sendMessage(NotificationMessageDTO notificationMessageDTO){
    System.out.println("Message successfully sent to " + notificationMessageDTO.getRecipientEmail());
    System.out.println(notificationMessageDTO.getTitle());
    System.out.println(notificationMessageDTO.getBody());
  }

}
