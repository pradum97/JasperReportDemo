package com.example.jasperreport;


import com.example.jasperreport.model.CustomerDetailsModel;
import com.example.jasperreport.model.KitInfoModel;
import com.example.jasperreport.model.KitUsageModel;
import com.example.jasperreport.model.SterilizerInfoModel;
import javafx.scene.image.Image;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws JRException {
        Map<String, Object> param = new HashMap<>();
        List<KitInfoModel> kitList = new ArrayList<>();
        List<SterilizerInfoModel> sertilizerList = new ArrayList<>();
        List<KitUsageModel> kitUsageList = new ArrayList<>();
        CustomerDetailsModel cdm= new CustomerDetailsModel("12345","9709759387-","12345667890-");

    /*    for (int i = 0; i < 4; i++) {
            sertilizerList.add(new SterilizerInfoModel("brand"+i,"strem-"+i,"123456789123"+i));
        }
        for (int i = 0; i < 4; i++) {
            kitList.add(new KitInfoModel("12345678"+i,"10/10/200"+i));
        }
        for (int i = 0; i <2000; i++) {
            kitUsageList.add(new KitUsageModel("12345678"+i,"10/10/200","PASS+"));
        }*/

        JRBeanCollectionDataSource kitListJrBean = new JRBeanCollectionDataSource(kitList);
        JRBeanCollectionDataSource sterilizerListJrBean = new JRBeanCollectionDataSource(sertilizerList);
        JRBeanCollectionDataSource kitUsageListJrBean = new JRBeanCollectionDataSource(kitUsageList);
        JRBeanCollectionDataSource customerJrBean = new JRBeanCollectionDataSource(Arrays.asList(cdm));

        String doctorFullAddress = """
               RIO MAR DENTAL
               1340 W. AVE. J201 N. EUCLID ST.
               FULLERTON CA 92832-
                """;

        param.put("KitInfoList",kitListJrBean);
        param.put("sterilizerInfoList",sterilizerListJrBean);
        param.put("kitUsage",kitUsageListJrBean);
        param.put("doctorFullAddress",doctorFullAddress);
        param.put("watermarkImg",Main.class.getResourceAsStream("watermark_img.jpeg")); // type- java.io.InputStream

        JasperReport jasperReport = JasperCompileManager.compileReport( Main.class.getResourceAsStream("sns_report.jrxml"));
        JasperPrint print = JasperFillManager.fillReport(jasperReport, param, customerJrBean);
        JasperViewer jv = new JasperViewer(print);
        jv.show();
    }
}
