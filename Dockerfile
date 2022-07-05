FROM openjdk:11
ADD target/EmployeeApp-0.0.1-SNAPSHOT.jar EmployeeApp
ENTRYPOINT ["java","-jar","/EmployeeApp"]