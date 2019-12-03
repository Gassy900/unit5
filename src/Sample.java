
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitc2200
 */
public class Sample {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("a");
        list.add("b");
        list.add(1,"c");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(1,"e");
        for (String lett : list) {
            System.out.println(lett);
        }
        list.add("f");
        list.remove(2);
        for (String string : list) {
            System.out.println(string);
        }
    }
    
}
