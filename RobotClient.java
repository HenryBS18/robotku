public class RobotClient {
    public static void main(String[] args) {
        // create component robots
        Robot[] componentRobots = {
            new MeleeRobot("Melee 1", "melee", 100, 50, 10),
            new MeleeRobot("Melee 2", "melee", 100, 50, 10),
            new RangedRobot("Ranged 1", "ranged", 80, 50, 20),
            new RangedRobot("Ranged 2", "ranged", 80, 50, 20),
            new SupportRobot("Support 1", "support", 120, 50, 50)
        };

        // create central brain
        CentralBrain centralBrain = new CentralBrain("Large Robot", 500, 200, componentRobots);

        // combine component robots into a larger robot
        centralBrain.combine();

        // demonstrate movement and communication of smaller robots
        System.out.println("Demonstrating movement and communication of smaller robots:");
        for (Robot componentRobot : componentRobots) {
            componentRobot.move();
            if (componentRobot instanceof MeleeRobot) {
                ((MeleeRobot) componentRobot).useAbility();
            } else if (componentRobot instanceof RangedRobot) {
                ((RangedRobot) componentRobot).useAbility();
            } else if (componentRobot instanceof SupportRobot) {
                ((SupportRobot) componentRobot).useAbility();
            }
        }

        centralBrain.defend();

        centralBrain.heal(centralBrain);

        // demonstrate movement and attack of larger robot
        System.out.println("Demonstrating movement and attack of larger robot:");
        centralBrain.move();
        centralBrain.attack();

        // demonstrate separation of larger robot into component robots
        System.out.println("Demonstrating separation of larger robot into component robots:");
        centralBrain.separate();
    }
}
