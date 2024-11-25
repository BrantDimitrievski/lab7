class ResidentialSite extends Site {
    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    /*
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
     */
}