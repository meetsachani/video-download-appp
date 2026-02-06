package o;

import java.math.BigDecimal;
import java.math.RoundingMode;

@InterfaceC11149zF0
@InterfaceC8058ma0
/* renamed from: o.dn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5895dn {

    /* renamed from: o.dn$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC3569Lp2<BigDecimal> {
        public static final a a = new a();

        @Override // o.AbstractC3569Lp2
        /* renamed from: f */
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: g */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: h */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: i */
        public BigDecimal e(double d, RoundingMode roundingMode) {
            return new BigDecimal(d);
        }
    }

    public static double a(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return a.a.b(bigDecimal, roundingMode);
    }
}
