package UtilityPackage;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources
({
	"file:src/test/resources/propertyfiles/config.properties"
})

public interface InterfaceConfigProperties extends Config{
	
	@Key("baseURI")
	public String getBaseURI();
	
	@Key("basePath")
	public String getBasePath();
	
	@Key("validSecretKey")
	public String getValidSecretKey();
	
	@Key("customerAPIEndPoint")
	public String getCustomerAPIEndPoint();
}
