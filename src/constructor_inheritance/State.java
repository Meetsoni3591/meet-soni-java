package constructor_inheritance;

public class State {
	private String State;
	

	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public State() {
		this.State = "gujarat";
	}
	

	public State(String state) {
//		super();
		this.State = state;
	}


	@Override
	public String toString() {
		return  " "+State ;
	}
	
}
