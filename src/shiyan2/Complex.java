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
    void s_R(double sr){
        this.realPart = sr;
    }
    void s_I(double si){
        this.imaginPart = si;
    }
    double g_R(){
        return realPart;
    }
    double g_I(){
        return imaginPart;
    }
    Complex complexAdd(Complex a){
        Complex t_c = new Complex((this.g_R() + a.g_R()),(this.g_I() + a.g_I()));
        return t_c;
    }
    Complex complexSub(Complex a){
        Complex t_c = new Complex((this.g_R() - a.g_R()),(this.g_I() - a.g_I()));
        return t_c;
    }
    Complex complexMulti(Complex a){
        Complex t_c = new Complex();
        t_c.s_R( ( this.g_R() * a.g_R() ) - (this.g_I() * a.g_I() ) );
        t_c.s_I( ( this.g_R() * a.g_I() ) + ( this.g_I() * a.g_R() ) );
        return t_c;
    }
    Complex complexDiv(Complex a){
        Complex t_c_a = new Complex(a.g_R(),-1 * a.g_I());
        double t_num = Math.pow(a.g_R(),2) + Math.pow(a.g_I(),2);
        Complex t_c2 =this.complexMulti(t_c_a);
        Complex t_c = new Complex((t_c2.g_R() / t_num),(t_c2.g_I() / t_num));
        return t_c;
    }
    Complex multiReal(double d){
        Complex t_c = new Complex(this.realPart * d,this.imaginPart * d);
        return t_c;
    }
    double getArg(){
        return Math.atan(this.imaginPart / this.realPart);
    }
    Complex minPoint(Complex c){
        return new Complex(((this.realPart + c.realPart) / 2),((this.imaginPart + c.imaginPart) / 2));
    }
    boolean equals(Complex a){
        return ( ( this.g_R() == a.g_R() ) && ( this.g_I() == a.g_I() ) );
    }
    public String toString() {
        if (this.realPart != 0) {
            if (this.imaginPart > 0) {
                if (this.imaginPart == 1) {
                    return new DecimalFormat("#.##").format(this.realPart) + "+i";
                } else {
                    return new DecimalFormat("#.##").format(this.realPart) + "+" + new DecimalFormat("#.##").format(this.imaginPart) + "i";
                }
            } else if (this.imaginPart < 0) {
                if (this.imaginPart == -1) {
                    return new DecimalFormat("#.##").format(this.realPart) + "-i";
                } else {
                    return new DecimalFormat("#.##").format(this.realPart) + new DecimalFormat("#.##").format(this.imaginPart) + "i";
                }
            } else {
                return new DecimalFormat("#.##").format(this.realPart) + "";
            }
        } else {
            if (this.imaginPart > 0) {
                if (this.imaginPart == 1) {
                    return "i";
                } else {
                    return new DecimalFormat("#.##").format(this.imaginPart) + "i";
                }
            } else if (this.imaginPart < 0) {
                if (this.imaginPart == -1) {
                    return "-i";
                } else {
                    return new DecimalFormat("#.##").format(this.imaginPart) + "i";
                }
            } else {
                return "0";
            }
        }
    }
}
