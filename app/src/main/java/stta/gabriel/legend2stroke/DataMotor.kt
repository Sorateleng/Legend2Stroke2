package stta.gabriel.legend2stroke

object DataMotor {
    private var motorNames = arrayListOf(
        "Honda Dash",
        "Honda NSR 150",
        "Kawasaki Binter KH100",
        "Kawasaki Ninja RR",
        "Yamaha RX King",
        "Yamaha RX Z",
        "Suzuki RGR",
        "Suzuki Satria Hiu",
        "Suzuki Tornado GS",
        "Suzuki TS Jumbo",
        "Yamaha 125Z",
        "Yamaha F1ZR",
        "Yamaha Tiara",
        "Yamaha TZM"
    )
    private var motorMrk = arrayListOf(
        "Honda",
        "Honda",
        "Kawasaki",
        "Kawasaki",
        "Yamaha",
        "Yamaha",
        "Suzuki",
        "Suzuki",
        "Suzuki",
        "Suzuki",
        "Yamaha",
        "Yamaha",
        "Yamaha",
        "Yamaha",
    )

    private var motorType = arrayListOf(
        "Ayago",
        "Sport",
        "Figther",
        "Sport",
        "Fighter",
        "Sport Semi",
        "Sport",
        "Cub",
        "Cub",
        "Trail",
        "Cub",
        "Cub",
        "Ayago",
        "Sport"
    )

    private var motorYear = arrayListOf(
        "1997",
        "1996",
        "1980",
        "1996",
        "1993",
        "1995",
        "1996",
        "1999",
        "1996",
        "1995",
        "1994",
        "1997",
        "1999",
        "1995",
    )

    private var motorCubic = arrayListOf(
        "125 cc",
        "150 cc",
        "100 cc",
        "150cc",
        "135 cc",
        "137 cc",
        "150 cc",
        "120 cc",
        "110 cc",
        "115 cc",
        "125 cc",
        "110 cc",
        "120 cc",
        "150 cc"
    )

