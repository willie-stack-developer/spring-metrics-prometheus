package com.cortez.willie.springmetricsprometheus;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMetricsPrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMetricsPrometheusApplication.class, args);
    }

    @Bean
    public TimedAspect timedAspect(MeterRegistry registry){
        return new TimedAspect(registry);
    }
}
