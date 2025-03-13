package org.example;

public class Post {
    private final int seq;
    private String title;
    private String content;

    public Post(int seq, String title, String content) {
        this.seq = seq;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return seq + "번 게시물\n"
                + "제목:" + this.title + "\n"
                + "내용:" + this.content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
