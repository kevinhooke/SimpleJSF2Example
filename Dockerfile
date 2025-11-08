FROM tomcat:9.0.111-jre8-temurin-jammy

COPY ./properties/context.xml /usr/local/tomcat/conf
COPY ./target/simplejsf.war /usr/local/tomcat/webapps
ENV CATALINA_OPTS="-Dorg.apache.catalina.session.StandardSession.ACTIVITY_CHECK=true"
EXPOSE 8080

CMD ["catalina.sh", "run"]