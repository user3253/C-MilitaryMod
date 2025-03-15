package F.content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import mindustry.Vars;

public class FSounds {
    public static Sound
    open,bomb,fall,B2flying;


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
        fall = loadSound("fall");
        B2flying = loadSound("B2flying");
    }
}
