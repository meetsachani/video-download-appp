package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import o.AD1;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class AM extends C2168p5 {
    public static byte[] A00;
    public static String[] A01 = {"IiHFHpE70aCOc94efxOlf2iC0Ng8zMr5", "b3mzaytlZJgoRVhs4UINeaUr6S0G0E41", "6IHqdrhMw9UxFnoc7iMNxZeDC0DTO0yB", "go0dTVggBQ2s7heaJCrnqGQgIh6JhPx1", "bkC24C7HhnNqTiNutYzB4zMXotuBenI", "te5qRCwogDd297VgLok2fv8nwYFOdDR1", "xjDDw5bsf4CogqtV7hhNk6k9HWMs2JIA", "oLDdWjUmHvVvISH87gP40QDZoo9t6EZz"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].charAt(11) != 'O') {
                throw new RuntimeException();
            }
            A01[2] = "31sOmOCDO5yq31NNiMqquOfpDH8J50WI";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{96, 79, 70, 66, 81, 87, 70, 91, 87, 3, 107, 119, 119, 115, 3, 87, 81, 66, 69, 69, 74, 64, 3, 77, 76, 87, 3, 83, 70, 81, 78, 74, 87, 87, 70, 71, 13, 3, 112, 70, 70, 3, 75, 87, 87, 83, 80, C8077mf.C, C8077mf.n, C8077mf.n, 71, 70, 85, 70, 79, 76, 83, 70, 81, 13, 66, 77, 71, 81, 76, 74, 71, 13, 64, 76, 78, C8077mf.n, 68, 86, 74, 71, 70, C8077mf.n, 87, 76, 83, 74, 64, 80, C8077mf.n, 78, 70, 71, 74, 66, C8077mf.n, 74, 80, 80, 86, 70, 80, C8077mf.n, 64, 79, 70, 66, 81, 87, 70, 91, 87, C8077mf.p, 77, 76, 87, C8077mf.p, 83, 70, 81, 78, 74, 87, 87, 70, 71};
    }

    static {
        A02();
    }

    public AM(IOException iOException, C04905i c04905i) {
        super(A01(0, 121, 4), iOException, c04905i, AD1.j1, 1);
    }
}
