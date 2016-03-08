package thisRobot;
import java.util.Scanner;

public class MovementBot extends LazerRobot{
	Scanner input = new Scanner(System.in);
	public MovementBot(){
		
	}
	public void BotGo(){
		String RobotName = input.next();
		int movementForward = 3;
		int movementBackward = 4;
		int movementLeft = 2;
		int movementRight = 5;
		do
			switch(input.nextInt()){
			case 1:
				power  = power - movementForward;
				System.out.println(RobotName + " " + "moves Forward");
				System.out.println("battery left:" + " " + power);
				break;
			case 2:
				power = power - movementBackward;
				System.out.println(RobotName + " " + "moves Backward");
				System.out.println("battery left:" + " " + power);
				break;
			case 3:
				power = power - movementLeft;
				System.out.println(RobotName + " " + "moves Left");
				System.out.println("battery left:" + " " + power);
				break;
			case 4:
				power = power - movementRight;
				System.out.println(RobotName + " " + "moves Right");
				System.out.println("battery left:" + " " + power);
				break;
			case 5:
				power = power - LazerPowerUsage;
				Lazer = (true);
				System.out.println("you fire your lazor");
				System.out.println("pew pew");
				System.out.println("battery left:" + " " + power);
				Lazer = (false);
			default:
	
			}while(power>=0);
	input.close();
	}
}
