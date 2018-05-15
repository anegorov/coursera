package coursera;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class WorkWithCSV {
    public void getFromCSV(){
        File f = new File("C:\\Users\\anegorov\\Downloads\\exports\\exportdata.csv");
        FileResource fr = new FileResource(f);
        CSVParser parser = fr.getCSVParser();
        for(CSVRecord record : parser){
            System.out.print(record.get("Country")+": ");
            System.out.print(record.get("Exports")+": ");
            System.out.println(record.get("Value (dollars)"));
        }
    }

    public void listExportersTwoProducts(CSVParser parser, String exportItem1 , String exportItem2){

        for(CSVRecord record : parser){
            String temp = record.get("Exports");
            if(temp.contains(exportItem1) && temp.contains(exportItem2)) {
                System.out.println(record.get("Country"));
            }
        }
    }

    public void numberOfExporters(CSVParser parser, String exportItem ) {
        int count=0;
        for (CSVRecord record : parser) {
            String temp = record.get("Exports");
            if (temp.contains(exportItem)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void bigExporters(CSVParser parser, String amount){
        for (CSVRecord record : parser) {
            String temp = record.get("Value (dollars)");
            if (temp.length() > amount.length()) {
                System.out.println(record.get("Country") + ": " + temp);
            }
        }
    }
}
