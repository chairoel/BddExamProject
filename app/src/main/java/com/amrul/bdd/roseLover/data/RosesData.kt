package com.amrul.bdd.roseLover.data

import com.amrul.bdd.roseLover.R

object RosesData {
    private val roseNames = arrayOf(
        "Red Rose",
        "Yellow Rose",
        "Pink Rose",
        "White Rose",
        "Orange Rose",
        "Blue Rose",
        "Green Rose",
        "Wild Rose",
        "Old Garden Rose",
        "Alba Rose",
        "Galica Rose",
        "Damask Rose",
        "Centifolia Rose",
        "Moss Rose",
        "China Rose",
        "The Portland Rose",
        "Bourbon Rose",
        "Hybrid Perpetual Rose",
        "Tea Rose",
        "Bermuda Mysterious Rose",
        "Climbing Rose",
        "Shrub Rose",
        "Garden Rose",
        "Hybrid Tea Rose",
        "Floribunda Rose",
        "Buck Rose",
        "English Rose",
        "Miniature Rose",
        "Black Rose",
        "Talitha Rose",
        "Putri Rose",
        "White Mega Rose"
    )

    private val roseDetails = arrayOf(
        "Makna bunga mawar merah menunjukkan keistimewaan. Apabila bunga ini dikasihkan kepada seseorang bawasannya orang tersebut memang mencintai dirinya.",
        "Bunga dengan warna kuning menunjukkan rasa solidaritas yang tinggi, kekeluargaan, ceria, dan gembira.  sesuai warnanya bunga ini cocok untuk dijadikan hadiah kejutan unutk teman, sahabat, atau keluarga yang sangat kita cintai.",
        "Bunga mawar merah muda menunjukkan kebahagiaan, rasa hormat, lembut, dan pujian kepada orang. Bisa diartikan dengan uangkapan kekaguman. Disisi lain yang lebih tua diartikan dengan rasa berterima kasih kepada seseorang.",
        "Warna putih pada bunga mawar menunjukkan rasa cinta sejati, suci, kemurnian hati, dan anggun. Bunga mawar putih ini cocok diberi kepada sahabat karena warna putih ini melambangkan persahabatan sejati.",
        "Bunga mawar orange mempunyai arti semangat. Hal ini diartikan bawasannya seseorang yang memberikan bunga ini sangat mengetahui karaktersitik dari orang yang diberi bunga.",
        "Bunga Mawar ini memiliki makna kesempurnaan. Mawar biru ini diperoleh untuk alat mengekpresikan rasa cinta dan kasih sayang. Disisi lain Bunga berwarna Biru tersebut melambangkan misteri, pesimistis dan juga kemustahilan. Dilihat dari warnanya bunga mawar ini memilki warna yang unik. Sehingga tidak heran jika bunga mawar ini banyak yang digemari para kalangan remaja.",
        "Bunga mawar ini memiliki makna kesburunan,harmonis, dan sejahtera. Dan bisa diartikan harapan untuk menjadi kehidupan yang lebih baik. Warna hijau sendiri memiliki sebuah tanda perdamain dan ketenangan. Dan bisa diartikan sebagai sebuah harapan untuk membuat kehidupan yang baru nanti lebih sejahtera. Dan harapan untuk mendapatkan kesehatan yang lebih baik.",
        "Bunga mawar jenis wild rose ini memiliki pertumbuhan secara liar. Sehingga banyak diketahui oleh semua kalangan. Bentuk bunga ini sangatlah simpel hanya saja mempunyai warna yang indah.",
        "Bunga mawar ini bunga yang unik dan memiliki ciri khas bau yang harum. Dimana bunga ini hasil persilangan yang sebelumnya dikenalkannya Hybrird Tea.",
        "Bunga mawar ini berwarna putih dan hasil persilangan dari mawar Rosa Arvensis dan Rosa Alba. Mawar Alba berbunga hanya setahun sekali.",
        "Bunga mawar galica salah satu mawar hasil persilangan dari rosa galica. Bunga mempunyai warna yang sangat menyegarkan ketika dipandang sehingga banyak yang menggemari bunga ini.",
        "Bunga mawar ini berasal dari Persia yang dibawa oleh Robert de Brie ke Eropa pada tahun 1254 dan tahun 1276. Mawar ini juga hasil persilangamn antar bunga mawar rosa phoenicea dengan mawar galica.",
        "Bunga mawar ini mempunyai sebutan nama provence. Yang memiliki arti  seribu daun mahkota. Mawar ini hanya berbunga satu tahun sekali.",
        "Bunga mawar moss lebih mirip dengan mawar Centifolia yang kelopak dan batangnya seperti ditumbuhi lumut. Bahkan mawar ini hanya bisa berbunga satu kali dalam setahun.",
        "Bunga mawar china memiliki perbedaan dari mawar pada umumnya. Mawar ini mampu berbunga sepanjang musim. Bunga mawar ini juga mempunyai empat jenis Person Pink China, Slater’s crimson China, Parks yellow Tea scented China, dan Hume’s Blus China.\nMawar ini pertama kalinya dibawa ke Eropa karena mempunyai kelebihan mampu berbunga berkali-kali.",
        "Nama dari mawar ini disematkan kepada Duke of Portland sebagai tanda mengenang beliau. Karena dia orang pertama kali yang menerima mawar ini dari Italia.",
        "Bunga mawar ini pertama kali ditemukan di Prancis pada tahun 1823. Mawar ini persilangan antara mawar Old Blush China dan Autumn Damask.",
        "Bunga mawar ini keturunan Bourbron yang dapat dijumpai di Inggris. Mawar jenis ini juga bisa berbunga berkali-kali setiap tahunnya.",
        "Bunga mawar jenis ini hasil persilangan antara Yellow Tea Scented China dengan jenis dari Noisette dan Bourbon. Pada bunga terdapat Gen bourbon sehingga mampu bebunga berkali-kali setiap tahun. Mawar ini memiliki aroma seperti layaknya teh.",
        "Bunga mawar ini mempunyai nilai ekonomi cukup tinggi. Mawar bunga bisa ditanam ditempat daerah tropis dan semi tropis. Bunga ini juga mampu bertahan pada cuaca panas dan lembab.",
        "Bunga mawar ini memiliki artian memanjat. Mawar ini salah satu jenis kelompok mawar yang bisa merambat. Bunga ini memiliki berbagai banyak jenis diantaranya : Ayrshire, Climbing China, Sempervirens, Boursault, Laevigate, Climbing Bourbon, dan Climbing Tea.",
        "",
        "Bunga mawar ini termasuk mawar jenis semak dan masih keturunan dari Old Garden. Mawar ini memiliki bentuk yang beragam. Bunga ini juga mampu berbunga berkali-kali.",
        "Bunga mawar ini merupakan jenis bunga mawar yang bagus digunakan untuk  bunga potong. Dalam satu batang bunga ini mampu memproduksi 5 sampai 6 bunga. Bunga ini biasanya disematkan di jas ketika dalam acara pernikahan.",
        "Bunga mawar ini memiliki ukuran yang kecil. Tetapi didalam satu batang bisa menumbuhkan hingga 10 bunga. Mawar ini cocok dibudidayakan di ruangan terbuka. Karena tanamannya rimbun sehingga bisa mencolok dari kejauhan.",
        "Nama dari mawar ini berasal dari seorang Professor yang bernama Griffith Buck dari Iowa University. Beliau sangat ahli dalam bidang hortikulturra, dan sukses memuliakan lebih 90 varietas bunga mawar. Bunga mawar ini bisa bertahan terhadap penyakit dan musim dingin.",
        "Bunga mawar ini memiliki bau yang harum dan mampu berbunga berkali-kali. Mawar ini hasil persilangan antara mawar modern dan old Garden.",
        "Bunga mawar Miniature Roses merupakan bunga mawar yang mempunyai ukuran kecil. Tetapi bunga ini mampu berbunga berkali-kali.",
        "Bunga yang satu tergolong bunga yang langka tidak seperti bunga mawar lainnya. Mawar hitam ini tumbuh di daerah Halferi. Saat ini mawar hitam spesies yang terancam punah. Hal ini dikarenakan sulitnya dalam penanaman bunga tersebut.\nBunga mawar hitam mempunyai makna lambang kebencian dan simbol misteri. Namun demikian bunga ini memiliki keindahan dan perlu dilestarikan.",
        "Bunga mawar talitha adalah salah satu jenis bunga potong dengan bunga ganda. Warna yang dimiliki mawar ini berwarna orange. Ukuran bunga mawar ini tidak jauh berbeda dengan bunga mawar pada umumnya. Kesegaran bunga mawar ini mampu bertahan kurang lebih 9 hari.",
        "Bunga mawar putrid temasuk golongan jenis bunga mawar potong dengan jenis ganda. Warna bunga mawar ini merah tua atau merah dark red. Bunga ini mempunyai aroma wangi lebih tinggi. Aroma wangi bunga putrid mampu bertahan kurang lebih 10 hari. Ukuran bunga putrid lebih besar dibandingkan dengan ukuran bunga talitha.",
        "Bunga mawar mega putih merupakan jenis bunga yang mempunyai ukuran cukup besar. Uncup bunga ini mencapai 3 cm dan ketika mekar memiliki diameter 12 cm. Bunga ini memiliki batang yang kokoh sehingga kelopak bunganya bisa menopang di batangnya."
    )

