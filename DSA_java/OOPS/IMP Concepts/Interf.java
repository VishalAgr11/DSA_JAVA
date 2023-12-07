import java.util.*;

class Interf{
    public static void main(String[] args){
        Bear obj=new Bear();
        obj.eatgrass();
        obj.eatMeat();
    }
}
interface Herbivore{
    void eatgrass();
}
interface Carnivore{
    void eatMeat();
}
class Bear implements Herbivore,Carnivore{
    public void eatgrass(){
        System.out.println("Eats grass");
    }
    public void eatMeat(){
        System.out.println("Eats Flesh");
    }
}