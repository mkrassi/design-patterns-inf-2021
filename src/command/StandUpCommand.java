package command;

public class StandUpCommand implements Command {

	private Exercise exercise;
	
	public StandUpCommand(Exercise exercise) {
		this.exercise = exercise;
	}

	@Override
	public void execute() {
		this.exercise.StandUp();
	}

}
