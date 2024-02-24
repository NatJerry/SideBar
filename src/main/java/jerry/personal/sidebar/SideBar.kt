package jerry.personal.sidebar

import org.bukkit.plugin.java.JavaPlugin

class SideBar : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabling...")
        logger.info("Enabled")
    }

    override fun onDisable() {
        logger.info("Disabling")
        logger.info("disabled")
    }
}
