/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.ionic.ionicons;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "IonIcons",
		pluginUniqueName = "ion-icons",
		pluginDescription = "The premium icon font for Ionic Framework.",
		pluginVersion = "2.0.1",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "The premium icon font for Ionic Framework.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-IoniconsPlugin",
		pluginSourceUrl = "https://github.com/driftyco/ionicons",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-IoniconsPlugin/wiki",
		pluginOriginalHomepage = "http://ionicons.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/IoniconsPlugin.jar/download",
		pluginIconUrl = "bower_components/Ionicons/ionicons-icon.png",
		pluginIconImageUrl = "bower_components/Ionicons/ionicons-logo.png",
		pluginLastUpdatedDate = "2017/03/04")
@SuppressWarnings("unused")
public class IonIconsPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;
	private static final IonIconsJSReference reference = new IonIconsJSReference();

	private static boolean autoSwitchForIOS;

	/**
	 * A new instance of the page configurator
	 */
	public IonIconsPageConfigurator()
	{
		//No config needed
	}

	/**
	 * Get the reference
	 *
	 * @return
	 */
	public static IonIconsJSReference getReference()
	{
		return reference;
	}

	/**
	 * Auto switches the icon to render for ios when necessary
	 *
	 * @return
	 */
	public static boolean isAutoSwitchForIOS()
	{
		return autoSwitchForIOS;
	}

	/**
	 * Auto switches the icons to ios when necessary
	 *
	 * @param autoSwitchForIOS
	 */
	public static void setAutoSwitchForIOS(boolean autoSwitchForIOS)
	{
		IonIconsPageConfigurator.autoSwitchForIOS = autoSwitchForIOS;
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addJavaScriptReference(reference);
		}
		return page;
	}
}
