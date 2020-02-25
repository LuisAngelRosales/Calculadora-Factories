
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
	
	protected Vector<E> datos;
	
	public StackVector()

	{
		datos = new Vector<E>();
	}

	public void push(E item) {
	
		datos.add(item);
		
	}

	@Override
	public E pop() {

		return datos.remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return datos.get(size() - 1);
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return datos.isEmpty();
	}

	@Override
	public int size() {

		return datos.size();
	}

}