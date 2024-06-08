fun main() {
    println("Welcome to your banking system. ")
    println()
    println("What type of account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")

    var accountType = ""
    var userChoice = 0

    while (accountType == "")
    {
        println("Choose an option (1, 2 or 3)")
        userChoice=(1..5).random()
        println("The selected option is... $userChoice")

        accountType = when(userChoice)
        {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }

        println("You have created a $accountType account.")

        var accountBalance = (1..1000).random()

        println("Your account balance is $accountBalance dollars")

        val money = (1..1000).random()

        println("Your amount is $money dollars")

        var output = 0

        fun withdraw (amount : Int) : Int
        {
            accountBalance -= amount

            println("the amount you withdrew is $amount")
            println("Your Current Balance is $accountBalance")

            return amount
        }

    }
}