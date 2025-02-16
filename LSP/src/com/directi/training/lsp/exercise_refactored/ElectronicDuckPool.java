package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuckPool
{
    public void run()
    {
        ElectronicDuck electronicDuck = new ElectronicDuck();
        ElectronicDuck electronicDuck1 = new ElectronicDuck();
        quack(electronicDuck, electronicDuck1);
        swim(electronicDuck, electronicDuck1);

        electronicDuck.turnOn();
        electronicDuck.turnOn();

        quack(electronicDuck, electronicDuck1);
        swim(electronicDuck, electronicDuck1);
    }

    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        ElectronicDuckPool pool = new ElectronicDuckPool();
        pool.run();
    }
}
