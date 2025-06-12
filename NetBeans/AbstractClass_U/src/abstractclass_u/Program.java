package abstractclass_u;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities_enum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int n = r.nextInt()+1;
        List<Shape> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle(r/c)?");
            char ch = r.next().charAt(0);
            System.out.print("Color (BLACK,BLUE,RED):");
            Color color = Color.valueOf(r.next());
            if (ch == 'r') {
                System.out.println("Widht: ");
                double widht = r.nextDouble();
                System.out.println("Height: ");
                double height = r.nextDouble();
                list.add(new Rectangle(widht, height, color));
            } else if (ch == 'c') {
                System.out.println("Radius: ");
                double radius = r.nextDouble();
                list.add(new Circle(radius, color));
            } else {
                System.out.println("[ERRO]try again!");
            }
          
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape shape :list){
            System.out.println(shape.area());
        }
            

    }

}
