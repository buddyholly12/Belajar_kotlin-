import java.util.Arrays


class datapegawai(nama:String, Umur: Int){
    val _nama= nama
    val _umur = Umur

    fun tampilkan(){
        println(" Yang memiilki usia tertua")
        println("Yang memiliki usia termuda")



    }

}




fun main(){
 println("no 1")
    var nlist:List<String> = listOf("abcd","123")
    var ukuran :MutableList<Int> =ArrayList()
    for (i in 0..nlist.size-1)
    {
        ukuran.add(nlist[i].length)
    }
    println(ukuran)


    println("no 3")
    val rows = 4

    for (i in 1..rows) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}