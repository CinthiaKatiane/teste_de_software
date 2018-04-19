import java.util.ArrayList;

public class CircularBuffer {
	private int buffer_counter;
	private int out_counter;
	private int cap;
	private ArrayList<Integer> buffer = new ArrayList<Integer>();
	
	public CircularBuffer() {
		buffer_counter = 0;
		out_counter = 0;
		cap = 1000;
	}

	public CircularBuffer(int i) {
		cap = i;
	}

	public boolean isEmpty() {
		if (buffer_counter > 0){ 
			return false;
		} 
		else {
			return true;	
		}
	}

	public boolean isFull() {
		if (capacity() > 0 && buffer_counter >= capacity()) {
			return true;
		}
		else {
			return false;
		}
	}

	public void put(int i) throws CircularBufferException
	{
		if (!isFull()) {
			buffer.add(i);
			buffer_counter++;
		}
		else {
			throw new CircularBufferException("Put to full circular buffer");
		}
	}
	
	public int get() {
		if (!isEmpty()) {
			int elemnt = buffer.remove(out_counter);
			buffer_counter--;
			return elemnt;
		}
		else {
			throw new CircularBufferException("Get from empty circular buffer");
		}
	}

	public int capacity() {
		return cap;
	}
}
