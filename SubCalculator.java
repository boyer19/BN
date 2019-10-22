import java.util.Scanner;

	// This program calculates the crush depth of a homebuilt submersible 
	// Recreated by Matt Boyer 
	// Oct 12, 2019
	
	public class SubCalculator
{
		  public static void main(String[] args)
   {
		 // Variables
		 double T;
		 double R;
		 double L;
		 double V;
		 double E;
		 
		 
		 // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Submarine Hull Strength Program");
			System.out.println(" for cylindrical steel hulls, elastic bucking only");
			
			// Thickness
			System.out.println("Enter the hull thickness in inches: ");
			T = keyboard.nextFloat();
			
			// Radius
			System.out.println("Enter the hull radius in inches: ");
			R = keyboard.nextFloat();
			
			// Length
			System.out.println("Enter the hull length in inches: ");
			L = keyboard.nextFloat();
			
			// Poisson's Ratio (for Steel(0.29))
			System.out.println("Enter Poisson's Ratio (use 0.3 for steel): ");
			V = keyboard.nextFloat();
			
			// Axial Modulus of Elasticity (3E7 for Steel)
			System.out.println("Enter Axial Modulus of Elasticity (3E7 for Steel): ");
			E = keyboard.nextFloat();
			
		 double X = (T / R) * (T / R);
		 double Y = V * V;
		 double Z = 1/(1-Y);
		 double W = Z * X;
		 double Q = Math.pow(W , .25);
		 double P = 0.807 * ((E * T * T) / (L * R));
		 double p = P * Q;
		 double D = p * 2.245;
			
			System.out.println("According to Roark, Formulas for Stress and Strain, 1961");
			System.out.println(p + " is crush pressure in psi");
                        
			System.out.println(D + " is the crush depth in feet");
			
	 }
}