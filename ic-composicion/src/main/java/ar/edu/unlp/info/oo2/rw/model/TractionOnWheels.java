package ar.edu.unlp.info.oo2.rw.model;

public class TractionOnWheels extends Locomotion
{
    public void move(Robot r) {
        System.out.println("Robot " + r.getName() + " moving on 4x4 wheels");
    }
 
}