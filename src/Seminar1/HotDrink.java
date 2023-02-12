package Seminar1;

public class HotDrink extends Drink{
    protected int temperature;
    HotDrink(String name, int price) {
        super(name, price);
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void consume(){
        System.out.println("Горячий, только наполовину");
    }
}
