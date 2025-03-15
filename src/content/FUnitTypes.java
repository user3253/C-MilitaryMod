package content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.bullet.BasicBulletType;
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
            targetable = false;
            health = 12000;
            speed = 3f;
            rotateSpeed = 1f;
            accel = 0.005f;
            drag = 0.002f;
            loopSound = FSounds.B2flying;
            flying = true;
            hitSize = 75f;
            targetAir = false;
            faceTarget = false;
            range = 140f;
            itemCapacity = 0;
            circleTarget = true;
            targetFlags = new BlockFlag[]{BlockFlag.factory, null};
            ammoType = new ItemAmmoType(Items.graphite);
            setEnginesMirror(
                    new UnitEngine(12.5f,-20f,5,62)
            );
            weapons.add(
                    new Weapon(){{
                        x = 9f;
                        mirror = true;
                        alternate = false;
                        reload = 200f;
                        shoot.shots = 20;
                        shoot.shotDelay = 15f;
                        soundPitchMin = 1f;
                        shootSound = FSounds.fall;
                        bullet = new BasicBulletType(){{
                            sprite = "military-B2missile";
                            backColor = frontColor = Color.white;
                            width = height = 45f;
                            ammoMultiplier = 2;
                            maxRange = 30f;
                            ignoreRotation = true;
                            hitSound = FSounds.bomb;
                            shootCone = 180f;
                            hitShake = 10f;
                            collidesAir = false;
                            lifetime = 70f;
                            despawnEffect = FFx.Fsmoke;
                            keepVelocity = false;
                            shrinkX = shrinkY = 0.7f;
                            speed = 0.2f;
                            collides = false;
                            makeFire = true;
                            incendAmount = 75;
                            incendSpread = 45;
                            splashDamage = 800f;
                            splashDamageRadius = 80f;
                            damage = 1500f;
                        }};
                    }}
            );
        }};

    };
}
