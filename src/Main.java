/**
 * Created by apple on 1/25/17.
 */
public class Main {
    private static int inputLower(){
        Input in = new Input();
        System.out.print("Input Lower: ");
        return in.nextInt();
    }

    private static int inputUpper(){
        Input in = new Input();
        System.out.print("Input Upper: ");
        return in.nextInt();
    }

    private static int inputN(){
        Input in = new Input();
        System.out.print("Input a number n: ");
        return in.nextInt();
    }

    public static void main(String []args){
        int lower;
        int upper;
        int n;

        while (true){
            lower = Main.inputLower();
            upper = Main.inputUpper();
            if (lower > upper){ System.out.println("Invalid input!");}
            else{ break; }
        }

        Range object = new Range(lower, upper);

        System.out.println(object.getLower());
        System.out.println(object.getUpper());
        System.out.println(object.getValue());

        n = Main.inputN();

        System.out.println(object.contains(n));
    }
}

