package Controller;

import Model.model_mp3;
import View.view_mp3;


import java.io.IOException;
import com.itextpdf.text.DocumentException;

public class controller_mp3 {

	public static void main(String args[])throws IOException , DocumentException{
		model_mp3 obj = new model_mp3();
		if(args.length == 0){
			System.out.println("PLs put arguments///just a reminder for you baby you can delete it");
		}
		else {
		char ch[] = args[0].toCharArray();
		int char_f[] = new int[ch.length];
		
		obj.setWord(args[0]);
		obj.setE_word(args[1]);
		view_mp3.displayAscii(ch, char_f, obj);
		}
	}

}
