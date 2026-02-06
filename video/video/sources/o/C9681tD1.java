package o;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9681tD1 {
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final Random a(@NotNull AbstractC10696xN1 abstractC10696xN1) {
        F2 f2;
        Random r;
        C6562gT0.p(abstractC10696xN1, "<this>");
        if (abstractC10696xN1 instanceof F2) {
            f2 = (F2) abstractC10696xN1;
        } else {
            f2 = null;
        }
        if (f2 != null && (r = f2.r()) != null) {
            return r;
        }
        return new UX0(abstractC10696xN1);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final AbstractC10696xN1 b(@NotNull Random random) {
        UX0 ux0;
        AbstractC10696xN1 a;
        C6562gT0.p(random, "<this>");
        if (random instanceof UX0) {
            ux0 = (UX0) random;
        } else {
            ux0 = null;
        }
        if (ux0 != null && (a = ux0.a()) != null) {
            return a;
        }
        return new C9438sD1(random);
    }

    @XP0
    public static final AbstractC10696xN1 c() {
        return C9195rD1.a.b();
    }

    public static final double d(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }
}
