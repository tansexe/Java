public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        String e = a;

        String c = new String("Kunal");
        String d = new String("Kunal");

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(b == e);
        System.out.println(c.equals(d));

        System.out.println(c.charAt(0));
    }
}
