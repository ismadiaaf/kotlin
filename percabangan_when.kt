fun main(args: Array<String>){
    val angka : Int = 4

   when (angka) {
        3,4,5,6 -> print("It is summer season")
        6,7,9 -> print("It is rainy season")
        8,11 -> print("It is autumn season")
        10,12,1,2 -> print("It is winter season")

        else -> {
            print("invalid input")
        }
    }

}
