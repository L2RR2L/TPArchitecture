package com.directi.training.ocp.exercise_refactored;

import java.util.HashSet;

public class TimeSlot extends Resource{

    public TimeSlot(HashSet<Integer> availableIds) {
        super(availableIds);
    }

    @Override
    public void markBusy(int resourceId)
    {
        System.out.println("Marking time slot busy..");
        if (availableIds.contains(resourceId)){
            availableIds.remove(resourceId);
            System.out.println("Time slot marked busy.");
            return;
        }
        System.out.println("Invalid Resource Id");
    }

    @Override
    public void markFree(int resourceId)
    {
        System.out.println("Freeing time slot...");
        if (!availableIds.contains(resourceId) && resourceId != INVALID_RESOURCE_ID){
            availableIds.add(resourceId);
            System.out.println("Time slot marked free.");
            return;
        }
        System.out.println("Invalid Resource Id");
    }

    @Override
    public int findFree()
    {
        System.out.println("Finding a free time slot..");
        if (!this.availableIds.isEmpty()){
            System.out.println("Time slot found.");
            return this.availableIds.iterator().next();
        }
        System.out.println("Time slot not found.");
        return INVALID_RESOURCE_ID;
    }
}
