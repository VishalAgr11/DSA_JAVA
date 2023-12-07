import java.util.*;

class lastoccr{
    static int occr(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            int a=occr(arr,(i+1),key);
            if(a==-1)
                return i;
            else
                return a;    
        }
        return occr(arr,(i+1),key);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,6,5,5,6,5};
        System.out.println(occr(arr,0,5));
    }
}