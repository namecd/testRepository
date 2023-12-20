package co.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableTransactionManagement //事务支持
@MapperScan("co.demo.mapper")
public class AtmApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class);
    }
}
