package common;

import spark.*;

public interface HmsRequestHandler {
    String handleRequest(Request request, Response response);
}
