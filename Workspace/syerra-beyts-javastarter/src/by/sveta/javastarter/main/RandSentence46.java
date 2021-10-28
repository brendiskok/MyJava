package by.sveta.javastarter.main;

public class RandSentence46 {
	public static void main (String[] srgs) {
		
		//3 word sequences 
		
		String[] seq1 = {"прекрасная", "супер", "круто", "зашибись" };
		String[] seq2 = {"отлично ", ", ���������� ", ", �����������"};
		String[] seq3 = {", ���������!", ", ���������!", ", ��� ���������!"};
		
		// counting number of words in sequences
		
		int forSeq1 = seq1.length;
		int forSeq2 = seq2.length;
		int forSeq3 = seq3.length;
		
		// generate 3 random numbers and make them int
		// Math.random() chooses 0<double<1 not including 0 and 1
		// (int) () makes int from double rounding it
		
		int rand1 = (int) (Math.random() * forSeq1);
		int rand2 = (int) (Math.random() * forSeq2);
		int rand3 = (int) (Math.random() * forSeq3);
		
				
		System.out.println( "���� ���� ������� ����� " + seq1[rand1] + seq2[rand2] + seq3[rand3]);
		
				
	}

}
