package org.example;

public class MessageHandler {
    private MessageHandler nextHandler;

    public void handleMessage(Message message){
        if(nextHandler != null){
            nextHandler.handleMessage(message);
        }
    }

    public void setNextHandler(MessageHandler messageHandler){
        this.nextHandler = messageHandler;
    }

    public MessageHandler getNextHandler(){
        return nextHandler;
    }
}
