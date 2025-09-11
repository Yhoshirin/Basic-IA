package perceptron;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][] dataSet = {{0,0,0},{0,1,0},{1,0,0},{1,1,1}};

        for (int [] data: dataSet){
            for ( int value:data){
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
