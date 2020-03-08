package com.jwebmp.plugins.ionic.ionicons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class IonIconsExclusionsModule
		implements IGuiceScanModuleExclusions<IonIconsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.ionic.ionicons");
		return strings;
	}
}
