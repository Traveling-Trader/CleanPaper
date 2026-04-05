# CleanPaper

**CleanPaper** is a stripped-down fork of Paper, with unnecessary features and commands removed for stability and simplicity. Paper is the most widely used, high-performance Minecraft server that aims to fix gameplay and mechanics inconsistencies. The main goal is to remove all optional built-in functionality so that the server can be fully customized through plugins based on your specific needs.

Original [Paper](https://github.com/PaperMC/Paper) by [PaperMC](https://papermc.io). Paper is licensed under the GPLv3 license.

**You can use my project [CleanVelocity](https://github.com/Traveling-Trader/CleanVelocity) as a proxy server for your CleanPaper.**

## What was changed / removed:

- Updated files structure:
    - All configurations files(`bukkit.yml`, `commands.yml`, `eula.txt`, `help.yml`, `paper-global.yml`, `paper-world-defaults.yml`, `permissions.yml`, `server.properties`, `spigot.yml`) moved to the `configs/` folder;
    - All data files(`banned-ips.json`, `banned-players.json`, `ops.json`, `usercache.json`, `whitelist.json`) moved to the `data/` folder;
    - Deleted `version_history.json`;
- Deleted bStats analytics;
- Removed server offline-mode message;
- Removed commands aliases;
- And some other minor changes.

## Download & Running

The compiled JAR file can be **downloaded from the [Releases](https://github.com/Traveling-Trader/CleanPaper/releases)** section on this GitHub. Requires Java 25 or higher.