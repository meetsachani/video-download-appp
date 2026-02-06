package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.zx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11321zx2 extends C10835xx2 implements InterfaceC6987iE<C9860tx2>, InterfaceC2796Dv1<C9860tx2> {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final C11321zx2 a1 = new C11321zx2(-1, 0, null);

    /* renamed from: o.zx2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C11321zx2 a() {
            return C11321zx2.a1;
        }

        public a() {
        }
    }

    public /* synthetic */ C11321zx2(long j, long j2, C9516sY c9516sY) {
        this(j, j2);
    }

    public long D() {
        return k();
    }

    public long F() {
        return j();
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ C9860tx2 d() {
        return C9860tx2.g(F());
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(C9860tx2 c9860tx2) {
        return r(c9860tx2.p0());
    }

    @Override // o.C10835xx2
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C11321zx2) {
            if (!isEmpty() || !((C11321zx2) obj).isEmpty()) {
                C11321zx2 c11321zx2 = (C11321zx2) obj;
                if (j() == c11321zx2.j() && k() == c11321zx2.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ C9860tx2 h() {
        return C9860tx2.g(D());
    }

    @Override // o.C10835xx2
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) C9860tx2.n(j() ^ C9860tx2.n(j() >>> 32))) * 31) + ((int) C9860tx2.n(k() ^ C9860tx2.n(k() >>> 32)));
    }

    @Override // o.InterfaceC2796Dv1
    public /* bridge */ /* synthetic */ C9860tx2 i() {
        return C9860tx2.g(w());
    }

    @Override // o.C10835xx2, o.InterfaceC6987iE
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(j() ^ Long.MIN_VALUE, k() ^ Long.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    public boolean r(long j) {
        int compare;
        int compare2;
        compare = Long.compare(j() ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, k() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.C10835xx2
    @NotNull
    public String toString() {
        return ((Object) C9860tx2.j0(j())) + ".." + ((Object) C9860tx2.j0(k()));
    }

    public long w() {
        if (k() != -1) {
            return C9860tx2.n(k() + C9860tx2.n(1 & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public C11321zx2(long j, long j2) {
        super(j, j2, 1L, null);
    }

    @InterfaceC9150r20(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static /* synthetic */ void B() {
    }
}
