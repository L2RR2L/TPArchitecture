package com.directi.training.ocp.exercise_refactored;

import java.util.HashSet;

public abstract class Resource {

    protected static final int INVALID_RESOURCE_ID = -1;

    protected HashSet<Integer> availableIds;

    protected Resource(HashSet<Integer> availableIds) {
        this.availableIds = availableIds;
    }

    public abstract void markBusy(int resourceId);

    public abstract void markFree(int resourceId);

    public abstract int findFree();
}
