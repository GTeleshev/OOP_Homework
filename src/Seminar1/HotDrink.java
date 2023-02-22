package Seminar1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void consume() {
        System.out.println("Горячий, только наполовину");
    }
}
