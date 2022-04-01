package com.github.ivan100kg.stepikjava;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComplexNumber) {
            ComplexNumber cN = (ComplexNumber) obj;
            return Math.abs(re - cN.re) < 0.00001 && Math.abs(im - cN.im) < 0.00001;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) (re * 5 + im * 7);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 12);
        ComplexNumber b = new ComplexNumber(2, 12);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " == " + b.hashCode());
    }
}
