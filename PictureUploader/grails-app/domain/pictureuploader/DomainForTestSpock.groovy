package pictureuploader

class DomainForTestSpock {
	
	String nom
	String prenom
	Integer age 
	String image;
	

    static constraints = {
    }
	
	def ToString()
	{
		return "${nom} ${prenom} ${age} ${image}"
	}
}
