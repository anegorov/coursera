package coursera;

import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class BabyBirths {

    public void printNames() {
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            if (numBorn <= 100) {
                System.out.println("Name:" + rec.get(0) +
                        " Gender:" + rec.get(1) +
                        " Num born:" + rec.get(2)
                );
            }
        }
    }

    public void totalBirths(FileResource fr) {
        int totalBirth = 0;
        int totalBoys = 0, totalGirls = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirth += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
            } else {
                totalGirls += numBorn;
            }
        }
        System.out.println("Total num of births:" + totalBirth);
        System.out.println("Total num of Boys:" + totalBoys);
        System.out.println("Total num of Girls:" + totalGirls);
    }

    public int getRank(int year, String name, String gender) {
        int rank = 0;

        File f = new File("C:\\Users\\anegorov\\Downloads\\us_babynames\\us_babynames_by_year\\yob" + year + ".csv");
        FileResource fr = new FileResource(f);
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(1).equals(gender)) rank++;
            if (rec.get(0).equals(name) && rec.get(1).equals(gender)) {
                //System.out.println(rec.get(0)+" "+rec.get(1));
                return rank;
            }
        }

        return -1;
    }

    public String getName(int year, int rank, String gender) {
        String name = "NO NAME";
        int currRank = 0;
        File f = new File("C:\\Users\\anegorov\\Downloads\\us_babynames\\us_babynames_by_year\\yob" + year + ".csv");
        FileResource fr = new FileResource(f);
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(1).equals(gender)) currRank++;
            //int currRank = Integer.parseInt(rec.get(2));
            if (currRank == rank && rec.get(1).equals(gender)) {
                System.out.println(rec.get(0) + " " + rec.get(1) + " " + rec.get(2));
                return rec.get(0);
            }
        }

        return name;
    }

    public int getNumBirth(int year, String name, String gender) {
        File f = new File("C:\\Users\\anegorov\\Downloads\\us_babynames\\us_babynames_by_year\\yob" + year + ".csv");
        FileResource fr = new FileResource(f);
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(0).equals(name) && rec.get(1).equals(gender)) {
                //System.out.println(rec.get(0)+" "+rec.get(1));
                return Integer.parseInt(rec.get(2));
            }
        }

        return -1;
    }


    public void whatIsNameInYear(String name, int year, int newYear, String gender) {
        int currRank = getRank(year, name, gender);
        String newName = getName(newYear, currRank, gender);
        System.out.println(name + " born in " + year + " would be " + newName + " if it was born in " + newYear);

    }

    public int yearOfHighestRank(String name, String gender) {
        int prevNum = 9999999;
        int maxYear = 0;
        for (int i = 1880; i <= 2014; i++) {
            //int currNum = getNumBirth(i, name, gender);
            int currNum = getRank(i, name, gender);
            //System.out.println("currNum:"+currNum);
            if (currNum > 0 && currNum <= prevNum) {
                prevNum = currNum;
                maxYear = i;
                System.out.println(prevNum + " " + i);
            }
        }
        return maxYear;
    }

    public double getAverageRank(String name, String gender) {
        int count = 0;
        int sum = 0;
        for (int i = 1880; i <= 2014; i++) {
            int currRank = getRank(i, name, gender);
            //System.out.println("currNum:"+currNum);
            sum += currRank;
            count++;
            if (currRank == -1) return -1.0;
        }
        System.out.println(sum + " " + count);
        return (double) sum / count;
    }

    public int getTotalBirthsRankedHigher(int year, String name, String gender) {
        int total = 0;
        int currNum = 0;
        File f = new File("C:\\Users\\anegorov\\Downloads\\us_babynames\\us_babynames_by_year\\yob" + year + ".csv");
        FileResource fr = new FileResource(f);
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(0).equals(name) && rec.get(1).equals(gender)) {
                //System.out.println(rec.get(0)+" "+rec.get(1));
                return total;
            }
            currNum = Integer.parseInt(rec.get(2));
            total += currNum;

        }

        return -1;
    }
}
