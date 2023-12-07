import java.util.*;

class PairSum{
    static boolean check_brute(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean check_2pointer(ArrayList<Integer> list, int target){
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target=50;

        System.out.println(check_brute(list,target)?"Found":"Not Found");
        System.out.println(check_2pointer(list,target)?"Found":"Not Found");
    }
}