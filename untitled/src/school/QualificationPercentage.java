package school;

public enum QualificationPercentage {

    THEORETICAL(0.4),
    PRACTICE(0.1),
    RESOLUTION(0.5);

    private final double percentage;

    public double getPercentage() {
        return percentage;
    }

    QualificationPercentage(double percentage) {
        this.percentage = percentage;
    }
}
