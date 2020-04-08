package chapter_2.design_patterns.builder;

import chapter_2.design_patterns.immutable_objests.Hero;

import java.util.Arrays;
import java.util.List;

public class HeroBuilder {

    private String name;
    private int lvl;
    private List<String> spells;

    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder setLvl(int lvl) {
        this.lvl = lvl;
        return this;
    }

    public HeroBuilder setSpells(List<String> spells) {
        this.spells = spells;
        return this;
    }

    public Hero build() {
        return new Hero(name, lvl, spells);
    }

    public static void main(String[] args) {

        HeroBuilder warriorBuilder = new HeroBuilder();
        warriorBuilder.setName("warrior")
                .setLvl(10)
                .setSpells(Arrays.asList("charge", "execute"));
        Hero warrior = warriorBuilder.build();

        Hero mage = new HeroBuilder()
                .setLvl(15)
                .setSpells(Arrays.asList("frost bolt", "fire ball"))
                .setName("Mage")
                .build();
    }
}

