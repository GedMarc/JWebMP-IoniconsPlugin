package com.jwebmp.plugins.ionic.ionicons;

import com.jwebmp.core.base.html.Italic;
import net.sf.uadetector.OperatingSystemFamily;

import javax.validation.constraints.NotNull;
import java.util.EnumSet;

/**
 * An Ion Icon Tag as an Italic Component displaying ion icons
 *
 * @param <J>
 * 		This item
 */
public class IonIcon<J extends IonIcon<J>>
		extends Italic<J>
{
	private IonIcons icon;

	public IonIcon()
	{
		this(null);
	}

	public IonIcon(IonIcons icon)
	{
		super();
		this.icon = icon;
		setTag("ion-icon");
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			String iconName = icon.toString();
			if (IonIconsPageConfigurator.isAutoSwitchForIOS())
			{
				if (EnumSet.of(OperatingSystemFamily.IOS, OperatingSystemFamily.MAC_OS)
				           .contains(getPage().getUserAgent()
				                              .getOperatingSystem()
				                              .getFamily()))
				{
					iconName = "ios-" + iconName;
				}
				else
				{
					iconName = "md-" + iconName;
				}
			}
			else
			{
				iconName = "ios-" + iconName;
			}
			addAttribute("name", iconName);
		}
		super.preConfigure();
	}

	/**
	 * Returns the assigned icon
	 *
	 * @return This object
	 */
	public IonIcons getIcon()
	{
		return icon;
	}

	/**
	 * Sets the assigned icon
	 *
	 * @param icon
	 * 		The icon to be assigned
	 *
	 * @return Always this object
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setIcon(IonIcons icon)
	{
		this.icon = icon;
		return (J) this;
	}
}
