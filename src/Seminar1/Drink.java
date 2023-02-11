package Seminar1;

public class Drink extends Product{
    protected int volume;
    Drink(String name, int price) {
        super(name, price);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void consume(){
        System.out.println("Напиток выпит");
    }
}
