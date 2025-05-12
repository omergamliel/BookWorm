package com.yvc.ex2_2025;

public class Book {
    private String name;
    private String author;
    private int coverID;

    public Book(String name, String author, int coverID) {
        this.name = name;
        this.author = author;
        this.coverID = coverID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCoverID() {
        return coverID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoverId(int coverID) {
        this.coverID = coverID;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
