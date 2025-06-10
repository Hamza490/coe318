package coe318.lab6;

import java.util.ArrayList;

public class Circuit{
  private static Circuit instance = null;
  private ArrayList <Resistor> resistors = new ArrayList<>();

  public static Circuit getInstance(){
    if (instance == null){
      instance = new Circuit();
    } 
    
    return instance;
  }

  private Circuit(){};

  public void addResistor(Resistor resistor){
    resistors.add(resistor);
  }

  @Override
  public String toString(){
    String message = "";
  
    for(int i = 0; i<this.resistors.size(); i++){
      message += resistors.get(i).toString() +"\n";
    }

    return message;
  }
  }
