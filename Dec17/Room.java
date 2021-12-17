package dec17practice;

public class room {
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	room() {
		// TODO Auto-generated constructor stub
	}
	room(int roomNo, String roomType, float roomArea, boolean acMachine) {
        this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}
      public int getRoomNo() {
		return roomNo;
	}
     public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
     public String getRoomType() {
		return roomType;
	}
    public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

     public float getRoomArea() {
		return roomArea;
	}
    public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}
    public boolean isAcMachine() {
		return acMachine;
	}

    public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}

    void displayData() {
	System.out.println("The Room No is:"+getRoomNo());
	System.out.println("The Room Area :"+ getRoomArea());
	System.out.println("The room Type is:"+getRoomType());
	String s = (acMachine) ? "yes" : "no";
	System.out.println("The acMachine is:"+s);
	}
	public static void main(String arg[]) {
	room r1 = new room();
	r1.setRoomNo(101);
	r1.setRoomArea(442);
	r1.setRoomType("single");
	r1.setAcMachine(true);
	r1.displayData();
	
}
}
