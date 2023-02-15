package org.example.try_catch.throwP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainThrow {
    public static void main(String[] args) {
        reading();
    }

    public static void reading (){
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String texto;
        try {
            texto = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
