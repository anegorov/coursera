package jagru;

import coursera.AllCodeons;
import main.java.jagru.MyAux;
import main.java.jagru.Regular;
import org.junit.Assert;
import org.junit.Ignore;

import java.util.List;

public class TestService{
	@Ignore
	public void testMsg(){
		String str = new main.java.jagru.Service().getMessage();
		Regular reg = new Regular();

		System.out.println("MESSAGE:" + reg.removeEmpty());

		//Assert.assertEquals("to be or not to be1",str);
	}

	@Ignore
	public void testFindStop(){
		String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxx";
		AllCodeons ac = new AllCodeons();
		int dex = ac.findStopCodon(dna,0,"TAA");
		Assert.assertEquals(9,dex);
		dex = ac.findStopCodon(dna,9,"TAA");
		Assert.assertEquals(21,dex);
		dex = ac.findStopCodon(dna,0,"TAA");
		Assert.assertEquals(9,dex);
		dex = ac.findStopCodon(dna,0,"TAG");
		Assert.assertEquals(-1,dex);
	}

	@Ignore
	public void testfindGene(){
		String dna = "ATGCCCGGGAAATAACCC";
		AllCodeons ac = new AllCodeons();
		String gene = ac.findGene(dna,0);
		Assert.assertEquals("ATGCCCGGGAAATAA",gene);

		dna = "ATGCCCGGGAAATAGCCC";
		gene = ac.findGene(dna,0);
		Assert.assertEquals("ATGCCCGGGAAATAG",gene);

		dna = "SSSDDDAATGCCCGGGAAATGACCC";
		gene = ac.findGene(dna,0);
		Assert.assertEquals("ATGCCCGGGAAATGA",gene);
	}

	@Ignore
    public void testPrintAllGenes(){
        MyAux ma = new MyAux();
        List fList = ma.readFileToArrayList("C:\\Users\\anegorov\\Downloads\\dna\\GRch38dnapart.fa");
        System.out.println(fList.size());
        AllCodeons ac = new AllCodeons();
		ac.printAllGenes(fList.get(0).toString());
        //ac.printAllGenes("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        //ac.printAllGenes("ACAAGTTTGTACAAAAAAGCAGAAGGGCCGTCAAGGCCCACCATGCCTATTGGATCCAAAGAGAGGCCAACATTTTTTGA");

    }
}
