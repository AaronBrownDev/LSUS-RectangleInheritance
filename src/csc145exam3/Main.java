package csc145exam3;
/**
 * File: Main.java
 * Author: Aaron Brown
 * Concentration: SD
 * Date: 04/03/2024
 * Java class description: The driver class designed to show off that the MyRectangle class works as intended.
 */
import java.awt.Point;

public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyRectangle rect1 = new MyRectangle(0, 0, 10, 10);
    MyRectangle rect2 = new MyRectangle(new Point(5, 5), new Point(15, 10));
    MyRectangle edgeCase = new MyRectangle(1000, 1000, 1001, 1001);

    System.out.println("Rectangle 1 before scale: " + rect1);
    rect1.scaleIt(2);
    System.out.println("Rectangle 1 after scale: " + rect1);

    System.out.println();

    System.out.println("Rectangle 2: " + rect2);
    System.out.println("Rectangle 2 perimeter: " + rect2.getPerimeter());
    System.out.println("Rectangle 2 area: " + rect2.getArea());

    System.out.println();
    System.out.println("Rectangle 1 area: " + rect1.getArea());

    System.out.println("The combined area of Rectangle 1 and 2: " + rect1.getCombinedArea(rect2));
    System.out.println("The combined area of Rectangle 1 and separate Rectangle: " + rect1.getCombinedArea(edgeCase));

    System.out.println();

    System.out.println("The intersect area of Rectangle 1 and 2: " + rect1.getIntersectArea(rect2));
    System.out.println("The intersect area of Rectangle 1 and separate Rectangle: " + rect1.getIntersectArea(edgeCase));

    System.out.println();

    System.out.println("The percent of area intersected of Rectangle 1 and 2: " + rect1.getPercentIntersect(rect2));
    System.out.println("The percent of area intersected of Rectangle 1 and separate Rectangle: " + rect1.getPercentIntersect(edgeCase));

    System.out.println();

    System.out.println("Rectangle 1 is touching Rectangle 2: " + rect1.touching(rect2));
    System.out.println("Rectangle 1 is touching Separate Rectangle: " + rect1.touching(edgeCase));

    System.out.println();

    System.out.println("Rectangle 1 is landscape shaped: " + rect1.isLandscape());
    System.out.println("Rectangle 2 is landscape shaped: " + rect2.isLandscape());

    System.out.println();

    System.out.println("Rectangle 1 is a square: " + rect1.isSquare());
    System.out.println("Rectangle 2 is a square: " + rect2.isSquare());
  }
}
