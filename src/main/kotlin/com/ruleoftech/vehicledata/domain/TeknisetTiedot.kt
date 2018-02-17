package com.ruleoftech.vehicledata.domain

import com.ruleoftech.vehicledata.dto.TeknisetTiedotDto
import java.sql.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Tekniset tiedot model.
 */
@Entity
@Table(name = "tekniset_tiedot")
internal data class TeknisetTiedot(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    val co2: Int) {

    fun toDto() = TeknisetTiedotDto(
        jarnro = jarnro,
        ajoneuvoluokka = ajoneuvoluokka,
        ensirekisterointipvm = ensirekisterointipvm,
        ajoneuvoryhma = ajoneuvoryhma,
        ajoneuvonkaytto = ajoneuvonkaytto,
        kayttoonottopvm = kayttoonottopvm,
        vari = vari,
        ovienLukumaara = ovienLukumaara,
        korityyppi = korityyppi,
        ohjaamotyyppi = ohjaamotyyppi,
        istumapaikkojenLkm = istumapaikkojenLkm,
        omamassa = omamassa,
        teknSuurSallKokmassa = teknSuurSallKokmassa,
        tieliikSuurSallKokmassa = tieliikSuurSallKokmassa,
        ajonKokPituus = ajonKokPituus,
        ajonLeveys = ajonLeveys,
        ajonKorkeus = ajonKorkeus,
        kayttovoima = kayttovoima,
        iskutilavuus = iskutilavuus,
        suurinNettoteho = suurinNettoteho,
        sylintereidenLkm =sylintereidenLkm,
        ahdin = ahdin,
        merkkiSelvakielinen = merkkiSelvakielinen,
        mallimerkinta = mallimerkinta,
        vaihteisto = vaihteisto,
        vaihteidenLkm = vaihteidenLkm,
        kaupallinenNimi = kaupallinenNimi,
        voimanvalJaTehostamistapa = voimanvalJaTehostamistapa,
        tyyppihyvaksyntanro = tyyppihyvaksyntanro,
        yksittaisKayttovoima = yksittaisKayttovoima,
        kunta = kunta,
        co2 = co2
    )
}
