package es.studium.Taller;

public class Ejemplo5
{

	public static void main(String[] args)
	{
		try
		{
			final int TAM = 3;
			Object tabla[] = new String[TAM];
			tabla[0] = 4;
			System.out.println(tabla[0]);
		}
		catch(ArrayStoreException ase)
		{
			System.out.println("El número introducido debe ser un String");
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
