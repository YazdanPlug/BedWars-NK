package ir.yzn.bw;

import ir.yzn.bw.EvEnTs;
import cn.nukkit.plugin.PluginBase;

public class BedWars extends PluginBase {
  @Override
  public void onEnable(){
    this.getLogger().info("Enabled BedWars plugin on Nukkit by YazdanPlug");
    PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new EvEnTs(), this);
  }
}
