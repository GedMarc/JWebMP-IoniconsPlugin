import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.ionic.ionicons.IonIconsPageConfigurator;

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

}
