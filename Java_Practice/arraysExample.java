public class arraysExample {
    public static void main(String[] args) {
        // int i= 10;
        // int arr[] = new int[i];
        // int arr[]= {1,2,3,4,5,6,7,8,9,9};
        // for(int i: arr){
        //     System.out.println(arr[i]);
        // }

        int multiArr[][]= { {1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i<=2 ; i++){
            for(int j=0; j<=2; j++){
                System.out.println(multiArr[i][j]);
            }
        }
    }
}
