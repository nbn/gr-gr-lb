/**
 * Created by Niels Bech Nielsen on 24-12-2015.
 */
public class MyJavaCall {
    public void myStaticCall(String param) {
        int value = Integer.valueOf(param); // Manuel conversion
        System.out.println(param.getClass().getName());
        //System.out.println(value.getClass().getName());  // Primitiver har ikke metoder.

        System.out.println(2 * value);
    }

    public static void main(String[] args) {
        MyJavaCall mjc = new MyJavaCall();

        mjc.myStaticCall("5");
    }
}
