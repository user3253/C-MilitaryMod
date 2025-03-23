package cmilitary;


import cmilitary.content.FBlocks;
import cmilitary.content.FFx;
import cmilitary.content.FSounds;
import cmilitary.content.FUnitTypes;
import mindustry.mod.*;

public class ModMain extends Mod{

    @Override
    public void loadContent(){
        FFx.load();
        FSounds.load();
        FUnitTypes.load();
        FBlocks.load();
    }

}
