public class RunnableMain implements Runnable {

    public void run(){

    }

    public static void main(String args[]) throws Exception{
        SerialPortMain  ser = new SerialPortMain();

        ser.connect("COM3");
        


    }
}
