import java.util.*;

class PairSum2{
    static boolean check(ArrayList<Integer> list, int target){
        int pivot=-1,i;
        for(i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i;
            }
        }
        int lp=pivot+1,rp=pivot,n=list.size();
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the array values press -1 to stop");
        ArrayList<Integer> l1=new ArrayList<Integer>();
        int inpu=in.nextInt();
        while(inpu>=0){//11 15 6 8 9 10, target=16
            l1.add(inpu);
            inpu=in.nextInt();
        }
        System.out.println(check(l1,16)?"Found":"Not Found");
    }
}