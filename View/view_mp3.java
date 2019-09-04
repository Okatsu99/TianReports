package View;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import Model.model_mp3;
public class view_mp3 {
	
	public static String print_Invisible(int index) {
		
		String invisible_c[]  =  {"NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL", "BS", "HT", "LF", "VT", "FF", "CR", "SO", "SI",
				"DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB", "CAN", "EM", "SUB", "ESC", "FS", "GS", "RS", "US", "SPACE"};
		String invisible_c2[] = {"DEL", "Ç", "ü", "é", "â", "ä", "à", "å", "ç", "ê", "ë", "è", "ï", "î", "ì", "Ä", "Å", "É", "æ", "Æ",
				"ô", "ö", "ò", "û", "ù", "ÿ", "Ö", "Ü", "ø", "£", "Ø", "×", "ƒ", "á", "í", "ó", "ú", "ñ", "Ñ", "ª", "º", "¿", "®", "¬",
				"½", "¼", "¡", "«", "»", "░", "▒", "▓", "│", "┤", "Á", "Â", "À", "©", "╣","║", "╗", "╝", "¢", "¥", "┐", "└", "┴", "┬", "├",
				"─", "┼", "ã", "Ã", "╚", "╔", "╩", "╦", "╠", "═", "╬", "¤", "ð", "Ð", "Ê", "Ë", "È", "ı", "Í", "Î", "Ï", "┘", "┌", "█", "▄",
				"¦", "Ì", "▀", "Ó", "ß", "Ô", "Ò", "õ", "Õ", "µ", "þ", "Þ", "Ú", "Û", "Ù", "ý", "Ý", "¯", "´", "≡", "±", "‗", "¾", "¶", "§",
				"÷", "¸", "°", "¨", "·", "¹", "³", "²", "■", "nbsp"};
		
		if (index <= 32) 
			return invisible_c[index];
		
		else 
			return invisible_c2[index - 127];
	}
	
