package com.example.teamfinesse;

public class ChatMessage {
    private String messageText;

    public ChatMessage(String messageText) {
        this.messageText = messageText;
    }

    public ChatMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
