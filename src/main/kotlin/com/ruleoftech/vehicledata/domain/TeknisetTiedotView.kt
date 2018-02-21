package com.ruleoftech.vehicledata.domain

import com.ruleoftech.vehicledata.dto.TeknisetTiedotViewDto
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Tekniset tiedot model.
 */
@Entity
@Table(name = "tekniset_tiedot_mat_view")
internal data class TeknisetTiedotView(
    val ajoneuvoluokka: String,
    val ajoneuvoluokkaselite: String?,
    val ensirekisterointipvm: String?,
    val ajoneuvoryhma: String?,
    val ajoneuvoryhmaselite: String?,
    val ajoneuvonkaytto: String?,
    val ajoneuvonkayttoselite: String?,
    val variantti: String?,
    val versio: String?,
    val kayttoonottopvm: Int?,
    val vari: String?,
    val variselite: String?,
    val ovienLukumaara: Int?,
    val korityyppi: String?,
    val korityyppiselite: String?,
    val ohjaamotyyppi: String?,
    val ohjaamotyyppiselite: String?,
    val istumapaikkojenLkm: Int?,
    val omamassa: Int,
    val teknSuurSallKokmassa: Int?,
    val tieliikSuurSallKokmassa: Int?,
    val ajonKokPituus: Int?,
    val ajonLeveys: Int?,
    val ajonKorkeus: Int?,
    val kayttovoima: String?,
    val kayttovoimaselite: String?,
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
    val voimanvalJaTehostamistapaselite: String?,
    val tyyppihyvaksyntanro: String?,
    val yksittaisKayttovoima: String?,
    val kunta: String,
    val kuntaselite: String?,
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
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        "",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        "",
        null,
        null,
        null,
        "",
        null,
        null
    )

    fun toDto() = TeknisetTiedotViewDto(
        ajoneuvoluokka = ajoneuvoluokka,
        ajoneuvoluokkaselite = ajoneuvoluokkaselite,
        ensirekisterointipvm = ensirekisterointipvm,
        ajoneuvoryhma = ajoneuvoryhma,
        ajoneuvoryhmaselite = ajoneuvoryhmaselite,
        ajoneuvonkaytto = ajoneuvonkaytto,
        ajoneuvonkayttoselite = ajoneuvonkayttoselite,
        variantti = variantti,
        versio = versio,
        kayttoonottopvm = kayttoonottopvm,
        vari = vari,
        variselite = variselite,
        ovienLukumaara = ovienLukumaara,
        korityyppi = korityyppi,
        korityyppiselite = korityyppiselite,
        ohjaamotyyppi = ohjaamotyyppi,
        ohjaamotyyppiselite = ohjaamotyyppiselite,
        istumapaikkojenLkm = istumapaikkojenLkm,
        omamassa = omamassa,
        teknSuurSallKokmassa = teknSuurSallKokmassa,
        tieliikSuurSallKokmassa = tieliikSuurSallKokmassa,
        ajonKokPituus = ajonKokPituus,
        ajonLeveys = ajonLeveys,
        ajonKorkeus = ajonKorkeus,
        kayttovoima = kayttovoima,
        kayttovoimaselite = kayttovoimaselite,
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
        voimanvalJaTehostamistapaselite = voimanvalJaTehostamistapaselite,
        tyyppihyvaksyntanro = tyyppihyvaksyntanro,
        yksittaisKayttovoima = yksittaisKayttovoima,
        kunta = kunta,
        kuntaselite = kuntaselite,
        co2 = co2,
        matkamittarilukema = matkamittarilukema,
        alue = alue,
        valmistenumero2 = valmistenumero2,
        jarnro = jarnro
    )
}
