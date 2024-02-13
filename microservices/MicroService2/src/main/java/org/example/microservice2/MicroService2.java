package org.example.microservice2;

import org.example.lib2.Lib2;
public class MicroService2 {
    public static void main(String[] args) {
        String greeting = Lib2.greet("MicroService2");
        System.out.println(greeting);
    }
}
