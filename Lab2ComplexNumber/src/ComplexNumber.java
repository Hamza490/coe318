package coe318.Lab2ComplexNumber;

public class ComplexNumber {
 //Instance variable declarations
private final double re;
private final double im;

 public ComplexNumber(double real, double imaginary) {
  //Initialize the instance variables
  this.re = real;
  this.im = imaginary;
 }

 public double getReal() {
  return re;
 }

 public double getImaginary() {
  return im;
 }

 public ComplexNumber negate() {
  return new ComplexNumber(-this.re, -this.im);
 }

 public ComplexNumber add(ComplexNumber z) {
  return new ComplexNumber(this.re + z.re, this.im + z.im); 
 }

 public ComplexNumber subtract(ComplexNumber z) {
  return new ComplexNumber(this.re-z.re, this.im-z.im); 
 }

 public ComplexNumber multiply(ComplexNumber z) {
  double real = ((this.re * z.re)-(this.im * z.im));
  double imaginary = ((this.re * z.im)+(this.im*z.re));
  return new ComplexNumber(real, imaginary);
 }

 public ComplexNumber reciprocal() {
  double denominator = (this.re * this.re + this.im * this.im);
  return new ComplexNumber(
    this.re/denominator, (-1*this.im)/denominator
    ); 
 }

 public ComplexNumber divide(ComplexNumber z) {
  double real = ((this.re*z.re)+(this.im*z.im))/((z.re*z.re)+(z.im*z.im));
  double imaginary = ((this.im*z.re)-(this.re*z.im))/((z.re*z.re)+(z.im*z.im));
  return new ComplexNumber(real, imaginary); 
 }
 /**
 * Returns a String representation of
 * <em>this</em> in the format:
 * <pre>
 * real +-(optional) i imaginary
 * </pre>
 * If the imaginary part is zero, only the
 * real part is converted to a String.
 * A "+" or "-" is placed between the real
 * and imaginary parts depending on the
 * the sign of the imagrinary part.
 * <p>
 * Examples:
 * <pre>
 * ..println(new ComplexNumber(0,0); -> "0.0"
 * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
 * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
 * </pre>
 * @return the String representation.
 */
 @Override
 public String toString() {
 //DO NOT MODIFY THIS CODE!
 String str = "" + this.getReal();
 if (this.getImaginary() == 0.0) {
 return str;
 }
 if (this.getImaginary() > 0) {
 return str + " + i" + this.getImaginary();
 } else {
 return str + " - i" + -this.getImaginary();
 }
 }
 }