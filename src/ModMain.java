import content.FFx;
import content.FSounds;
import content.FUnitTypes;
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
