package lesson10;

public enum Length {
    МИЛЛИМЕТРЫ(1), САНТИМЕТРЫ(2), ДЕЦИМЕТРЫ(3), МЕТРЫ(4), КИЛОМЕТРЫ(5), NOSELECT(6);

    private int index;

    Length(int index) {
        this.index = index;
    }

    public static Length proverka(int index) {
        for (Length length : values()) {
            if (length.index == index) {
                return length;
            }
        }
        return Length.NOSELECT;
    }
}
