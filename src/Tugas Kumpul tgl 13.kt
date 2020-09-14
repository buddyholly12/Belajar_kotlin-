import java.util.Arrays

fun tambah (vararg inputnumb:Int) :Int{
return inputnumb.sum()
}
fun view (vararg inputnumb:Int){
    println(Arrays.toString(inputnumb))
}
val additions: (Int, Int) -> Int = { inputint, inputint2 -> inputint + inputint2 }
fun countchar(counts: (Int,Int) -> Int = { inputint, inputint2 -> inputint + inputint2 }) {
    var x =20
    var y =25
    counts(x,y)
    val ch = 'r'
    var frequency = 0
    val iterator1=("Pemrograman aplikasiAndroid" )
    val iterator = ("Pemrograman aplikasiAndroid" ).iterator()
    for ((index, value) in iterator.withIndex()) {
        println("The element at $index is $value")
    }
    for (i in 0..iterator1.length - 1) {
        if (ch == iterator1[i]) {
            frequency++
        }
    }

    println("Frequency of $ch = $frequency")
}
fun main(){
    println("NO 1 :")
    val sorts= mutableListOf("a","i","c","g","k","t","p","l","w","e","d")
    val frequenciesByFirstChar = sorts.groupingBy { it.first() }.eachCount()
    val asc = sorts.sorted()
    val desc = sorts.sortedDescending()
    println("Hasil Sorting Ascending:$asc")
    println("Hasil Sorting descending:$desc")
    val moreFrequencies = sorts.groupingBy { it.first() }.eachCountTo(frequenciesByFirstChar.toMutableMap())
    println("hasil hitung List:$moreFrequencies")
    println("NO 2 :")
    var inputnumb = intArrayOf(10,20,30,40,50,11,24,24)
    println(tambah(*inputnumb))
    val nlist:List<Int> = listOf(1,-2,3,-4,-5,8,10,11,23,3,5,6,7,8,9,10,11)
    val angkaneg = nlist.filter{(it<0)}
    val oddNumbers = nlist.filter{(it<0) || (it % 2 != 0) }
    println(angkaneg)
    println(oddNumbers)
    println("NO 3 :")
    println(additions(20,25))
    countchar(additions)
}
