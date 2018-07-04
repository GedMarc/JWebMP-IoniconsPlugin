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

import com.jwebmp.base.references.JavascriptReference;

/**
 * The IonIcons CSS Reference
 *
 * @author GedMarc
 * @since 13 Jan 2017
 */
public class IonIconsJSReference
		extends JavascriptReference
{

	private static final long serialVersionUID = 1L;

	public IonIconsJSReference()
	{
		super("IonIcons", 4.2, "bower_components/Ionicons/docs/ionicons.min.js", "http://code.ionicframework.com/ionicons/4.2.0/ionicons.min.js");
	}
}
