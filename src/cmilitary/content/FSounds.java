package cmilitary.content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import mindustry.Vars;

public class FSounds {
    public static Sound
    open,bomb,bomb2,fall,fall2,B2flying,F117flying;


    protected static Sound loadSound(String fileName) {
        String name = "sounds/" + fileName;
        String path = Vars.tree.get(name + ".ogg").exists() ? name + ".ogg" : name + ".mp3";

        Sound sound = new Sound();

        AssetDescriptor<?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
        desc.errored = Throwable::printStackTrace;

        return sound;
    }

    public static void load(){
        open = loadSound("open");
        bomb = loadSound("bomb");
        bomb2 = loadSound("bomb2");
        fall = loadSound("fall");
        fall2 = loadSound("fall2");
        B2flying = loadSound("B2flying");
        F117flying = loadSound("F117flying");
    }
}
