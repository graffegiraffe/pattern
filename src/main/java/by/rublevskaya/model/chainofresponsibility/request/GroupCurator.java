package by.rublevskaya.model.chainofresponsibility.request;

import by.rublevskaya.model.chainofresponsibility.university.RequestHandler;

public class GroupCurator extends RequestHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("schedule")) {
            System.out.println("Group Curator: The schedule question has been processed");
        } else {
            System.out.println("Group Curator: Passing the request on");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
