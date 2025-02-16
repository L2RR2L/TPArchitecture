package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {

    public abstract void markBusy(int resourceId);

    public abstract void markFree(int resourceId);

    public abstract int findFree();
}
