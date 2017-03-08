package z4b4.day61;

public class Player {
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	private String name;//player name
	private int score;//player score
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+":"+this.getScore();
	}

}
