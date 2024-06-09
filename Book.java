package com.example.testexam_1;

public class Book {
    private long id;
    private String Title;
    private Category category;
    private long pages;

    public Book(long id, String title, Category category, long pages) {
        this.id = id;
        this.Title = title;
        this.category = category;
        this.pages = pages;
    }

    public Book() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }
}

