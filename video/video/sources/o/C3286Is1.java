package o;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: o.Is1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3286Is1 {
    public static final int a = 10000;

    public static void a(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal b(String str) throws NumberFormatException {
        a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    public static BigInteger c(String str) throws NumberFormatException {
        a(str);
        return new BigInteger(str);
    }
}
