package org.example.try_catch;

public class Main {
    public static void main(String[] args) {

        int operation = 0;
        try {
            operation = Arithmetic.division(21,0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("It doesn't matter what happen what happens in try or catch I'm gonna execute");
            System.out.println("Current operation " + operation);
        }
    }
}