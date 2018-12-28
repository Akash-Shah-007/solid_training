package exercise_refactored;

public class space_slot {
	 public int allocate(ResourceType resourceType)
	    {
	        int resourceId = 0;
	        resourceId = findFreeSpaceSlot();
	        markSpaceSlotBusy(resourceId);
	        return resourceId;
	    }
	    public void free(ResourceType resourceType, int resourceId)
	    {
	        	markSpaceSlotFree(resourceId);
	    }

	    void markSpaceSlotFree(int resourceId)
	    {
	    }
	    void markSpaceSlotBusy(int resourceId)
	    {
	    }
	    int findFreeSpaceSlot()
	    {
	        return 0;
	    }

}
