package fcfs;

import printer.Printer;
import structure.ProcessStruct;
import structure.TimeDetails;

public class FCFS {

    private final Printer printer = new Printer();

    private final ProcessStruct[] processes;

    private final TimeDetails timeDetails = new TimeDetails();

    public FCFS(ProcessStruct... processes) {
        this.processes = processes;
    }

    public void execute() {
        sort_processes();
        calculate_waiting_time();
        calculate_turnaround_time();
        calculate_waiting_time_details();
        calculate_turnaround_time_details();
        printer.print(processes);
        printer.print(timeDetails);

    }

    //sorting processes by arrival_order
    private void sort_processes() {
        int n = processes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (processes[j].getArrival_order() > processes[j + 1].getArrival_order()) {
                    // swap arr[j+1] and arr[j]
                    var temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }
    }

    //calculating waiting time for each process
    private void calculate_waiting_time() {
        processes[0].setWaiting_time(0);
        for (int i = 1; i < processes.length; ++i)
            processes[i].setWaiting_time(processes[i - 1].getBurst_time() + processes[i - 1].getWaiting_time());
    }

    //calculating turnaround time for each process
    private void calculate_turnaround_time() {
        for (ProcessStruct process : processes)
            process.setTurnaround_time(process.getBurst_time() + process.getWaiting_time());
    }

    //calculating waiting time details
    private void calculate_waiting_time_details() {
        double total_waiting_time = 0;
        for (var item : processes)
            total_waiting_time += item.getWaiting_time();

        timeDetails.setTotal_waiting_time(total_waiting_time);
        timeDetails.setAvg_waiting_time(total_waiting_time / processes.length);
    }

    //calculating turnaround time details
    private void calculate_turnaround_time_details() {
        double total_turnaround_time = 0;
        for (var item : processes)
            total_turnaround_time += item.getTurnaround_time();

        timeDetails.setTotal_turnaround_time(total_turnaround_time);
        timeDetails.setAvg_turnaround_time(total_turnaround_time / processes.length);
    }

}
