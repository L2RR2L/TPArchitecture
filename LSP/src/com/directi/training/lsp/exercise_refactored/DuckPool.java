package com.directi.training.lsp.exercise_refactored;

public class DuckPool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck donaldDuck2 = new Duck();
        quack(donaldDuck, donaldDuck2);
        swim(donaldDuck, donaldDuck2);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        DuckPool pool = new DuckPool();
        pool.run();
    }
}
