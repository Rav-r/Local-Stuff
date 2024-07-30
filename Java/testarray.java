import java.lang.*;
class testarray {
	public static void main(String args[]) {
		int a[]={1,4,5,67,34,25};
		int i;
	   for(i=0;i<a.length;i++) {
			System.out.println("array is" + a[i]);
		}
		float sum=0,avg;
		for(i=0;i<a.length;i++){
			sum+=a[i];
		}
		avg=sum/a.length;
		System.out.println("average of our array is " + avg);
	}
}
