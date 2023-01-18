package com.example.jasperreport;


import com.example.jasperreport.model.CustomerDetailsModel;
import com.example.jasperreport.model.KitInfoModel;
import com.example.jasperreport.model.KitUsageModel;
import com.example.jasperreport.model.SterilizerInfoModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws JRException, ParseException {

        Map<String, Object> param = new HashMap<>();

        param.put("kits",getKitInfo());
        param.put("sterilizers",getSterilizer());
        param.put("kitUsage",getKitUsage());
       // param.put("datePattern","dd/MM/yyyy HH:mm");
        param.put("watermarkImg",Main.class.getResourceAsStream("watermark_img.jpeg")); // type- java.io.InputStream

        String consolidatedReportPath = "consolidated_test_report.jrxml";
        String testReportPath = "test_report.jrxml";
        JasperReport jasperReport = JasperCompileManager.compileReport( Main.class.getResourceAsStream(testReportPath));
        JasperPrint print = JasperFillManager.fillReport(jasperReport, param, getCustomer());

        JasperExportManager.exportReportToPdfFile(print,"C:\\Users\\ASUS\\Desktop\\test.pdf");

       /* JasperViewer jv = new JasperViewer(print);
        jv.show();*/
    }

    private static JRBeanCollectionDataSource getSterilizer() throws ParseException {
        List<SterilizerInfoModel> sertilizerList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            sertilizerList.add(new SterilizerInfoModel("brand"+i,"strem-"+i,"123456789123"+i));
        }
        return new JRBeanCollectionDataSource(sertilizerList);
    }

    private static JRBeanCollectionDataSource getKitInfo() throws ParseException {
        List<KitInfoModel> kitList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String sDate1="31/12/1998";
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            kitList.add(new KitInfoModel(12345678+i,date1));
        }

        return new JRBeanCollectionDataSource(kitList);

    }

    private static JRBeanCollectionDataSource  getKitUsage() throws ParseException {

        List<KitUsageModel> kitUsageList = new ArrayList<>();

        for (int i = 0; i <100; i++) {
            String sDate1="31/12/1998";
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            kitUsageList.add(new KitUsageModel(12345678+i,date1,"PASS+"));
        }

        return new JRBeanCollectionDataSource(kitUsageList);

    }
    private static JRBeanCollectionDataSource getCustomer (){

     return    new JRBeanCollectionDataSource(Arrays.asList(
             new CustomerDetailsModel(12345,"9709759387-","12345667890"," RIO MAR DENTAL\n" +
             "1340 W. AVE. J201 N. EUCLID ST.\n" +
             "FULLERTON CA 92832-")));
    }
}
