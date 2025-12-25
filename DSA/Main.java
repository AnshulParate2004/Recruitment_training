// You are given an array A of n integers and q queries Each query can be one of the following two types 
// Type 1 Query (1,l,r) - Replace A[i] with  (i-l+1)*A[l] for each index i,where l<=i<=r
// Type 2 Query (2,l,r) - Calculate the sum of the elements in A form index l to index r.

// Find the sum of answers to all types 2 queries . Since answers can be large , return it modulo 109+7.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int [] A= new int[n];
        sc.nextLine();
        System.out.println("Enter the number ");
        for(int i=0;i<n;i++){
            System.out.println("Entre the number at index :"+i);
            A[i] = sc.nextInt();
        }
        int  = ;
        System.out.println("Enter the Type of Query :");
        sc
        System.out.print("Enter l :");
        System.out.print("Enter r:");


        

        
    }
}