    private var motorPrice = arrayListOf(
        "Rp17.000.000.00",
        "Rp40.000.000.00",
        "Rp13.000.000.00",
        "Rp18.000.000.00",
        "Rp19.000.000.00",
        "Rp35.000.000.00",
        "Rp19.000.000.00",
        "Rp20.000.000.00",
        "Rp35.000.000.00",
        "Rp80.000.000.00",
        "Rp30.000.000.00",
        "Rp15.000.000.00",
        "Rp17.000.000.00",
        "Rp50.000.000.00",

        )
    private var motorDetails = arrayListOf(
        "Honda Nova Dash 125 merupakan suksesor dari generasi sebelumnya yaitu Honda Nova Tena yang kubikasi mesinnya masih 110cc. Nah pada generasi Dash, tidak hanya naik kubikasi menjadi 125cc tapi juga ada rombakan total pada desain body yang makin ganteng dan penambahan radiato",
        "Honda NSR adalah sang legenda. Ya, legenda motor Honda di Indonesia yang menjadi cikal bakal lahirnya All-New Honda CBR150R saat ini. Pada masa kejayaannya, NSR begitu diperhitungkan sebagai salah satu motor 'laki' bermesin 2-tak tercepat di Indonesia.\n" +
                "Namun, akibat perputaran ekonomi Indonesia dan daya saing otomotif kala itu, lama-kelamaan Honda NSR tersisih dan berhenti diproduksi. Motor ini pun kin menjadi legenda di Indonesia dan tentunya tidak mudah untuk dilupakan begitu saja.\n" +
                "Dalam sejarahnya, Honda NSR sempat diluncurkan dalam 4 periode dan 4 varian berbeda. Yuk simak apa saja modelnya.",
        "Kawasaki Binter KH100 adalah motor yang cukup melegenda walaupun penjualannya hanya bertahan selama 6 tahun, namun saat ini banyak penggila roda dua khususnya pecinta motor-motor klasik 2tak untuk mengoleksi motor unik dari kawasaki ini",
        "Kawasaki Ninja RR adalah motor sport milik Kawasaki, Ninja adalah kelas tertinggi unutk motor sport besutan kawasaki, motor ini sangat melegenda karena umur yang panjang dalam urusan penjualannya. pada tahun 2010 kawasaki memutuskan untuk menghentikan produksinya karena masalah emisi dan lain-lain, tapi tenang untuk 10 tahun kedepan pabrikan dengan ciri khas warna hijau ini masih menyediakan onderdil ori untuk kawasaki ninja 2tak",
        "Yamaha RX King, siapa yang tidak tau motor sangar nan bengis ini, dilengkapi dengan mesin yang powerfull julukannya pun tidak main-main 'MOTOR JAMBRET' ya ini adalah motor legendaris dari pabrikan Yamaha, kepopuleran Yamaha RX King seakan tak akan pernah sirna oleh waktu sampai saat ini penggemar motor ini sangat banyak, tidak heran sering diadakan acara jamboro khususnya RX KING Lovers",
        "Yamaha RX Z, ini adalah varian dari keluarga RX Yamaha dibekali dengan mesin 135cc SE, kubikasinya sama dengan dengan RX King namun dibekelai dengan percepatan 6speed, motor ini mempunyai bentuk semi race karena bentuknya yang emruncing menandakan bahwa motor ini siap unutk diajak turun ke lintisan",
        "Suzuki RGR, RGR adalah motor besutan dari pabrikan Suzuki dengan body full fairing suzuki RGR ditanamkan DNA balap dari sang jawara MotoGP 2000 yaitu Suzuki GSV R yang meraih juara dunia. Ubagi yang menggilai kecepatan dan handling RGR adalah paket komplit",
        "Suzuki Satria 120 R adalah varian bebek/moped underbone dua langkah (2-tak) dari pabrikan Suzuki. Terlahir dari keluarga RG, Satria 120 adalah versi pembesaran kapasitas versi pabrikan dari Suzuki RG Sport 110 (tidak tersedia di Indonesia) yang lebih dulu lahir di negeri asalnya Malaysia,dengan perbedaan yang cukup banyak. Mulai dari perbedaan diameter dan langkah silinder, diameter lubang venturi karburator, rasio kompresi hingga power dan torsi maksimum, dsb.",
        "Suzuki Tornado dirilis untuk meneruskan kejayaan keluarga RC series di Indonesia pada tahun 1994. Menyandang sebagai “anak bontot” Suzuki Tornado mengusung desain yang sangat berbeda dari saudara-saudaranya seperti Suzuki Crystal dan Suzuki Bravo.\n" +
                "\n" +
                "Body bongsor terlihat jelas menjadi ciri khas Suzuki Tornado, di tambah desain lampu depan yang futuristik Nampak seperti salah satu ikon film Star Trek. Edisi pertama diberi nama Suzuki Tornado GS110.\n" +
                "\n" +
                "Tornado GS110 mengusung mesin sama dengan Suzuki Crystal yaitu 110cc tentunya tetap dengan teknologi andalannya Jet Cooled. Bagian rem depan juga sudah menggunakan cakram dipadukan dengan knalpot model racing.",
        "Suzuki TS 125 adalah enduro bike berkubikasi 123 cc dua langkah bertenaga 13 hp di 7000 rpm. Diproduksi suzuki pertama kali tahun 1970 dan sejak tahun 1991 untuk pasar Amerika berspesifikasi 124 cc, liquid cooled, 22 hp sementara untuk pasar jepang bermesin 4 tak DOHC bertenaga sama dengan versi amrik 22 hp di 9500 rpm.",
        "sejarah Yamaha 125Z di Indonesia, yang masuk pada era 2000-an.\n" +
                "\n" +
                "Saat itu di bawa oleh APM resmi Yamaha Indonesia yang masih bernama PT Yamaha Motor Kencana Indonesia (YMKI), secara utuh alias CBU.\n" +
                "\n" +
                "Meski harganya tinggi, pemasarannya terhitung lancar, karena pada saat itu sedang gencarnya ajang balap motor underbone 2-tak.\n" +
                "\n" +
                "Tapi sayang, masa edar Yamaha 125Z di Indonesia relatif pendek, hanya sekitar tahun 2000 hingga 2002.",
        "Yamaha Indonesia membuat terobosan dengan meluncurkan F1ZR. Secara kasat mata jelas tersaji lewat tubuh yang kian sporty. Terlihat dari bentuk tubuh yang meruncing di bagian depan. Desain headlamp, juga lebih besar ketimbang versi F1Z. Di sini, dia juga sudah memakai kopling semi otomatis. Lantaran bertugas meringankan pergantian gigi saja. Padahal, perpindahan gigi tetap bisa dilakukan tanpa harus menarik tuas di stang kiri tadi. Merujuk pada model sebelumnya, F1ZR dengan kopling banci ini sepertinya menjadi bahan pembanding bagi F1Z versi manual clutch.",
        "Pada awal 2000-an, dunia otomotif Indonesia sedang gandrung dengan yang namanya motor ayago. Nah, melihat peluang tersebut, Yamaha pun mendatangkan varian Tiara 120S langsung dari Malaysia.\n" +
                "\n" +
                "Dirilis pada tahun 2001, ini adalah motor ayago yang digadang-gadang punya power dahsyat. Dibekali mesin 2-tak, berkapasitas 119cc, Tiara punya tenaga maksimal 17 PS pada putaran 7.500 rpm.",
        "Sesuai namanya, Yamaha TZM 150 menganut kapasitas mesin 150cc. Kendati tergolong kecil, namun tenaganya bisa melebihi motor sport modern bermesin 250cc. Bahkan, apabila diadu dengan Yamaha R25, TZM sanggup mengimbanginya. Hal itu disebabkan konfigurasi dua-tak yang dinilai lebih berdaya dari empat-tak."
    )

    private val motorImages = intArrayOf(
        R.drawable.honda_dash,
        R.drawable.honda_nsr_150,
        R.drawable.kawasaki_binter_kh100,
        R.drawable.kawasaki_ninja_rr,
        R.drawable.rx_king,
        R.drawable.rx_z,
        R.drawable.suzuki_rgr,
        R.drawable.suzuki_satria_hiu,
        R.drawable.suzuki_tornado_gs,
        R.drawable.suzuki_ts_jumbo,
        R.drawable.yamaha_125z,
        R.drawable.yamaha_f1zr,
        R.drawable.yamaha_tiara,
        R.drawable.yamaha_tzm
    )

    val listData: ArrayList<Motor>
        get() {
            val list = arrayListOf<Motor>()
            for (position in motorNames.indices) {
                val motor = Motor()
                motor.name = motorNames[position]
                motor.detail = motorDetails[position]
                motor.photo = motorImages[position]
                motor.merk = motorMrk[position]
                motor.tipemotor = motorType[position]
                motor.tahun = motorYear[position]
                motor.kubik = motorCubic[position]
                motor.price = motorPrice[position]
                list.add(motor)
            }
            return list
        }
}