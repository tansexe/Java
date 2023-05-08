public class multiply {
    public static void main(String[] args) {
        double totalCost= 70;
        double tax = 0.5;
        double subTotal = totalCost + totalCost*tax;
        System.out.println(subTotal);
        double perPerson = subTotal/4;
        System.out.println(perPerson);
    }
    
}
