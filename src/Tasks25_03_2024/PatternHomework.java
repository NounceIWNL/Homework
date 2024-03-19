package Tasks25_03_2024;

import java.util.ArrayList;
import java.util.List;

// Я изменил поля интерфейса и отказался от идеи делать объекты классов анонимными.
// Также теперь присутствует связь между классами посредством методов (методом одного класса вызывается метод другого)
// В данном коде описывается начальная атака (пошагово) персонажей фентези-игры.

public class PatternHomework {
    public static void main(String[] args) {
        OpeningOrder.openingPattern();
    }
}

interface Sorcerer {
    void cast(String spellName);

    void usePrePot();
}

class Warlock implements Sorcerer {
    public void burst() {
        usePrePot();
        cast("Incinerate.");
        cast("Immolate.");
        cast("Curse of the Elements.");
        summonDoomguard();
        cast("Dark Soul.");
        cast("Berserking.");
        cast("Conflagrate.");
        cast("Conflagrate.");
        cast("Immolate."); //(reapplying the empowered one)
        cast("Chaos Bolt.");
        cast("Incinerate.");
        cast("Chaos Bolt.");
        cast("Incinerate.");
        cast("Incinerate.");
        cast("Chaos Bolt.");
    }

    @Override
    public void usePrePot() {
        System.out.println("Warlock is using prepot.");
    }

    @Override
    public void cast(String spellName) {
        System.out.println("Warlock is casting " + spellName);
    }

    public void summonDoomguard() {
        System.out.println("Warlock is summoning the Doomgurad.");
    }

    public void getEmpowered() {
        System.out.println("Tricks of the Trade have been used on Warlock.");
    }

    public void getStormlash() {
        System.out.println("Stormlash has been placed for the Warlock.");
    }
}

class Priest implements Sorcerer {
    public void burst(Shaman shaman) {
        usePrePot();
        cast("Vampiric Touch.");
        cast("Shadow word: Pain.");
        cast("Berserking.");
        summonFiend();
        cast("Mind Blast.");
        cast("Devour Plague.");
        cast("Mind Flay.");
        cast("Shadow word: Pain."); //(reapplying the empowered one)
        cast("Vampiric Touch."); //(reapplying the empowered one)
        cast("Halo.");
        cast("Mind Flay.");
        giveShield(shaman);
    }

    @Override
    public void usePrePot() {
        System.out.println("Priest is using prepot.");
    }

    @Override
    public void cast(String spellName) {
        System.out.println("Priest is casting " + spellName);
    }

    public void summonFiend() {
        System.out.println("Priest is summoning the Shadow Fiend.");
    }

    public void giveShield(Shaman shaman) {
        System.out.println("Priest is giving shield to the Shaman.");
        shaman.getShielded();
    }

    public void getStormlash() {
        System.out.println("Stormlash has been placed for the Priest.");
    }
}

class Shaman implements Sorcerer {
    public void burst(Rogue rogue, Warlock warlock, Priest priest) {
        usePrePot();
        summonElemental();
        cast("Flameshock.");
        cast("Lightning Bolt.");
        useStormlash(warlock, priest);
        cast("Empowered Weapon.");
        cast("Lava Burst.");
        cast("Ascendance.");
        cast("Lava Burst.");
        cast("Lava Burst.");
        surgeHeal(rogue);
    }

    @Override
    public void usePrePot() {
        System.out.println("Shaman is using prepot.");
    }

    @Override
    public void cast(String spellName) {
        System.out.println("Shaman is casting " + spellName);
    }

    public void summonElemental() {
        System.out.println("Shaman is summoning the Fire Elemental.");
    }

    public void getShielded() {
        System.out.println("The shield has been given to the Shaman.");
    }

    public void surgeHeal(Rogue rogue) {
        System.out.println("Shaman is casting surge heal on the Rogue.");
        rogue.getHealed();
    }

    public void useStormlash(Warlock warlock, Priest priest) {
        System.out.println("Shaman is casting surge heal on the Rogue.");
        warlock.getStormlash();
        priest.getStormlash();
    }
}

class Rogue implements Sorcerer {
    public void burst(Warlock warlock) {
        usePrePot();
        cast("Stealth.");
        cast("Slice and Dice.");
        cast("Ambush.");
        cast("Ambush.");
        cast("Eviscerate.");
        empower(warlock);
        cast("Shadow Dance.");
        cast("Shadow Blades.");
        cast("Mark of Death.");
        cast("Eviscerate.");
        cast("Ambush.");
        cast("Ambush.");
        cast("Rapture.");
    }

    @Override
    public void usePrePot() {
        System.out.println("Rogue is using prepot.");
    }

    @Override
    public void cast(String spellName) {
        System.out.println("Rogue is casting " + spellName);
    }
    public void empower(Warlock warlock) {
        System.out.println("Rogue is giving Tricks of the Trade to Warlock.");
        warlock.getEmpowered();
    }
    public void getHealed() {
        System.out.println("Rogue has been healed by the Shaman.");
    }
}

class OpeningOrder {
    private static List<Sorcerer> sorcererList = new ArrayList<>();

    public static void openingPattern() {
        Rogue rogue = new Rogue();
        Warlock warlock = new Warlock();
        Shaman shaman = new Shaman();
        Priest priest = new Priest();

        warlock.burst();
        rogue.burst(warlock);
        shaman.burst(rogue, warlock, priest);
        priest.burst(shaman);
    }
}


