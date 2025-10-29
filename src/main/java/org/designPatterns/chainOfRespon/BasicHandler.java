package org.designPatterns.chainOfRespon;

import java.util.Objects;

public class BasicHandler implements RequestHandler {
  private RequestHandler next;

  @Override
  public void setNext(RequestHandler requestHandler) {
    this.next = requestHandler;
  }

  @Override
  public void handle(Request request) {
    if (Objects.nonNull(request)) {
      System.out.println("Inside the basic Handler");
      forward(request);
    }
  }

  @Override
  public void forward(Request request) {
    if (Objects.nonNull(next)) {
      next.handle(request);
    }
  }
}
