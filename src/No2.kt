fun main() {
    val nilai : Array<Int> = arrayOf(67,75,87,72)
    var sum = 0

    for (num in nilai) {
        sum += num
    }

    val rataRata = sum / nilai.size
    println("Nilai rata-rata = $rataRata")

    if (rataRata >= 76){
        println("Selamat anda lolos")
    }else{
        println("Mohon maaf anda tidak lolos")
    }
}