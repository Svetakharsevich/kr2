fun main(){
    try {
        var Milk=Info("Йогурт")
        Milk.ProductWeight()
        Milk.FatContentOfProduct()
        Milk.mmanufacturerOfproducts()
    }
    catch (e: Exception){
        println("Ошибка. Введите корректные данные")
    }

}