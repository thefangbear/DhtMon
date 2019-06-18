package edu.temple.cis.dht.models;

public enum TNodeState {
    TNodeJoining, TNodeJoinSync, TNodeSynchronizing, TNodeWaitingForSync, TNodeOneRing, TNodeJoiningOneRing,
    TNodeDisconnected, TNodeFailure, TNodeStable
}
