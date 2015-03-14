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
public class ZduckSimulator {
    public static void main(String[] args) {
        Duck mallard = new DuckMallard();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("-------------------");
        Duck model = new DuckModel();
        model.display();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
