package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello Welcome to the Jenkins we are using java application and maven as a build tool, keep learning enjoy !!!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
