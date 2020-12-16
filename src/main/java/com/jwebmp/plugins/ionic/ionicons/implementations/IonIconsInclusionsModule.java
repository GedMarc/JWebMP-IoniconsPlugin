package com.jwebmp.plugins.ionic.ionicons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class IonIconsInclusionsModule implements IGuiceScanModuleInclusions<IonIconsInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.ionic.ionicons");
		return set;
	}
}
