class Spellbook {

    @JvmField
    val spells = listOf("lakfm", "akjgjhg")

    companion object {
        @JvmField
        val MAX_SPELL_COUNT = 10
        @JvmStatic
        fun getSpellbookGreeting() = println("I am the Great!")
    }
}