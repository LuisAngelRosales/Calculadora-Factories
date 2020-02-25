import java.util.ArrayList;

public class Stack<E> implements iStack<E>
{
	protected ArrayList<E> datos;

	public Stack()

	{
		datos = new ArrayList<E>();
	}

	public void push(E item)

	{
		datos.add(item);
	}

	public E pop()

	{
		return datos.remove(size()-1);
	}

	public E peek()

	{
		return datos.get(size() - 1);
	}

	public int size()

	{
		return datos.size();
	}

	public boolean empty()

	{
		return size() == 0;
	}
}