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

import com.jwebmp.Page;
import com.jwebmp.guicedinjection.GuiceContext;
import com.jwebmp.plugins.ComponentInformation;
import net.sf.uadetector.OperatingSystemFamily;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * A list of all the ion icons that are available
 *
 * @author GedMarc
 * @since 26 Feb 2017
 */
@ComponentInformation(name = "ion-icons ",
		description = "Enumeration list for ion icons",
		url = "http://ionicons.com/cheatsheet.html")
public enum IonIcons
{
	add_circle,
	add_circle_outline,
	airplane,
	alarm,
	albums,
	alert,
	american_football,
	analytics,
	aperture,
	apps,
	appstore,
	archive,
	arrow_back,
	arrow_down,
	arrow_dropdown,
	arrow_dropdown_circle,
	arrow_dropleft,
	arrow_dropleft_circle,
	arrow_dropright,
	arrow_dropright_circle,
	arrow_dropup,
	arrow_dropup_circle,
	arrow_forward,
	arrow_round_back,
	arrow_round_down,
	arrow_round_forward,
	arrow_round_up,
	arrow_up,
	at,
	attach,
	backspace,
	barcode,
	baseball,
	basket,
	basketball,
	battery_charging,
	battery_dead,
	battery_full,
	beaker,
	bed,
	beer,
	bicycle,
	bluetooth,
	boat,
	body,
	bonfire,
	book,
	bookmark,
	bookmarks,
	bowtie,
	briefcase,
	browsers,
	brush,
	bug,
	build,
	bulb,
	bus,
	business,
	cafe,
	calculator,
	calendar,
	call,
	camera,
	car,
	card,
	cart,
	cash,
	cellular,
	chatboxes,
	chatbubbles,
	checkbox,
	checkbox_outline,
	checkmark,
	checkmark_circle,
	checkmark_circle_outline,
	clipboard,
	clock,
	close,
	close_circle,
	close_circle_outline,
	cloud,
	cloud_circle,
	cloud_done,
	cloud_download,
	cloud_outline,
	cloud_upload,
	cloudy,
	cloudy_night,
	code,
	code_download,
	code_working,
	cog,
	color_fill,
	color_filter,
	color_palette,
	color_wand,
	compass,
	construct,
	contact,
	contacts,
	contract,
	contrast,
	copy,
	create,
	crop,
	cube,
	cut,
	desktop,
	disc,
	document,
	done_all,
	download,
	easel,
	egg,
	exit,
	expand,
	eye,
	eye_off,
	fastforward,
	female,
	filing,
	film,
	finger_print,
	fitness,
	flag,
	flame,
	flash,
	flash_off,
	flashlight,
	flask,
	flower,
	folder,
	folder_open,
	football,
	funnel,
	gift,
	git_branch,
	git_commit,
	git_compare,
	git_merge,
	git_network,
	git_pull_request,
	glasses,
	globe,
	grid,
	hammer,
	hand,
	happy,
	headset,
	heart,
	heart_dislike,
	heart_empty,
	heart_half,
	help,
	help_buoy,
	help_circle,
	help_circle_outline,
	home,
	hourglass,
	ice_cream,
	image,
	images,
	infinite,
	information,
	information_circle,
	information_circle_outline,
	jet,
	journal,
	key,
	keypad,
	laptop,
	leaf,
	link,
	list,
	list_box,
	locate,
	lock,
	log_in,
	log_out,
	magnet,
	mail,
	mail_open,
	mail_unread,
	male,
	man,
	map,
	medal,
	medical,
	medkit,
	megaphone,
	menu,
	mic,
	mic_off,
	microphone,
	moon,
	more,
	move,
	musical_note,
	musical_notes,
	navigate,
	notifications,
	notifications_off,
	notifications_outline,
	nuclear,
	nutrition,
	open,
	options,
	outlet,
	paper,
	paper_plane,
	partly_sunny,
	pause,
	paw,
	people,
	person,
	person_add,
	phone_landscape,
	phone_portrait,
	photos,
	pie,
	pin,
	pint,
	pizza,
	planet,
	play,
	play_circle,
	podium,
	power,
	pricetag,
	pricetags,
	print,
	pulse,
	qr_scanner,
	quote,
	radio,
	radio_button_off,
	radio_button_on,
	rainy,
	recording,
	redo,
	refresh,
	refresh_circle,
	remove,
	remove_circle,
	remove_circle_outline,
	reorder,
	repeat,
	resize,
	restaurant,
	return_left,
	return_right,
	reverse_camera,
	rewind,
	ribbon,
	rocket,
	rose,
	sad,
	save,
	school,
	search,
	send,
	settings,
	share,
	share_alt,
	shirt,
	shuffle,
	skip_backward,
	skip_forward,
	snow,
	speedometer,
	square,
	square_outline,
	star,
	star_half,
	star_outline,
	stats,
	stopwatch,
	subway,
	sunny,
	swap,
	$switch,
	sync,
	tablet_landscape,
	tablet_portrait,
	tennisball,
	text,
	thermometer,
	thumbs_down,
	thumbs_up,
	thunderstorm,
	time,
	timer,
	today,
	train,
	transgender,
	trash,
	trending_down,
	trending_up,
	trophy,
	tv,
	umbrella,
	undo,
	unlock,
	videocam,
	volume_high,
	volume_low,
	volume_mute,
	volume_off,
	walk,
	wallet,
	warning,
	watch,
	water,
	wifi,
	wine,
	woman,;

	IonIcons()
	{

	}

	@Override
	public String toString()
	{
		String cleaned = name().replace(CHAR_UNDERSCORE, CHAR_DASH)
		                       .replace("\\$", "");
		if (IonIconsPageConfigurator.isAutoSwitchForIOS())
		{
			Page p = GuiceContext.get(Page.class);
			if (p.getUserAgent()
			     .getOperatingSystem()
			     .getFamily() == OperatingSystemFamily.IOS)
			{
				cleaned = "ion ion-ios-" + cleaned;
			}
			else
			{
				cleaned = "ion ion-md-" + cleaned;
			}
		}
		return cleaned;
	}

}
