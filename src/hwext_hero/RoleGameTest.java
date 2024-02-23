package hwext_hero;

public class RoleGameTest {

	public static void main(String[] args) {

		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);

		saber.setAttackBehavior(new AttackSword());
		saber.setMoveBehavior(new MoveRun());
		saber.setDefendBehavior(new DefendAction());

		archer.setAttackBehavior(new AttackArrow());
		archer.setMoveBehavior(new MoveRun());
		archer.setDefendBehavior(new DefendAction());

		
		saber.attack();
		archer.attack();
	}
}
