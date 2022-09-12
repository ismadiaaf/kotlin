// if
// if else
// if else if
// when = switch case

fun main(args: Array<String>){

    val UTS: Int = 60
    val UAS: Int = 80
    val NA: Double = (0.4 * UTS) + (0.6 * UAS)

    if (NA > 80) {
        println("Selamat Anda Naik Semester")
    }
    else
        println("Anda Cuti")

    println("Masukkan pilihan angka 1-12")
    val angka:Int = readLine()!!.toInt()

    when (angka) {
        3, 4, 5, 6 -> print("It is summer season")
        6, 7, 9 -> print("It is rainy season")
        8, 11 -> print("It is autumn season")
        10, 12, 1, 2 -> print("It is winter season")

        else -> {
            print("invalid input")
        }
    }
}