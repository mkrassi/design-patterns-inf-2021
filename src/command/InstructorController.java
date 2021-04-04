package command;

public class InstructorController {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void changeCommand() {
		System.out.println("Executing command");
		this.command.execute();
	}
	
}
