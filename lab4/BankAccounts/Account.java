package coe318.lab4.bankaccounts;

class Account{
String name;
int accountNumber;
double balance;

public Account(String name, int accountNumber, double initBalance){
  this.name = name;
  this.accountNumber = accountNumber;
  balance = initBalance;
}

public String getName(){
  return this.name;
}

public int getNumber(){
  return this.accountNumber;
}

public double getBalance(){
  return this.balance;
}

public boolean withdraw(int withdrawAmount){
  if (withdrawAmount>this.balance || withdrawAmount <= 0){
    return false; //Indicating you can't withdraw more than what you have in the bank
  } else {
      this.balance = this.balance - withdrawAmount;
      return true;
  }
}

public boolean deposit(int depositAmount){
  if(depositAmount<= 0){
    return false;
  } else {
    this.balance = this.balance + depositAmount;
    return true;
  }
}

public String toString() {
  return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
}
}