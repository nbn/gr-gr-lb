/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockLoad2 {

    public static void main(String[] args) {
        use(StockCategory) {
            "order1.dsl".loadOrder()
        }
    }
}
