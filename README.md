# CleanPaper

**CleanPaper** is a stripped-down fork of Paper, with unnecessary features and commands removed for stability and simplicity. Paper is the most widely used, high-performance Minecraft server that aims to fix gameplay and mechanics inconsistencies. The main goal is to remove all optional built-in functionality so that the server can be fully customized through plugins based on your specific needs.

Original [Paper](https://github.com/PaperMC/Paper) by [PaperMC](https://papermc.io). Paper is licensed under the GPLv3 license.

## What was changed / removed:

- Updated server messages;
- Updated server structure;
    - All configurations (`bukkit.yml`, `spigot.yml`, `commands.yml`, `paper-world-defaults.yml`) moved to the `configs/` folder;
    - Player and server data (`ops.json`, `whitelist.json`, bans, name cache) moved to the `data/` folder;
    - Deleted `help.yml` and `version_history.json`;
- Removed bStats analytics;
- Deleted commands with prefixes `paper:`, `spigot:`, `bukkit:`, `minecraft:`;
- Deleted some command aliases;
- And some other minor changes.

## Download & Running

The compiled JAR file can be **downloaded from the [Releases]** section on this GitHub. Requires Java 21 or higher.