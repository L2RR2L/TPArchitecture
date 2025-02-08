package com.directi.training.ocp.exercise_refactored;

import java.util.HashSet;

public class SpaceSlot extends Resource
{

    public SpaceSlot(HashSet<Integer> availableIds){
        super(availableIds);
    }

    @Override
    public void markBusy(int resourceId)
    {
        System.out.println("Marking space slot busy..");
        if (availableIds.contains(resourceId)){
            availableIds.remove(resourceId);
            System.out.println("Space slot marked busy.");
            return;
        }
        System.out.println("Invalid Resource Id");
    }

    @Override
    public void markFree(int resourceId)
    {
        System.out.println("Freeing space slot...");
        if (!availableIds.contains(resourceId) && resourceId != INVALID_RESOURCE_ID){
            availableIds.add(resourceId);
            System.out.println("Space slot marked free.");
            return;
        }
        System.out.println("Invalid Resource Id");
    }

    @Override
    public int findFree()
    {
        System.out.println("Finding a free space slot..");
        if (!this.availableIds.isEmpty()){
            System.out.println("Space slot found.");
            return this.availableIds.iterator().next();
        }
        System.out.println("Space slot not found.");
        return INVALID_RESOURCE_ID;
    }
}
