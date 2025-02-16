package com.directi.training.ocp.exercise_refactored;

public class SpaceSlot extends Resource
{
    @Override
    public void markBusy(int resourceId) {}

    @Override
    public void markFree(int resourceId) {}

    @Override
    public int findFree()
    {
        return 0;
    }
}
