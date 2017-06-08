import java.util.Scanner;
public class donttouch
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
								"\n 3. Anemia or fever");
								int c = kb.nextInt();
								if(c == 1)
								{
									System.out.println("Okay One more question which of these do your symptoms best identify with?" +
									"\n 1. Fever and rash" + 
									"\n 2. Dark Urine and pale feces");
									int d = kb.nextInt();
									if(d == 1)
									{
										System.out.println("You most likely have Acinar Carcinoma, a cancer of the pancreas. Here is a link to more information regarding the disease.");
									}
									else
									{
										System.out.println("You most likely have Cholangiocarcinoma, a cancer of the bile duct. Here is a link to more information regarding the disease.");
									}
								}
								else if(c == 2)
								{
									System.out.println("Okay One more question which of these do your symptoms best identify with?" +
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
								else
								{
									System.out.println("Okay One more question which of these do your symptoms best identify with?" +
									"\n 1. Weight loss nasuea and vomiting" +
									"\n 2. Extreeme abdominal pain and constant fever");
									int f = kb.nextInt();
									if(f ==1)
									{
										System.out.println("You most likely have Ampullary Carcinoma, a cancer of the digestive tract. Here is a link to more information regarding the disease.");
									}
									else 
									{
										System.out.println("You most likely have Cell Renal Cell Carcinoma, a cancer of the kidney where blood is filtered. Here is a link to more information regarding the disease.");
									}
								}
								}
									
							
							else if(b == 2)
							{
								System.out.println("Okay Please add another description to your pain." +
								"\n 1. Lumps in the throat or mouth area." +
								"\n 2. Coughing and Hoarseness." );
									int g = kb.nextInt();
								    if(g == 1)
									{
										System.out.println("Okay one more question which of these symptoms do you most closely identify with?" +
										"\n 1. Swelling and and discomfort feeling unwell." +
										"\n 2. Hearing loss and headaches");
										int i = kb.nextInt();
										if(i == 1)
										{
											System.out.println("You most likely have Diffuse Large b cell lymphoma, a cancer of the lympnodes. Here is a link to more information regarding the disease.");
										}
										else
										{
											System.out.println("You most likely have Nasopharyngeal cancer, a cancer of the nose and throat. Here is a link to more information regarding the disease.");
										}
									}
									else
									{
										System.out.println("Okay one more question which of these symptoms do you most closely identify with?" +
										"\n 1. Pain in the ear and mouth ulcers." +
										"\n 2. Weight loss and chest pain.");
										int j = kb.nextInt();
										if(j == 1)
										{
											System.out.println("You most likely have Head and Neck Squamous Carcinoma, a cancer of the head and neck area. Here is a link to more information regarding the disease.");
										}
										else
										{
											System.out.println("You mosty likely have Esophageal Adenocarcinoma, a cancer of the esophagus. Here is a link to more information");

										}
									}
								
								}
								else if(b == 3)
								{
									System.out.println("Okay Please add another description to your pain." +
									"\n 1. More frequent urination at night, decreased flow or velocity of urine." +
									"\n 2. Swelling in pelvic area or legs, fatigue, erectile dysfunction. " );
									int k = kb.nextInt();
									if(k == 1)
									{
										System.out.println("You most likely have Prostate Adenocarcinoma, a cancer of the prostate. Here is a link to more information regarding the disease.");
									}
									else
									{
										System.out.println("You most likely have Prostate Cancer Metastatic, a cancer of the prostate. Here is a link to more information regarding the disease.");
									}
								}
								else if(b == 4)
								{
									System.out.println("Okay Please add another description to your pain." +
									"\n 1. Vision problems or seeing double." +
									"\n 2. Tilting the head to the side and poor motor skills." );
									int l = kb.nextInt();
									if(l == 1)
									{
										System.out.println("You most likely have Brain Lower grade giloma, a cancer of the brain. Here is a link to more information regarding the disease.");
									}
									else
									{
										System.out.println("You most likely have Medullablastoma, a cancer of the brain. Here is a link to more information regarding the disease.");
									}
								}
								else if(b == 5)
								{
									System.out.println("Okay Please add another description to your pain." +
									"\n 1. Vision problems or seeing double." +
									"\n 2. Tilting the head to the side and poor motor skills." );
									int l = kb.nextInt();
								}
								
							}	
							}
		}
	
