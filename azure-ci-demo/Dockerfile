#
# Officially supported Zulu JDK 
#
# For support or general questions go to:
#
# https://support.microsoft.com/en-us/help/4026305/sql-contact-microsoft-azure-support
#
FROM mcr.microsoft.com/java/jdk:17-zulu-ubuntu

# Set the working directory to '/opt/ecf-azci-demo' directory
WORKDIR /opt/ecf-azci-demo

# Expose the ports we're interested in
EXPOSE 8080

# Make Java 8 obey container resource limits, improve performance
ENV JAVA_OPTS='-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:+UseG1GC -Djava.awt.headless=true'

# Copy the JAR file
COPY /target/aritra-azci-0.0.1.jar /opt/ecf-azci-demo/aritra-azci-0.0.1.jar

# Set the default command to run on boot
CMD java $JAVA_AGENT -jar aritra-azci-0.0.1.jar