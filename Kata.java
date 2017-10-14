class Kata
{
	public static void main(String[] args){
		char[] arg = { 'O','Q','R','S' };
		findMissingLetter(arg);
	}
	
	public static char findMissingLetter(char[] array){
		/*
		WITHOUT USING CHAR VALUES
		
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char firstLetter = array[0];

		char[] correctSequence = new char[array.length+1];
		int index = 0;
		
	
		//Finds the starting index of the sequence
		for (int i = 0; i < alphabet.length; i++){
		  if (Character.toUpperCase(firstLetter) == alphabet[i]){
			index = i; 
			break;
		  }
			   
		}
		//Get correct sequence
		int counter = 0;
		while (counter < array.length + 1){
			correctSequence[counter] = alphabet[index];
			counter++;
			index++;
		}
		
		for (int i = 0; i < correctSequence.length; i++){
			System.out.println(correctSequence[i]);
		}
		
		// array = ['O','Q','R', 'S']
		// correctSequence = ['O','P','Q','R', 'S']
		char missingChar = 0;
		for (int i = 0; i < array.length; i++){
			if (Character.toUpperCase(array[i]) != correctSequence[i]){
				if (Character.isLowerCase(array[0]))
					missingChar =  Character.toLowerCase(correctSequence[i]);
				else
					missingChar = correctSequence[i];
				break;
			}
				
				
		}
	
		return missingChar;
		*/
		
		/*USING CHAR VALUES*/
		for (int i = 0; i < array.length - 1; i++){
			if (array[i]+2 == array[i+1])
				return (char) (array[i] + 1);
		}
		
		return ' ';
	}
}