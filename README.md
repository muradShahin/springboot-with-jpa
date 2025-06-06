In this demo i'm explaining how to connect spring boot application with postgres database using JPA , and also  i have explained how to run postgres locally using Docker . 

## docker command for pulling postgres and run it :

```
docker run --name my-postgres \
 -e POSTGRES_PASSWORD=mysecretpassword \
  -e POSTGRES_USER=myuser \
  -e POSTGRES_DB=mydb \
  -p 5432:5432 \
  -d postgres
```

## properties

```

spring.datasource.url=jdbc:postgresql://localhost:5432/demodb
spring.datasource.username=demo1
spring.datasource.password=1971
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
```




