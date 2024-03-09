import Box;
import java.util.Scanner;

public class Demo {
    public class Box {

        double length;
        double width;
        double height;

        public Box() {
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double volume() {
            return length * width * height;
        }

        public String toString() {
            return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        Box box = new Box(length, width, height);

        System.out.println("Box details:");
        System.out.println(box);
        System.out.printf("Volume: %.2f", box.volume());
    }
}
