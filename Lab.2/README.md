# Laboratory Work Nr. 2

### Objectives
 - Learn about concurrency and multi-threading;
 - Learn what a thread is along with its properties, states;
 - Learn what are the means of communications between threads;
 - Learn how is it possible to synchronize the threads;
 - Use the gained knowledge in order to create a simple concurrent and multi-threading program.

### Task
 * According to the oriented graph which is presented below. Create a program that would model the activities as they are represented. The events/activites are marked by an orage rectangular while the arrows show us the dependecies between them. 1 -> 2 means that the activity 1 is dependent on the acitivity 2. In other words the activity 2 can not take place until the activity 1 is done.

![Variant](https://github.com/Rossnerr/Network-Programming/blob/master/Lab.2/Screens/Variant.PNG)

### Implementation
First of all lets see what is going on with the presented graph. I have 7 activities/events there. As it can be seen the event 1 is dependent on events 2, 3 and 4. So, it can not occur before those 3 are performed. Next the event 2 is dependent on the event 5, the event 3 is dependent on the event 6 and the event 4 is dependent on the event 7. That's why the events 2, 3 and 4 can not be executed before the events 5, 6 and 7, correspondingly.

I have represented each event by a thread which will print its name. That's why I have created _MyThread_ class which extends the _Thread_ class. Each object of thea earilier mentioned class has 3 fields. _threadsToBeExecutedBefore_ is an array of other objects of this type and is used to set up the dependencies between the threads. For the threads with no dependencies the earlier mentioned array will be empty. _executed_ is the next one it shows either the thread was executed or not. Initially it is set to false and after the execution happens it is set to true. The last is _name_ it is obviouse for what I need it.

After all the threads are created the dependecies should be added. It can be done by calling the _setThreadsToBeExecutedBefore_ on an object of _MyThread_ type. It will take as an argument an object of _MyThread_ type and will add it to the array mentioned above.

Next I start the threads. This means that the code written in the _run_ method will execute. Because there is no way of controlling the exectuion order of the threads a check is performed before the desired result occurs. By desired result I reffer to printing of the thread's name. First it checks if the array of the threads to be executed before is empty. In case that it is empty the execution of that thread will happen. After the printing is done the variable which shows the status of thread is set to true. And also the call to the _notifyAll_ method is executed. By calling it all the threads which are waiting on this thread are notified and further they will execute. In case that the array is not empty an additional check will happen. For every thread which is presented in that array its status will be checked. If there is at least one thread which have its executed status set to false, the running thread will be set to the waiting stage until the desired thread will send a notification.

Below are presented 2 versions of outputs.

![Variant](https://github.com/Rossnerr/Network-Programming/blob/master/Lab.2/Screens/Output%201.PNG)

![Variant](https://github.com/Rossnerr/Network-Programming/blob/master/Lab.2/Screens/Output%202.PNG)

### Conclusion
This laboratory work served as a good starting point in the conccurent and multi-threading programming. I have learned what concurrency is and how can I use threads in order to create a concurrent program. Because threads are working on the shared data the communication between them should be realised in a proper way. Synchronization is a tool that can prevent different errors while trying to establish a communication between multiple threads.
