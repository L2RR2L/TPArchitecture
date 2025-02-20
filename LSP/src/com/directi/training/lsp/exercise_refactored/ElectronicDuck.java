package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck not quack because off...");
        }
    }

    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Electronic duck not swim because off...");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

    public boolean isOn(){
        return _on;
    }
}
