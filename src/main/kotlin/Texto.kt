class Texto {
    fun cuentaPalabras (frase : String, palabra : String) : Int{
        return frase.split(' ').count { it == palabra }
    }
}
