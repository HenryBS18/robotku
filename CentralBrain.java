public class CentralBrain extends Robot implements CombiningRobot {
    private Robot[] componentRobots;

    public CentralBrain(String name, int maxHealth, int power, Robot[] componentRobots) {
        super(name, "central brain", maxHealth, power);
        this.componentRobots = componentRobots;
    }

    public Robot[] getComponentRobots() {
        return componentRobots;
    }

    public void setComponentRobots(Robot[] componentRobots) {
        this.componentRobots = componentRobots;
    }

    @Override
    public void move() {
        // implementation for central brain move
        System.out.println(getName() + " is moving the whole robot.");
    }

    @Override
    public void attack(Robot robot) {
        // implementation for central brain attack
        System.out.println(getName() + " is using a laser beam to attack " + robot.getName());
        robot.setHealth(robot.getHealth() - getPower());
    }

    @Override
    public void defend() {
        // implementation for central brain defend
        System.out.println(getName() + " is activating its force field to defend against enemy attacks.");
    }

    @Override
    public void heal(Robot robot) {
        // implementation for central brain heal
        System.out.println(getName() + " is repairing any damaged component robots.");
        for (Robot componentRobot : componentRobots) {
            componentRobot.setHealth(componentRobot.getMaxHealth());
        }
    }

    @Override
    public void combine() {
        // implementation for central brain combine
        System.out.println(getName() + " is combining the component robots.");
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
        for (Robot componentRobot : componentRobots) {
            setMaxHealth(getMaxHealth() + componentRobot.getMaxHealth());
            setHealth(getHealth() + componentRobot.getHealth());
            setPower(getPower() + componentRobot.getPower());
        }
    }

    @Override
    public void separate() {
        // implementation for central brain separate
        System.out.println(getName() + " is separating the component robots.");
        for (Robot componentRobot : componentRobots) {
            componentRobot.setHealth(getHealth() * componentRobot.getMaxHealth() / getMaxHealth());
        }
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
    }
}
