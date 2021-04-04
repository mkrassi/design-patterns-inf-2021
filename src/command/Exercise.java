package command;

import observer.Trainer;

public class Exercise {

	private String exerciseName;

	public void LieDown() {
		System.out.println("Exercise is `Lie Down`");
		this.exerciseName = "Lie Down";
	}
	
	public void StandUp() {
		System.out.println("Exercise is `Stand up`");
		this.exerciseName = "Stand up";
	}
}
