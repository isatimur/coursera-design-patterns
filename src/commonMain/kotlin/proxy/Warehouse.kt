package proxy

class Warehouse : IOrder {
    private var stock = mutableMapOf<String, Int>();
    private var address: String;

    constructor(stock: MutableMap<String, Int>, address: String) {
        this.stock = stock
        this.address = address
    }

    override fun fulfilOrder(order: Order) {
        for (item: Item in order.itemList) {
            this.stock[item.sku] = stock.getValue(item.sku) - 1
        }
    }

    fun currentInventory(item: Item): Int {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku)!!;
        return 0;
    }

}
