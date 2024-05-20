
public class intro {
    private int a;
    private byte b;
    private int[] p = { 3, 4, 5 };
    private int pint;
    private String mot1 = "coucou";
    private String mot3 = new String("coucou");
    private String mot2 = mot3;


    public intro() {
        this.a = 3;
        this.p[0] = 7;
        this.b = 125 + 1;
        this.pint = p[0];
    }

    public int getValeur() {
        return a;
    }

    public int getPint() {
        return pint;
    }

    public byte getB() {
        return b;
    }

    public int getSeven() {
        return this.a;
    }
    public boolean comp1() {
        boolean result;
        result = this.mot1 == this.mot2;
        return result ;
    }
    public boolean comp2() {
        boolean result2;
        result2 = this.mot1.equals(this.mot2);
        return result2 ;
    }
}