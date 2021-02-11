package ir.yzn.bw;

import cn.nukkit.event.Listener;

public class EvEnTs implements Listener {
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
    switch (command.getName().toLowerCase()){
      case "bw" :
        sender.sendMessage("++--//{ EggWars-NK }\\--++");
        sender.sendMessage("join : /ew join");
        sender.sendMessage("leave : /ew leave");
        sender.sendMessage("create : /ew create");
        sender.sendMessage("list : /ew list");
  }
    
}
