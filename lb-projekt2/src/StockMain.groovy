/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockMain {


    public static void main(String[] args) {
        def dsl = {
            buy   500, "APPLE INC"      at    514.5
            sell 1000, "MICROSOFT"      above 245
            buy  1000, "GOOGLE"         at    400    spread 20 bp
            sell  ALL, "ORANGE COUNTY"
            execute
        }


        dsl.delegate = new StockDSLDelegate()
        dsl()
    }
}
