abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.13;

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}