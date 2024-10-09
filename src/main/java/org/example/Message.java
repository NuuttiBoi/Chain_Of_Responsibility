package org.example;

public class Message {
    private String content;
    private String email;
    private Type type;

    public Message(String content, String email, Type type){
        this.content = content;
        this.email = email;
        this.type = type;
    }

    public String getContent(){
        return this.content;
    }
    public String getEmail(){
        return this.email;
    }
    public Type getType(){
        return this.type;
    }

    enum Type {
        COMPENSATION,
        CONTACT_REQUEST,
        DEVELOPMENT_SUGGESTION,
        GENERAL_FEEDBACK
    }
}
