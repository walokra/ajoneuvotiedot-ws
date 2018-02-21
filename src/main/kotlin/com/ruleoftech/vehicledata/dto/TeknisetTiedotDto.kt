package com.ruleoftech.vehicledata.dto

data class TeknisetTiedotDto(
    val ajoneuvoluokka: String,
    val ensirekisterointipvm: String?,
    val ajoneuvoryhma: Int?,
    val ajoneuvonkaytto: String?,
    val variantti: String?,
    val versio: String?,
    val kayttoonottopvm: Int?,
    val vari: String?,
    val ovienLukumaara: Int?,
    val korityyppi: String?,
    val ohjaamotyyppi: Int?,
    val istumapaikkojenLkm: Int?,
    val omamassa: Int,
    val teknSuurSallKokmassa: Int?,
    val tieliikSuurSallKokmassa: Int?,
    val ajonKokPituus: Int?,
    val ajonLeveys: Int?,
    val ajonKorkeus: Int?,
    val kayttovoima: String?,
    val iskutilavuus: Int?,
    val suurinNettoteho: Double?,
    val sylintereidenLkm: Int?,
    val ahdin: String?,
    val sahkohybridi: String?,
    val merkkiSelvakielinen: String,
    val mallimerkinta: String?,
    val vaihteisto: String?,
    val vaihteidenLkm: Int?,
    val kaupallinenNimi: String?,
    val voimanvalJaTehostamistapa: String?,
    val tyyppihyvaksyntanro: String?,
    val yksittaisKayttovoima: String?,
    val kunta: String,
    val co2: Int?,
    val matkamittarilukema: Int?,
    val alue: String,
    val valmistenumero2: String?,
    val jarnro: Long?
)
