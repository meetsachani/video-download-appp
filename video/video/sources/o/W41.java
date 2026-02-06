package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class W41 extends U41 implements InterfaceC6987iE<Long>, InterfaceC2796Dv1<Long> {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final W41 a1 = new W41(1, 0);

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final W41 a() {
            return W41.a1;
        }

        public a() {
        }
    }

    public W41(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: B */
    public Long i() {
        if (k() != Long.MAX_VALUE) {
            return Long.valueOf(k() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: F */
    public Long h() {
        return Long.valueOf(k());
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: G */
    public Long d() {
        return Long.valueOf(j());
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(Long l) {
        return w(l.longValue());
    }

    @Override // o.U41
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof W41) {
            if (!isEmpty() || !((W41) obj).isEmpty()) {
                W41 w41 = (W41) obj;
                if (j() == w41.j() && k() == w41.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.U41
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (j() ^ (j() >>> 32))) + (k() ^ (k() >>> 32)));
    }

    @Override // o.U41, o.InterfaceC6987iE
    public boolean isEmpty() {
        if (j() > k()) {
            return true;
        }
        return false;
    }

    @Override // o.U41
    @NotNull
    public String toString() {
        return j() + ".." + k();
    }

    public boolean w(long j) {
        if (j() <= j && j <= k()) {
            return true;
        }
        return false;
    }

    @InterfaceC9150r20(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static /* synthetic */ void D() {
    }
}
