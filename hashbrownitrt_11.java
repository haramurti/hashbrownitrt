import java.util.HashSet;
import java.util.Iterator;

class hashbrownitrt_11 {
    public static void main (String[]args){

        HashSet <Integer> pas = new HashSet<Integer>();
        pas.add(8);
        pas.add(5);
        pas.add(4);
        pas.add(6);
        pas.add(1);
        pas.add(7);
        pas.add(23);
        pas.add(12);

        Iterator<Integer> it = pas.iterator();
            while (it.hasNext()){
                int i = it.next();
                if ( i <= 8){
                    it.remove();
                }
            }

            System.out.println(pas);
    }
}