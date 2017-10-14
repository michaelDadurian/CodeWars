class Kata
{
	public static void main(String[] args){
		char[] arg = {'a','b','c','d','e','f'};
		findMissingLetter(arg);
	}
	
	public static char findMissingLetter(char[] array){
		int length = array.length;
		char firstLetter = array[0];
		char[] correctSequence = new char[length+1];
		int index = 0;
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		for (int i = 0; i < alphabet.length; i++){
		  if (Character.toUpperCase(firstLetter) == alphabet[i]){
			index = i;   
		  }
			   
		}
		int k = 0;
		for (int j = index; j < length + 1; j++){
		  correctSequence[k] = alphabet[j];
		  k++;
		  
		}

		for (int l = 0; l < correctSequence.length; l++){
			System.out.println(correctSequence[l]);
		}




		return ' ';
	}
}