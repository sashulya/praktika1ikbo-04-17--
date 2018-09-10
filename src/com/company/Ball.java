package com.company;

public class Ball {
    private String game;
    private String color;
    public Ball(String a, String b){
        game = a;
        color = b;
    }
    public Ball(String a) {
        game = a;
        color = "Blue";
    }
    public void setGame(String a) {
        this.game = a;
    }
    public void setColor(String a) {
        this.color = a;
    }
    public String getGame() {
        return game;
    }
    public String getColor() {
        return color;
    }
    public void punchBall() {
        System.out.println(color+" ball for "+game+" was punched");
    }
    public String toString() {
        return this.color+" ball for "+this.game;
    }
}
