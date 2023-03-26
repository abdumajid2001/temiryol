package uz.boom.temiryol.entity;

public class Problem {
    private double diameter;
    private double sila;
    private double coefficient;
    private double ugol;
    private double a;
    private double b;
    private double c;
    private double weight;
    private double gruz;
    private double loparey;
    private double poteri;
    private double blokov;
    private double diametrBarabana;

    public Problem(double diameter, double sila, double coefficient, double ugol, double a, double b, double c, double weight, double gruz, double loparey, double poteri, double blokov, double diametrBarabana) {
        this.diameter = diameter;
        this.sila = sila;
        this.coefficient = coefficient;
        this.ugol = ugol;
        this.a = a;
        this.b = b;
        this.c = c;
        this.weight = weight;
        this.gruz = gruz;
        this.loparey = loparey;
        this.poteri = poteri;
        this.blokov = blokov;
        this.diametrBarabana = diametrBarabana;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getSila() {
        return sila;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public double getUgol() {
        return ugol;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getWeight() {
        return weight;
    }

    public double getGruz() {
        return gruz;
    }

    public double getLoparey() {
        return loparey;
    }

    public double getPoteri() {
        return poteri;
    }

    public double getBlokov() {
        return blokov;
    }

    public double getDiametrBarabana() {
        return diametrBarabana;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "diameter=" + diameter +
                ", sila=" + sila +
                ", coefficient=" + coefficient +
                ", ugol=" + ugol +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", weight=" + weight +
                ", gruz=" + gruz +
                ", loparey=" + loparey +
                ", poteri=" + poteri +
                ", blokov=" + blokov +
                ", diametrBarabana=" + diametrBarabana +
                '}';
    }

}
