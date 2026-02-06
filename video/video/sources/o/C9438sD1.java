package o;

import java.io.Serializable;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.sD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9438sD1 extends F2 implements Serializable {
    @NotNull
    public static final a Y0 = new a(null);
    private static final long serialVersionUID = 0;
    @NotNull
    public final Random Z;

    /* renamed from: o.sD1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C9438sD1(@NotNull Random random) {
        C6562gT0.p(random, "impl");
        this.Z = random;
    }

    @Override // o.F2
    @NotNull
    public Random r() {
        return this.Z;
    }
}
