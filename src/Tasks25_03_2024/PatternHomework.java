package Tasks25_03_2024;

import java.util.ArrayList;
import java.util.List;

// Мною был использован шаблон Facade. На мой взгляд, основным его преимуществом является возможность
// декомпозиции целого на части. Также , если заранее известно, что классы будут иметь похожие методы,
// удобно использовать интерфейс для предварительного создания таких методов.
//
// Фасад (Facade) можно сделать Одиночкой (Singleton), так как обычно нужен только один объект-фасад.
//
// В данном коде описывается начальная атака (пошагово) персонажей фентези-игры.

public class PatternHomework {
    public static void main(String[] args) {
        OpeningOrder.openingPattern();
    }
}

interface Sorcerer {
    void cast(String spellName);

    void usePrePot();

    void summon();

    void burst();
}

class Warlock implements Sorcerer {
    @Override
    public void burst() {
        usePrePot();
        cast("Incinerate.");
        cast("Immolate.");
        cast("Curse of the Elements.");
        summon();
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
    @Override
    public void summon() {
        System.out.println("Warlock is summoning the Doomgurad.");
    }
}

class Priest implements Sorcerer {
    @Override
    public void burst(){
        usePrePot();
        cast("Vampiric Touch.");
        cast("Shadow word: Pain.");
        cast("Berserking.");
        summon();
        cast("Mind Blast.");
        cast("Devour Plague.");
        cast("Mind Flay.");
        cast("Shadow word: Pain."); //(reapplying the empowered one)
        cast("Vampiric Touch."); //(reapplying the empowered one)
        cast("Halo.");
        cast("Mind Flay.");
    }
    @Override
    public void usePrePot() {
        System.out.println("Priest is using prepot.");
    }
    @Override
    public void cast(String spellName) {
        System.out.println("Priest is casting " + spellName);
    }
    @Override
    public void summon() {
        System.out.println("Priest is summoning the Shadow Fiend.");
    }
}

class Shaman implements Sorcerer {
    @Override
    public void burst(){
        usePrePot();
        summon();
        cast("Flameshock.");
        cast("Lightning Bolt.");
        cast("Empowered Weapon.");
        cast("Lava Burst.");
        cast("Ascendance.");
        cast("Lava Burst.");
        cast("Lava Burst.");
    }
    @Override
    public void usePrePot() {
        System.out.println("Shaman is using prepot.");
    }
    @Override
    public void cast(String spellName) {
        System.out.println("Shaman is casting " + spellName);
    }
    @Override
    public void summon() {
        System.out.println("Shaman is summoning the Fire Elemental.");
    }
}

class OpeningOrder {
    private static List<Sorcerer> sorcererList = new ArrayList<>();

    public static void openingPattern() {
        sorcererList.add(new Warlock());
        sorcererList.add(new Priest());
        sorcererList.add(new Shaman());

        sorcererList.forEach(Sorcerer::burst);
    }
}


