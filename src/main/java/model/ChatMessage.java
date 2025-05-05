package model;

import java.awt.TrayIcon.MessageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    private MessageType type;
    private String conetent;
    private String sender;
}
