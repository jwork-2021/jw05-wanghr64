package world;

import java.util.*;

public class HideBrotherAI extends PlayerAI {

    public HideBrotherAI(Creature creature, World world, List<String> messages) {
        super(creature, world, messages);
    }

    @Override
    public void run() {
        this.onSkill = true;
        player.isVisible = false;
        player.setGlyph((char) 150);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        player.isVisible = true;
        player.setGlyph((char) 149);
        this.onSkill = false;
    }
}