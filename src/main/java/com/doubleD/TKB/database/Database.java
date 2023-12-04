package com.doubleD.TKB.database;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Monhoc;
import com.doubleD.TKB.repositories.MonhocRepository;
import com.doubleD.TKB.service.Impl.KhoaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class Database {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase (KhoaServiceImpl khoaServiceImpl, MonhocRepository monhocRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Khoa chinhTri = new Khoa();
                Monhoc monA = new Monhoc();
                monA.setMaMonhoc("CME 1001");
                monA.setTenMonhoc("Đường lối quốc phòng và an ninh của Đảng Cộng sản Việt Nam");
                Monhoc monB = new Monhoc();
                monB.setMaMonhoc("CME 1002");
                monB.setTenMonhoc("Công tác Quốc phòng và An ninh");

                Set<Monhoc> dsMonhoc =  new HashSet();
                dsMonhoc.add(monA);
                dsMonhoc.add(monB);

                chinhTri.setMonhocs(dsMonhoc);
                monA.setKhoa(chinhTri);
                monB.setKhoa(chinhTri);

                logger.info("Luu khoa CT: "+ khoaServiceImpl.saveKhoa(chinhTri));
                logger.info("Luu khoa Mon A, Mon B: "+ monhocRepository.save(monA));
                logger.info("Luu khoa Mon A, Mon B: "+ monhocRepository.save(monB));

                Khoa quanSu = new Khoa("QS", "Quân sự");
                Monhoc monC = new Monhoc();
                monC.setMaMonhoc("CME 1003");
                monC.setTenMonhoc("Quân sự chung");
                Monhoc monD = new Monhoc();
                monD.setMaMonhoc("CME 1004");
                monD.setTenMonhoc("Kỹ thuật chiến đầu bộ binh và chiến thuật");

                Set<Monhoc> dsMonhoc2 = new HashSet();
                dsMonhoc2.add(monC);
                dsMonhoc2.add(monD);

                quanSu.setMonhocs(dsMonhoc2);
                monC.setKhoa(quanSu);
                monD.setKhoa(quanSu);

                logger.info("Luu khoa QS: "+ khoaServiceImpl.saveKhoa(quanSu));
                logger.info("Luu khoa Mon C : "+ monhocRepository.save(monC));
                logger.info("Luu khoa Mon D: "+ monhocRepository.save(monD));

            }
        };
    }
}
