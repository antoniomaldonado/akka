package akka.pi.messages;

public class Result {
	private final double value;

	public Result(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
