
package coe318.lab1;

public class Resistor {
    //Instance (state) variables  
    double  r;
    double i;

    public Resistor(double resistance) {
        //Set values of state variables
        r = resistance;
        i = 0.0;
    }

    public double getResistance() {
        return r;
    }

    public double getVoltage() {
        return i*r;
    }

    public void setVoltage(double voltage) {
        i = voltage/r;
    }

    public double getCurrent() {
        return i;
    }

    public void setCurrent(double current) {
        i = current;
    }

    public double getPower() {
        return (i*r)*i;
    }

    /**
     * A simple example of using a Resistor. <p> The output should be:
     * <pre>
     * Creating a 50 Ohm resistor (r1)
     * Its resistance is 50.0 Ohms
     * Its current is 0.0 Amps
     * Its voltage is 0.0 Volts
     * Its power is 0.0 Watts
     * Creating a 100 Ohm resistor (r2)
     * Its resistance is 100.0 Ohms
     * Setting r1's current to 2 Amps
     * Its current is 2.0 Amps
     * Its voltage is 100.0 Volts
     * Its power is 200.0 Watts
     * Setting r1's voltage to 50 Volts
     * Its current is 1.0 Amps
     * Setting r2's current to 3 Amps
     * Its voltage is 300.0 Volts
     * </pre>
     *
     * @param args (Command line arguments not used.)
     */

    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");

    }
}