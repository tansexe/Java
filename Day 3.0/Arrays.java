public class Arrays{
	public static void main(String[] args){
	int arr[][] = new int[4][4];
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			arr[i][j]=i*j;
			System.out.println(arr[i][j]);
			}
		}

	}

}