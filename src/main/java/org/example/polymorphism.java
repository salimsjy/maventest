package org.example;

//Overloading ubah int menjadi double
class Operation {
    public int add(int a, int b) {
        return a + b;
    }


//Overloading : Parameter menjadi 3 int


    public double add(double a, double b) {
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
}


//Overriding
class Multiplyoverride extends Operation {
    @Override
    public int add(int a, int b){
            return a*b; // melakukan overrride operasi diganti menjadi perkalian
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Operation op = new Operation();
        Operation MulOv = new Multiplyoverride();

        int result1 = op.add(5,10);
        double result2= op.add(2.5,3.5);
        int result3 = op.add(5,10,15);
        int result4 = MulOv.add (7,8);

            System.out.println("operation (5,10): "+ result1);
            System.out.println("operation (2.5,3.5): "+ result2);
            System.out.println("operation (5,10,15): "+ result3);
            System.out.println("operation (7,8): "+ result4);


            try{
                int result = 10/0;
            }catch (ArithmeticException e){
                System.out.println("Caught AritmethicException "+ e.getMessage());

            }

            try {
               int[] arr = new int[5];
               int index = arr[10];
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutBoundsException" + e.getMessage());
            }

            try {
                String str= null;
                str.length();
            }catch (NullPointerException e){
                System.out.println("Caught NullPointerException "+ e.getMessage());
            }

            try {
                String str ="hello";
                char ch = str.charAt(10);
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Caught StringindexOutOfBoundsException "+ e.getMessage());
            }

            try {
                Thread t = new Thread();
                t.start();
                t.start();
            }catch (IllegalThreadStateException e){
                System.out.println("Caught IllegalThreadStateException "+ e.getMessage());
            }

    }

}
