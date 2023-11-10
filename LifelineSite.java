public class LifelineSite extends Site{

    public LifelineSite(int _units, double _rate) {
        super(_units, _rate);
    }

    private double getBillableAmount(double _units, double _rate) {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
