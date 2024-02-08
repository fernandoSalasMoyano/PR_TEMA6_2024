package es.studium.Taller;

public class Ejemplo6
{

	public static void main(String[] args)
	{
		//IllegalArgumentException
		try
		{
			int edad = -5; // Edad negativa, lo cual es inválido
			
			if (edad < 0) 
			{
				throw new IllegalArgumentException("La edad no puede ser negativa");
			} 
			else 
			{
				System.out.println("La edad es: " + edad);
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("La edad no puede ser negativa");
		}
		catch(Exception e)
		{
			System.out.println("Error desconocido");
		}
		finally
		{
			System.out.println("Fin de la transmisión");
		}
	}
}
