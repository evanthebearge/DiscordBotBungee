package de.staticred.discordbot.util;

import de.staticred.discordbot.DBVerifier;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class Debugger {

    public static void debugMessage(String string) {
        System.out.println("[DBVerifier] [DEBUG] " + string);
        for(ProxiedPlayer player : ProxyServer.getInstance().getPlayers()) {
            if(player.hasPermission("db.debug")) {
                if(DBVerifier.getInstance().debugMode) {
                    player.sendMessage(new TextComponent("§8[§aDBVerifier§8] [§aDEBUG§8] §r" + string));
                }
            }
        }
    }
}
