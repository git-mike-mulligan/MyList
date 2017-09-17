import com.gmail.developer.mpm.datastructures.List;
import com.gmail.developer.mpm.datastructures.EmptyListException;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		
		list.insertAtFront( -1 );
		list.print();
		
		list.insertAtFront( 0 );
		list.print();
		
		list.insertAtBack( 1 );
		list.print();
		
		list.insertAtBack( 5 );
		list.print();

	}

}
