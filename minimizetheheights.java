import java.util.*;
class minimizetheheights{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                arr[i]=arr[i]+k;
            }else{
                arr[i]=arr[i]-k;
            }
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]-arr[0]);
    }
}