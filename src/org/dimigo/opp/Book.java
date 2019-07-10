package org.dimigo.opp;

public class Book {
    private static boolean flag;
    private String title = "Word Master";
    private String author = "이투스북";
    private int page = 300;

   public Book() {
       System.out.println("기본 생성자 호출");
   }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}