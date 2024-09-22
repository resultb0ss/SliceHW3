fun main() {
    var array: List<String> = arrayListOf("one","two","three")
    println(array.map { it.toList() }.flatten())
}