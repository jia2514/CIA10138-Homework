package hwext_hero;

public class Hero {

	private String name;
	private int level;
	private double exp;


	private AttackBehavior attackBehavior;
	private DefendBehavior defendBehavior;
	private MoveBehavior moveBehavior;
	
	

	// Constructor
	public Hero() {
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}


	
	

	public AttackBehavior getAttackBehavior() {
		return attackBehavior;
	}	
	
	public void setAttackBehavior(AttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}

	public DefendBehavior getDefendBehavior() {
		return defendBehavior;
	}

	public void setDefendBehavior(DefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
	}

	public MoveBehavior getMoveBehavior() {
		return moveBehavior;
	}

	public void setMoveBehavior(MoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}

	// methods
	public String roleSpeak() {
		String roleSpeak = this.getClass().getSimpleName() + ", 名字/" + this.getName() + ", 等級/" + this.getLevel() + ", 經驗值/"
				+ this.getExp();
		return roleSpeak;
	}

	public void attack() {
		attackBehavior.attack();
	}

	public void move() {
		moveBehavior.move();
	}

	public void defend() {
		defendBehavior.defend();
	}

	
	
	
}
