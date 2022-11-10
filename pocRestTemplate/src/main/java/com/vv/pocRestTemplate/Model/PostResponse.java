package com.vv.pocRestTemplate.Model;

import lombok.Data;

@Data
public class PostResponse {
    public String data;
    public Headers headers;
    public Json json;
    public String origin;
    public String url;
}
