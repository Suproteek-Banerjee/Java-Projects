public class Computation {
    private int sum;
    private int count;

    public Computation() {
        this.sum = 0;
        this.count = 0;
    }

    public void add(int number) {
        if (number > 0) {
            this.sum += number;
            this.count++;
        }
    }

    public int getSum() {
        return this.sum;
    }

    public double getAverage() {
        if (this.count == 0) {
            return 0.0;
        }
        return (double) this.sum / this.count;
    }
}
