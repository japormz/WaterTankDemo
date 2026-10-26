package test;

public class Main {

	
		private String name;
		private int[] buckets;
		private int top;
		
		public Main() {
			this.name = "Standard Tank";
			this.buckets = new int[5];
			this.top = -1;
			System.out.println(name + " create no-argument constructor");
			
	}
		public Main(String name, int capacity) {
			this.name = name;
			this.buckets = new int[capacity];
			this.top = -1;
		System.out.println(name + ": Holds " + capacity + "buckets.");
		}
		public void pour(int liters) {
			if (top==buckets.length - 1) {
				System.out.println("OVERFLOW!" + name + "is full." + liters + "it spilled on the floor!");
				return;
			}
			top++;
			buckets[top] = liters;
			System.out.println("Poured " + liters + "L into " + name);
			
		}
		public int drain() {
			if (isEmpty()) {
				System.out.println("UNDERFLOW!");
				return 0;
			}
			int liters = buckets[top];
			top--;
			System.out.println("Drained " + liters + "L from " + name);
			return liters;
			
		}
		public int checkTop() {
			if (isEmpty()) {
				System.out.println(name + "is empty.");
				return 0;
			}
			return buckets[top];
		}
		public boolean isEmpty() {
			return top == -1;
				
		}
		public int bucketCount() {
			return top + 1;
		}
		public int totalLiters() {
			int total = 0;
			for (int i = 0; i<= top; i++) {
				total += buckets[i];
				
			}
			return total;
		}
		
		public class WaterTankDemo {
			
		}
		public static void main(String[] args) {
			Main tank1 = new Main();
			tank1.pour(10);
			tank1.pour(20);
			tank1.pour(15);
		System.out.println("Top Bucket: " + tank1.checkTop() + "L");
		    tank1.drain();
		    System.out.println("Buckets left: " + tank1.bucketCount() + 
		    		"| Total Water: " + tank1.bucketCount());
		}
}
		
