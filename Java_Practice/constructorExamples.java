class Box {
    double height;
    double width;
    double depth;

    Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        double volume= height  * width * depth;
        return (volume);
    }
}

public class constructorExamples {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 30);
        System.out.println(myBox.volume());
    }
}
