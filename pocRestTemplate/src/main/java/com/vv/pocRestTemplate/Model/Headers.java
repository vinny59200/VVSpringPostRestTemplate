package com.vv.pocRestTemplate.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers{
    @JsonProperty("Accept")
    public String accept;
    @JsonProperty("Accept-Encoding")
    public String acceptEncoding;
    @JsonProperty("Content-Length")
    public String contentLength;
    @JsonProperty("Content-Type")
    public String contentType;
    @JsonProperty("Host")
    public String host;
    @JsonProperty("Postman-Token")
    public String postmanToken;
    @JsonProperty("User-Agent")
    public String userAgent;
    @JsonProperty("X-Amzn-Trace-Id")
    public String xAmznTraceId;
}

