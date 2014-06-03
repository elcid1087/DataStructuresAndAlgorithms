package myclasses.demos.ds.stack.getmininstack;

public class SpecialStack extends Stack {
	private int[] minStackArray;
	private int minTop;

	public SpecialStack(int s) {
		super(s);
		minStackArray = new int[s];
		minTop = -1;
	}

	public void push(int iValue) {

		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			super.push(iValue);
			if (isMinStackEmpty()) {
				minStackArray[++minTop] = iValue;
			} else {
				int minPeakValue = minPeak();
				if (iValue < minPeakValue) {
					minStackArray[++minTop] = iValue;
				} else {
					minStackArray[++minTop] = minPeakValue;
				}
			}

		}

	}

	public boolean isMinStackEmpty() {
		return minTop == -1;
	}
public boolean isMinStackFull(){
	return minTop==4;
}
	public int minPeak() {
		return minStackArray[minTop];
	}

	public int getMin() {
		return minStackArray[minTop];
	}
}
