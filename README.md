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

### Build requirements

Required software on macOS to build the app.

Install Homebrew (http://brew.sh/)
```
$ ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Install Maven
```
$ brew install maven
```

Install Docker
```
$ TBD
```

## Running the application

You have one choice to run the Project

* Build Docker image and run the container with DB

```
$ docker-compose up
```

App should answer at:
```
http://localhost:8080/vehicledata-ws/public/version/
http://localhost:8080/vehicledata-ws/public/api-docs/
```

## Run tests

```
$ mvn docker:stop -P postgres
```

## Using Docker

TBD

# Other

https://yle.fi/uutiset/3-10015086
https://github.com/postgraphql/postgraphql
https://github.com/graphcool/prisma

## TraFi open data

TraFi's open data of vehicle information can be found from http://www.trafi.fi/tietopalvelut/avoin_data

# License

Application: MIT

TraFi's data: CC 4.0 (http://www.trafi.fi/tietopalvelut/avoin_data/avoimen_datan_lisenssi)
