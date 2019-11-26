package UtilityPackage;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources
({
	"file:src/test/resources/propertyfiles/config.properties"
})

public interface configProperties extends Config{
	
	@Key("baseURI")
	String getBaseURI();
	
	@Key("basePath")
	String getBasePath();
	
	@Key("validSecretKey")
	String getValidSecretKey();
	
	@Key("invalidSecretKey")
	String getInValidSecretKey();
	
	@Key("customerAPIEndPoint")
	String getCustomerAPIEndPoint();
}
