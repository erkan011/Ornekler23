import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val suan = LocalDateTime.now()
    println("Tarih: ${suan.toLocalDate()}")
    println("Saat: ${suan.toLocalTime()}")

    val an = Instant.now()
    println("UTC zamanı: $an")

    val gelecek = LocalDateTime.of(2025, 1, 1, 0, 0, 0)
    if (suan.isBefore(gelecek)){
        println("Gelecek zaman, mevcut zamandan sonra.")
    }else {
        println("Gelecek zaman, mevcut zamandan önce.")
    }

    val formatliZaman = suan.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
    println("Formatli Zaman: $formatliZaman")
}