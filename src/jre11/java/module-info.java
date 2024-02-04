import com.jwebmp.plugins.ionic.ionicons.implementations.IonIconsInclusionsModule;

module com.jwebmp.plugins.ionic.ionicons {
	exports com.jwebmp.plugins.ionic.ionicons;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;
	requires net.sf.uadetector.core;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.ionic.ionicons.IonIconsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.ionic.ionicons.implementations.IonIconsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with IonIconsInclusionsModule;

	opens com.jwebmp.plugins.ionic.ionicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
