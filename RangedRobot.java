public class RangedRobot extends Robot {
    private int range;

    public RangedRobot(String name, String type, int maxHealth, int power, int range) {
        super(name, type, maxHealth, power);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public void attack(Robot robot) {
        // implementation for ranged robot attack
        System.out.println(getName() + " is shooting a projectile at " + robot.getName());
        robot.setHealth(robot.getHealth() - getPower());
    }

    public void retreat() {
        // implementation for ranged robot retreat
        System.out.println(getName() + " is retreating from the enemy.");
    }
}
