open class Info(var invoice:String):Product() {
    override val nomer=23
    override val mould=true
    override fun ProductWeight(){
        println("Введите вид продукта")
        invoice= readLine().toString()
        when{
            (Weight>2)-> println("'${Name}' вес продукта = ${Weight} Цена = ${price}, вид продукта =${invoice} ")
            (Weight>4&&Weight<6)->println("'${Name}' вес продукта = ${Weight}(Тяжелый) Цена = ${price}, вид продукта =${invoice} ")

        }
    }

    override fun  FatContentOfProduct(){
       when{
           (FatContent<40&&mould==true)-> println("Кисло-молочный продукт")
           (FatContent>40&&mould==false)-> println("Молочный продукт")
       }
    }
    override fun manufacturerOfproducts() {
        when{
            (manufactur=="")-> println("Введите производителя")
            else -> println("Продукт '${Name}'-производитель:${manufactur}")
        }

    }

}