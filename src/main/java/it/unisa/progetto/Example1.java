/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.progetto;

/**
 *
 * @author Rembor
 */
public class Example1 {
 
    public void doSomething(int p) {
        if (p == 1) {
           d();
        } 
        else if(p==22){
            e();
        }
        else {
           f();
        }
    }

    private void d() {
        System.out.println("c");
    }

    private void e() {
        System.out.println("d ");
    }

    private void f() {
        System.out.println("e");
    }   
}
