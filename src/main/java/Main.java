

public class Main {


    public static int nbYear(int p0, double percent, int aug, int p) {

        double start =  p0;
        int counter =0;
        while( start < p ){
            start =  start + (start*(percent/100)) + aug;
            counter++;
            System.out.println(start);
        }
        return counter;
    }



}
