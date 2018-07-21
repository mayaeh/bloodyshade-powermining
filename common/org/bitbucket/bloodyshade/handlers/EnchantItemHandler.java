/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included lgpl-3.0.txt or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * Handler class for the EnchantItemEvent Listener, used to create the listener and keep a reference to it
 */

package org.bitbucket.bloodyshade.handlers;

import org.bitbucket.bloodyshade.PowerMining;
import org.bitbucket.bloodyshade.listeners.EnchantItemListener;

public class EnchantItemHandler {
	public EnchantItemHandler() {};
	public EnchantItemListener listener;

	public void Init(PowerMining plugin) {
		listener = new EnchantItemListener(plugin);
	}

	public EnchantItemListener getListener() {
		return listener;
	}
}
