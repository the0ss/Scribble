package org.designPatterns.builder;

import java.util.Objects;

public class HttpRequest {
  private String url;

  private HttpRequest(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public static HttpRequestBuilder builder() {
    return new HttpRequestBuilder();
  }

  public static class HttpRequestBuilder {
    private String url;

    public HttpRequestBuilder url(String url) {
      if (Objects.nonNull(url)) {
        this.url = url;
      }
      return this;
    }

    public HttpRequest build() {
      return new HttpRequest(url);
    }
  }
}
