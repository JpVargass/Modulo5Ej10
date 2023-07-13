package cl.jpvs.modulo5ej10



class FoldablePhone (isScreenLightOn : Boolean =false) :Phone(isScreenLightOn) {

      var isFoldable : Boolean = false
    override  fun switchOn() {
        if (!isFoldable) {
            isScreenLightOn = true

        }
    }
    fun abrir() {
        isFoldable = true
    }
    fun cerrar() {
        isFoldable = false
    }

}