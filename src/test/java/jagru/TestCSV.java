package jagru;

import coursera.FileResource;
import coursera.TempCSV;
import coursera.WorkWithCSV;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Ignore;

import java.io.File;


public class TestCSV {
    @Ignore
    public void testAllCSV(){

        File f = new File("C:\\Users\\anegorov\\Downloads\\exports\\exportdata.csv");
        FileResource fr = new FileResource(f);
        CSVParser parser = fr.getCSVParser();

        WorkWithCSV wwc = new WorkWithCSV();
        //wwc.listExportersTwoProducts(parser,"cotton","flowers");

        //CSVParser parser1 = fr.getCSVParser();
        //wwc.numberOfExporters(parser1,"cocoa");

        CSVParser parser2 = fr.getCSVParser();
        wwc.bigExporters(parser2, "$999,999,999,999");

        //wwc.getFromCSV();
    }

    @Ignore
    public void testHottestInDay(){
        File f = new File("C:\\Users\\anegorov\\Downloads\\nc_weather\\2015\\weather-2015-01-02.csv");
        FileResource fr = new FileResource(f);
        TempCSV tc = new TempCSV();
        CSVRecord lagest = tc.hottestHourInFile(fr.getCSVParser());
        System.out.println("Temp: " + lagest.get("TemperatureF"));
    }

    @Ignore
    public void testHottestInManyDays(){
        TempCSV tc = new TempCSV();
        CSVRecord lagest = tc.hottestInManyDays();
        System.out.println("Temp: " + lagest.get("TemperatureF"));
    }

    @Ignore
    public void testColdestHourInFile(){
        File f = new File("C:\\Users\\anegorov\\Downloads\\nc_weather\\2014\\weather-2014-05-01.csv");
        FileResource fr = new FileResource(f);
        TempCSV tc = new TempCSV();
        CSVRecord lagest = tc.coldestHourInFile(fr.getCSVParser());
        System.out.println("Temp: " + lagest.get("TemperatureF"));
    }

    @Ignore
    public void testColdestInManyDays(){
        TempCSV tc = new TempCSV();
        CSVRecord lagest = tc.coldestInManyDays();
        System.out.println("Temp: " + lagest.get("TemperatureF") + "Time: " + lagest.get("DateUTC"));
    }

    @Ignore
    public void testLowestHumidityInManyFiles(){
        TempCSV tc = new TempCSV();
        CSVRecord lagest = tc.lowestHumidityInManyFiles();
        System.out.println("Humidity: " + lagest.get("Humidity") + "Time: " + lagest.get("DateUTC"));
    }



    @Ignore
    public void testAverageTemperatureInFile(){
        File f = new File("C:\\Users\\anegorov\\Downloads\\nc_weather\\2013\\weather-2013-08-10.csv");
        FileResource fr = new FileResource(f);
        TempCSV tc = new TempCSV();
        double lagest = tc.averageTemperatureInFile(fr.getCSVParser());
        System.out.println("Average temp: " + lagest);
    }

    @Ignore
    public void testAverageTemperatureWithHighHumidityInFile(){
        File f = new File("C:\\Users\\anegorov\\Downloads\\nc_weather\\2013\\weather-2013-09-02.csv");
        FileResource fr = new FileResource(f);
        TempCSV tc = new TempCSV();
        double lagest = tc.averageTemperatureWithHighHumidityInFile(fr.getCSVParser(), 80);
        System.out.println("Average temp: " + lagest);
    }

}
