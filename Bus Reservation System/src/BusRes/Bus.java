package BusRes;

public class Bus {
       private  int bus_no;
       private  boolean ac;
       private  int capacity;
    Bus(int num,boolean ac,int cap){
        this.bus_no=num;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBusno(){
        return bus_no;
    }
    public boolean getAcInfo(){
        return ac;
    }
    public void setAcType(boolean value){
        ac=value;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public void displayBusInfo(){
        System.out.println("Bus number: "+bus_no+" AC: "+ac+" Capacity: "+capacity);
    }
}