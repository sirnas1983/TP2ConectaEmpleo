class Texto {
    fun cuentaPalabras (_frase : String, _palabra : String) : Int{
        return _frase.split(' ').count { it == _palabra }
    }
}
