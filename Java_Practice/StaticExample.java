class Friends {
    String name;
    static int numberOfFriends;

    Friends(String name) {
        this.name = name; 
        numberOfFriends++;
    }

    // int Count() {
    // return numberOfFriends;
    // }

    static void displayFriends() {

        System.out.println("You have " + Friends.numberOfFriends + " friends.");
    }

}

public class StaticExample {
    public static void main(String[] args) {
        Friends friend1 = new Friends("Kokin");
        Friends friend2 = new Friends("Mahin");

        // System.out.println(Friends.numberOfFriends);
        // System.out.println(Friends.Count());

        Friends.displayFriends();
    }
}
