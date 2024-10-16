import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element in the array that you want to search");
        int key=sc.nextInt();

        int check=binarySearchWithRecursion(arr,0,arr.length-1,key);
        System.out.println(check==-1 ? "Element is not Present in array":"Element is present at index :- "+check);
    }

    public static int binarySearchWithRecursion(int arr[],int left,int right,int key)
    {
        if(left > right)
        return -1;
        
        int mid=(left+right)/2;
        if(key==arr[mid])
        return mid;
        if(key > arr[mid])
        return binarySearchWithRecursion(arr,mid+1,right,key);
        else
        return binarySearchWithRecursion(arr,left,mid-1,key);
    }
}
