import java.util.Arrays
fun main(){
 //Collection
 /*
 val nlist:List<Int> = listOf(1,2,3,4,5) // immutable
 val nlist2 = mutableListOf(1,2,3,4,5) // mutable list
 val nlist3 = nlist.toMutableList()

 nlist2.add(10)
 nlist2.add(2)
 println(nlist)
 println(nlist2)
 nlist3.add(20)
 println(nlist3)
 nlist3.add(3,4)
 println(nlist3)
 nlist2.remove(3)
 println(nlist2)
 nlist2.removeAt(2)*/
 // Set
/* val tstset = setOf(1,1,3,1,5,7,2,9,2)
 println(tstset)
 val tstset2 = setOf(1,2,9,3,5,7)
 println(tstset == tstset2)
 println("union = ${tstset.union(tstset2)}")
 println("Intersect = ${tstset.intersect(tstset2)}")
 */
 //map
 /*var capitalcity = mapOf(
         "Russia" to "Moscow",
         "Indonesia" to "Jakarta"
 )
 println(capitalcity)
 println(capitalcity.keys)
 println(capitalcity.values)

 capitalcity = capitalcity.toMutableMap()
 capitalcity.put("India","New Delhi")
 println(capitalcity)*/

 // filter lambda function
/* val nlist:List<Int> = listOf(1,-2,3,-4,-5,8,10)

 val angkaneg = nlist.filter{(it<0)}
 println(angkaneg)*/

// vararg & lambda
 /*var numbers = intArrayOf(10,20,30,40,50)
 view(1,10,20,70,*numbers,1,1)
 println(jumlah(*numbers))
 // Lambda
 pesan("Test Order 1")
 println(additions(100,90))
 println(additions2(100,90))*/






}




/*
val pesan ={ isipesan :String -> println("Cetak $isipesan")}

val additions :(Int,Int) -> Int ={inputint,inputint2-> inputint * inputint2}
fun view(vararg numbers:Int){
 println(Arrays.toString(numbers))
}

fun additions2(inputint:Int,inputint2: Int) :Int {
 return inputint*inputint2
}
fun jumlah(vararg numbers:Int):Int{
 return numbers.sum()
}*/
