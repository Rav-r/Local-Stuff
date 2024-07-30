import java.lang.*;
class array3 {
	public static void main (String args[]) {

		int x[][][] = new int [3][4][5];
		int i,j,k;
	    for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				for(k=0;k<5;k++){
					x[i][j][k] = i*j*k;
				}
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				for(k=0;k<5;k++){
					System.out.print(x[i][j][k]+" ");
									}
				System.out.println(" ");
			}
			System.out.println(" ");

		}
	}
}

