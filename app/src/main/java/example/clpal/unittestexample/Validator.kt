package example.clpal.unittestexample

object Validator {
    fun validateInput(amount:Int,desc:String):Boolean{
        return !(amount<0 || desc.isEmpty())


    }
}