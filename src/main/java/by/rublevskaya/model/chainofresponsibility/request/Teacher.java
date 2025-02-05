package by.rublevskaya.model.chainofresponsibility.request;

import by.rublevskaya.model.chainofresponsibility.university.RequestHandler;

public class Teacher extends RequestHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("retake")) {
            System.out.println("Teacher: The question about retaking the exam has been processed");
        } else {
            System.out.println("Teacher: Passing the request on");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
