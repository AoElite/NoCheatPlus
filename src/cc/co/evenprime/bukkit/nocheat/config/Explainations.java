package cc.co.evenprime.bukkit.nocheat.config;

import java.util.HashMap;
import java.util.Map;
import cc.co.evenprime.bukkit.nocheat.config.util.OptionNode;

/**
 * Textual explainations of options, will be displayed at the end of the
 * config.txt file
 * 
 */
public class Explainations {

    private static final Map<OptionNode, String> explainations = new HashMap<OptionNode, String>();

    static {

        set(Configuration.LOGGING_ACTIVE, "Should NoCheat related messages get logged at all. Some messages may still appear, e.g. error\n messages, even if this option is deactivated");

        set(Configuration.LOGGING_PREFIX, "The short text that appears in front of messages by NoCheat. Color codes are &0-&9 and &A-&F");
        set(Configuration.LOGGING_FILENAME, "Where logs that go to the logfile are stored. You can have different files for different worlds.");
        set(Configuration.LOGGING_LOGTOFILE, "Should messages get logged to the specified logfile?");
        set(Configuration.LOGGING_LOGTOINGAMECHAT, "Should messages get logged to the ingame chat?");
        set(Configuration.LOGGING_LOGTOCONSOLE, "Should messages get logged to the server console?");

        set(Configuration.DEBUG_SHOWACTIVECHECKS, "Print to the console an overview of all checks that are enabled when NoCheat gets loaded.");
        set(Configuration.DEBUG_COMPATIBILITY, "Do some voodoo to fix common mistakes of other plugins which interfere with NoCheat.");

        set(Configuration.INVENTORY_CHECK, "If true, do various checks on Inventory related things.");
        set(Configuration.INVENTORY_DROP_CHECK, "If true, prevent players from dropping too many items in a short timeframe to reduce lag");
        set(Configuration.INVENTORY_DROP_TIMEFRAME, "Over how many seconds should item drops be counted.");
        set(Configuration.INVENTORY_DROP_LIMIT, "How many seperate items should the player be allowed to drop during that timeframe");
        set(Configuration.INVENTORY_DROP_ACTIONS, "What should be done if a player drops more items than that.\nUnit is item drops above the limit.");

        set(Configuration.MOVING_CHECK, "If true, do various checks on PlayerMove events.");
        set(Configuration.MOVING_IDENTIFYCREATIVEMODE, "If true, NoCheat will automatically identify if players are in creative mode and will allow them to fly, avoid fall damage etc.");

        set(Configuration.MOVING_RUNFLY_CHECK, "If true, check if a player is walking/sprinting/sneaking/swimming too fast/high.");
        set(Configuration.MOVING_RUNFLY_WALKINGSPEEDLIMIT, "Set the speed limit for moving horizontal under 'normal' conditions.\nUnit is 1/100 of a block, default is 22.");
        set(Configuration.MOVING_RUNFLY_SPRINTINGSPEEDLIMIT, "Set the speed limit for moving horizontal while sprinting.\nUnit is 1/100 of a block, default is 40.");
        set(Configuration.MOVING_RUNFLY_ALLOWHUNGRYSPRINTING, "Should players with a food level of less than 6 be allowed to use the builtin sprint-function?");
        set(Configuration.MOVING_RUNFLY_JUMPHEIGHT, "Set how high a player is allowed to jump.\nUnit is 1/100 of a block, default is 135.");
        set(Configuration.MOVING_RUNFLY_CHECKSWIMMING, "Use a seperate speed limit for swimming players.");
        set(Configuration.MOVING_RUNFLY_SWIMMINGSPEEDLIMIT, "Set the speed limit for moving horizontal while in water.\nUnit is 1/100 of a block, default is 18");
        set(Configuration.MOVING_RUNFLY_CHECKSNEAKING, "Use a seperate speed limit for sneaking players.");
        set(Configuration.MOVING_RUNFLY_SNEAKINGSPEEDLIMIT, "Set the speed limit for moving horizontal while sneaking.\nUnit is 1/100 of a block, default is 14");
        set(Configuration.MOVING_RUNFLY_ACTIONS, "What should be done if a player moves faster than the speed limit(s) or jumps higher than allowed.\nUnits are in 1/100 of a block above the limit.");

        set(Configuration.MOVING_RUNFLY_CHECKNOFALL, "If true, check if a player is avoiding fall damage by using a nofall hack. EXPERIMENTAL! Feedback is appreciated.");
        set(Configuration.MOVING_RUNFLY_NOFALLMULTIPLIER, "How many percent falldamage should be dealt to the player.\nNoCheat will almost always underestimate fall damage, using a value bigger than 100 is advised.\nUnit is percent of the estimated original fall damage, default is 200.");
        set(Configuration.MOVING_RUNFLY_NOFALLACTIONS, "What should be done if a player is detected as avoiding fall damage.\nUnit is number of blocks the player fell down.");

        set(Configuration.MOVING_RUNFLY_ALLOWLIMITEDFLYING, "If true, instead of doing the above checks for walking/sprinting/swimming/sneaking,\nallow flying and only limit the flying speed.");
        set(Configuration.MOVING_RUNFLY_FLYINGSPEEDLIMITVERTICAL, "Set the speed limit for moving vertical while flying.\nUnit is 1/100 of a block, default is 100.");
        set(Configuration.MOVING_RUNFLY_FLYINGSPEEDLIMITHORIZONTAL, "Set the speed limit for moving horizontal while flying.\nUnit is 1/100 of a block, default is 60.");
        set(Configuration.MOVING_RUNFLY_FLYINGHEIGHTLIMIT, "Set the absolute height limit that a player may go to when flying.\nUnit is number of blocks, default is 500");
        set(Configuration.MOVING_RUNFLY_FLYINGACTIONS, "What should be done if a player flies faster than the speed limit(s). \nUnits are in 1/100 of a block above the speedlimit.");

        set(Configuration.MOVING_MOREPACKETS_CHECK, "If true, check if a player is sending too many 'move-packets' per second. In a normal game, the player won't send more than 22 packets per second.");
        set(Configuration.MOVING_MOREPACKETS_ACTIONS, "What should be done if a player sends more 'move-packets' than normal.\nUnits are packets per second above the limit.");

        set(Configuration.BLOCKBREAK_CHECK, "If true, do various checks on BlockBreak events.");

        set(Configuration.BLOCKBREAK_REACH_CHECK, "If true, check if a player is breaking blocks that are too far away.");
        set(Configuration.BLOCKBREAK_REACH_ACTIONS, "What should be done if a player is breaking blocks that are too far away.\nUnit is number of break(attempt)s beyond the limit.");

        set(Configuration.BLOCKBREAK_DIRECTION_CHECK, "If true, check if a player is looking at the block that he's breaking.");
        set(Configuration.BLOCKBREAK_DIRECTION_CHECKINSTABREAKBLOCKS, "If true, NoCheat will also check for direction for Instant-Breaking blocks.\nTHIS WILL CAUSE FALSE POSITIVES, when a player keeps his mouse button pressed and moves the mouse fast over the screen.");
        set(Configuration.BLOCKBREAK_DIRECTION_PRECISION, "Define how precise a player has to hit blocks when mining. Lower values mean more precision, higher values less precision.");
        set(Configuration.BLOCKBREAK_DIRECTION_PENALTYTIME, "Define how long after a failed attempt to dig a player will be disallowed to break another block. \nUnit is milliseconds, default is 300.");
        set(Configuration.BLOCKBREAK_DIRECTION_ACTIONS, "What should be done if a player is breaking blocks that are not in his line of sight.\nUnit is the combined distance in blocks between where the player looked vs. where the block was.");

        set(Configuration.BLOCKBREAK_NOSWING_CHECK, "If true, check if a player swung his arm before breaking a block, which he should have done.");
        set(Configuration.BLOCKBREAK_NOSWING_ACTIONS, "What should be done if a player didn't swing his arm.\nUnit is number of blockbreaking without armswinging.");

        set(Configuration.BLOCKPLACE_CHECK, "If true, do various checks on BlockPlace events.");

        set(Configuration.BLOCKPLACE_REACH_CHECK, "If true, check if a player is placing blocks at locations too far away.");
        set(Configuration.BLOCKPLACE_REACH_ACTIONS, "What should be done if a player is placing blocks that are too far away.\nUnit is number of place(attempt)s beyond the limit.");

        set(Configuration.BLOCKPLACE_DIRECTION_CHECK, "If true, check if a player is looking at the block that he's placing.");
        set(Configuration.BLOCKPLACE_DIRECTION_PRECISION, "Define how precise a player has to be when placing blocks. Lower values mean more precision, higher values less precision. Default 75.");
        set(Configuration.BLOCKPLACE_DIRECTION_PENALTYTIME, "Define how long after a failed attempt to place blocks a player will be disallowed to place another block. \nUnit is milliseconds, default is 100.");
        set(Configuration.BLOCKPLACE_DIRECTION_ACTIONS, "What should be done if a player is placing blocks that are not in his line of sight.\nUnit is the combined distance in blocks between where the player looked vs. where the block was.");

        set(Configuration.CHAT_CHECK, "If true, do various checks on PlayerChat events.");

        set(Configuration.CHAT_COLOR_CHECK, "If true, check if a message sent by the player contains color codes.");
        set(Configuration.CHAT_COLOR_ACTIONS, "What should be done if a player is trying to send colored messages.\n\"cancel\" means in this case that the color codes get removed from the message.\nUnit is number of colored chat messages sent by the player.");
        set(Configuration.CHAT_SPAM_CHECK, "If true, check if a player is spamming the chat.");
        set(Configuration.CHAT_SPAM_WHITELIST, "A list of messages that should be ignored by the spam check, seperated by ','. All messages/commands starting with one of these will be let through.");
        set(Configuration.CHAT_SPAM_TIMEFRAME, "Over what timeframe (in seconds) should the messages be counted?\nWhen the time is over, counting starts at 0 again.");
        set(Configuration.CHAT_SPAM_LIMIT, "How many messages per timeframe may the player send without it counting as spamming?");
        set(Configuration.CHAT_SPAM_ACTIONS, "What should be done if a player is trying to spam the chat.\nUnit is number of chat messages above the limit you declared above.");

        set(Configuration.FIGHT_CHECK, "If true, do various checks on Events related to fighting.");
        set(Configuration.FIGHT_DIRECTION_CHECK, "If true, check if a player is really looking at enemies that he attacks.");
        set(Configuration.FIGHT_DIRECTION_PRECISION, "Set how precise the check should be. If you experience the check to be too zealous, increase this value. \nIf you want to make it tighter, reduce this value. Default is 100.");
        set(Configuration.FIGHT_DIRECTION_PENALTYTIME, "If a player fails the check, he will be unable to attack for this amount of time (in milliseconds), default is 500.");
        set(Configuration.FIGHT_DIRECTION_ACTIONS, "What should be done if a player attacks entities that are not in his field of view.\nUnit is sqare root of the distance in blocks between where the enemy was and where the player looked.");

        set(Configuration.FIGHT_NOSWING_CHECK, "If true, check if a player swung his arm before attacking, which he should have done.");
        set(Configuration.FIGHT_NOSWING_ACTIONS, "What should be done if a player didn't swing his arm.\nUnit is number of attacks without armswinging.");

    }

    private static void set(OptionNode id, String text) {
        explainations.put(id, text);
    }

    public static String get(OptionNode id) {
        String result = explainations.get(id);

        if(result == null) {
            System.out.println("Missing description for " + id.getName());
            result = "No description available";
        }

        return result;
    }
}
