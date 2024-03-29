package io.pivotal.pal.tracker.allocations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestOperations;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import java.util.TimeZone;

@SpringBootApplication
@ComponentScan({"io.pivotal.pal.tracker.allocations", "io.pivotal.pal.tracker.restsupport"})

public class App {


}
