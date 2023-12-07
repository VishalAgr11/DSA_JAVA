import java.util.*;

class MaxWater2pointer{
    static int calc(ArrayList<Integer> ht){
        int lp=0,rp=ht.size()-1;
        int curr=0;
        int maxi= Integer.MIN_VALUE;
        while(lp<rp){
            int h=Math.min(ht.get(lp),ht.get(rp));
            int w=rp-lp;
            curr=w*h;
            maxi=Math.max(maxi,curr);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the array values press -1 to stop");//1 8 6 2 5 4 8 3 7
        ArrayList<Integer> l1=new ArrayList<Integer>();
        int inpu=in.nextInt();
        while(inpu>=0){
            l1.add(inpu);
            inpu=in.nextInt();
        }
        System.out.println("The max possible water is = "+calc(l1));
    }
}
