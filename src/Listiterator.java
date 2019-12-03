
import java.util.ArrayList;
import java.util.ListIterator;


public class Listiterator {

 
    public static void main(String[] args) {
       ArrayList <String> x = new ArrayList();
       ListIterator it = x.listIterator();
       it.add("a");
       it.add("b");
       it.add("c");
       it.previous();
       it.previous();
       it.add("d"); 
       showList(x,it);
    }
    public static void showList(ArrayList list, ListIterator it){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"|");
            if(i==it.previousIndex()) System.out.println("*");
        }
    }
}
    

