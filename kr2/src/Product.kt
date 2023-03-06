abstract class Product():DairyProduct {
     abstract val nomer:Int
     abstract val mould:Boolean
     override fun ProductWeight(){
        println("'${Name}' вес продукта = ${Weight} Цена = ${price} ")
    }
     override  fun FatContentOfProduct(){
        when {
            (FatContent < 40) -> println("Продукт'${Name}' имеет жирность = ${FatContent}%")
            else -> println("Такого молочного изделия нет")
        }
    }
    open fun manufacturerOfproducts(){
        println("Продукт '${Name}'-производитель:${manufactur}")
    }
}