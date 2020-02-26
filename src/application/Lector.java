package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
public static void main(String[] args) throws IOException {
		

		
		iStack<Integer> miStack = new StackVector<Integer>();

	
		ImpCalculadora implementacion = new ImpCalculadora();

		int result = 0;


		
		BufferedReader in = new BufferedReader(new FileReader("src/datos.txt"));

	
		String expresion;


		while((expresion = in.readLine()) != null)
		{
		
			String[] operacion = expresion.split("");

		
			for (int i = 0; i < operacion.length; i++) {

			
				if (operacion[i].equals("+")) {

				
					result = implementacion.Calculate(miStack.pop(), miStack.pop(),"+");

					miStack.push(result);

				
				} else if (operacion[i].equalsIgnoreCase("-")) {

			
					result = implementacion.Calculate(miStack.pop(), miStack.pop(),"-");

					
					miStack.push(result);

			
				} else if (operacion[i].equalsIgnoreCase("*")) {

			
					result = implementacion.Calculate(miStack.pop(), miStack.pop(),"*");

			
					miStack.push(result);

					
				} else if (operacion[i].equalsIgnoreCase("/")) {

				
					result = implementacion.Calculate(miStack.pop(), miStack.pop(),"/");

		
					miStack.push(result);

					
				} else {
					try {

					
						Integer num = Integer.parseInt(operacion[i]);

						
						miStack.push(num);

					} catch(Exception e) {
						//			System.out.println("Calculandoooooooo");
					}

				}
			}
			
			
			System.out.println(String.format("%-20s", expresion) + " = "  + miStack.pop());
		}
		in.close(); 

	}


}
