fun setmhs(NRP:String, nama:String) : String ="$NRP-$nama"
fun setmhs1(NRP:String, nama:String): String {
    println("\n Status: Ok")
    return "$NRP-$nama"
}
fun addition(A:Int,B:Int = 20,C:Int = 25):Int{
  var hasil = A + B + C
    return hasil
}
/*fun addition1(A:Int,B:Int = 20,C:Int?):Int{
    var hasil = A + B + C
    return hasil
}
 */


/*fun checkPrimeNumbers(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}*/
fun main(){
    /*
   *        Trial Kotlin Langguage
   * */
    // Intro Print hello world
    //println("hello World")
// Intro input output / i/o
    //print("Enter a number: ")
    //val reader = readLine()
    //print("ini angka input :$reader")


    /*
    *       Kelas Android Kotlin 31 Agustus 2020
    * */
    /*
    // latihan Var
    var a:String?= "Hello Buddy "
    println(a)
    // Escape String
    var x:String?= "\"Hello Buddy \""
    println(a)
    // Unicode
    var test:String?= "\"!Hola \""
    println(test)
    //
    var kode1 = 17
    var kode2 = "agustus"
    println("$kode1 $kode2")

    var kodechar ='q'
    println(kodechar)
    println(++kodechar)
    println(kodechar++)

    var kodechar1 =100
    println(kodechar1)
    println(++kodechar1)
    println(kodechar1++)

    var teststr ="Hello Kotlin"
    print(teststr[10])
    */

    /*
    *
    *       BASIC ARRAY Kotlin
    *  */
    /*var arrvar = arrayOf(1,2,5,6,7,8,4,3)
    var arrvar1 = arrayOf(17,"Agustus",1945)
    var arrvarInt = intArrayOf(1,2,5,6,7,8,4,3)
    print(arrvar[1])
     */


    /*
    type of arrayOf
     */

    /*
    booleanArrayOf()
    intArrayOf()
    longArrayOf()
    shortArrayOf()
    byteArrayOf()

     */

    /*
    *   Intro Lambda Function
    * */
    /*var arrayobj = Array(3, { i -> i * 2})
    println(arrayobj[1])
     */

    /*
    Tutorial Membuat fungsi
    dalam kasus ini fungsi yang dibuat adalah setMHS
     */


    //print(setmhs("26416001","Marcellino"))
    //print(setmhs1("26416001","Marcellino"))
    //print(addition(10))
    //print(addition1(10,5,null))

    /*var n = 5
    var m = 7
    var x =
    var testrange = n.rangeTo(m)

    for (i in 1..m)
            print(i)
            println()
        for(x in m..n)
            print(x)
    */

   /* var low = 0
    val high = 10

    while (low < high) {
        if (checkPrimeNumbers(low))
            print(low.toString() + " ")

        ++low
    }
*/

    var line = "My name is Buddy "
    var vowels = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        when (ch) {
            'a', 'e', 'i', 'o', 'u' -> ++vowels
        }
    }

    println("jumlah huruf vokal: $vowels")


}