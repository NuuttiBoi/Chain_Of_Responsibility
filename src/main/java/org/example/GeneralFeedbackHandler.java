package org.example;

import java.util.Scanner;

public class GeneralFeedbackHandler extends MessageHandler{
    @Override
    public void handleMessage(Message message) {
        System.out.println("Your feedback : " + message.getContent());
        System.out.println("Thank you for your feedback. We have reviewed it carefully and will make the" +
                "necessary changes to make the experience better.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want your feedback to be forwarded to Development suggestions? (y/n)");
        if (scanner.nextLine().equals("y")){
            System.out.println("Forwarding to Development suggestions...");
            this.getNextHandler().handleMessage(message);
        } else {
            System.out.println("Thank you for your feedback.");
        }
    }
}
