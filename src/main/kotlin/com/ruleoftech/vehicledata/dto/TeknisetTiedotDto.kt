package com.ruleoftech.vehicledata.dto

import java.sql.Date

data class TeknisetTiedotDto(
    val jarnro: Long,
    val ajoneuvoluokka: String,
    val ensirekisterointipvm: Date,
    val ajoneuvoryhma: Int,
    val ajoneuvonkaytto: String,
    val kayttoonottopvm: Long,
    val vari: String,
    val ovienLukumaara: Int,
    val korityyppi: String,
    val ohjaamotyyppi: Int,
    val istumapaikkojenLkm: Int,
    val omamassa: Int,
    val teknSuurSallKokmassa: Int,
    val tieliikSuurSallKokmassa: Int,
    val ajonKokPituus: Int,
    val ajonLeveys: Int,
    val ajonKorkeus: Int,
    val kayttovoima: String,
    val iskutilavuus: Int,
    val suurinNettoteho: Int,
    val sylintereidenLkm: Int,
    val ahdin: String,
    val merkkiSelvakielinen: String,
    val mallimerkinta: String,
    val vaihteisto: String,
    val vaihteidenLkm: Int,
    val kaupallinenNimi: String,
    val voimanvalJaTehostamistapa: String,
    val tyyppihyvaksyntanro: String,
    val yksittaisKayttovoima: String,
    val kunta: String,
    val co2: Int
)
