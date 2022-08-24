package proxy

class OrderFulfillment : IOrder {
    private var warehouses: List<Warehouse>;

    constructor(warehouses: List<Warehouse>) {
        this.warehouses = warehouses
    }

    override fun fulfilOrder(order: Order) {
        for (item: Item in order.itemList) {
            for (warehouse: Warehouse in warehouses) {
                warehouse.fulfilOrder(order)
            }
        }
        return;
    }
}