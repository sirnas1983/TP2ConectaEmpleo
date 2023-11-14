class Tp1 {
        fun algoritmo(_n : Int) : Int{
            var n = _n
            var s  = 0
            var p  = 1
            while (n > 0){
                if( n.mod(2) == 0){
                    p *= n
                } else {
                    s += n
                }
                n -= 1
            }
            return (p-s)
        }
}