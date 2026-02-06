package o;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.in0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7121in0 extends F2 {
    @NotNull
    public final a Z = new a();

    /* renamed from: o.in0$a */
    /* loaded from: classes3.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // o.F2
    @NotNull
    public Random r() {
        Random random = this.Z.get();
        C6562gT0.o(random, "get(...)");
        return random;
    }
}
