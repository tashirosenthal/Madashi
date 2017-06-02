public class Mutations extends Portal 
{
	private int muts;
	
	public Mutations()
	{
		muts = m;
	}
	public void getMutations()
	{
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("http://www.cbioportal.org/webservice.do?cmd=getGeneticProfiles&cancer_study_id=ball_tcga"));
	}
	
}