package com.directi.training.isp.exercise_refactored;

public abstract class Door {

    protected boolean _locked;
    protected boolean _opened;

    abstract void lock();

    abstract void unlock();

    abstract void open();

    abstract void close();
}
