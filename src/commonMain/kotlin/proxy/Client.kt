package proxy

import kotlin.jvm.JvmStatic

object Client {
    @JvmStatic
    fun main(args: Array<String>) {

        var warehouseAtBH = Warehouse(mutableMapOf(), "Beverly Hillls 90210")
        var warehouseAtNY = Warehouse(mutableMapOf(), "New York")
        var warehouseAtCA = Warehouse(mutableMapOf(), "California")



    }
}