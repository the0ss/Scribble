package org.designPatterns.builder;

public class Demo {
  public static void main(String[] args) {
    HttpRequest httpRequest = HttpRequest.builder().url("google.com").build();
    System.out.println(httpRequest.getUrl());
  }
}
