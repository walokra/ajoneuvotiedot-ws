FROM java:8-jre-alpine

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

# Create directories
RUN mkdir -p ${log_dir} \
    && mkdir -p ${deploy_dir}

WORKDIR ${deploy_dir}

# Deploy project
ADD target/vehicledata-ws.jar ${deploy_dir}/vehicledata-ws.jar

RUN bash -c 'touch ${deploy_dir}/vehicledata-ws.jar'

# Set default command on run
CMD ["java","-jar","vehicledata-ws.jar"]
