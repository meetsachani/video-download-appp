package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.5")
@InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
/* renamed from: o.sx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9617sx2 extends C9132qx2 implements InterfaceC6987iE<C7162ix2>, InterfaceC2796Dv1<C7162ix2> {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final C9617sx2 a1 = new C9617sx2(-1, 0, null);

    /* renamed from: o.sx2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C9617sx2 a() {
            return C9617sx2.a1;
        }

        public a() {
        }
    }

    public /* synthetic */ C9617sx2(int i, int i2, C9516sY c9516sY) {
        this(i, i2);
    }

    public int D() {
        return k();
    }

    public int F() {
        return j();
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ C7162ix2 d() {
        return C7162ix2.g(F());
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(C7162ix2 c7162ix2) {
        return r(c7162ix2.p0());
    }

    @Override // o.C9132qx2
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C9617sx2) {
            if (!isEmpty() || !((C9617sx2) obj).isEmpty()) {
                C9617sx2 c9617sx2 = (C9617sx2) obj;
                if (j() == c9617sx2.j() && k() == c9617sx2.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ C7162ix2 h() {
        return C7162ix2.g(D());
    }

    @Override // o.C9132qx2
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (j() * 31) + k();
    }

    @Override // o.InterfaceC2796Dv1
    public /* bridge */ /* synthetic */ C7162ix2 i() {
        return C7162ix2.g(w());
    }

    @Override // o.C9132qx2, o.InterfaceC6987iE
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(j() ^ Integer.MIN_VALUE, k() ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    public boolean r(int i) {
        int compare;
        int compare2;
        compare = Integer.compare(j() ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, k() ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.C9132qx2
    @NotNull
    public String toString() {
        return ((Object) C7162ix2.j0(j())) + ".." + ((Object) C7162ix2.j0(k()));
    }

    public int w() {
        if (k() != -1) {
            return C7162ix2.n(k() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public C9617sx2(int i, int i2) {
        super(i, i2, 1, null);
    }

    @InterfaceC9150r20(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static /* synthetic */ void B() {
    }
}
