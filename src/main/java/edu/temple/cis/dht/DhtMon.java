package edu.temple.cis.dht;


import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class DhtMon {

    public static void tryZeroMQConnect () {
        try (ZContext context = new ZContext()) {
            // Socket to talk to clients
            ZMQ.Socket socket = context.createSocket(ZMQ.REP);
            socket.bind("tcp://*:5555");

            while (!Thread.currentThread().isInterrupted()) {
                // Block until a message is received
                byte[] reply = socket.recv(0);

                // Print the message
                System.out.println(
                        "Received: [" + new String(reply, ZMQ.CHARSET) + "]"
                );

                // Send a response
                String response = "Hello, world!";
                socket.send(response.getBytes(ZMQ.CHARSET), 0);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}
