package com.ironhack.mockemailservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NotificationMessageDTO {
  private String title;
  private String body;
  private String recipientEmail;
}
