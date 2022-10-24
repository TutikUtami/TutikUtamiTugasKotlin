package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String="Tutik"
    println("My First Name is : $firstName")
    val lastName: String="Utami"
    println("My Last Name is : $lastName")
    val JenisKelamin: String="Perempuan"
    println("Jenis Kelamin : $JenisKelamin")
    val Usia: Int = 22
    println("Usia Ku : $Usia")
    val Single: Boolean= false
    val TidakSingle: Boolean= true

    println("Status Ku Adalah="+ (Single && TidakSingle))//Mengembalikan nilai true jika kedua operan benar
    println("Status Ku Adalah="+ (Single || TidakSingle))//Mengembalikan nilai true jika salah satu operan benar
    println("Status Ku Adalah="+ (!TidakSingle))//Membalikkan hasilnya, mengembalikan false jika operannya true
    println("Status Ku Adalah="+ (Single>TidakSingle))
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val team: String = "Ilham,Laila, Seno, Tutik Utami"
    println("My team is:$team")
    return "Tutik Utami"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 4
    return mentor.count() + countOfGroup;
}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Group 2", listOf("4 member", "Infinite Learning", "Heathycare"), "Afternoon")
}