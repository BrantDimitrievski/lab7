public class LifelineSite extends Site {
    public static final double TAX_RATE = 0.13;
    private double _units;
    private double _rate;

    public LifelineSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
        ///
    }
}