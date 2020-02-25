public abstract class AbstractStack<E> implements iStack<E>{
	
	public abstract void push(E item);

	public abstract E pop();


	public abstract E peek();


	public abstract boolean empty();

	public abstract int size();

}
