package com.murrah.ondemandcontent;


public class ContentVO {

    private final long id;
    private byte[]  content;

    public ContentVO(long id, byte[] content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public byte[] getContent() {
        return content;
    }
}
