
public class intro {
    private int a;
    private byte b;
    private int[] p = { 3, 4, 5 };
    private int pint;

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

}