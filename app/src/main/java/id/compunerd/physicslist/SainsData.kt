package id.compunerd.physicslist

object SainsData {
    private val sainsNames = arrayOf(
        "Mekanika",
        "Fisika Quantum",
        "Mekanika Fluida",
        "Fisika Listrik dan Maget",
        "Termodinamika",
        "Optika Geometris",
        "Astronomi",
        "Fisika Medis",
        "Fisika Radiasi",
        "Fisika Lingkungan",
        "Geofisika",
        "Ekonomifisika")

    private val sainsDetails = arrayOf(
        "Mekanika merupakan cabang ilmu fisika yang telah mulai dipelajari sejak sekolah dasar. Cabang ini mempelajari tentang gerak benda. Gelombang dan cahaya termasuk pada fisika mekanik.",
        "Fisika quantum merupakan cabang ilmu fisika yang mempelajari tentang atom dan sub atom. Ilmu kuantum berada di tengah antara ilmu fisika dan kimia. Yang dipelajari sama-sama bagian terkecil dari benda, yaitu atom.",
        "Ilmu mekanika fluida bagi beberapa ahli sering dimasukkan dalam ilmu mekanika secara umum. Namun, bagi ahli lain mekanika fluida sedikit berbeda. Fluida merupakan benda atau zat yang dapat mengalami perubahan bentuk karena dikenai gaya.",
        "listrik dan magnet mempelajari elektron atau partikel yang bermuatan listrik dan magnet. Secara dasar, ilmu ini juga sudah mulai dipelajari di tingkat sekolah awal, seperti rangkaian listrik dan gaya magnet.",
        "Termodinamika berasal dari dua kata, termo yang berarti panas dan dinamika yang bergerak. Termodinamika diartikan sebagai ilmu yang mempelajari tentang energi dan perpindahan panas.",
        "Benda optik adalah benda yang berhubungan dengan pemanfaatan sifat cahaya yang dapat dipantulkan. Benda ini berhubungan dengan mata yang bekerja sesuai dengan sifat cahaya yang dipantulkan.",
        "Astronomi termasuk dalam ilmu fisika. Iya, karena ilmu ini mempelajari segala sesuatu tentang perbintangan dan benda-benda di luar angkasa. Kesemuanya merupakan benda tidak hidup.",
        "Medis berasal dari kata medical atau kedokteran. Fisika medis, artinya ilmu fisika yang berhubungan dengan dunia kesehatan atau kedokteran.",
        "Fisika radiasi mempelajari proses energi yang bergerak dalam ruangan dan diserap oleh benda lain. Umumnya benda yang mengalami radiasi adalah gelombang cahaya, beberapa di antaranya berbahaya.",
        "fisika lingkungan berhubungan dengan ilmu sosial seperti geografi dan geologi. Fisika lingkungan adalah ilmu fisika yang mempelajari segala sesuatu yang berada di bumi dan udara dan berhubungan dengan kehidupan.",
        "Geofisika merupakan gabungan dari beberapa ilmu sains. Ilmu ini menggabungkan ilmu fisika, geografi, kimia, dan matematika sekaligus. Yang termasuk dalam ilmu ini adalah ilmu tentang gempa atau seismologi, magnet bumi, gravitasi, dan geoelektro.",
        "Ekonomi fisika adalah ilmu yang mempelajari tentang fisika dilihat dari sudut ekonomi. Tentunya secara sederhana ilmu fisika dihubungkan dengan hukum penawaran dan permintaan."
    )

    private val sainsImages = intArrayOf(
        R.drawable.ic_mekanika,
        R.drawable.ic_quantum,
        R.drawable.ic_fluida,
        R.drawable.ic_magnet,
        R.drawable.ic_termodinamika,
        R.drawable.ic_optika,
        R.drawable.ic_astronomi,
        R.drawable.ic_medis,
        R.drawable.ic_radiasi,
        R.drawable.ic_lingkungan,
        R.drawable.ic_geofisika,
        R.drawable.ic_ekonomifisika
    )

    val listData: ArrayList<Sains>
    get() {
        val list = arrayListOf<Sains>()
        for (position in sainsNames.indices){
            val sains = Sains()
            sains.name = sainsNames[position]
            sains.detail = sainsDetails[position]
            sains.photo = sainsImages[position]
            list.add(sains)
        }
        return list
    }
}