fun main() {
    var elements = arrayOf(3, 5, 6, 2, 7)
    println("The maximum element is: ${computeResult(elements, "MAX")}")
    println("The minimum element is: ${computeResult(elements)}")
}

fun maximum(elements: Array<Int>): Int{
    var max = elements[0];
    for (element in elements){
        if (element > max){
            max = element
        }
    }
    return max
}

fun minimum(elements: Array<Int>): Int{
    var max = elements[0];
    for (element in elements){
        if (element < max){
            max = element
        }
    }
    return max
}

fun computeResult(elements:Array<Int>, option: String = "MIN"):Int = if (option == "MAX") maximum(elements) else minimum(elements)