/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tut.chp1.composition;

/**
 *
 * @author Exabyte
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
           
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void display(){
        System.out.println("initial display");
    }
    
    public void swim(){
        System.out.println("All duck can swim");
    }
}
