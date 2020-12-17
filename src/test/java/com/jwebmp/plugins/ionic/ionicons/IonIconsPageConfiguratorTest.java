package com.jwebmp.plugins.ionic.ionicons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.DivSimple;
import org.junit.jupiter.api.Test;

public class IonIconsPageConfiguratorTest
{
	@Test
	public void test()
	{
		Page<?> p = new Page();
		IonIcon icon = new IonIcon(IonIcons.radio);
		p.add(new DivSimple<>().add(icon));
		System.out.println(p.toString(true));

	}
}