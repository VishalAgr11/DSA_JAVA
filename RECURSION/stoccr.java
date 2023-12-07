import java.util.*;

class stoccr{
    static int occr(int arr[],int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return occr(arr,(i+1),key);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,6,5};
        System.out.println(occr(arr,0,8));
    }
}