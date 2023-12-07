import java.util.*;

class water_container{
    static int calc(ArrayList<Integer> ht){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ht.size();i++){
            for(int j=i+1;j<ht.size();j++){
                int len= Math.min(ht.get(i),ht.get(j));
                int width=j-i;
                max=Math.max(max,(len*width));
            }
        }
        return max;
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