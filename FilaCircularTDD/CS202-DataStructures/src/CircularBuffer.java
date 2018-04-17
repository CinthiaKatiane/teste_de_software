import java.util.ArrayList;
import java.util.List;

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
		if (buffer_counter > 0) 
		{ 
			return false;
		} 
		else 
		{
			return true;	
		}
		
	}

	public boolean isFull() {
		
		if (capacity() > 0 && buffer_counter >= capacity()) {
			return true;
		}
		else 
		{
			return false;
		}
		
}

	public void put(int i) throws CircularBufferException{
			buffer.add(i);
			buffer_counter++;
	}

	public int get() {
		int elemnt = buffer.remove(out_counter);
		buffer_counter--;
		return elemnt;
	}

	public int capacity() {
		return cap;
	}

}
