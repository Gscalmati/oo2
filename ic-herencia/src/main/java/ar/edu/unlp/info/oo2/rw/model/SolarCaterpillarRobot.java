package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarCaterpillarRobot extends SolarRobot
{
    public SolarCaterpillarRobot(String name) {
        super(name);
    }
    
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on caterpillar");
    }
}
