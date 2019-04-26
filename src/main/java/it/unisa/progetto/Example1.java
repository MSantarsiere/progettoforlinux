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
           c();
        } 
        else if(p==22){
            d();
        }
        else {
           e();
        }
    }

    private void c() {
        System.out.println("c");
    }

    private void d() {
        System.out.println("d ");
    }

    private void e() {
        System.out.println("e");
    }   
}
