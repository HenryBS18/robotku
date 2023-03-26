public class SupportRobot extends Robot {
    private int healingPower;

    public SupportRobot(String name, String type, int maxHealth, int power, int healingPower) {
        super(name, type, maxHealth, power);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void attack(Robot robot) {
        // implementation for support robot attack
        System.out.println(getName() + " is using a stun gun to immobilize " + robot.getName());
        robot.setHealth(robot.getHealth() - (getPower() / 2));
    }

    public void heal(Robot robot) {
        // implementation for support robot heal
        System.out.println(getName() + " is healing " + robot.getName());
        int newHealth = robot.getHealth() + healingPower;
        if (newHealth > robot.getMaxHealth()) {
            newHealth = robot.getMaxHealth();
        }
        robot.setHealth(newHealth);
    }
}
