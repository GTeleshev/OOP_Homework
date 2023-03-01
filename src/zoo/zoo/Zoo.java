package zoo.zoo;

import zoo.animals.Lion;
import zoo.animals.Snake;
import zoo.animals.Wolf;
import zoo.cage.LionCage;
import zoo.cage.SnakeCage;
import zoo.cage.WolfCage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//    Создать пэкедж zoo, работу продолжаем в нём создать класс Zoo и объявить у него 3 переменные:
//    клетка с волками //    клетка с львами
//    террариум со змеями
//    использовать тип переменных как можно более абстрактный
public class Zoo {

    private List<WolfCage> wolfCages;
    private List<LionCage> lionCages;
    private List<SnakeCage> snakeTerrariums;

    public Zoo() {
        this.wolfCages = new ArrayList<>();
        this.lionCages = new ArrayList<>();
        this.snakeTerrariums = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Zoo [" +
                "wolfCages = " + wolfCages.size() +
                ", lionCages=" + lionCages.size() +
                ", snakeTerrariums=" + snakeTerrariums.size() +
                ']';
    }
    public void printZoo(){
        if(lionCages!=null){
            for (LionCage el: lionCages) {
                System.out.println(el.toString());
            }
        }
        if(wolfCages!=null){
            for (WolfCage el: wolfCages) {
                System.out.println(el.toString());
            }
        }
        if(snakeTerrariums!=null){
            for (SnakeCage el: snakeTerrariums){
                System.out.println(el.toString());
            }
        }
        else System.out.println("Zoo is empty");
    }

    public void populateZoo(int lionCount, int wolvesCount, int snakesCount) {
        this.lionCages.add(new LionCage());
        this.wolfCages.add(new WolfCage());
        this.snakeTerrariums.add(new SnakeCage());
        this.lionCages.get(lionCages.size() - 1).collectionAdd(lionCount);
        this.wolfCages.get(wolfCages.size() - 1).collectionAdd(wolvesCount);
        this.snakeTerrariums.get(snakeTerrariums.size() - 1).collectionAdd(snakesCount);
    }


    public void addLion(Lion lionToAdd) {
        int len = lionCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (lionCages != null) {
            LionCage randCage = lionCages.get(cageNumber);
            System.out.println("Добавляем льва");
            System.out.println(lionToAdd.toString());
            randCage.animalAdd(lionToAdd);
        } else {
            System.out.println("Lion cage list is empty");
        }
    }

    public void removeRandomLion() {
        int len = lionCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (lionCages != null) {
            LionCage randCage = lionCages.get(cageNumber);
            if (randCage != null) {
                randCage.deleteLion(randCage.catchAnimal());
            } else {
                System.out.println("Cage is empty");
            }
        } else {
            System.out.println("Lion cage list is empty");
        }
    }

    public void addWolf(Wolf wolfToAdd) {
        int len = wolfCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (wolfCages != null) {
            WolfCage randCage = wolfCages.get(cageNumber);
            System.out.println("Добавляем волка");
            System.out.println(wolfToAdd.toString());
            randCage.animalAdd(wolfToAdd);
        } else {
            System.out.println("Wolf cage list is empty");
        }
    }

    public void removeRandomWolf() {
        int len = wolfCages.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (wolfCages != null) {
            WolfCage randCage = wolfCages.get(cageNumber);
            if (randCage != null) {
                randCage.deleteWolf(randCage.catchAnimal());
            } else {
                System.out.println("Cage is empty");
            }
        } else {
            System.out.println("Wolf cage list is empty");
        }
    }

    public void addSnake(Snake snakeToAdd) {
        int len = snakeTerrariums.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (snakeTerrariums != null) {
            SnakeCage randCage = snakeTerrariums.get(cageNumber);
            System.out.println("Добавляем змею");
            System.out.println(snakeToAdd.toString());
            randCage.animalAdd(snakeToAdd);
        } else {
            System.out.println("Snake cage list is empty");
        }
    }

    public void removeRandomSnake() {
        int len = snakeTerrariums.size();
        Random rand = new Random();
        int cageNumber = rand.nextInt(len);
        if (snakeTerrariums != null) {
            SnakeCage randCage = snakeTerrariums.get(cageNumber);
            if (randCage != null) {
                randCage.deleteSnake(randCage.catchAnimal());
            } else {
                System.out.println("Cage is empty");
            }
        } else {
            System.out.println("Snake cage list is empty");
        }
    }

    public void addLionCage(LionCage cageToAdd) {
        lionCages.add(cageToAdd);
    }

    public void addWolfCage(WolfCage cageToAdd) {
        wolfCages.add(cageToAdd);
    }

    public void addSnakeCage(SnakeCage cageToAdd) {
        snakeTerrariums.add(cageToAdd);
    }

    public List<WolfCage> getWolfCages() {
        return wolfCages;
    }

    public List<LionCage> getLionCages() {
        return lionCages;
    }

    public List<SnakeCage> getSnakeTerrariums() {
        return snakeTerrariums;
    }
}