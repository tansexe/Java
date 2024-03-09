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
