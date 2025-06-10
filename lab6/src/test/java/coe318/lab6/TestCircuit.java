package coe318.lab6;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TestCircuit {

  @Test
  public void testAddResistor (){
        Circuit c = Circuit.getInstance();
        Node n1 = new Node();
        Node n2 = new Node();
        Resistor r = new Resistor(100.0, n1, n2);
        assertNotNull(r);

    /*
    Node n1 = new Node();
    Node n2 = new Node();
    Node n3 = new Node();

    Resistor r1 = new Resistor(100, n1, n2);
    Resistor r2 = new Resistor(200, n1, n3);

    Circuit circuit = Circuit.getInstance();
    System.out.println(circuit);*/
  }
}