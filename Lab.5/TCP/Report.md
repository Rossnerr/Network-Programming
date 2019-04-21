# Laboratory Work Nr. 5

### Objectives 
 - Get familiar with Sockets API;
 - Develop an application which will transfer data, using the TCP and UDP protocols;
 
### Task
 * Create a simple chat application which will implement Sockets, TCP protocol and UDP protocol.
 
### Theory
Sockets are communication points on the same or different computers to exchange data. Sockets allow communication between two different processes on the same or different machines. To be more precise, it's a way to talk to other computers.

There are four types of sockets available to the users. The first two are most commonly used and the last two are rarely used:
 - Stream Sockets;
 - Datagram Sockets;
 - Raw Sockets;
 - Sequenced Packet Sockets;
 
Stream Sockets − Delivery in a networked environment is guaranteed. If you send through the stream socket three items "A, B, C", they will arrive in the same order − "A, B, C". These sockets use TCP (Transmission Control Protocol) for data transmission. If delivery is impossible, the sender receives an error indicator. Data records do not have any boundaries.

Datagram Sockets − Delivery in a networked environment is not guaranteed. They're connectionless because you don't need to have an open connection as in Stream Sockets − you build a packet with the destination information and send it out. They use UDP (User Datagram Protocol).

TCP is a connection oriented protocol and offers end-to-end packet delivery. It acts as back bone for connection. It exhibits the following key features:
 - Transmission Control Protocol (TCP) corresponds to the Transport Layer of OSI Model;
 - TCP ensures reliability by sequencing bytes with a forwarding acknowledgement number that indicates to the destination the next byte the source expect to receive.

UDP is connectionless and unreliable protocol. It doesn’t require making a connection with the host to exchange data. Since UDP is unreliable protocol, there is no mechanism for ensuring that data sent is received. UDP transmits the data in form of a datagram. The UDP datagram consists of five parts as shown in the following diagram:



### Implementation
