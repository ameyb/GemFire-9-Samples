# GemFire-9-Samples
GemFire Sample Code

###### Build and Install Domain 

We need to first build the Domain project and install it to local maven repository using following commands,
```
mvn clean package
mvn install
```

###### Build GemFire-9-Samples root project

```
mvn clean package
```

###### Run the project
Go to the specific project and execute the below command
```
mvn exec:java
```