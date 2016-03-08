package thisRobot;

public class RunRobot{

	public static void main(String[] args) {
			MainGuide Directions = new MainGuide();
			MovementBot GoRobotRun = new MovementBot();
			Directions.OptionGuides();
			GoRobotRun.BotGo();
}
}