package Assignment4;
import java.util.*;

public class problem4 {
	public static void main(String[] args){
		
		int a=0;
		Queue<Integer> q= new LinkedList<>();
		System.out.println("Enter the elements of queue are:");
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a=s.nextInt();
			q.add(a);
		}
		System.out.println("Elements of queue are"+ q);
		
		int removedele = q.remove();
		System.out.println("Removed element-" + removedele);

		System.out.println("The Remaining elements of queue are"+q);
		
		int head = q.peek();
		System.out.println("Head of queue-" + head);
		
		int size = q.size();
		System.out.println("Size of queue-" + size);
	}
}
