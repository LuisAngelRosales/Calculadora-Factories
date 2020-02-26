package application;
public class FactoryStack<E> {
	
	public iStack<E> getStack(String implementacion) {
		if(implementacion == null) {
			return new ImplementacionStackDefault<E>();
		}
		if(implementacion.equalsIgnoreCase("Vector")) {
			return new StackVector<E>();
		}
		if(implementacion.equalsIgnoreCase("ArrayList")) {
			return new Stack<E>();
		}
		if(implementacion.equalsIgnoreCase("List")) {
			return null;
		}
		return new ImplementacionStackDefault<E>();
	}

}
