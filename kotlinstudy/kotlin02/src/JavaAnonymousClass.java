import java.util.Random;

public class JavaAnonymousClass {
    public static void main(String[] args) {
        showOnBoard("ya", new DiscountWords() {
            @Override
            public String getDiscountWords(String goodsName, int hour) {
                int currentYear = 2022;
                return String.format(String.format("%d年，双11%s促销倒计时：%d小时", currentYear, goodsName, hour));
            }
        });
    }

    public interface DiscountWords {
        String getDiscountWords(String goodsName, int hour);
    }

    public static void showOnBoard(String goodsName, DiscountWords discountWords) {
        int hour = new Random().nextInt(24);
        System.out.println(discountWords.getDiscountWords(goodsName, hour));
    }
}
