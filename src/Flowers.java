public class Flowers extends Plants {
    public String FlowerName;
    private int TimeBlossing;
    String FlowerType; /// хвойное или лиственное

    public Flowers(String flowerName, int TimeBlossing, String flowerType) {
   //     super(flowerName,TimeBlossing,flowerType);
       FlowerName = flowerName;
        TimeBlossing = TimeBlossing;
        FlowerType = flowerType;
   }

    public String getFlowerName() {
        return FlowerName;
    }

    public int getTimeBlossing() {
        return TimeBlossing;
    }

    public String getFlowerType() {
        return FlowerType;
    }

    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

    public void setTimeBlossing(int timeBlossing) {
        TimeBlossing = timeBlossing;
    }

    public void setFlowerType(String flowerType) {
        FlowerType = flowerType;
    }
    public String PrintInfo(Flowers Flower1) {
        System.out.println("Название цветка: "+ Flower1.getFlowerName()+";время цветения в днях: "+ Flower1.getTimeBlossing() +"; тип цветка: "+ Flower1.getFlowerType());
        return FlowerName;
    }

}
