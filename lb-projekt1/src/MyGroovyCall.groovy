/**
 * Created by Niels Bech Nielsen on 21-12-2015.
 */
class MyGroovyCall {

    public void dynamicType(def /*String*/ param) {
        int value = param as int  // Type conversion (using asType)
        println param.getClass().name
        println value.getClass().name
        println 2 * value
    }

    public void myBadCall(int param) {
        def a = null
        a.dosomething
    }

    public static void main(String[] args) {
        def mgc = new MyGroovyCall()

        mgc.dynamicType('5')

        //def value=5
        //mgc.dynamicType("${value}") // Demonstrate type coersion

        //mgc.myBadCall(5)
    }
}
