# Ajoneuvotiedot

PWA for Finnish TraFi's "vehicle technical information" open data.

## Technology

### Application

* Kotlin
* Spring Boot
* Spring Data JPA
* Maven
* PostgreSQL

## Setting up environment

Project has Docker and Ansible playbooks for setting up things and importing data.

```
$ docker-compose up
```

### Requirements

Required software on macOS.

Install Homebrew (http://brew.sh/)
```
$ ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Install Ansible
```
$ brew install ansible
```

Install Gradle
```
$ brew install maven
```

You have two choice to run the Project
* Docker

## Using Docker

TBD

### Using PostgreSQL on Docker

psql access:
```
$ docker run --name vehicledata-db -e POSTGRES_PASSWORD=vehicledata -e POSTGRES_USER=vehicledata -d postgres

$ docker exec -it vehicledata-db psql
```

#### Importing data

You can also use the following to import the data manually.
Here we are using PostgreSQL where we have done vehicledata database and user.

Tables and views are described in following files:

* sql/tekniset_tiedot.sql
* sql/koodisto.sql
* sql/tekniset_tiedot_view.sql

Create database tables
```
vehicledata=> \i sql/koodisto.sql
vehicledata=> \i sql/tekniset_tiedot.sql
vehicledata=> \i sql/tekniset_tiedot_view.sql
```

##### Vehicles data

Before you can import the technical data version 5.1

1. Change the field separator because there are decimals in the data. The field separator , is changed to |.
```
$ awk 'BEGIN{FS=OFS="\""} {for (i=1;i<=NF;i+=2) gsub(/,/,"|",$i)}1' data.csv > data_clean.csv
```

2. Convert to UTF-8
```
$ iconv -f iso8859-15 -t utf8 data_clean.csv > data_utf8.csv
```

3. Connect to PostgreSQL and import data
```
vehicledata=# \COPY tekniset_tiedot FROM 'data_utf8.csv' CSV HEADER DELIMITER '|';
```

##### Codesystem

TBD: The codesystem data can be imported to the database as is:

1. Save the xlsx-file to CSV

2. Connect to PostgreSQL and import data
```
vehicledata=# \COPY koodisto FROM 'koodisto.csv' CSV HEADER DELIMITER ',';
```

## Running the application

```
$ docker-compose up
```

## TraFi open data

TraFi's open data of vehicle information can be found from http://www.trafi.fi/tietopalvelut/avoin_data

# License

Application: MIT

TraFi's data: CC 4.0 (http://www.trafi.fi/tietopalvelut/avoin_data/avoimen_datan_lisenssi)
