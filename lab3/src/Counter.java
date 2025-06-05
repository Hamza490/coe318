package coe318.lab3;

public class Counter {
    //Instance variables here
    private int modulus;
    private Counter left;
    private int dig;

    public Counter(int modulus, Counter left) {
      this.modulus = modulus;
      this.left = left;
    }

    public int getModulus() {
        return modulus;
    }

    public Counter getLeft() {
        return left;
    }

    public int getDigit() {
        return dig;
    }

    public void setDigit(int digit) {
      dig = digit;
    }

    public void increment() {
      if(this.dig<modulus-1){
        dig++;
      } 
      else{
        if(left!=null){
          dig = 0;
          left.increment();
        } else{
          dig = 0;
        }
      }
      }

    public int getCount() {
      if (left == null) {
          return dig;
      } else {
          return left.getCount() * modulus + dig;
      }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}