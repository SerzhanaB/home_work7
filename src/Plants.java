public abstract class Plants {

    public int lifespan;
    protected String area;
    String name;

    //public Plants(int lifespan, String area, String name) {
     //  this.lifespan = lifespan;
     //   this.area = area;
     //   this.name = name;
   // }
//Plants Plant1=new Plants(5, "Asia", "");


    public int getLifespan() {
        return lifespan;
    }

    public String getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String PrintInfo(Plants plant1) {
        System.out.println("Название растения: "+ plant1.getName()+"; продолжительность жизни: " +
                ""+ plant1.getLifespan() +"; область обитания: "+plant1.getArea());
       return name;
    }

    public String PrintInfo2(Plants plant1) {
        System.out.println("Название растения: "+ plant1.getName()+"; продолжительность жизни: " +
                ""+ plant1.getLifespan() +"; область обитания: "+plant1.getArea());
        return name;
    }
}
