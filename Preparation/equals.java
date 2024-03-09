public class equals {
    public static void main(String[] args) {
        String person1 = "Paul";
        String person2 = "John";
        String person3 = "Paul";
        
        System.out.println(person1.equals(person2));
        // Prints false, since "Paul" is not "John"
        
        System.out.println(person1.equals(person3));
        // Prints true, since "Paul" is "Paul"
        
    } 
    
    
}
