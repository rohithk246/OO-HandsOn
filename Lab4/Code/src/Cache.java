public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block
	static void setMaxCapacity(int x) {
		MAX_CAPACITY = x;
	}

	static int getMaxCapacity() {
		if(MAX_CAPACITY==0) {
			System.out.println("Enter Max Capacity : ");
			setMaxCapacity(Console.readInt());
		}
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}