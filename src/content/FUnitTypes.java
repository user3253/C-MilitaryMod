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
            targetAir = false;
            maxRange = 200;
            engineOffset = 14.0F;
            engineSize = 4f;
            speed = 5f;
            accel = 0.005F;
            drag = 0.01F;
            circleTarget = true;
            hitSize = 75f;
            health = 1000f;
            baseRotateSpeed = 1.5f;
            rotateSpeed = 2.5f;
            armor = 3.5f;
            flying = true;
            targetFlags = new BlockFlag[]{BlockFlag.factory, null};

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
                bullet = new BombBulletType(27f, 25f){{
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
