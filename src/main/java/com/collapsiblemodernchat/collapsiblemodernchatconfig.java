package com.collapsiblemodernchat;

import net.runelite.client.config.*;

@ConfigGroup("collapsiblechat")
public interface collapsiblemodernchatconfig extends Config
{

	
	
	@ConfigItem(
			keyName = "Set Chat Bar To Top Of Chat",
			name = "Set Chat Bar To Top Of Chat",
			description = "sets chat buttons to be at the top of the widget",
			position = 5
	)
	default boolean TopChatBarset()
	{
		return false;
	}
	@ConfigItem(
			keyName = "Mirror Collapsible Icon",
			name = "Mirror Collapsible Icon",
			description = "flips collapsible icon look for customization",
			position = 4
	)
	default boolean FlipCollIcon()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hide minimap",
			name = "Hide Minimap With Chat",
			description = "sets minimap to hidden",
			position = 2
	)
	default boolean HideMiniMapOnChat()
	{
		return false;
	}

	enum MinimapHidingTask {
		DEFAULT("Open Chat"),
		FLIPPED("Closed Chat");

		private final String displayName;

		MinimapHidingTask(String displayName) {
			this.displayName = displayName;
		}

		@Override
		public String toString() {
			return displayName;
		}
	}

	@ConfigItem(
			keyName = "Hide Minimap With",
			name = "Hide Minimap With",
			description = "Select the style for hiding minimap",
			position = 3
	)
	default MinimapHidingTask MinimapHidingTask() {
		return MinimapHidingTask.DEFAULT;
	}

	@ConfigItem(
			keyName = "hide minimap X",
			name = "Hide Minimap 'X'",
			description = "sets minimap 'X' to hidden",
			position = 1
	)
	default boolean HideMiniMapX()
	{
		return false;
	}


	@ConfigItem(
			keyName = "swap all with report",
			name = "Swap All With Report",
			description = "swaps the all button with the report button",
			position = 7
	)
	default boolean MirrorChatBarButtons()
	{
		return false;
	}
	@ConfigItem(
			keyName = "set collapsible icon to the right",
			name = "Set Collapsible Icon To Right",
			description = "sets the collapsible icon to the right of widget",
			position = 6
	)
	default boolean SetCollToRight()
	{
		return false;
	}

/*
	@ConfigItem(
			keyName = "Width Of Chat Widget:",
			name = "Width Of Chat Widget:",
			description = "value for widget width and button offset"
	)
	default String NewChatWidth()
	{
		return "";
	}

 */

	/*
	@ConfigItem(
			keyName = "set logout 'x' to hidden",
			name = "Set Minimap Logout To Hidden",
			description = "sets logout 'x' to hidden"
	)
	default boolean HideLogout()
	{
		return false;
	}

	 */

}
