fun main() {
    fun valid_number() : Int{
        try {
            val num = readLine()!!.toInt()
            return num
        } catch (e: Exception){
            return 0
        }
    }

    fun valid_operator() : String? {
        var op : String
        op = readLine()!!
        if (op == "+" || op == "-" || op == "*" || op == "/")
            return op
        else {
            print("Enter a valid operator (+ - * /) >> ")
            op = readLine()!!
            return op
        }
    }

    fun calc(num1: Int, num2: Int, op: String?){
        var result : Int = 0
        when (op) {
            "+" -> {
                result = num1 + num2
            }
            "-" -> {
                result = num1 - num2
            }
            "*" -> {
                result = num1 * num2
            }
            "/" -> {
                result = num1 / num2
            }
        }
        print("$num1 $op $num2 = $result\n")
    }

    while(true){
        print("\nEnter your first number: ")
        val number1 =valid_number()
        print("$number1")

        print("\nEnter operator: ")
        val operator = valid_operator()
        print("$number1 $operator")

        print("\nEnter your second number: ")
        val number2 = valid_number()

        if (operator == "/" && number2 == 0){
            println("You Can not divide by ZERO")
            continue
        }

        calc(number1, number2, operator)
    }
}