package edu.temple.cis.dht.models;

import java.util.ArrayList;

public class TNode {

    private ArrayList<String> successorList;
    private String predecessor;
    private String successor;
    private Integer syncInterval;
    private Integer timeoutInterval;
    private TNodeState currState;

    public ArrayList<String> getSuccessorList() {
        return successorList;
    }

    public void setSuccessorList(ArrayList<String> successorList) {
        this.successorList = successorList;
    }

    public String getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(String predecessor) {
        this.predecessor = predecessor;
    }

    public String getSuccessor() {
        return successor;
    }

    public void setSuccessor(String successor) {
        this.successor = successor;
    }

    public Integer getSyncInterval() {
        return syncInterval;
    }

    public void setSyncInterval(Integer syncInterval) {
        this.syncInterval = syncInterval;
    }

    public Integer getTimeoutInterval() {
        return timeoutInterval;
    }

    public void setTimeoutInterval(Integer timeoutInterval) {
        this.timeoutInterval = timeoutInterval;
    }

    public TNodeState getCurrState() {
        return currState;
    }

    public void setCurrState(TNodeState currState) {
        this.currState = currState;
    }
}
