package com.murrah.ondemandcontent;



public class HelloVO {

    private final long id;
    private final String content;

    HelloVO(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