	public static void displayAscii(char ch[], int char_f[], model_mp3 words)throws IOException , 
	DocumentException, FileNotFoundException {
		
		int ic = count_Invisible(words);
		int vc = count_Visible(words);
		int emb_total = count_EmbeddedWord(words);
		int total = count_Total(ic, vc);
		Document document = new Document();
		 
	    PdfWriter.getInstance(document,new FileOutputStream("D:\\ Mp4_Result.pdf"));
	    document.open();
	    
	   String arialLoc = "C://Windows//Fonts//Century.ttf";
	    
	    PdfPTable table = new PdfPTable(3);
	    PdfPCell cell;
	    BaseFont courier = BaseFont.createFont(arialLoc, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	    Font test = new Font(courier);
//	    String imgLoc = "D:\\love2.png";
//	    Image image1 = Image.getInstance(imgLoc);
//	    image1.setAbsolutePosition(225f, 680f);
//	    image1.scaleAbsolute(150f, 150f);
//	    document.add(image1);
	    
	    Paragraph para = new Paragraph();
	    para.add("Gomez and Gaspar's ASCII Table Machine Problem");
	    para.setAlignment(Element.ALIGN_CENTER);
	    para.setSpacingBefore(135);
	    para.setSpacingAfter(20);
	    document.add(para);
	    
	    Paragraph para_1 = new Paragraph();
	    para_1.add("Word: " + words.getWord());
	    para_1.setAlignment(Element.ALIGN_CENTER);
	    para_1.setSpacingAfter(20);
	    document.add(para_1);
	    
	    Paragraph para_2 = new Paragraph();
	    para_2.add("Embedded Word: " + words.getE_word());
	    para_2.setAlignment(Element.ALIGN_CENTER);
	    para_2.setSpacingAfter(20);
	    document.add(para_2);
		    
		System.out.println("Word: " + words.getWord());
		System.out.println("Embedded Word: " + words.getE_word());
		System.out.println(" ");


		table.addCell("DEC");
		table.addCell("Char");
		table.addCell("OCC");
		System.out.println("DEC\tChar\tOCC");
		count_Occurances(ch,char_f);
		

		for (int ctr = 0; ctr <=255; ctr++) {
			
			char c_symbol = (char) ctr;
			
			if (ctr <= 32) {
				String s= Integer.toString(ctr);
				String val = print_Invisible(ctr);
				table.addCell(s);
				table.addCell(val);
				System.out.print(ctr + "\t" + val + "\t");
				
				if (containsChar(c_symbol, ch)) { 
					int occ = print_Occurances(c_symbol, ch, char_f);
					System.out.println(occ);
					String oc = Integer.toString(occ);
					table.addCell(oc);
				}
				else{
					table.addCell("0");
					System.out.println("0");
				}

			}
			
			else if (ctr == 127) {
				String s= Integer.toString(ctr);
				String val = print_Invisible(ctr);
				table.addCell(s);
				table.addCell(val);
				System.out.print(ctr + "\t" + val + "\t");
				if (containsChar(c_symbol, ch)) {
					int occ = print_Occurances(c_symbol, ch, char_f);
					System.out.println(occ);
					String oc = Integer.toString(occ);
					table.addCell(oc);
				}
				else{
					table.addCell("0");
					System.out.println("0");
				}

				
				Scanner pause = new Scanner(System.in);
				String text = "Press any key to Continue: ";
				System.out.println(text);
				cell = new PdfPCell(new Phrase(text));
				cell.setColspan(3);
				table.addCell(cell);
				pause.nextLine();
				Sleep(1000);
				
			}
			
			else if (ctr > 127) {
				
				
				
				String s= Integer.toString(ctr);
				String val = print_Invisible(ctr);
				
				table.addCell(s);
				table.addCell(new Paragraph(val,test)); //display ascii in pdf
				System.out.print(ctr + "\t" + val + "\t");
				
				if (containsChar(c_symbol, ch)) {
					int occ =print_Occurances(c_symbol, ch, char_f);
					System.out.println(occ);
					String oc = Integer.toString(occ);
					table.addCell(oc);
				}
				else{
					table.addCell("0");
					System.out.println("0");
				}
					
			}
			
			
			else {
				String s= Integer.toString(ctr);
				String sym= Character.toString(c_symbol);
				table.addCell(s);
				table.addCell(sym);
				System.out.print(ctr + "\t" + c_symbol + "\t");
				if (containsChar(c_symbol, ch)) {
					int occ = print_Occurances(c_symbol, ch, char_f);
					System.out.println(occ);
					String oc = Integer.toString(occ);
					table.addCell(oc);
				}
				else{
					table.addCell("0");
					System.out.println("0");
				}
					
			}
		}
		
		document.add(table);
	      Paragraph para1 = new Paragraph("\nNumber of Invisible Characters: " + ic,FontFactory.getFont(FontFactory.COURIER_BOLD,20,BaseColor.BLUE));
//	      color and font change
	      Paragraph para2 = new Paragraph();
	      Paragraph para3 = new Paragraph();
	      Paragraph para4 = new Paragraph();
	      para2.add("Number of Visible Characters: " + vc);
	      para3.add("Total Characters: " + total);
	      para4.add("Embedded Word Occurances: " + emb_total);
	      para1.setAlignment(Element.ALIGN_LEFT);
	      para2.setAlignment(Element.ALIGN_LEFT);
	      para3.setAlignment(Element.ALIGN_LEFT);
	      para4.setAlignment(Element.ALIGN_LEFT);
	      document.add(para1);
	      document.add(para2);
	      document.add(para3);
	      document.add(para4);
	      
	     
		System.out.println("\nNumber of Invisible Characters: " + ic);
		System.out.println("Number of Visible Characters: " + vc);
		System.out.println("Total Characters: " + total);
		System.out.println("Embedded Word Occurances: " + emb_total);
		
	    document.close();
	
	}
	
	public static void Sleep(int time ) {
		try {
			Thread.sleep(time);
		} catch (Exception e){}
	}
	
	public static boolean containsChar(char symbol, char ch[]) {
		boolean containsChar = false;
		
		if(symbol != (char) 0) {
			for(int i = 0; i < ch.length; i++) {
				if(symbol == ch[i]) {
					containsChar = true;
				}
			}
		}
		
		return containsChar;
	}
	
	public static int print_Occurances(char c_symbol,char ch[], int char_f[]) {
		int counter = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == c_symbol) 
				counter = char_f[i];
		}return counter;
	}
	
	public static void count_Occurances(char ch[], int char_f[]) {
	
		for(int i = 0; i < ch.length;i++) {
			char_f[i] = 1;
				for(int j = i+1; j < ch.length; j++) {
					if(ch[i] == ch[j]) {
						char_f[i]+=1;
						ch[j] = (char) 0;
					}
			}
		}
	}
	
	public static int count_Visible(model_mp3 data) {
		
		char ch[] = data.getWord().toCharArray();
		int v_count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 32 && ch[i] < 127)
				v_count += 1;
		} return v_count;
	}
	
	public static int count_Invisible(model_mp3 data) {
		
		char ch[] = data.getWord().toCharArray(); //data is temporary data
		int i_count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] < 33 || ch[i] == 127)
				i_count += 1;
		} return i_count;
	}
	
	
	public static int count_Total (int invisible, int visible) {
		return invisible + visible;
	}
	
	private static int count_EmbeddedWord(model_mp3 data) {
		int ew_count = 0;
		
		if(!data.getWord().isEmpty() && !data.getE_word().isEmpty()) {
			ew_count = (data.getWord().length() - data.getWord().replace(data.getE_word(), "").length()) /data.getE_word().length();
		} return ew_count;
	}
}
