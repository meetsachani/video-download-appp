package o;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final /* synthetic */ class LS2 {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}
