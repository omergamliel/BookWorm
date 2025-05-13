package com.yvc.ex2_2025;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private int coverID;

    private String url;
    private LocalDate returndate;


    public Book(String name, String author, int coverID,String url) {
        this.name = name;
        this.author = author;
        this.coverID = coverID;
        this.url=url;
    }

    public Book(String name, String author,LocalDate returndate) {
        this.name = name;
        this.author = author;
        this.returndate=returndate;

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

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setReturndate(LocalDate returndate) {
        this.returndate = returndate;
    }

    public LocalDate getReturndate() {
        return returndate;
    }


}
