package com.directi.training.ocp.exercise_refactored;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resource spaceSlot = new SpaceSlot();
        Resource timeSlot = new TimeSlot();

        ResourceAllocator resourceAllocator = new ResourceAllocator();
        int allocatedSpaceSlotResourceId = resourceAllocator.allocate(spaceSlot);
        int allocatedTimeSlotResourceId = resourceAllocator.allocate(timeSlot);

        resourceAllocator.allocate(spaceSlot);
        resourceAllocator.free(spaceSlot, allocatedSpaceSlotResourceId);

        allocatedSpaceSlotResourceId = resourceAllocator.allocate(spaceSlot);
    }
}
