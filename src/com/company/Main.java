package com.company;

public class Main {

    public static void main(String[] args) {
        Ball b1 = new Ball("Basketball","Green");
        Ball b2 = new Ball("Football");
        b1.setGame("Volleyball");
        b2.setColor("Yellow");
        b1.punchBall();
        b2.punchBall();
        Book book1 = new Book("Selin",15);
        Book book2 = new Book("Prust");
        book1.setAuthor("Moravia");
        book2.setPage(20);
        book1.turnPage();
        book2.turnPage();
    }
}
