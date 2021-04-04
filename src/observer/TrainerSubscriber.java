package observer;

public class TrainerSubscriber implements Observer {

	
//	private String name;
//	private Observable topic;

	private String name;
	private Observable spectator;
	
	public TrainerSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.spectator == null) {
			System.out.println(this.name + " has no started yet");
			return;
		}
		String spectatorExercise = this.spectator.getUpdate();
		System.out.println(this.name + " updated with new exercise");
	}

	@Override
	public void setTopic(Observable spectator) {
		this.spectator = spectator;
	}

}
