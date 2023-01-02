package java_fundamentals;

public class InstanceMembers implements Walk, Run, Hop{
	
	@Override
	public int getSpeed() {
		return 15;
	}
	
	public int getWalkSpeed() {
		return Walk.super.getSpeed();
	}
	
	public int getRunSpeed() {
		return Run.super.getSpeed();
	}

	public static void main(String[] args) {
		System.out.println(new InstanceMembers().getSpeed()); // 15
		System.out.println(new InstanceMembers().getWalkSpeed()); // 5
		System.out.println(new InstanceMembers().getRunSpeed());  // 10
		System.out.println(Hop.getJumpHeight());

	}

}
