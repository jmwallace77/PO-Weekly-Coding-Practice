class LittleMissedPigLatiny{
	String pigLatinConverter(String statement){
		String[] words = statement.split(" ");
		for(int v = 0; v < words.length(); v ++){
			for(int x = 0; x < words[v].length; x++){
				switch(words[v].charAt(x)){
					case "a":
						words[v]+="way";
						break;
					case "A":
						words[v]+="way";
						break;
					case "e":
						words[v]+="way";
						break;
					case "E":
						words[v]+="way";
						break;
					case "i":
						words[v]+="way";
						break;;
					case "I":
						words[v]+="way";
						break;
					case "o":
						words[v]+="way";
						break;
					case "O":
						words[v]+="way";
						break;
					case "u":
						words[v]+="way";
						break;
					case "U":
						words[v]+="way";
						break;
					default:
						StringBuilder newWord = new StringBuilder(words[v]);
						newWord = newWord.append(words[v].charAt(x).toLower()).append("ay");
						newWord.deleteCharAt(0);
						words[v] = newWord;
						break;
				}
			}
		}
	}
}