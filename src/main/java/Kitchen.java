import java.util.Arrays;

public class Kitchen {

    String[] tortillas = new String[1];

    public boolean isEmpty(){
        return tortillas.length == 0;
    }

    public void add(String tortilla){
        String[] copy = Arrays.copyOf(tortillas, tortillas.length+1);
        copy[tortillas.length-1] = tortilla;
        tortillas = copy;
    }

    public void remove(String tortilla){
        for (int i = 0; i < tortillas.length; i++){
            if(tortillas[i].equals(tortilla)){
                tortillas[i] = null;
                tortillas[i] = tortillas[tortillas.length];
            }
        }
    }

    public boolean contains(String tortilla){
        for (int i = 0; i < tortillas.length; i++){
            if(tortillas[i].equals(tortilla))
                return true;
        }
        return false;
    }
    
    public void printAll(){
        for (int i = tortillas.length-1; i >= 0; i--){
            if(tortillas[i] != null)
            System.out.println("tortillas["+i+"] " + tortillas[i]);
        }
    }

}
