package by.rublevskaya.model.chainofresponsibility.request;

import by.rublevskaya.model.chainofresponsibility.university.RequestHandler;

public class Accountant extends RequestHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("debt")) {
            System.out.println("Accounting: Financial debt issue processed");
        } else {
            System.out.println("Accounting: Failed to process request. Contact the dean's office");
        }
    }
}