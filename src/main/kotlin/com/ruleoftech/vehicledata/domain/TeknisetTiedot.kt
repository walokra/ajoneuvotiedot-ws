package com.ruleoftech.vehicledata.domain

import com.ruleoftech.vehicledata.dto.TeknisetTiedotDto
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Tekniset tiedot model.
 */
@Entity
@Table(name = "tekniset_tiedot")
internal data class TeknisetTiedot(
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
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val jarnro: Long?
) {

    // Default constructor for JPA.
    @Suppress("unused")
    private constructor() : this(
        "",
        null,
        null,
        "",
        null,
        null,
        null,
        null,
        null,
        "AC",
        null,
        0,
        Int.MIN_VALUE,
        null,
        null,
        null,
        null,
        null,
        "",
        Int.MIN_VALUE,
        null,
        null,
        "",
        null,
        "",
        "",
        null,
        null,
        "",
        "",
        null,
        "",
        "",
        null,
        null,
        "",
        "",
        Long.MIN_VALUE
    )

    fun toDto() = TeknisetTiedotDto(
        ajoneuvoluokka = ajoneuvoluokka,
        ensirekisterointipvm = ensirekisterointipvm,
        ajoneuvoryhma = ajoneuvoryhma,
        ajoneuvonkaytto = ajoneuvonkaytto,
        variantti = variantti,
        versio = versio,
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
        sylintereidenLkm = sylintereidenLkm,
        ahdin = ahdin,
        sahkohybridi = sahkohybridi,
        merkkiSelvakielinen = merkkiSelvakielinen,
        mallimerkinta = mallimerkinta,
        vaihteisto = vaihteisto,
        vaihteidenLkm = vaihteidenLkm,
        kaupallinenNimi = kaupallinenNimi,
        voimanvalJaTehostamistapa = voimanvalJaTehostamistapa,
        tyyppihyvaksyntanro = tyyppihyvaksyntanro,
        yksittaisKayttovoima = yksittaisKayttovoima,
        kunta = kunta,
        co2 = co2,
        matkamittarilukema = matkamittarilukema,
        alue = alue,
        valmistenumero2 = valmistenumero2,
        jarnro = jarnro
    )
}
