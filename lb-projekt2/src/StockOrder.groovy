/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockOrder {
    String verb
    String share
    int quantity

    String priceverb
    BigDecimal price
    int spread

    def at(def price) {
        this.price = price
        priceverb = 'fixedprice'
        this
    }

    def above(def price) {
        this.price = price
        priceverb = 'limit'

    }

    def spread(int spred) {
        this.spread = spred
        this
    }

    def getBp() {
        this
    }


    String toString() {
        def sb = new StringBuilder()
        sb << "${verb}ing ${calculateQuantity()} ${share} "
        switch (priceverb) {
            case "fixedprice": sb << fixedprice(); break
            case "limit": sb << "anywhere above $price"; break;
            default: sb << "immediately"
        }
        sb.toString()
    }
    String fixedprice() {
        if (spread) {
            "between ${ price - (spread/100)} - ${price + (spread/100)}"
        } else {
            "at ${price}"
        }
    }

    String calculateQuantity() {
        return quantity < 0 ? "all my" : "$quantity shares of"
    }
}