    private val roseColors = arrayOf(
        "Merah",
        "Kuning",
        "Pink",
        "Putih",
        "Orange",
        "Biru",
        "Hijau",
        "Merah, Putih",
        "Pink",
        "Putih",
        "Pink",
        "Pink, Putih",
        "Merah",
        "Beragam",
        "Merah",
        "Merah",
        "Pink",
        "Merah, Putih, Ungu",
        "Pink",
        "Merah, Putih",
        "Ungu",
        "Putih",
        "Merah",
        "Merah",
        "Merah",
        "Merah",
        "Merah, Pink",
        "Pink, Putih",
        "Hitam",
        "Orange",
        "Merah",
        "Putih"
    )

    private val heroesImages = intArrayOf(
        R.drawable.mawar_merah,
        R.drawable.mawar_kuning,
        R.drawable.mawar_pink,
        R.drawable.mawar_putih,
        R.drawable.mawar_orange,
        R.drawable.mawar_biru,
        R.drawable.mawar_hijau,
        R.drawable.mawar_wild_roses,
        R.drawable.mawar_old_garden,
        R.drawable.mawar_alba,
        R.drawable.mawar_galica,
        R.drawable.mawar_damask,
        R.drawable.mawar_centifolia,
        R.drawable.mawar_moss,
        R.drawable.mawar_china,
        R.drawable.mawar_the_portland_rose,
        R.drawable.mawar_bourbon,
        R.drawable.mawar_hybrid_perpetual,
        R.drawable.mawar_tea,
        R.drawable.mawar_bermuda_mysterious,
        R.drawable.mawar_climbing,
        R.drawable.mawar_shrub,
        R.drawable.mawar_garden,
        R.drawable.mawar_hybrid_tea,
        R.drawable.mawar_floribunda,
        R.drawable.mawar_buck,
        R.drawable.mawar_english,
        R.drawable.mawar_miniature,
        R.drawable.mawar_hitam,
        R.drawable.mawar_talitha,
        R.drawable.mawar_putri,
        R.drawable.mawar_mega_putih,
    )

    val listData: ArrayList<Rose>
        get() {
            val list = arrayListOf<Rose>()
            for (position in roseNames.indices) {
                val hero = Rose()
                hero.name = roseNames[position]
                hero.detail = roseDetails[position]
                hero.color = roseColors[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}