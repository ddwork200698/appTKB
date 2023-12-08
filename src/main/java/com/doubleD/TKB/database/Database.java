package com.doubleD.TKB.database;

import com.doubleD.TKB.models.Baihoc;
import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Monhoc;
import com.doubleD.TKB.repositories.MonhocRepository;
import com.doubleD.TKB.service.Impl.KhoaServiceImpl;
import com.doubleD.TKB.service.impl.BaihocServiceImpl;
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
    CommandLineRunner initDatabase (KhoaServiceImpl khoaServiceImpl, MonhocRepository monhocRepository, BaihocServiceImpl baihocService) {
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


                // Tao danh sach bai hoc mon A
                Baihoc a1 = new Baihoc("A1", "Đối tượng, nhiệm vụ, phương pháp nghiên cứu môn học",1,"", monA,"LT");
                Baihoc a2 = new Baihoc("A2", "Quan điểm cơ bản của chủ nghĩa Mac-Lenin, tư tưởng Hồ Chính Minh về chiến tranh, quân đội và bảo vệ Tổ quốc",2,"", monA,"LT");
                Baihoc a3 = new Baihoc("A3", "Xây dựng nền quốc phòng toàn dân, an ninh nhân dân bảo vệ Tổ quốc Việt Nam xã hội chủ nghĩa",3,"", monA,"LT");
                Baihoc a4 = new Baihoc("A4", "Chiến tranh nhân dân bảo vệ tổ quốc Việt Nam xã hội chủ nghĩa",4,"", monA,"LT");
                Baihoc a5 = new Baihoc("A5", "Xây dựng lực lượng vũ trang nhân dân",5, "",monA,"LT");
                Baihoc a6 = new Baihoc("A6", "Kết hợp phát triển kinh tế, xã hội với tăng cường quốc phòng, an ninh và đối ngoại",6,"", monA,"LT");
                Baihoc a7 = new Baihoc("A7", "Những vấn đề cơ bản về lịch sử nghệ thuật quân đội Việt Nam",7,"", monA,"LT");
                Baihoc a8 = new Baihoc("A8", "Xây dựng và bảo vệ chủ quyền biển đảo, biên giới quốc gia trong tình hình mới",8, "",monA,"LT");
                Baihoc a9 = new Baihoc("A9", "Xây dựng lực lượng dân quân tự vệ, lực lượng dự bị động viên và động viên quốc phòng",9,"", monA,"LT");
                Baihoc a10 = new Baihoc("A10", "Xây dựng phong trào toàn dân bảo vệ an ninh Tổ quốc",10,"", monA,"LT");
                Baihoc a11 = new Baihoc("A11", "Những vấn đề cơ bản về bảo vệ an ninh quốc gia và bảo đảm trật tự an toàn xã hộ",11,"", monA,"LT");
                Baihoc ktgk1 = new Baihoc("KTGK1", "Thi giữa kỳ môn A thi trong buổi học",12,"",monA,"KTGK");
                Baihoc thi1 = new Baihoc("Thi1", "Thi hết môn A",13,"", monA,"THI");

                Set<Baihoc> dsBaihocMonA = new HashSet();
                dsBaihocMonA.add(a1);
                dsBaihocMonA.add(a2);
                dsBaihocMonA.add(a3);
                dsBaihocMonA.add(a4);
                dsBaihocMonA.add(a5);
                dsBaihocMonA.add(a6);
                dsBaihocMonA.add(a7);
                dsBaihocMonA.add(a8);
                dsBaihocMonA.add(a9);
                dsBaihocMonA.add(a10);
                dsBaihocMonA.add(a11);
                dsBaihocMonA.add(ktgk1);
                dsBaihocMonA.add(thi1);

                monA.setBaihocs(dsBaihocMonA);

                // Tao danh sach bai hoc mon B
                Baihoc b1 = new Baihoc("B1","Phòng, chống chiến lược \"diễn biến hòa bình\", bạo loạn lật đổ của các thế lực thù địch đối với các mạng Việt Nam",1,"", monB,"LT");
                Baihoc b2 = new Baihoc("B2","Một số nội dung cơ bản về dân tộc, tôn giáo, đấu tranh phòng chống các thế lực thù địch lợi dụng vấn đề về dân tộc, tôn giáo chống phá cách mạng Việt Nam",2,"", monB,"LT");
                Baihoc b3 = new Baihoc("B3","Phòng, chống vi phạm pháp luật về bảo vệ môi trường",3,"", monB,"LT");
                Baihoc b4 = new Baihoc("B4","Phòng, chống vi phạm pháp luật về bảo đảm trật tự an toàn giao thông",4,"", monB,"LT");
                Baihoc b5 = new Baihoc("B5","Phòng, chống một số loại tội phạm xâm hại danh dự, nhân phẩm của người khác",5,"", monB,"LT");
                Baihoc b6 = new Baihoc("B6","An toàn thông tin và phòng chống vi phạm pháp luật trên không gian mạng",6,"", monB,"LT");
                Baihoc b7 = new Baihoc("B7","An ninh phi truyền thống và các mối đe doạn an ninh phi truyền thông ở Việt Nam",7,"", monB,"LT");
                Baihoc ktgk2 = new Baihoc("KTGK2","Thi giữa môn B thi trong buổi học",8,"", monB,"KTGK");
                Baihoc thi2 = new Baihoc("Thi2","Thi hết môn B",9,"", monB,"THI");

                Set<Baihoc> dsBaihocMonB = new HashSet<>();
                dsBaihocMonB.add(b1);
                dsBaihocMonB.add(b2);
                dsBaihocMonB.add(b3);
                dsBaihocMonB.add(b4);
                dsBaihocMonB.add(b5);
                dsBaihocMonB.add(b6);
                dsBaihocMonB.add(b7);
                dsBaihocMonB.add(ktgk2);
                dsBaihocMonB.add(thi2);

                monB.setBaihocs(dsBaihocMonB);

                Baihoc c1 = new Baihoc("C1","Chế độ làm việc, sinh hoạt, học tập và quy định sắp xếp bố trí trật tự nội vụ vệ sinh doanh trại", 1, "C1, C2 cùng 1 buổi", monC,"LT");
                Baihoc c2 = new Baihoc("C2","Hiểu biết chung về quân, binh chủng trong QĐNDVN", 2, "C1, C2 cùng 1 buổi", monC,"LT");
                Baihoc c3 = new Baihoc("C3","Đội ngũ từng người có súng", 3, "", monC,"TH");
                Baihoc c4 = new Baihoc("C4","Đội ngũ đơn vị", 4, "", monC,"TH");
                Baihoc c5 = new Baihoc("C5","Hiểu biết chung về bản đồ địa hình quân sự", 5, "", monC,"LT");
                Baihoc c6 = new Baihoc("C6","Phòng tránh địch tiến công bằng hỏa lực vũ khí công nghệ cao", 6, "", monC,"LT");
                Baihoc c7 = new Baihoc("C7","Ba môn quân sự phối hợp", 7, "Bài C7 phải học sau bài NLĐ và TB", monC,"TH");
                Baihoc Thi3 = new Baihoc("Thi3","Thi hết môn 3", 1, "", monC,"THI");

                Set<Baihoc> dsBaihocMonC = new HashSet<>();
                dsBaihocMonC.add(c1);
                dsBaihocMonC.add(c2);
                dsBaihocMonC.add(c3);
                dsBaihocMonC.add(c4);
                dsBaihocMonC.add(c5);
                dsBaihocMonC.add(c6);
                dsBaihocMonC.add(c7);
                dsBaihocMonC.add(Thi3);
                monC.setBaihocs(dsBaihocMonC);

                Baihoc d1 = new Baihoc("D1","Kỹ thuật bắn súng tiểu niên AK",1, "D1, D2 học cùng 1 buổi", monD,"LT");
                Baihoc d2 = new Baihoc("D2","Tính năng, cấu tạo và cách sử dụng một số loại lựu đạn",2, "D1, D2 học cùng 1 buổi", monD,"LT");
                Baihoc d31 = new Baihoc("D3.1","Từng người trong chiến đấu tiến công",3, "Thao trường không thể học cùng lúc quá 5 bài D3.1", monD,"TH");
                Baihoc d32 = new Baihoc("D3.2","Từng người trong chiến đấu tiến công",4, "", monD,"TH");
                Baihoc d33 = new Baihoc("D3.3","Từng người trong chiến đấu tiến công",5, "", monD,"TH");
                Baihoc d41 = new Baihoc("D4.1","Từng người trong chiến đấu phòng ngự",6, "", monD,"TH");
                Baihoc d42 = new Baihoc("D4.2","Từng người trong chiến đấu phòng ngự",7, "", monD,"TH");
                Baihoc d5 = new Baihoc("D5","Từng người làm nhiệm vụ canh gác",8, "", monD,"TH");
                Baihoc tb1 = new Baihoc("TB1","Thực hành tập bắn súng tiểu niên AK",9, "", monD,"TH");
                Baihoc tb2 = new Baihoc("TB2","Thực hành tập bắn súng tiểu niên AK",10, "", monD,"TH");
                Baihoc tb3 = new Baihoc("TB3","Thực hành tập bắn súng tiểu niên AK",11, "", monD,"TH");
                Baihoc tb4 = new Baihoc("TB4","Thực hành tập bắn súng tiểu niên AK",12, "", monD,"TH");
                Baihoc nld = new Baihoc("NLĐ","Thực hành ném Lựu đạn bài 1b",2, "", monD,"TH");
                Baihoc ktbs = new Baihoc("KTBS","Kiểm tra môn D sau khi học hết môn D",2, "", monD,"TH");

                logger.info("Luu khoa CT: "+ khoaServiceImpl.saveKhoa(chinhTri));
                logger.info("Luu khoa Mon A, Mon B: "+ monhocRepository.save(monA));
                logger.info("Luu khoa Mon A, Mon B: "+ monhocRepository.save(monB));
                logger.info("Luu khoa QS: "+ khoaServiceImpl.saveKhoa(quanSu));
                logger.info("Luu khoa Mon C : "+ monhocRepository.save(monC));
                logger.info("Luu khoa Mon D: "+ monhocRepository.save(monD));

                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a1));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a2));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a3));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a4));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a5));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a6));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a7));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a8));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a9));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a10));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(a11));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(ktgk1));
                logger.info("Luu danh sach bai hoc Mon A: "+ baihocService.save(thi1));

                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b1));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b2));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b3));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b4));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b5));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b6));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(b7));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(ktgk2));
                logger.info("Luu danh sach bai hoc Mon B: "+ baihocService.save(thi2));

                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c1));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c2));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c3));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c4));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c5));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c6));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(c7));
                logger.info("Luu danh sach bai hoc Mon C: "+ baihocService.save(Thi3));
            }
        };
    }
}
