FROM java:8-jre
MAINTAINER Lam Ngoc Khuong <me@ngockhuong.com>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761
