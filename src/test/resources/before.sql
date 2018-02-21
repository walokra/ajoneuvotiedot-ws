BEGIN;
DROP TABLE IF EXISTS tekniset_tiedot;

CREATE TABLE tekniset_tiedot (
  ajoneuvoluokka varchar(255),
  ensirekisterointipvm varchar(255),
  ajoneuvoryhma integer,
  ajoneuvonkaytto varchar(255),
  variantti varchar(255),
  versio varchar(255),
  kayttoonottopvm integer,
  vari varchar(255),
  ovienLukumaara integer,
  korityyppi varchar(255),
  ohjaamotyyppi integer,
  istumapaikkojenLkm integer,
  omamassa integer,
  teknSuurSallKokmassa integer,
  tieliikSuurSallKokmassa integer,
  ajonKokPituus integer,
  ajonLeveys integer,
  ajonKorkeus integer,
  kayttovoima varchar(255),
  iskutilavuus integer,
  suurinNettoteho decimal,
  sylintereidenLkm integer,
  ahdin varchar(255),
  sahkohybridi varchar(255),
  merkkiSelvakielinen varchar(255),
  mallimerkinta varchar(255),
  vaihteisto varchar(255),
  vaihteidenLkm integer,
  kaupallinenNimi varchar(255),
  voimanvalJaTehostamistapa varchar(255),
  tyyppihyvaksyntanro varchar(255),
  yksittaisKayttovoima varchar(255),
  kunta varchar(255),
  co2 integer,
  matkamittarilukema integer,
  alue varchar(255),
  valmistenumero2 varchar(255),
  jarnro BIGINT NOT NULL PRIMARY KEY UNIQUE
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
    'MUU', null, 21, '01', null, null, 19670000, null, null, null, null, 1, 210, null, null, null, null, null, '01', 590,
    null, null, null, null, 'BMW', 'R60/590', null, null, null, null, null, '01', '049', null, null, '027', null, 1
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
    'M1', '1997-01-10', null, '01', null, null, 19970110, '5', 5, 'AC', 1, 5, 1320, 1780, 1780, 4600, 1720, null, '01', 1780, 66, 4, false, null,
    'Volkswagen', '5D PASSAT VARIANT 1.8 CL-351-C/263', null, null, 'PASSAT', '05', null, '01', '286', null, 365135, '453', 'WVWZZZ3AZT', 2
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
    'MUU', '1976-09-01', 13, '01', null, null, 19760000, null, null, null, null, null, 630, null, 750, null, 1960, null, null, null, null, null, null, null,
    'Sprite', 'ALPINE/C', null, null, null, 01, null, null, '893', null, null, '669', null, 3
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '1984-07-09', null, '01', null, null, 19840000, '1', null, null, 1, 5, 780, 1175, 1155, null, 1590, null, '01', 1110, null, 4, null, null,
'Ford', '2D FIESTA 1.1-FBD/2280', null, null, 'FIESTA', '05', null, '01', '564', null, null, '905', null, 4
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'MUU', '1983-09-22', 13, '01', null, null, 19830000, null, null, null, null, null, 150, null, 350, null, 1580, null, null, null, null, null, null, null,
'Omavalmiste', 'PV350/2000', null, null, null, null, null, null, '734', null, null, '252', null, 5
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'O1', '1994-02-09', 1, '01', null, null, 19940209, null, null, null, null, null, 170, 750, 750, 2000, 1600, null, null, null, null, null, null, null,
'Valtteri', 'LKZ-8101', null, null, null, null, null, null, '761', null, null, '314', null, 6
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '1990-05-08', null, '05', null, null, 19900508, '9', null, null, 1, 5, 1060, 1505, 1435, 4270, 1680, null, '01', 1900, 88, 4, null, null,
'Citroen', '4D SEDAN BX 19 GTI-XBEY/2650', null, null, 'BX', '09', null, '01', '091', null, null, '007', 'VF7XBEY000', 7
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '2003-08-08', null, '01', null, '5365292375', 20030808, '2', null, 'AB', null, 5, 955, null, 1420, 3770, 1640, 1420, '01', 1140, 43, 4, null, null,
'Renault', '2D CLIO HATCHBACK 1.2-CB0FCF/247', null, null, 'CLIO', '05', null, '01', '609', '143', 119628, '283', 'VF1CB0FCF2', 8
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '2003-10-02', null, '01', 1, 4, 20031002, 6, null, 'AA', null, 5, 1462, 1920, 1920, 4670, 1760, 1450, '01', 1990, 114, 4, null, null,
'Honda', '4D ACCORD SEDAN 2.0-CL75/268', null, null, 'ACCORD', '05', 'e6*2001/116*0091*00', '01', '837', 190, 257197, '332', 'JHMCL75403', 9
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 5900, 9250, 9250, 4942, 2550, 2860, '02', 6596, 133, 6, true, false,
'Massey Ferguson', null, 4, 24, 'MF 7716', '09', null, '02', '853', null, null, '203', null, 4997957
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 5900, 9250, 9250, 4942, 2550, 2860, '02', 6596, 133, 6, true, false,
'Massey Ferguson', null, 4, 24, 'MF 7716', '09', null, '02', '853', null, null, '203', null, 4997958
);

 INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 7400, 14000, 14000, 5240, 2550, 3240, '02', 6596, 158, 6, true, false,
