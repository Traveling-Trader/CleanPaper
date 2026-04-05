package com.destroystokyo.paper;

import com.destroystokyo.paper.util.VersionFetcher;
import io.papermc.paper.ServerBuildInfo;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

import static net.kyori.adventure.text.Component.text;

@DefaultQualifier(NonNull.class)
public class PaperVersionFetcher implements VersionFetcher {
    private static final ServerBuildInfo BUILD_INFO = ServerBuildInfo.buildInfo();

    @Override
    public long getCacheTime() {
        return -1;
    }

    @Override
    public Component getVersionMessage() {
        return Component.empty();
    }

    public static void getUpdateStatusStartupMessage() {
        // Update check disabled
    }
}
