/*
*  Program calculate e=mc^2
*
* @author  Devin Jhu
* @version 1.0
* @since 2022-10-19
*/

// Import.
import java.util.Scanner;

/**
* This program calculates e=mc^2.
*/
final class Energy {

    /**
    * Speed of light.
    */
    public static final double SPEED_OF_LIGHT = Math.pow(299792458, 2);

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Cariable
        final double energy;
        final float massAmount;
        // Scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask for inputs
        System.out.println("input mass(kg)  ");

        /*
        * Try catch on the inputs.
        */
        try {
            // Stores float in variable.
            massAmount = myObj.nextFloat();

            // Calculations
            energy = massAmount * SPEED_OF_LIGHT;
            System.out.println("the energy produced is" + energy + "J");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("not a number");
        } finally {
            System.out.println("\ndone.");
        }
    }
}
