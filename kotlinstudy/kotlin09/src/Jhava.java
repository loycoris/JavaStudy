import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

import java.io.IOException;

public class Jhava {
    private int hitPoints = 3232330;

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());


        Spellbook spellbook = new Spellbook();
        //常规写法
//        spellbook.getSpells();
        for (String spell : spellbook.spells) {
            System.out.println(spell);
        }

        //kt函数使用了@JvmOverloads注解，java才可以支持重载
        Hero.handOverFood("apple");

        //伴生对象使用
//        spellbook.Companion.getMAX_SPELL_COUNT();
        //使用了JvmField注解之后
        System.out.println(spellbook.MAX_SPELL_COUNT);
        spellbook.getSpellbookGreeting();

        //抛出异常
        /*try {
            //强制在编译期进行处理
            new Jhava().extendHandInFriendship();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            Hero.acceptApology();
        } catch (IOException e) {
            //添加@Throws(IOException::class)注解后才能捕获异常
            System.out.println("Caught!");
        }

        Function1<String, Unit> translator = Hero.getTranslator();
        translator.invoke("TRUCE");
    }

    @NotNull
    public String utterGreeting() {
        return "HELLO";
    }

    @Nullable
    public String determineFriendshipLevel() {
        return null;
    }

    public int getHitPoints() {
        System.out.println("-----get hitPoints-------");
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        System.out.println("-----set hitPoints-------");
        this.hitPoints = hitPoints;
    }

    public void extendHandInFriendship() throws IOException {
        throw new IOException();
    }
}
