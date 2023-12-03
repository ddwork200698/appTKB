package com.doubleD.TKB.database;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.service.Impl.KhoaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase (KhoaServiceImpl khoaServiceImpl) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Khoa khoa1 = new Khoa();
                logger.info("Luu khoa1: "+ khoaServiceImpl.saveKhoa(khoa1));
            }
        };
    }
}
