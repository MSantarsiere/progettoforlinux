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
            a();
        } 
        else if(p==22){
            c();
        }
        else {
            b();
        }
    }

    private void a() {
        System.out.println("we waglio");
    }

    private void b() {
        System.out.println("bbello ");
    }

    private void c() {
        System.out.println("sto orologio");
    }   
}
