package p017_Number_Letter_Counts;

public class Main_017 {

	public static void main(String[] args) {
		int length = 0;
		for (int i = 1; i<=1000; i++){
			length+=generateName(i).replace(" ","").replace("-","").length();
		}
		System.out.println(length);
	}

	public static String generateName(int i) {
		String output = "";
		if (i > 99) {
			int hundred = i/100;
			switch (hundred){
				case 1: output += "one hundred"; break;
				case 2: output += "two hundred"; break;
				case 3: output += "three hundred"; break;
				case 4: output += "four hundred"; break;
				case 5: output += "five hundred"; break;
				case 6: output += "six hundred"; break;
				case 7: output += "seven hundred"; break;
				case 8: output += "eight hundred"; break;
				case 9: output += "nine hundred"; break;
				case 10: return "one thousand";
			}
			if (i % 100 != 0){
				output += " and ";
			}
			i = i%100;
		}

		if (i < 20){
			switch (i){
				case 1: output += "one"; break;
				case 2: output += "two"; break;
				case 3: output += "three"; break;
				case 4: output += "four"; break;
				case 5: output += "five"; break;
				case 6: output += "six"; break;
				case 7: output += "seven"; break;
				case 8: output += "eight"; break;
				case 9: output += "nine"; break;
				case 10: output += "ten"; break;
				case 11: output += "eleven"; break;
				case 12: output += "twelve"; break;
				case 13: output += "thirteen"; break;
				case 14: output += "fourteen"; break;
				case 15: output += "fifteen"; break;
				case 16: output += "sixteen"; break;
				case 17: output += "seventeen"; break;
				case 18: output += "eighteen"; break;
				case 19: output += "nineteen"; break;
			}
		}else{
			int tens = i /10;
			switch (tens){
				case 2: output += "twenty"; break;
				case 3: output += "thirty"; break;
				case 4: output += "forty"; break;
				case 5: output += "fifty"; break;
				case 6: output += "sixty"; break;
				case 7: output += "seventy"; break;
				case 8: output += "eighty"; break;
				case 9: output += "ninety"; break;
			}
			i = i%10;
			switch (i){
				case 1: output += "-one"; break;
				case 2: output += "-two"; break;
				case 3: output += "-three"; break;
				case 4: output += "-four"; break;
				case 5: output += "-five"; break;
				case 6: output += "-six"; break;
				case 7: output += "-seven"; break;
				case 8: output += "-eight"; break;
				case 9: output += "-nine"; break;
			}
		}
		return output;
	}

}
