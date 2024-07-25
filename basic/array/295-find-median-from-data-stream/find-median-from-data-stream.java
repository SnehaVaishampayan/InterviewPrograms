class MedianFinder {
    // two heaps.. 
    // max pq .. top max..for first half..
    // min pq ..top min..for secondhalf numbes

	private  PriorityQueue<Integer> firstHalfMaxHeap;
	private  PriorityQueue<Integer> secondHalfMinHeap;

	public MedianFinder() {
		this.firstHalfMaxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		this.secondHalfMinHeap = new PriorityQueue<Integer>();
	}

	public void addNum(int num) {
		// while adding.. add number two secondhalf.. if secondhalf.pop -> fisthalf 
		// ifsecodnhalf.size < fisrt,, then 
		// if firstHalf <= secondHalf .. offer to firstHalf.. 

		if(this.firstHalfMaxHeap.isEmpty() ||this.firstHalfMaxHeap.peek() >= num) {
			this.firstHalfMaxHeap.offer(num);
		}
		else {
			this.secondHalfMinHeap.offer(num);
		}

        if(this.firstHalfMaxHeap.size() > this.secondHalfMinHeap.size() + 1) {
            this.secondHalfMinHeap.offer(this.firstHalfMaxHeap.poll());          //storing 1 element extra in max for odd case

        } else if(this.firstHalfMaxHeap.size() < this.secondHalfMinHeap.size()){
            this.firstHalfMaxHeap.offer(this.secondHalfMinHeap.poll());
        }
	}

	public double findMedian() {
		if(this.firstHalfMaxHeap.size() == this.secondHalfMinHeap.size()) { // even numbers..addMidTwo/2
            double sum = this.firstHalfMaxHeap.peek() + this.secondHalfMinHeap.peek();
			return sum/2;
		}
		else {
			return (double) ( this.firstHalfMaxHeap.peek() );
		}
	}
}