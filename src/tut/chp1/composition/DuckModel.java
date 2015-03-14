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
public class DuckModel extends Duck{
    public DuckModel(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }
    
    public void display(){
        System.out.println("override display superclass for duck model");
        
    }
}
