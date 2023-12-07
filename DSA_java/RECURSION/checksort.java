import java.util.*;

class checksort{
    static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        if(arr[i]<arr[i+1]){
            return check(arr,i+1);
        }
        return false;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,6,5};
        System.out.println(check(arr,0));
    }
}