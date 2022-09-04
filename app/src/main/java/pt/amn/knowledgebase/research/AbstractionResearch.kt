package pt.amn.knowledgebase.research

class AbstractionResearch {

    fun testDescendantOfAbstractClass() {

        val skuList = SkuList()
        skuList.addItem("Dress 1")
        skuList.addItem("Trousers 2")
        skuList.addItem("Hat 3")

        skuList.itemList.forEach { item ->
            println(item)
        }
        println()

        skuList.deleteItem()
        skuList.itemList.forEach { item ->
            println(item)
        }
    }

    fun testDescendantOfInterface() {

        val skuList = SkuList()
        skuList.addItem("Dress 1")
        skuList.addItem("Trousers 2")
        skuList.addItem("Hat 3")

        skuList.itemList.forEach { item ->
            println(item)
        }
        println()

        skuList.deleteItem()
        skuList.itemList.forEach { item ->
            println(item)
        }
    }

}

abstract class ItemList<T>() {

    abstract var itemList: MutableList<T>

    fun addItem(item: T) {
        itemList.add(item)
    }

    abstract fun deleteItem()
}

class SkuList() : ItemList<String>() {

    override var itemList: MutableList<String> = mutableListOf()
        get() = field
        set(value) { itemList.addAll(value) }

    override fun deleteItem() {
        if (itemList.isNotEmpty()) itemList.removeLast()
    }
}

/**
 * Error: This type is final, so it cannot be inherited from
 *
 * We have to add a keyword "open" for the SkuList class, if we want to inherit from it
 *
class OldSkuList() : SkuList() {
}*/

interface ItemListNew<T> {

    var itemList: MutableList<T>

    fun addItem(item: T) {
        itemList.add(item)
    }

    fun deleteItem()
}

class SkuListNew() : ItemListNew<String> {

    override var itemList: MutableList<String> = mutableListOf()
        get() = field
        set(value) { itemList.addAll(value) }

    override fun deleteItem() {
        if (itemList.isNotEmpty()) itemList.removeLast()
    }
}

