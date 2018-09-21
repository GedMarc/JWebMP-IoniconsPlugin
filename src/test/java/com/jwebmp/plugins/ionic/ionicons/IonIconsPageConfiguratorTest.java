package com.jwebmp.plugins.ionic.ionicons;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

public class IonIconsPageConfiguratorTest
{
	@Test
	public void test()
	{
		Page p = new Page();
		IonIcon icon = new IonIcon(IonIcons.radio);
		p.add(icon);
		System.out.println(p.toString(true));

	}
}