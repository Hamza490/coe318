package coe318.lab6;

public class Node{
  int identity;

  private static int nextId = 0;   
  public Node(){
    this.identity = nextId++;
  }

  @Override
  public String toString(){
    return "Node " + Integer.toString(identity);
  }
}

