/**
 * Created by apple on 1/25/17.
 */
import java.util.ArrayList;

public class Range{
    private ArrayList<Integer> value;

    private int lower;
    private int upper;

    public Range(int lower, int upper){
        this.value = new ArrayList<Integer>();
        this.lower = lower;
        this.upper = upper;
        for (int i = lower; i <= upper; i++){value.add(i);}
    }

    public int getLower(){return lower; }

    public int getUpper(){return upper; }

    public boolean contains(int n){
        for (int i : value){
            if (i == n){return true; }
        }
        return false;
    }

    public ArrayList<Integer> getValue(){
        return value;
    }

}
