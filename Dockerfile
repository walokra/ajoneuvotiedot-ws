#
# Build stage
#
FROM maven:3.5-jdk-8 AS build

COPY .git /usr/src/app/.git
COPY libs /usr/src/app/libs
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

#
# Run stage
#
FROM openjdk:8-jre-alpine

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

# Variables
ENV home_dir /data
ENV log_dir ${home_dir}/logs
ENV deploy_dir ${home_dir}/deploy

# Install common tools
RUN set -x \
    && apk update && apk upgrade \
    && apk add --no-cache bash

# Add scripts
ADD scripts/bootstrap.sh /

# Create directories
RUN mkdir -p ${log_dir} \
    && mkdir -p ${deploy_dir}

WORKDIR ${deploy_dir}

COPY --from=build /usr/src/app/target/vehicledata-ws.jar ${deploy_dir}/vehicledata-ws.jar

EXPOSE 8080

# Set default command on run
ENTRYPOINT ["/bootstrap.sh", "vehicledata-ws.jar"]