'Massey Ferguson', null, 6, null, 'MF 7720', '09', null, '02', '853', null, null, '203', null, 4997959
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 7000, 14000, 14000, 5040, 2550, 3240, '02', 7365, 191, 6, true, false,
'Massey Ferguson', null, 6, null, 'MF 7726', '09', null, '02', '853', null, null, '203', null, 4997960
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 7000, 14000, 14000, 5040, 2550, 3240, '02', 7365, 191, 6, true, false,
'Massey Ferguson', null, 6, null, 'MF 7726', '09', null, '02', '853', null, null, '203', null, 4997961
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'T3', '2017-12-30', 933, '01', 'T', '4W', 20171230, null, null, null, 4, 2, 445, 545, 545, 2240, 1160, 1480, '01', 493, 6.5, 1, null, false,
'Linhai', null, 5, null, 'LH500ATV-D T3', '02', 'e13*167/2013*00041*00', '01', '505', null, null, '046', null, 4997962
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'LTR', '2017-12-29', 81, '05', null, null, 20171229, null, 2, null, 1, 2, 10300, 15000, 15000, 5160, 2550, 3280, '02', 8419, 206, 6, true, false,
'Massey Ferguson', null, 6, null, 'MF 8727', '09', null, '02', '853', null, null, '203', null, 4997963
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'T3', '2017-12-30', 933, '01', 'T', '4W', 20171230, null, null, null, 4, 2, 445, 545, 545, 2240, 1160, 1480, '01', 493, 6.5, 1, null, false,
'Linhai', null, 5, null, 'LH500ATV-D T3', '02', 'e13*167/2013*00041*00', '01', '086', null, null, '058', null, 4997964
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '2017-12-29', null, '01', null, null, 19580000, '9', 2, 'AA', 1, 5, 780, 1180, 1180, 4060, 1560, null, '01', 1900, 44.4, 4, false, false,
'Volkswagen', '1200 Sedan (AA) 2ov 1900cm3', 1, 4, 1200, '02', null, '01', '743', null, 0, '601', null, 4997965
);

INSERT INTO tekniset_tiedot
(ajoneuvoluokka, ensirekisterointipvm, ajoneuvoryhma, ajoneuvonkaytto, variantti, versio, kayttoonottopvm, vari, ovienLukumaara, korityyppi,
ohjaamotyyppi, istumapaikkojenLkm, omamassa, teknSuurSallKokmassa, tieliikSuurSallKokmassa, ajonKokPituus, ajonLeveys, ajonKorkeus, kayttovoima, iskutilavuus,
suurinNettoteho, sylintereidenLkm, ahdin, sahkohybridi, merkkiSelvakielinen, mallimerkinta, vaihteisto, vaihteidenLkm, kaupallinenNimi, voimanvalJaTehostamistapa,
tyyppihyvaksyntanro, yksittaisKayttovoima, kunta, Co2, matkamittarilukema, alue, valmistenumero2, jarnro)
  VALUES (
'M1', '2017-12-29', null, '01', 'NJ51', '02', 20070125, '8', 4, 'AC', null,  5, 1760, 2285, 2285, 4840, 1850, 1490, '02', 2490, 130, 6, true, false,
'BMW', '525d Farmari (AC) 4ov 2490cm3 A', 2, null, '525d', '05', 'e1*01/116*0230*08', '02', '049', 213, 253444, '027', 'WBANJ51050', 4997966
);

COMMIT;