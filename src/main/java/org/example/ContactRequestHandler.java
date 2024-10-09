package org.example;

import static org.example.Message.Type.*;

public class ContactRequestHandler extends MessageHandler{
    private CompensationHandler compensationHandler = new CompensationHandler();
    private DevelopmentSuggestionHandler developmentSuggestionHandler = new DevelopmentSuggestionHandler();
    private GeneralFeedbackHandler generalFeedbackHandler = new GeneralFeedbackHandler();
    @Override
    public void handleMessage(Message message) {
        if(message.getType()==GENERAL_FEEDBACK){
            System.out.println("Forwarding you to general feedback...");
            setNextHandler(generalFeedbackHandler);
            this.getNextHandler().handleMessage(message);
        } else if(message.getType()==DEVELOPMENT_SUGGESTION){
            System.out.println("Forwarding you to development suggestions...");
            setNextHandler(developmentSuggestionHandler);
            this.getNextHandler().handleMessage(message);
        } else if(message.getType()==COMPENSATION){
            System.out.println("Forwarding you to compensation");
            setNextHandler(compensationHandler);
            this.getNextHandler().handleMessage(message);
        }
    }
}
