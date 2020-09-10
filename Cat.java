package ru.job4j.oop;

public class Cat {
    private String food;
    private String name1 ;

    public void show() {
        System.out.println("Эти "+ this.food + " ест " + this.name1);
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name1 = nick;
    }
    public static void main(String[] args) {
        Cat name1 = new Cat();
        name1.eat("сосиски");
        name1.giveNick ("полкан");
        name1.show();
    }
}