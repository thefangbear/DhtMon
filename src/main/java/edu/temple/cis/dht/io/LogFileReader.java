package edu.temple.cis.dht.io;

import java.io.*;
import java.util.ArrayList;

public class LogFileReader {

    private BufferedReader IN;

    private void parse() {

    }

    public LogFileReader (String filepath) throws ParseException, FileNotFoundException {
        IN = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
    }

    public ArrayList<LogMessage> getAllMessages() {

    }

    public LogMessageStream getStream() {

    }
}
