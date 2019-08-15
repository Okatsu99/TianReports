package Reg_Form1;

import java.text.DecimalFormat;

public class RegForm {
	public static void main(String args[])
	{
		DecimalFormat decimal = new DecimalFormat("0.00");
		DecimalFormat decimalThousand = new DecimalFormat("0,000.00");
		String space = "      ";String Space ="   "; String s = " ";
		//Assessment Summary
		float TutionFee1 = 32_705f;float TutionFee2 = 35_648.45f;
		float LaboratoryFee1 =12_600f;float LaboratoryFee2 =13_734f;
		float Miscellaneous1 =16_430f;float Miscellaneous2 =16_430f;
		float NewStudent1 =0f;float NewStudent2 =0f;
		float DownPayment = 32_906.23f;
		float Installment1st = 6_581.25f;
		float Installment2nd = 6_581.25f;
		float Installment3rd = 6_581.25f;
		float Installment4th = 6_581.25f;
		float Installment5th = 6_581.25f;
	
		//Miscellaneous Detail
		float AthleticFee = 530f;
		float AudioVisual = 1_580f;
		float EnergyFee = 3_680f;
		float Guidance = 1_050f;
		float HealthServices = 630f;
		float IdValidation =110f;
		float Insurance = 110f;
		float Internet = 1_580f;
		float LibraryFee =1_260f;
		float LearningMaterials = 1_580f; 
		float Registration = 530f;
		float StudentActivity = 1_580f;
		float StudentDevelopmentFee = 1_580f;
		float StudentOrganization = 420f;
		float StudentPublication = 210f;

		//Display
		System.out.println("\t\t\t\t\t\t\t Information and Communication Technology Academy");
		System.out.println("\t\t\t\t\t\t 7434 Yakal Street, Brgy. San Antonio, Makati City,Philippines");
		System.out.println("\t\t\t\t\t\t\t\t ASSESSMENT REGISTRATION FORM");
		System.out.println("\t\t\t__________________________________________________________________________________________________________________");
		System.out.println("\t\t\tStud. No.\t 201801244 \t\t\t\t\t SY/Sem \t :  2019-2020 First Term");
		System.out.println("\t\t\tName\t\t Gaspar, Christian Basa");
		System.out.println("\t\t\tAddress\t\t Blk 6 Lot 2 Mahogany ST. Meadowood \t\t Program/Major\t :  BSCSSE");
		System.out.println("\t\t\t\t\t EXECUTIVE VILLAGE PANAPAAN 8 BACOOR CAVITE \t Curriculum Code :  1819\n");
		System.out.println("\t\t\tSection \t Subject Name \t\t\t\t\t UNITS DAY \t TIME \t\t\t ROOM#");
		System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\tSE22 \t\t Computer Architcture and Organization \t\t 3.0 \tS \t 11:00AM-02:30PM \t 906-N");
		System.out.println("\t\t\tSE22 \t\t Computer Science Elective 1 \t\t\t 3.0 \tW \t 11:00AM-02:30PM \t 1002-N");
		System.out.println("\t\t\tSE22 \t\t Discrete Mathematics \t\t\t\t 3.0 \tT \t 02:30AM-06:00PM \t 903-N");
		System.out.println("\t\t\tSE22 \t\t Information Management and Database Systems \t 3.0 \tT \t 11:00AM-02:30PM \t 1002-N");
		System.out.println("\t\t\tSE22 \t\t National Service Training Prgram 2 \t\t 3.0 \tS \t 07:30AM-11:00PM \t 903-N");
		System.out.println("\t\t\tAN21 \t\t Physical Education 4 (Team Sports) \t\t 2.0 \tF \t 08:30AM-10:30AM \t BBCOURT");
		System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\tASSESSMENT SUMMARY \t\t\t\t\t MISCELLANEOUS DETAIL");
		System.out.println("\t\t\t\t\t\t FULLPAYMENT \t   INSTALLMENT");
		System.out.println("\t\t\t\t\t\t---------------  --------------");
		System.out.println("\t\t\t\tTuition Fee\t" +space + decimalThousand.format(TutionFee1) + "\t"+space +decimalThousand.format(TutionFee2) + "\t"
		+Space + "Athletic fee\t\t\t\t\t"+space+s+s +decimal.format(AthleticFee));
		System.out.println("\t\t\t\tLaboratory Fee\t" +space + decimalThousand.format(LaboratoryFee1) + "\t"+space +decimalThousand.format(LaboratoryFee2) +"\t"
		+Space+ "Audio visual\t\t\t\t\t"+space+s+s +decimal.format(AthleticFee));
		System.out.println("\t\t\t\tMiscellaneous\t" +space + decimalThousand.format(Miscellaneous1) + "\t"+space +decimalThousand.format(Miscellaneous2)+ "\t"
		+Space + "Energy fee\t\t\t\t\t"+space+ decimalThousand.format(EnergyFee));
		System.out.println("\t\t\t\tNew Student\t" +Space+s+space + decimal.format(NewStudent1) + "\t"+Space+s+space +decimal.format(NewStudent2)+ "\t"
		+Space + "Guidance\t\t\t\t\t"+space+ decimalThousand.format(Guidance));
		System.out.println("\t\t\t\t\t\t" +space +decimalThousand.format((TutionFee1 +LaboratoryFee1+Miscellaneous1+NewStudent1)) + "\t"+space 
				+decimalThousand.format((TutionFee2 +LaboratoryFee2+Miscellaneous2+NewStudent2))+ "\t"+Space + "Health services\t\t\t\t"+space+s+s+decimal.format(HealthServices));
		System.out.println("\t\t\t\t\t\t" + "--------------" + "\t---------------"+ "\t"+Space + "Id validation\t\t\t\t"+space+s+s+ decimal.format(IdValidation));
		System.out.println("\t\t\t\t\t\t\t\t\t\t"+Space+"Insurance\t\t\t\t\t"+space+s+s+ decimal.format(Insurance));
		System.out.println("\t\t\t\t\t\t\t\t\t\t"+Space+"Internet\t\t\t\t\t"+space+ decimalThousand.format(Internet));
		System.out.println("\t\t\t\t\t\t\t\t\t\t"+Space+"Library fee\t\t\t\t\t"+space+ decimalThousand.format(LibraryFee));
		System.out.println("\t\t\t Down Payment\t\t\t\t"+Space+s+s+s+s+decimalThousand.format(DownPayment)+Space + "Learning Materials\t\t\t\t"+space
				+ decimalThousand.format(LearningMaterials));
		System.out.println("\t\t\t 1st INSTALLMENT (07/31/2019)\t\t"+Space+s+s+s+s+s+decimalThousand.format(Installment1st)+Space +"Registration\t\t\t\t\t"+space+s+s
				+ decimal.format(Registration));
		System.out.println("\t\t\t 2nd INSTALLMENT (08/15/2019)\t\t"+Space+s+s+s+s+s+decimalThousand.format(Installment2nd)+Space+"Student activity\t\t\t\t"+space
				+ decimalThousand.format(StudentActivity));
		System.out.println("\t\t\t 3rd INSTALLMENT (08/30/2019)\t\t"+Space+s+s+s+s+s+decimalThousand.format(Installment3rd)+Space +"Student development fee\t\t\t"+space
				+ decimalThousand.format(StudentDevelopmentFee));
		System.out.println("\t\t\t 4th INSTALLMENT (09/13/2019)\t\t"+Space+s+s+s+s+s+decimalThousand.format(Installment4th)+Space +"Student organization\t\t\t\t"+space+s+s
				+ decimal.format(StudentOrganization));
		System.out.println("\t\t\t 5th INSTALLMENT (09/27/2019)\t\t"+Space+s+s+s+s+s+decimalThousand.format(Installment5th)+Space +"Student publication\t\t\t\t"+space+s+s
				+ decimal.format(StudentPublication));
		System.out.println("\t\t\t\t\t\t\t"+"\t"+Space+s+s+s+s+decimalThousand.format((DownPayment + Installment1st +Installment2nd+Installment3rd
				+Installment4th+Installment5th))+Space+"Total\t\t\t\t\t"+s+s+s+s+s+ decimalThousand.format((AthleticFee + AudioVisual 
						+EnergyFee +Guidance+ HealthServices + IdValidation + Insurance +Internet + LibraryFee 
						+LearningMaterials + Registration + StudentActivity + StudentDevelopmentFee +StudentOrganization+StudentPublication)));
		System.out.println("\t\t\t\t\t\t\t\t"+ "------------------\t\t\t\t\t\t----------------\n");
		System.out.println("\t\t"+ space+"Official Receipt Number/date\t\t__________________\n");
		System.out.println("\t\t"+space+"Enrollment Confirmed by\n");
		System.out.println("\t\t"+space+ "__________________________________________________________\t_____________________________________________________");
		System.out.println("\t\t\t\t\t "+ " Authorized Signatory \t\t\t\t\t\t\t" + "Registrar\n");
		System.out.println("\t\t"+space+"Note: Class schedule is subject to change.\n");
		System.out.println("\t\t\tI shall abide by all existing rules and regulations of the School and those that may be promulgated from time to time");
		System.out.println("\t\t\tI understand that the school has to collect my personal data and I allow the school to process all my information and all");
		System.out.println("\t\t\tpurpose related to this.\n");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t___________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tStudent Signature/Date\n");
		System.out.println("\t\t\tPlease see reverse side for the policy on school charges and refund of fees.");
		
	}
}
