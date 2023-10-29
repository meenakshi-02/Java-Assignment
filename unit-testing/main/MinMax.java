package assignment.junit;

import java.util.Objects;

public class MinMax {
	private int min;
	private int max;
	
	public MinMax(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public MinMax() {
		super();
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "MinMax [min=" + min + ", max=" + max + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(max, min);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinMax other = (MinMax) obj;
		return max == other.max && min == other.min;
	}
	
	

}
