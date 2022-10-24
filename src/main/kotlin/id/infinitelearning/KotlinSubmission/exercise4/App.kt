package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val result = validateAccount("Tutik", "123456789")
        println(result)
    } catch (error: Exception) {
        println(error)
    } finally {
        println("Finish")
    }
}


fun validateAccount(name: String, password: String): String {
    if (name.count() < 3) {
        throw Exception("Nama harus lebih panjang dari 3 huruf")
    }

    if (password.count() < 6) {
        throw Exception("Password harus lebih panjang dari 6 huruf")
    }

    return "Selamat account anda telah terbuat !"
}