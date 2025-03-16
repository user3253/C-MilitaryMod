package cmilitary.content;

import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import mindustry.entities.*;
import mindustry.graphics.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.lineAngle;
import static arc.graphics.g2d.Lines.stroke;
import static arc.math.Angles.*;

public class FFx {

    public static final Rand rand = new Rand();

    public static Effect Fsmoke;

    public static void load() {
        Fsmoke = new Effect(30, 500f, b -> {
            float intensity = 4f;
            b.lifetime = 50f + intensity * 65f;
            Color c = Color.valueOf("E38956FF");
            color(c);
            alpha(0.7f);
            for(int i = 0; i < 4; i++){
                rand.setSeed(b.id*2 + i);
                float lenScl = rand.random(0.4f, 1f);
                int fi = i;
                b.scaled(b.lifetime * lenScl, e -> {
                    randLenVectors(e.id + fi - 1, e.fin(Interp.pow10Out), (int)(2.9f * intensity), 22f * intensity, (x, y, in, out) -> {
                        float fout = e.fout(Interp.pow5Out) * rand.random(0.5f, 1f);
                        float rad = fout * ((2f + intensity) * 2.35f);

                        Fill.circle(e.x + x, e.y + y, rad);
                        Drawf.light(e.x + x, e.y + y, rad * 2.5f, c, 0.5f);
                    });
                });
            }

        });
    };
}
