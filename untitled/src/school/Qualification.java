package school;

public class Qualification {

    private double practice;
    private double theoretical;
    private double resolution;

    public Qualification(double practice, double theoretical, double resolution) {
        this.practice = practice;
        this.theoretical = theoretical;
        this.resolution = resolution;
    }

    public Qualification() {
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }

    public double getTheoretical() {
        return theoretical;
    }

    public void setTheoretical(double theoretical) {
        this.theoretical = theoretical;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
}
