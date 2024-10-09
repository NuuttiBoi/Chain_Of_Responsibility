package org.example;

public class CompensationHandler extends MessageHandler{
    @Override
    public void handleMessage(Message message) {
        if(message.getContent().length()<100){
            System.out.println("Compensation approved");
        } else {
            System.out.println("We cannot approve your compensation request. Forwarding you to the next" +
                    "department...");
            this.getNextHandler().handleMessage(message);
        }
    }
}
