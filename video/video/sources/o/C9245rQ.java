package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9245rQ extends AbstractC9627t0 {
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public final String Y;

    /* renamed from: o.rQ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC5809dQ.c<C9245rQ> {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C9245rQ(@NotNull String str) {
        super(Z);
        this.Y = str;
    }

    public static /* synthetic */ C9245rQ U(C9245rQ c9245rQ, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c9245rQ.Y;
        }
        return c9245rQ.R(str);
    }

    @NotNull
    public final String I() {
        return this.Y;
    }

    @NotNull
    public final C9245rQ R(@NotNull String str) {
        return new C9245rQ(str);
    }

    @NotNull
    public final String V() {
        return this.Y;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C9245rQ) && C6562gT0.g(this.Y, ((C9245rQ) obj).Y)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.Y.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.Y + ')';
    }
}
