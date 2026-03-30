public class Vehicle1 {
    private double load;
    private static final double maxLoad = 10000;

    public double getLoad() {
        return this.load;
    }
    public double getMaxLoad() {
        return maxLoad;
    }
    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}