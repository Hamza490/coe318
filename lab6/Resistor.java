package coe318.lab6;

public class Resistor{
  Node node1, node2;
  double resistance;
  int identity;

  public Resistor(double resistance, Node node1, Node node2){
    identity = 1;
    identity++;

    this.resistance = resistance;
    this.node1 = node1;
    this.node2 = node2;
  }

  public Node [] getNodes(){

  }

  public String toString(){
    return "R " + this.identity + 
      " Node1 " + node1 + " Node2 " + node2 + 
      " Resistance: " + resistance + "ohms";
  }
}