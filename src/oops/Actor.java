package oops;

public enum Actor {
	VIJAY("5C"), AJITH("5C"), SK {
		public void acting() {
			System.out.println("Comedy actors");
		}
	};
	private String salary;
	Actor(String a) {
		this.salary = a;
	}
	Actor() {

	}
	public void acting() {
		System.out.println("Normal actors");
	}
	public String getSalary() {
		return salary;
	}

}
