import java.lang.*;
class array2 {
	public static void main(String args[]) {
		int x[][]=new int [3][4];
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				x[i][j] = i*j;
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				System.out.print(x[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
		
