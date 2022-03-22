import java.net.HttpRetryException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a;
        Scanner src = new Scanner(System.in);
        System.out.println("Ввести название дерева");
        Trees tree1= new Trees("", 0, "хвойное");
        a=src.nextLine();
        tree1.setTreeName(a);
        System.out.println("Ввести высоту  дерева");
        a=src.nextLine();
        tree1.setTreeHight(Integer.parseInt(a));

        System.out.println("Хвойное или лиственное дерево?");

        a=src.nextLine();
        tree1.setType(a);
        System.out.println("Вывод данных о дереве");

       
tree1.setArea("Asia");
        tree1.setLifespan(6);
        tree1.PrintInfo(tree1);
        tree1.PrintInfo2(tree1);

        System.out.println("Ввести название Цветка");
        Flowers Flower1= new Flowers("", 0, "дикорастущее");
        a=src.nextLine();
        Flower1.setFlowerName(a);
        System.out.println("Ввести длительность цветения в днях");
        a=src.nextLine();
        Flower1.setTimeBlossing(Integer.parseInt(a));

        System.out.println("Комнатное или дикорастущее?");

        a=src.nextLine();
        Flower1.setFlowerType(a);
        System.out.println("Вывод данных о дереве");

        Flower1.PrintInfo(Flower1);


        src.close();
    }

}
