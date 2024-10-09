package org.example;

public class DevelopmentSuggestionHandler extends MessageHandler{
    @Override
    public void handleMessage(Message message) {
        System.out.println("Your message content: " + message.getContent());
        System.out.println("Thank you for your development suggestion. We will take this " +
                "into account moving forward.");
    }
}
