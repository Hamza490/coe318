package coe318.lab6;

public class Node{
  double voltage = 0, current = 0, power;

  public Node(double voltage, double current){
    this.current = current;
    this.voltage = voltage;
  }

  public String toString(){
    return "Current: " + current + "Voltage: " + voltage;
  }
}

