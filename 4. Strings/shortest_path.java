import java.util.*;

class shortest_path{
    static float calc(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char ch=path.charAt(i);
            if(ch=='N')
                y++;
            else if(ch=='S')
                y--;
            else if(ch=='E')
                x++;
            else if(ch=='W')
                x--;
            else
                continue;
        }
        return (float)(Math.sqrt((x*x)+(y*y)));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter path: ");
        String str=in.next();
        System.out.println("distance = "+(calc(str)));
    }
}