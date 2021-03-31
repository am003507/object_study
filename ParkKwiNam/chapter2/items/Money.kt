package chapter2.items

data class Money(var value: Long = 0) : Item {
    override fun toString(): String {
        return "Money($value)"
    }
}

val FREE = Money(0)