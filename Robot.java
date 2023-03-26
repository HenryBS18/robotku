public abstract class Robot {
    private String name;
    private String type;
    private int health;
    private int maxHealth;
    private int power;

    public Robot(String name, String type, int maxHealth, int power) {
        this.name = name;
        this.type = type;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getPower() {
        return power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void attack(Robot robot);

    public void move() {
        // implementation to move the robot to a new location
        System.out.println("Robot " + name + " is moving to a new location.");
    }

    public void attack() {
        // implementation to cause the robot to attack an enemy
        System.out.println("Robot " + name + " is attacking an enemy.");
    }

    public void defend() {
        // implementation to cause the robot to defend itself against an enemy attack
        System.out.println("Robot " + name + " is defending against an enemy attack.");
    }

    public void heal(Robot meleeRobot2) {
        // implementation to cause the robot to heal itself
        System.out.println("Robot " + name + " is healing itself.");
    }

    public void useAbility(){}
}
