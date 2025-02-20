package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

  private void quack(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.quack();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.swim();
        } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
