package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver {
    private float a;
    private float b;
    private float c;
    private float delta;
    
    private void computeDeterminant()// non serve a chi usa coputeDeterminant--> occultamento o mascheramento
    {
        this.delta = (float)Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }
    
    public ComplexNumber computeX1() {
        this.computeDeterminant();
        ComplexNumber soluzione = new ComplexNumber();
        if(this.delta < 0) {
            soluzione.setRe(-this.getB());
            soluzione.setIm((float)Math.sqrt(-this.delta));
        }
        else {
            soluzione.setRe(-this.getB() + (float)Math.sqrt(this.delta));
            soluzione.setIm(0);
        }
        soluzione.setRe(soluzione.getRe()/(2*this.getA()));
        soluzione.setIm(soluzione.getIm()/ (2*this.getA()));
        return soluzione;
    }
    
    public ComplexNumber computeX2() {
        this.computeDeterminant();
        ComplexNumber soluzione = new ComplexNumber();
        if(this.delta < 0) {
            soluzione.setRe(-this.getB());
            soluzione.setIm(-(float)Math.sqrt(-this.delta));
        }
        else {
            soluzione.setRe(-this.getB() - (float)Math.sqrt(this.delta));
            soluzione.setIm(0);
        }
        soluzione.setRe(soluzione.getRe()/(2*this.getA()));
        soluzione.setIm(soluzione.getRe()/ (2*this.getA()));
        return soluzione;
    }
       
    public float getA(){
        return this.a;//per accedere al campo utilizzo questo metodo
    }

    /**
     * @param a the a to set
     */
    public void setA(float value) {
        if(value != 0)
            this.a = value;
        else{
            throw new IllegalArgumentException("The value of a must be different to 0");
        }
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
}