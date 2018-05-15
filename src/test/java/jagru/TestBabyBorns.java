package jagru;

import coursera.BabyBirths;
import coursera.FileResource;
import org.junit.Ignore;

import java.io.File;

public class TestBabyBorns {
    @Ignore
    public void testBaby(){
        BabyBirths bb = new BabyBirths();
        bb.printNames();
    }

    @Ignore
    public void testTotalBirths(){
        BabyBirths bb = new BabyBirths();
        File f = new File("C:\\Users\\anegorov\\Downloads\\us_babynames\\us_babynames_by_year\\yob1900.csv");
        FileResource fr = new FileResource(f);
        bb.totalBirths(fr);
    }

    @Ignore
    public void testGetRank(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.getRank(1960, "Emily","F"));
        System.out.println(" ");
    }

    @Ignore
    public void testNumBirth(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.getNumBirth(1980, "Mason","M"));
        System.out.println(" ");
    }

    @Ignore
    public void testGetName(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.getName(1982, 450,"M"));
        System.out.println(" ");
    }
    @Ignore
    public void testWhatIsNameInYear(){
        BabyBirths bb = new BabyBirths();
        bb.whatIsNameInYear("Owen",1974,2014,"M");
    }

    @Ignore
    public void testYearOfHighestRank(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.yearOfHighestRank("Genevieve","F"));
    }

    @Ignore
    public void testGetAverageRank(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.getAverageRank("Susan","F"));
    }

    @Ignore
    public void testGetTotalBirthsRankedHigher(){
        BabyBirths bb = new BabyBirths();
        System.out.println(bb.getTotalBirthsRankedHigher(1990 , "Drew","M"));
    }

}
