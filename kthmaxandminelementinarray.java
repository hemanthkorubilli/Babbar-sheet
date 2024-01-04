import java.util.*;
class kthmaxandminelementinarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("kth min ="+arr[k-1]);
        System.out.print("kth max ="+arr[n-k]);
          
    }
}