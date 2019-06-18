package edu.temple.cis.dht.io;

public class LogMessage {

    public enum Type {
        Peer2Peer, Internal, LinkCreation, LinkDeletion, NodeCreation, NodeDeletion
    }

    public LogMessage(Type type, String src, String dst, long time) {
        this.messsageType = type;
        this.src = src;
        this.dst = dst;
        this.time = time;
    }

    public LogMessage() {}

    public Type getMesssageType() {
        return messsageType;
    }

    public String getSrc() {
        return src;
    }

    public String getDst() {
        return dst;
    }

    public long getTime() {
        return time;
    }

    protected Type messsageType;
    protected String src;
    protected String dst;
    protected long time;

}
