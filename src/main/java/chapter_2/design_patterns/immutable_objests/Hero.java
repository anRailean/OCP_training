package chapter_2.design_patterns.immutable_objests;

import java.util.ArrayList;
import java.util.List;

public final class Hero {

    private final String name;
    private final int lvl;
    private final List<String> spells;

    public Hero(String name, int lvl, List<String> spells) {
        this.name = name;
        this.lvl = lvl;

        if (spells == null) {
            throw new RuntimeException("spells are required");
        }
        this.spells = new ArrayList<>(spells);
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public String getSpecificSpell(int index) {
        return spells.get(index);
    }

    public int getAmountOfSpells() {
        return spells.size();
    }
}
