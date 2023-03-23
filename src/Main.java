import fcfs.FCFS;
import structure.ProcessStruct;

public class Main {

    public static void main(String[] args) {

        var p0 = new ProcessStruct("p0", 2, 5);
        var p1 = new ProcessStruct("p1", 1, 8);
        var p2 = new ProcessStruct("p2", 3, 3);
        var p3 = new ProcessStruct("p3", 4, 10);

        var fcfs = new FCFS(p0, p1, p2, p3);

        fcfs.execute();

        //NOTE: GC (Garbage Collector) will collect and delete all unreachable objects from the memory at the end of the
        // program, so we don't need to use C commands like deallocate.

    }

}