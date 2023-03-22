package structure;

public class TimeDetails {

    private double total_waiting_time;

    private double avg_waiting_time;

    private double total_turnaround_time;

    private double avg_turnaround_time;

    public double getTotal_waiting_time() {
        return total_waiting_time;
    }

    public void setTotal_waiting_time(double total_waiting_time) {
        this.total_waiting_time = total_waiting_time;
    }

    public double getAvg_waiting_time() {
        return avg_waiting_time;
    }

    public void setAvg_waiting_time(double avg_waiting_time) {
        this.avg_waiting_time = avg_waiting_time;
    }

    public double getTotal_turnaround_time() {
        return total_turnaround_time;
    }

    public void setTotal_turnaround_time(double total_turnaround_time) {
        this.total_turnaround_time = total_turnaround_time;
    }

    public double getAvg_turnaround_time() {
        return avg_turnaround_time;
    }

    public void setAvg_turnaround_time(double avg_turnaround_time) {
        this.avg_turnaround_time = avg_turnaround_time;
    }

    @Override
    public String toString() {
        return "TimeDetails{" + "total_waiting_time=" + total_waiting_time + ", avg_waiting_time=" + avg_waiting_time + ", total_turnaround_time=" + total_turnaround_time + ", avg_turnaround_time=" + avg_turnaround_time + '}';
    }

}
