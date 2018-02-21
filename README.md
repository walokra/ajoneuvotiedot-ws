# ajoneuvotiedot-ws

REST microservice for TraFi's "vehicle technical information" open data. 

The vehicle data is processed to PostgeSQL database in separate project: [ajoneuvotiedot-db](https://github.com/walokra/ajoneuvotiedot-db).

## Technology

### Application

* Kotlin
* Spring Boot
* Spring Data JPA
* Maven
* PostgreSQL

## Setting up environment

Project uses Docker for setting up and getting things rolling.

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
https://docs.docker.com/docker-for-mac/install/#download-docker-for-mac
```

## Running the application

You have one choice to run the project

* Build Docker images for the web service and database
* Run the container with database

```
$ docker-compose up
```

App should answer at:
```
http://localhost:8080/vehicledata-ws/public/version/
http://localhost:8080/vehicledata-ws/public/api-docs/
http://localhost:8080/vehicledata-ws/v1/vehicles
```

## Run tests

```
$ mvn docker:start -P postgres
```

```
$ mvn clean verify
```

```
$ mvn docker:stop -P postgres
```

## TraFi open data

TraFi's open data of vehicle information can be found from [Open data at Trafi](https://www.trafi.fi/tietopalvelut/avoin_data). 
Link points to Finnish version of the page which has (at the time of writing) newer data.

# License

Application: MIT

TraFi's open data: CC 4.0 (https://www.trafi.fi/en/information_services/open_data/open_data_licence)
