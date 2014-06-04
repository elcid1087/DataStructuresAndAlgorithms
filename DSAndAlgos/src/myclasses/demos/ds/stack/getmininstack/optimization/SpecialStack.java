package myclasses.demos.ds.stack.getmininstack.optimization;

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
			super.pushSuper(iValue);
			if (isMinStackEmpty()) {
				minStackArray[++minTop] = iValue;
			} else {
				int minPeakValue = minPeak();
				if (iValue < minPeakValue) {
					minStackArray[++minTop] = iValue;
				} 
			}

		}

	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int out = super.popSuper();
			if(out == getMin()){
			minTop--;
			}
		}
	}

	public boolean isMinStackEmpty() {
		return minTop == -1;
	}

	public boolean isMinStackFull() {
		return minTop == 4;
	}

	public int minPeak() {
		return minStackArray[minTop];
	}

	public int getMin() {
		return minStackArray[minTop];
	}
}
