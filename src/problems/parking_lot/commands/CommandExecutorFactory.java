package problems.parking_lot.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {

    Map<Commands, CommandExecutor>  mp = new HashMap();

    public CommandExecutor getExecutor(Commands commands){
        return mp.get(commands);
    }

    public void addCommand(Commands commands, CommandExecutor commandExecutor){
        mp.put(commands, commandExecutor);
    }
}
