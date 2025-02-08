package com.directi.training.ocp.exercise_refactored;

import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        HashSet<Integer> availableSpaceSlotResourceIds = new HashSet<>(List.of(1));
        HashSet<Integer> availableTimeSlotResourceIds = new HashSet<>(List.of(2));

        Resource spaceSlot = new SpaceSlot(availableSpaceSlotResourceIds);
        Resource timeSlot = new TimeSlot(availableTimeSlotResourceIds);

        ResourceAllocator resourceAllocator = new ResourceAllocator();
        int allocatedSpaceSlotResourceId = resourceAllocator.allocate(spaceSlot);
        int allocatedTimeSlotResourceId = resourceAllocator.allocate(timeSlot);

        resourceAllocator.allocate(spaceSlot);
        resourceAllocator.free(spaceSlot, allocatedSpaceSlotResourceId);

        allocatedSpaceSlotResourceId = resourceAllocator.allocate(spaceSlot);
    }
}
