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
public class DuckMallard extends Duck{
    public DuckMallard(){
        quackBehavior = new QuackLow();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void display(){
        System.out.println("I am mallard duck");
    }
}
