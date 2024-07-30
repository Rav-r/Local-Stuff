 package Classes;
 import java.util.*;
 public class parray{
   public void print(int[] a){
     for(int i=0;i<a.length;i++){
       if(i==0){
         System.out.print("{ "+a[i]+", ");
       }
       else if(i==(a.length-1)){
         System.out.print(a[i]+" }");
       }
       else{
           System.out.print(a[i]+", ");
       }
     }
     System.out.println(" ");
   }
 }

