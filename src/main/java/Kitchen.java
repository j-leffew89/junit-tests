import java.util.Stack;

public class Kitchen {

    int count = 0;
    String[] tortillas = new String[1];

    public boolean isEmpty(){
        return tortillas.length == 0;
    }

    public void add(String tortilla){
        if(isEmpty()){
            tortillas[0] = tortilla;
        }else {
            tortillas[tortillas.length+1] = tortilla;
        }
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
        for (int i = 0; i < tortillas.length; i++){
            System.out.println("tortillas[i] = " + tortillas[i]);
        }
    }

}
