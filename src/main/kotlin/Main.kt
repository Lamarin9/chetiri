fun main(){
println("Результат вычисления: " + qweqwe(readln()))}
fun qweqwe(string: String): Float {
    var qw = ' '
    var sa2s = ""
    var sa1s = true
    var s1s = ""

    for (char in string.replace(" ", "")) {
        if (char.isDigit() || char == '.') {
            if (sa1s) {
                s1s += char
            } else {
                sa2s += char
            }
        } else if (char in setOf('+', '-', '*', '/')) {
            qw = char
            sa1s = false
        }
    }

    val num1 = s1s.toFloat()
    val num2 = sa2s.toFloat()

    return when (qw) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> 0.0f
    }
}