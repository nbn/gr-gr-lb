/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockDSLDelegate {

    def orders = []

    static final  ALL = -1

    def buy(int quantity, String name) {
        recordTransaction 'buy', name, quantity
    }

    def sell(int quantity, String name) {
        recordTransaction 'sell', name, quantity
    }

    // This is just for show, to omit parentheses
    def getExecute() {
        execute()
    }

    def execute() {
        orders.sort { it.share }.each { println it }
    }

    private def recordTransaction(String verb, String name, int quantity) {
        def order = new StockOrder(verb: verb, share: name, quantity: quantity)
        orders << order
        order
    }

}
