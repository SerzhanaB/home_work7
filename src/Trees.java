public class Trees extends Plants {
    public String TreeName;
    protected int TreeHight;
    private String type; /// хвойное или лиственное

    public Trees(int lifespan, String area) {
      //  super(lifespan, area, name);
        this.lifespan=lifespan;
        this.area=area;

    }

    public Trees(String treeName, int TreeHight, String type) {
       //super(treeName,TreeHight,type);
       this.TreeName = treeName;
       this.TreeHight = TreeHight;
        this.type = type;
    }
    //Trees tree1= new Trees("", 0, "хвойное");
    public String getTreeName() {
        return TreeName;
    }

    public int getTreeHight() {
        return TreeHight;
    }

    public String getType() {
        return type;
    }

    public void setTreeName(String treeName) {
        TreeName = treeName;
    }

    public void setTreeHight(int treeHight) {
        TreeHight = treeHight;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String PrintInfo(Trees tree2) {
        System.out.println("Название дерева: "+ tree2.getTreeName()+";высота дерева: "+ tree2.getTreeHight() +"; тип дерева: "+tree2.getType());
        return TreeName;
    }


}
