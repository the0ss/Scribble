package org.designPatterns.chainOfRespon;

public interface RequestHandler {

  void setNext(RequestHandler requestHandler);

  void handle(Request request);

  void forward(Request request);
}
