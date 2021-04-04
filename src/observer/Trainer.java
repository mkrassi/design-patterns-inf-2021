package observer;

import command.Command;
import command.InstructorController;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private String trainerExercise;
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// Can be something more than just a getter
		return this.trainerExercise;
	}

	public void setTrainerExercise(Command command) {
		InstructorController instructorController = new InstructorController();
		instructorController.setCommand( command );
		instructorController.changeCommand();

		this.notifyObservers();
	}

}
