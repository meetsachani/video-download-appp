package o;

import java.util.Arrays;
import o.AbstractC10668xG1;

/* renamed from: o.yG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10911yG1 {
    public static final AbstractC10668xG1 a(AbstractC10668xG1.b<?>... bVarArr) {
        C6562gT0.p(bVarArr, "pairs");
        return c((AbstractC10668xG1.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final AbstractC10668xG1 b() {
        return new C2972Fn1(null, true, 1, null);
    }

    public static final C2972Fn1 c(AbstractC10668xG1.b<?>... bVarArr) {
        C6562gT0.p(bVarArr, "pairs");
        C2972Fn1 c2972Fn1 = new C2972Fn1(null, false, 1, null);
        c2972Fn1.m((AbstractC10668xG1.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return c2972Fn1;
    }
}
