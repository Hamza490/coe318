package coe318.lab6;

public class Resistor{
  Node node1, node2;
  double resistance;
  int identity;
  private static int nextID = 0;

  public Resistor(double resistance, Node node1, Node node2){
    this.identity = nextID++;
    this.resistance = resistance;
    this.node1 = node1;
    this.node2 = node2;
  }

  public Node [] getNodes(){

    Node [] nodes = new Node[2];
    nodes[0] = node1;
    nodes[1] = node2;

    return nodes;

  }

  public String toString(){
    return "R " + this.identity + 
      " Node1 " + node1 + " Node2 " + node2 + 
      " Resistance: " + resistance + "ohms";
  }
}