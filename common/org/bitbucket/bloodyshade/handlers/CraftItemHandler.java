/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included lgpl-3.0.txt or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Handler class for the CraftItemHammer/CraftItemExcavator classes, used to create the instances and keep a reference to them
 */

package org.bitbucket.bloodyshade.handlers;

import org.bitbucket.bloodyshade.PowerMining;
import org.bitbucket.bloodyshade.crafting.CraftItemExcavator;
import org.bitbucket.bloodyshade.crafting.CraftItemHammer;
import org.bitbucket.bloodyshade.listeners.CraftItemListener;

public class CraftItemHandler {
	public CraftItemHandler() {};
	public CraftItemHammer HammerClass;
	public CraftItemExcavator ExcavatorClass;
	public CraftItemListener listener;

	public void Init(PowerMining plugin) {
		HammerClass = new CraftItemHammer(plugin);
		ExcavatorClass = new CraftItemExcavator(plugin);
		listener = new CraftItemListener(plugin);
	}

	public CraftItemListener getListener() {
		return listener;
	}
	public CraftItemHammer getHammerClass() {
		return HammerClass;
	}

	public CraftItemExcavator getExcavatorClass() {
		return ExcavatorClass;
	}
}