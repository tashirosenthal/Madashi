import java.util.Scanner;
public class quiz
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How are you feeling..." +
		        "\n 1. I feel amazing and healthy." +
				"\n 2. I feel like something is very wrong.");
							  
		int a = kb.nextInt();
		if(a == 1)
		{
			System.out.println("Sounds like you are cancer-free have a nice day!");
		}
		else
		{
			System.out.println("Please enter in the area below where you are having pain or notice something concerning" +
							"\n 1. Stomach/ lower abdomen " +
							"\n 2. Throat/under neck" +
							"\n 3. Pelvis(male)" +
							"\n 4. Head " +
							"\n 5. Joints/ bones" +
							"\n 6. Breast(female)" +
							"\n 7. Pelvis(female)" +
							"\n 8. Any unsual Lumps or swelling or spotting");
							int b = kb.nextInt();
							if(b == 1)
							{
								System.out.println("Okay Please add another description to your pain." +
								"\n 1. Extreeme Abdominal Pain" +
								"\n 2. Indigestion" +
								"\n 3. Anemia or fever" +
								"\n 4. Weight loss or Anorexia");
								int c = kb.nextInt();
								if(c == 1)
								{
									System.out.println("Okay One more question which of these do your symptoms best identify with?" +
									"\n 1. Fever and rash" + 
									"\n 2. Anemia");
									int d = kb.nextInt();
									if(d == 1)
									{
										System.out.println("You most likely have Acinar Carcinoma, a cancer of the pancreas. Here is a link to more information regarding the disease.");
									}
									else
									{
										System.out.println("You most likely have Cell Renal Cell Carcinoma, a cancer of the Kidney. Here is a link to more information regarding the disease.");
									}
								}
								else if(c == 2)
								{
									System.out.println("Okay One more question which of these do your symptoms best identify with?");
									"\n 1. Blood in Stool and constipation" + 
									"\n 2. Bloating, Nausea and vomiting");
									int e = kb.nextInt();
									if(e == 1)
									{
										System.out.println("You most likely have Colorectal Cancer, a cancer of the large intestine. Here is a link to more information regarding the disease.");
									}
									else
									{
										System.out.println("You most likely have GallBladder Carcinoma, a cancer of the GallBladder where bile is stored. Here is a link to more information regarding the disease.");
									}
								}
							}
							else if(r == 2)
							{
								System.out.println("Would you like to" +
								"\n 1.Take the shinkansen bullet train to hakkone?" +
								"\n 2.Or take the subway to Roponggi?");
								int h = kb.nextInt();
								if(h == 1)
								{
									System.out.println("Sound relaxing! What would you like to do when you arrive?" +
														"\n 1. Take a dip in the mountain spring spa?" +
														"\n 2. Take a gondola over Mount Fuji?");
														int n = kb.nextInt(); 
														if(n ==1)
														{
															System.out.println("How refreshing have a nice stay!");
														}
														else
														{
															System.out.println("Very scenic! Watch out for the sulfur deposits!");
														}
											
								}
								else
								{
									System.out.println("Excitemnt is in your near future! Do you want to" +
														"\n 1.Eat at the famous restaurant from Kill Bill" +
														"\n 2.Explore the manga world");
														int v = kb.nextInt();
														if(v == 1)
														{
															System.out.println("Yum! Make sure to get reservations it gets busy!");
														}
														else
														{
															System.out.println("Look for your favorite anime character and buy some suvoniers!");
														}
								}
							}
		}
	}
}