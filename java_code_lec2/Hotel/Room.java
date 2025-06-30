package Hotel;

public class Room {
    private int num;
    private String status;

    public Room(int num,String status) {
        this.num = num;
        this.status = status ; //1 is available ,0 is not
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
