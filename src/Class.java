import java.util.Arrays;

public class Class {
    private int number;
    private int[] array;
    private String soz;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array =array;
    }

    public Class(int number, String soz, int[] array){
        this.array= array;
        this.number=number;
        this.soz=soz;


    }

}
