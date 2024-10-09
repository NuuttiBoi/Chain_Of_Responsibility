package org.example;

import static org.example.Message.Type.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompensationHandler compensationHandler = new CompensationHandler();
        GeneralFeedbackHandler generalFeedbackHandler = new GeneralFeedbackHandler();
        ContactRequestHandler contactRequestHandler = new ContactRequestHandler();
        DevelopmentSuggestionHandler developmentSuggestionHandler = new DevelopmentSuggestionHandler();

        compensationHandler.setNextHandler(generalFeedbackHandler);
        generalFeedbackHandler.setNextHandler(developmentSuggestionHandler);


        Message message1 = new Message("I want to my money back!", "givememoney@gmail.com", COMPENSATION);
        compensationHandler.handleMessage(message1);

        Message message2 = new Message("Your store sucks", "whocares@gmail.com", GENERAL_FEEDBACK);
        generalFeedbackHandler.handleMessage(message2);

        Message message3 = new Message("I want to give some general feedback", "customer@gmail.com", GENERAL_FEEDBACK);
        contactRequestHandler.handleMessage(message3);

    }
}