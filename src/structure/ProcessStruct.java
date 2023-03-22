package structure;

public class ProcessStruct {

    private String process_id;

    private int arrival_order;

    private int burst_time;

    private int turnaround_time;

    private int waiting_time;

    public ProcessStruct(String process_id, int arrival_order, int burst_time) {

        this.process_id = process_id;
        this.arrival_order = arrival_order;
        this.burst_time = burst_time;
    }

    public String getProcess_id() {
        return process_id;
    }

    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    public int getArrival_order() {
        return arrival_order;
    }

    public void setArrival_order(int arrival_order) {
        this.arrival_order = arrival_order;
    }

    public int getBurst_time() {
        return burst_time;
    }

    public void setBurst_time(int burst_time) {
        this.burst_time = burst_time;
    }

    public int getTurnaround_time() {
        return turnaround_time;
    }

    public void setTurnaround_time(int turnaround_time) {
        this.turnaround_time = turnaround_time;
    }

    public int getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }

    @Override
    public String toString() {

        return "ProcessStruct{" + "process_id='" + process_id + '\'' + ", arrival_order=" + arrival_order + ", burst_time=" + burst_time + ", turnaround_time=" + turnaround_time + ", waiting_time=" + waiting_time + '}';
    }

}
