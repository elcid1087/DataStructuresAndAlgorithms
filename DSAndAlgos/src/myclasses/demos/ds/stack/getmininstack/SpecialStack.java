package myclasses.demos.ds.stack.getmininstack;

// TODO: Auto-generated Javadoc
/**
 * The Class SpecialStack.
 */
public class SpecialStack extends Stack {

	/** The min stack array. */
	private final int[] minStackArray;

	/** The min top. */
	private int minTop;

	/**
	 * Instantiates a new special stack.
	 * 
	 * @param s
	 *            the s
	 */
	public SpecialStack(int s) {
		super(s);
		minStackArray = new int[s];
		minTop = -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see myclasses.demos.ds.stack.getmininstack.Stack#push(int)
	 */
	@Override
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see myclasses.demos.ds.stack.getmininstack.Stack#pop()
	 */
	@Override
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			super.pop();
			minTop--;
		}
	}

	/**
	 * Checks if is min stack empty.
	 * 
	 * @return true, if is min stack empty
	 */
	public boolean isMinStackEmpty() {
		return minTop == -1;
	}

	/**
	 * Checks if is min stack full.
	 * 
	 * @return true, if is min stack full
	 */
	public boolean isMinStackFull() {
		return minTop == 4;
	}

	/**
	 * Min peak.
	 * 
	 * @return the int
	 */
	public int minPeak() {
		return minStackArray[minTop];
	}

	/**
	 * Gets the min.
	 * 
	 * @return the min
	 */
	public int getMin() {
		return minStackArray[minTop];
	}
}
