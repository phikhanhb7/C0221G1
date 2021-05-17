package luyen_tap_oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
   List<Room> roomList = new ArrayList<>();

   public void addRoom(Room room){
       roomList.add(room);
   }

   public void removeRoom(int roomnumber){
       for (Room item : roomList){
           if (roomnumber == item.getRoomNumber()){
               roomList.remove(item);
               break;
           }
       }
   }

}
