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
public class QuackMedium implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("sound quack medium");
    }
    
}
