package F;

import F.content.FFx;
import F.content.FSounds;
import F.content.FUnitTypes;
import mindustry.mod.*;

public class ModMain extends Mod{
    public static Mods.LoadedMod FM;

    public ModMain(){

    }

    @Override
    public void loadContent(){
        FFx.load();
        FSounds.load();
        FUnitTypes.load();

    }

}
