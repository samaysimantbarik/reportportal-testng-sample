
	
Install docker

Install curl for windows	 

Execute the below commands:	

 1)curl https://raw.githubusercontent.com/reportportal/reportportal/master/docker-compose.yml -o docker-compose.yml	
 
  2)docker-compose -p reportportal up -d --force-recreate	
	
	
Open localhost or Ip:8080 - You should see report portal site	

Under src/test/resources - Create a file named reportportal.properties and have the below info as per your installation:	

rp.endpoint = http://localhost:8080	

rp.uuid = 03b51518-f3aa-4219-98e2-2f0e3d62c426	

rp.launch = superadmin_TEST_EXAMPLE	

rp.project = superadmin_personal	

Dependencies:

<dependencies>

		<dependency>
			<groupId>com.epam.reportportal</groupId>
			<artifactId>agent-java-testng</artifactId>
			<version>LATEST</version>
		</dependency>
		
		 <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.10.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.10.0</version>
        </dependency>
        
		<dependency>
			<groupId>com.epam.reportportal</groupId>
			<artifactId>logger-java-log4j</artifactId>
			<version>LATEST</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.14.3</version>
			<scope>test</scope>
		</dependency>


	</dependencies>
	
	PLUGGINS:
	
	<plugins>

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.15</version>
				<configuration>
					<suitexmlfiles>
						<suitexmlfile>testng.xml</suitexmlfile>
					</suitexmlfiles>
					<properties>
						<property>
							<name>usedefaultlisteners</name>
							<value>false</value> <!-- disabling default listeners is optional -->
						</property>
						<property>
							<name>listener</name>
							<value>com.epam.reportportal.testng.ReportPortalTestNGListener</value>
						</property>
					</properties>
				</configuration>
			</plugin>

		</plugins>
		
		LOGGING:
		
		Create a file named log42j.xml under src/main/resources and paste the below contents:
		
		<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="ConsoleAppender" target="SYSTEM_OUT">
            <PatternLayout
                    pattern="%d [%t] %-5level %logger{36} - %msg%n%throwable"/>
        </Console>
        <ReportPortalLog4j2Appender name="ReportPortalAppender">
            <PatternLayout
                    pattern="%d [%t] %-5level %logger{36} - %msg%n%throwable"/>
        </ReportPortalLog4j2Appender>
    </Appenders>
    <Loggers>
        <Root level="DEBUG">
            <AppenderRef ref="ConsoleAppender"/>
            <AppenderRef ref="ReportPortalAppender"/>
        </Root>
    </Loggers>
</Configuration>


