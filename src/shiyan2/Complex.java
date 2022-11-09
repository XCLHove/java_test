package shiyan2;

import java.text.DecimalFormat;

public class Complex {
    private double realPart,imaginPart;
    Complex(){
        this.realPart = 0;
        this.imaginPart = 0;
    };
    Complex(double r,double i){
        this.realPart = r;
        this.imaginPart = i;
    }
    void setReal(double sr){
        this.realPart = sr;
    }
    void setImagin(double si){
        this.imaginPart = si;
    }
    double getReal(){
        return realPart;
    }
    double getImagin(){
        return imaginPart;
    }
    Complex complexAdd(Complex a){
        Complex temp_complex = new Complex();
        temp_complex.setReal(this.getReal() + a.getReal());
        temp_complex.setImagin(this.getImagin() + a.getImagin());
        return temp_complex;
    }
    Complex complexSub(Complex a){
        Complex temp_complex = new Complex();
        temp_complex.setReal(this.getReal() - a.getReal());
        temp_complex.setImagin(this.getImagin() - a.getImagin());
        return temp_complex;
    }
    Complex complexMulti(Complex a){
        Complex temp_complex = new Complex();
        temp_complex.setReal( ( this.getReal() * a.getReal() ) - (this.getImagin() * a.getImagin() ) );
        temp_complex.setImagin( ( this.getReal() * a.getImagin() ) + ( this.getImagin() * a.getReal() ) );
        return temp_complex;
    }
    Complex complexDiv(Complex a){
        Complex temp_complex = new Complex();
        Complex temp_complex_a = new Complex(a.getReal(),-1 * a.getImagin());
        double temp_number = Math.pow(a.getReal(),2) + Math.pow(a.getImagin(),2);
        Complex temp_complex2 =this.complexMulti(temp_complex_a);
        temp_complex.setReal(temp_complex2.getReal() / temp_number);
        temp_complex.setImagin(temp_complex2.getImagin() / temp_number);
        return temp_complex;
    }
    Complex multiReal(double d){
        Complex temp_complex = new Complex(this.realPart * d,this.imaginPart * d);
        return temp_complex;
    }
    double getArg(){
        return Math.atan(this.imaginPart / this.realPart);
    }
    Complex minPoint(Complex c){
        return new Complex(((this.realPart + c.realPart) / 2),((this.imaginPart + c.imaginPart) / 2));
    }
    boolean equals(Complex a){
        return ( ( this.getReal() == a.getReal() ) && ( this.getImagin() == a.getImagin() ) );
    }
    public String toString() {
        if (this.realPart != 0) {
            if (this.imaginPart > 0) {
                if (this.imaginPart == 1) {
                    return new DecimalFormat("#.###").format(this.realPart) + "+i";
                } else {
                    return new DecimalFormat("#.###").format(this.realPart) + "+" + new DecimalFormat("#.###").format(this.imaginPart) + "i";
                }
            } else if (this.imaginPart < 0) {
                if (this.imaginPart == -1) {
                    return new DecimalFormat("#.###").format(this.realPart) + "-i";
                } else {
                    return new DecimalFormat("#.###").format(this.realPart) + new DecimalFormat("#.###").format(this.imaginPart) + "i";
                }
            } else {
                return new DecimalFormat("#.###").format(this.realPart) + "";
            }
        } else {
            if (this.imaginPart > 0) {
                if (this.imaginPart == 1) {
                    return "i";
                } else {
                    return new DecimalFormat("#.###").format(this.imaginPart) + "i";
                }
            } else if (this.imaginPart < 0) {
                if (this.imaginPart == -1) {
                    return "-i";
                } else {
                    return new DecimalFormat("#.###").format(this.imaginPart) + "i";
                }
            } else {
                return "0";
            }
        }
    }
}
