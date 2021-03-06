package world;

import java.util.*;

public class ViewBrotherAI extends PlayerAI {

    public ViewBrotherAI(Creature creature, World world, List<String> messages) {
        super(creature, world, messages);
    }

    @Override
    public void run() {
        onSkill = true;
        allSee = true;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        allSee = false;
        onSkill = false;
    }
}