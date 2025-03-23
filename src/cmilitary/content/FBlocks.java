package cmilitary.content;

import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;

public class FBlocks {
    public static Block
            leadWall,
            militaryFactory;

    public static void load(){
        leadWall = new Wall("lead-wall"){{
            requirements(Category.defense,with(Items.lead,500,Items.plastanium,100));
            size = 2;
            health = 6450;
            absorbLasers = true;
            buildCostMultiplier = 4;
        }};

        militaryFactory = new UnitFactory("military-factory"){{
            requirements(Category.units,with(Items.titanium,5000,Items.surgeAlloy,2000,Items.plastanium,3000));
            health = 10000;
            size = 16;
            consumePower(180);
            consumeLiquid(Liquids.cryofluid,6f);
            plans = Seq.with(
                    new UnitPlan(FUnitTypes.B2,60 * 240,with(Items.plastanium,5000,Items.surgeAlloy,8000))
            );
        }};
    };
}
