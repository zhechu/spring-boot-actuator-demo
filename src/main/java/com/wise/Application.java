package com.wise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控端点
 * http://localhost:8000/actuator/{endpoint}
 * 如：
 * 健康指标：http://localhost:8000/actuator/health
 * 可用内存：http://localhost:8000/actuator/metrics/jvm.memory.max
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
