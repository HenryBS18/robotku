public class MeleeRobot extends Robot {
    private int armor;

    public MeleeRobot(String name, String type, int maxHealth, int power, int armor) {
        super(name, type, maxHealth, power);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack(Robot robot) {
        // implementation for melee robot attack
        System.out.println(getName() + " is using a sword to attack " + robot.getName());
        robot.setHealth(robot.getHealth() - (getPower() - ((MeleeRobot) robot).getArmor()));
    }

    public void charge() {
        // implementation for melee robot charge
        System.out.println(getName() + " is charging towards the enemy.");
    }
}
