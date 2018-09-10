package com.company;

public class Book {
    private String author;
    private int currentPage;
    public Book(String a, int b){
        author = a;
        currentPage = b;
    }
    public Book(String a) {
        author = a;
        currentPage = 1;
    }
    public void setAuthor(String a) {
        this.author = a;
    }
    public void setPage(int a) {
        this.currentPage = a;
    }
    public String getAuthor() {
        return author;
    }
    public int getPage() {
        return currentPage;
    }
    public void turnPage() {
        System.out.println(author+"'s book page was turned from "+currentPage+" to "+(currentPage+1));
        currentPage +=1;
    }
    public String toString() {
        return this.author+"'s book is now on page "+this.currentPage;
    }
}
