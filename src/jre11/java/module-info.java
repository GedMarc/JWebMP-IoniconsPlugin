import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.ionic.ionicons.IonIconsPageConfigurator;
import com.jwebmp.plugins.ionic.ionicons.implementations.IonIconsExclusionsModule;

module com.jwebmp.plugins.ionic.ionicons {
	exports com.jwebmp.plugins.ionic.ionicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;
	requires uadetector.core;

	provides IPageConfigurator with IonIconsPageConfigurator;
	provides IGuiceScanModuleExclusions with IonIconsExclusionsModule;
	provides IGuiceScanJarExclusions with IonIconsExclusionsModule;

	opens com.jwebmp.plugins.ionic.ionicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
