package com.directi.training.isp.exercise_refactored;

public class TimedDoor extends Door {
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    public void timeOutCallback()
    {
        _locked = true;
    }
}
