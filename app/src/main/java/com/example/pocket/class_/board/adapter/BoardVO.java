package com.example.pocket.class_.board.adapter;

public class BoardVO {

    private String title;
    private String context;
    private String file;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }


    public BoardVO(String title, String context, String file) {
        this.title = title;
        this.context = context;
        this.file = file;
    }
// private (내부 메서드(get/set)를 사용해서 접근 가능)



}
