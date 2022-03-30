package example

fun main(args: Array<String>) {
    // you can not do  this val str :String  = null
    // nullable string type
    val str: String? = "not nulll"

    // we are taking the risk here  you can throw business exception afterwards
    var str1 = str!!.uppercase()

    val nullValue: String? = null

    //  if (str != null) {
    //        str.uppercase();
    //    }
    str?.uppercase()

    println("In java you will get null pointer exception here but in kotlin  ${nullValue?.uppercase()}")

    val something = arrayOf(1, 2, 3)
    val mystring = something as? String

    println(" no exception again ${mystring?.uppercase()}")

    var test: String? = null
    println(test?.length ?: "empty")

    var temp = 20
    var result = if (temp > 10) "hot"
    else "cold"

    println(result)

}