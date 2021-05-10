fun main(){
    println(even(45))
    println(even(32))
    println(returnString("Patrick"))
    println(namesArray(arrayOf("holly","John","peter","Mary")))
    println( Product("floor",34.5,600,"groseries"))
    println(Product("food",65.0,90,"hygine"))
}

fun even(num:Int):Boolean{
    return num%2==0
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String)
fun kiosk(product: Product){
    var groseriesList= mutableListOf<Product>()
    var hygineList= mutableListOf<Product>()
    var otherList= mutableListOf<Product>()

    when(product.category){
        "groseries"->groseriesList.add(product)
        "hygien"->hygineList.add(product)
        else->otherList.add(product)
    }
    print(groseriesList)
    print(hygineList)
    print(otherList)
}


fun returnString(name:String):String{
    var characters=""
    name.forEachIndexed{index,character->
        if (index % 2==0){
            characters+=character
        }
    }
    return characters
}
fun namesArray(name:Array<String>):List<String>{
    var namesList= mutableListOf<String>()
    name.forEach { names->
        if(names.length%2==0){
            namesList.add(names)
        }
    }

    return namesList
}