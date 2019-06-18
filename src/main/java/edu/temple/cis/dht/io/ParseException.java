package edu.temple.cis.dht.io;

public class ParseException extends Exception {

    public ParseException(String msg) {
        super("ParseException: " + msg);
    }
}
