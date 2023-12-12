import task_1.Circle;
import task_1.Sphere;
import task_2_3.Tester;
import task_4_5.MovableCircle;
import task_4_5.MovablePoint;
import task_4_5.MovableRectangle;

public class App {
    public static void main(String[] args) {
        // Task 1
        System.out.println("---------- TASK 1 ----------");

        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getVolume());

        Sphere sphere = new Sphere(10);
        System.out.println(sphere.getArea());
        System.out.println(sphere.getVolume());

        // Task 2
        System.out.println("---------- TASK 2 | TASK 3 ----------");
        Tester.test();

        // Task 4
        System.out.println("---------- TASK 4 ----------");
        MovablePoint movablePoint = new MovablePoint(0, 0, 10, 10);

        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movablePoint.toSting());

        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println(movablePoint.toSting());

        MovableCircle movableCircle = new MovableCircle(0, 0, 20, 20, 10);

        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println(movableCircle.toString());

        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());

        // Task 5
        System.out.println("---------- TASK 5 ----------");
        MovableRectangle movableRectangle = new MovableRectangle(10, 5, 20, 0, 10, 20);

        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle.toString());

        movableRectangle.moveDown();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle.toString());
    }
}
