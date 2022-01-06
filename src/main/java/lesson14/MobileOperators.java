package lesson14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public enum MobileOperators {
    MEGAFON(List.of("920", "922", "927")),
    MTS(List.of("912", "917", "919")),
    BEELINE(List.of("903", "905", "906", "909")),
    YOTA(List.of("996", "999"));

    static {
        CODES = Arrays.stream(values()).map(MobileOperators::getPhoneCodes).flatMap(List::stream).collect(Collectors.toList());
    }

    private static final List<String> CODES;

    private final List<String> phoneCodes;

    MobileOperators(List<String> phoneCodes) {
        this.phoneCodes = phoneCodes;
    }

    public List<String> getPhoneCodes() {
        return phoneCodes;
    }

    public static String generateCode() {
        return CODES.get(new Random().nextInt(CODES.size()));
    }
}
