package exercise_refactored;

public class time_slot 
{		
	int resourceId;

      
      public int allocate(ResourceType resourceType)
      {
              resourceId = findFreeTimeSlot();
              markTimeSlotBusy(resourceId);
              return resourceId;
      }

      public void free(ResourceType resourceType, int resourceId)
      {
    	  markTimeSlotFree(resourceId);
      }

      void markTimeSlotFree(int resourceId)
      {
      }
      
      private void markTimeSlotBusy(int resourceId)
      {
      }
      private int findFreeTimeSlot()
      {
          return 0;
      }
}
