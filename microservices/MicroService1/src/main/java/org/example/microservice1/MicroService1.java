package org.example.microservice1;

import org.example.lib1.Lib1;
public class MicroService1 {
    public static void main(String[] args) {
        String greeting = Lib1.greet("MicroService1");
        System.out.println(greeting);
    }
}
