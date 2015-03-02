package complexnumber;

public class ComplexNumber {
    private float re;
    private float im;
    
    public String formatComplexNumber() {
        String r = this.getRe() + "+(" + this.getIm() + ")i";
        return r;
    }

    /**
     * @return the re
     */
    public float getRe() {
        return re;
    }

    /**
     * @param re the re to set
     */
    public void setRe(float re) {
        this.re = re;
    }

    /**
     * @return the im
     */
    public float getIm() {
        return im;
    }

    /**
     * @param im the im to set
     */
    public void setIm(float im) {
        this.im = im;
    }
}