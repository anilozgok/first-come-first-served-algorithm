## First Come, First Served (FCFS) Algorithm
Implementation of First Come, First Served (FCFS) aka FIFO (First In First Out) algorithm.

We are given n processes like p0, p1, ..., pn along the information's with their burst times and arrival orders.

Algorithm is expected to find waiting and turnaround time of each process.

Structure of Process is defined in the  ``ProcessStruct.java`` class in the project under the ``structure`` package. Also we have a ``TimeDetails.java`` class for time details of our total processes.

The FCFS algorithm is implemented on the ``FCFS.java`` class under the ``fcfc`` package.

``Printer.java`` is our helper class to print our process details.

Thanks to abstraction, all you need to do is that define the processes with arrival order and burst time details and pass to the ``FCFC.java`` class and executing the following command ``fcfs.execute()``

### Program Input and Outputs
Input:

![Screenshot_2.png](..%2F..%2F..%2FDesktop%2FScreenshot_2.png)

Output:

![Screenshot_3.png](..%2F..%2F..%2FDesktop%2FScreenshot_3.png)


#### NOTE: Since the GC (Garbage Collector) will collect and delete all unreachable objects from the memory at the end of the program we don't need to use C commands like deallocate.