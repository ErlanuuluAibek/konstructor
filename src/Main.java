import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

       Class clas=new Class(18,"Hello",new int[]{12,333,44});
        System.out.println(clas.getNumber()+" "+clas.getSoz()+" "+ Arrays.toString(clas.getArray()));
    }
}