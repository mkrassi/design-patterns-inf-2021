package command;

public class LieDownCommand implements Command {

	private Exercise exercise;
	
	public LieDownCommand(Exercise exercise) {
		this.exercise = exercise;
	}

	@Override
	public void execute() {
		this.exercise.LieDown();
	}

}
