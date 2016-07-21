package com.epam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext app = SpringApplication.run(SpringTestApplication.class, args);
	}
}
