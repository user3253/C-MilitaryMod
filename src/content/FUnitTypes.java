package content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BombBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.world.meta.BlockFlag;

public class FUnitTypes {
    public static UnitType B2;

    public static void load(){
        B2 = new UnitType("B2"){{
            constructor = UnitEntity::create;
            health = 340;
            speed = 1.65f;
            accel = 0.01f;
            drag = 0.005f;
            flying = true;
            hitSize = 75f;
            targetAir = false;
            engineOffset = 7.8f;
            range = 140f;
            faceTarget = false;
            armor = 3f;
            itemCapacity = 0;
            targetFlags = new BlockFlag[]{BlockFlag.factory, null};
            circleTarget = true;
            ammoType = new ItemAmmoType(Items.graphite);

            weapons.add(new Weapon(){{
                    minShootVelocity = 0.75f;
                    x = 3f;
                    shootY = 0f;
                    reload = 12f;
                    shootCone = 180f;
                    ejectEffect = Fx.none;
                    inaccuracy = 15f;
                    ignoreRotation = true;
                    shootSound = Sounds.none;
                    bullet = new BombBulletType(27f, 25f) {{
                        width = 10f;
                        height = 14f;
                        hitEffect = Fx.flakExplosion;
                        shootEffect = Fx.none;
                        smokeEffect = Fx.none;

                        status = StatusEffects.blasted;
                        statusDuration = 60f;
                        damage = splashDamage * 0.5f;
                    }};
            }});
        }};

    };
}
