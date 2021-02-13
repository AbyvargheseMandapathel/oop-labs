import java.util.Scanner;

public class binary {
    private static int x;

    public static void findrecursly(int search, int arr[], int start, int end){

        if( start >  end) {
        return;}
        int mid=(start+end)/2;
        if(arr[mid]==search) {
            System.out.println(mid);
        } else if (arr[mid]>search) {
            findrecursly(search,arr,mid+1,arr.length);
        }
        else  {
                    findrecursly(search,arr,0,mid-1);
        }
        }

    public static void main(String[] args){
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        System.out.println("enter value to search");
        Scanner s=new Scanner(System.in);
                int search=s.nextInt();

        int start=0;
        int end = x;
        findrecursly(search,arr,start,x);


    }


}
