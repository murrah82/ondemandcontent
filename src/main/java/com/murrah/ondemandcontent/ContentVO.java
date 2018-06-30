package com.murrah.ondemandcontent;

public class ContentVO {

    private final long id;
    private final String content;

    public ContentVO(long id, String content) {
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
