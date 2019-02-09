/*
 * Copyright (C) 2017 GedMarc
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
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-IoniconsPlugin",
		pluginSourceUrl = "https://github.com/driftyco/ionicons",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-IoniconsPlugin/wiki",
		pluginOriginalHomepage = "http://ionicons.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/IoniconsPlugin.jar/download",
		pluginIconUrl = "bower_components/Ionicons/ionicons-icon.png",
		pluginIconImageUrl = "bower_components/Ionicons/ionicons-logo.png",
		pluginLastUpdatedDate = "2017/03/04")
@SuppressWarnings("unused")
public class IonIconsPageConfigurator
		implements IPageConfigurator<IonIconsPageConfigurator>
{
	private static final IonIconsJSReference reference = new IonIconsJSReference();
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static boolean autoSwitchForIOS;

	/**
	 * A new instance of the page configurator
	 */
	public IonIconsPageConfigurator()
	{
		//No config needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return IonIconsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		IonIconsPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Get the reference
	 *
	 * @return
	 */
	public static IonIconsJSReference getReference()
	{
		return IonIconsPageConfigurator.reference;
	}

	/**
	 * Auto switches the icon to render for ios when necessary
	 *
	 * @return
	 */
	public static boolean isAutoSwitchForIOS()
	{
		return IonIconsPageConfigurator.autoSwitchForIOS;
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

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addJavaScriptReference(IonIconsPageConfigurator.reference);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return IonIconsPageConfigurator.enabled;
	}
}
