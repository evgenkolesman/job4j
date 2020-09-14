package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery (int power) {
        this.load = power;
    }

    public void exchange(Battery another){
        this.load = this.load - another.load;
        another.load = 10;
    }
    public static void main(String[] args) {
        Battery first = new Battery(90);
        Battery second = new Battery(5);
        //Battery third1 = new Battery(75); проба изменения кода//

        System.out.println("first : " + first.load); // + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load); // + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load);
    }
}
