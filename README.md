# spring-boot-boilerplate

- mvn archetype:generate -DartifactId=sprints -DgroupId=in.stackroute.planage -Dversion=1.0.0-SNAPSHOT

- select pom-root

- check the pom.xml and add maven compiler properties in root pom.xml:
```
<properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  ```
- add spring-boot-starter-parent to parent pom.xml

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.8.RELEASE</version>
  </parent>
```


-  mvn archetype:generate -DartifactId=api -DgroupId=in.stackroute.planage.sprints -Dversion=1.0.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -Dinteractive=false

- check in parent pom.xml for modules

- check the api pom.xml add the spring-boot-maven-plugin
  *Spring Boot Maven Plugin provides Spring Boot support in Maven, letting you package executable jar or war archives and run an application “in-place”.* 
```
<build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <executions>
          <execution>
            <goals>
              <goal>repackage</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>

  </build>
```

- add spring-boot-starter-web dependency for enabling it a web app:

```
<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
```

- annotate the main class of `api` to `@SpringBootApplication` and `SpringApplication.run(App.class, args)` in `psvm`
