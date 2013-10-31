package pictureuploader

class DomainForTestSpock {
	
	String nom
	String prenom
	Integer age 

    static constraints = {
    }
	
	def ToString()
	{
		return "${nom} ${prenom} ${age}"
	}
}
