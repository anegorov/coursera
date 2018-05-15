package coursera;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class TempCSV {
    public CSVRecord hottestHourInFile(CSVParser parser){
        CSVRecord lagestSoFar = null;
        for(CSVRecord currentRow : parser){
            if(lagestSoFar == null) {
                lagestSoFar = currentRow;
            }else{
                Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("TemperatureF"));
                if(currentTemp > largestTemp) lagestSoFar = currentRow;
            }

        }
        return lagestSoFar;
    }

    public CSVRecord coldestHourInFile(CSVParser parser){
        CSVRecord lagestSoFar = null;
        for(CSVRecord currentRow : parser){
            if(lagestSoFar == null) {
                lagestSoFar = currentRow;
            }else{
                Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("TemperatureF"));
                if(currentTemp < largestTemp) lagestSoFar = currentRow;
            }

        }
        return lagestSoFar;
    }

    public CSVRecord hottestInManyDays(){
        CSVRecord lagestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            TempCSV tc = new TempCSV();
            CSVRecord currentRow = tc.hottestHourInFile(fr.getCSVParser());
            if (lagestSoFar == null){
                lagestSoFar = currentRow;
            }else {
                Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("TemperatureF"));
                if(currentTemp > largestTemp) lagestSoFar = currentRow;
            }
        }
    return lagestSoFar;
    }

    public CSVRecord coldestInManyDays(){
        CSVRecord lagestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            TempCSV tc = new TempCSV();
            CSVRecord currentRow = tc.coldestHourInFile(fr.getCSVParser());
            if (lagestSoFar == null){
                lagestSoFar = currentRow;
            }else {
                Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("TemperatureF"));
                if(currentTemp < largestTemp) lagestSoFar = currentRow;
            }
        }
        return lagestSoFar;
    }

    public CSVRecord lowestHumidityHourInFile(CSVParser parser){
        CSVRecord lagestSoFar = null;
        for(CSVRecord currentRow : parser){
            if(lagestSoFar == null) {
                lagestSoFar = currentRow;
            }else{
                Double currentTemp = Double.parseDouble(currentRow.get("Humidity"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("Humidity"));
                if(currentTemp < largestTemp) lagestSoFar = currentRow;
            }

        }
        return lagestSoFar;
    }

    public CSVRecord lowestHumidityInManyFiles(){
        CSVRecord lagestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            TempCSV tc = new TempCSV();
            CSVRecord currentRow = tc.lowestHumidityHourInFile(fr.getCSVParser());
            if (lagestSoFar == null){
                lagestSoFar = currentRow;
            }else {
                Double currentTemp = Double.parseDouble(currentRow.get("Humidity"));
                Double largestTemp = Double.parseDouble(lagestSoFar.get("Humidity"));
                if(currentTemp < largestTemp) lagestSoFar = currentRow;
            }
        }
        return lagestSoFar;
    }

    public double averageTemperatureInFile (CSVParser parser){
        Double sum = 0.0;
        int count=0;
        for(CSVRecord currentRow : parser){
            Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            sum = sum + currentTemp;
            count++;
            }
        return sum/count;
    }

    public double averageTemperatureWithHighHumidityInFile  (CSVParser parser, int value){
        Double sum = 0.0;
        int count=0;
        for(CSVRecord currentRow : parser){

            Double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
            if(currentHumidity >= value) {
                Double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                sum = sum + currentTemp;
                count++;
            }
        }
        return sum/count;
    }

}
