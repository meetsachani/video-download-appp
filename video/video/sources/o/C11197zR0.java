package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.zR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11197zR0 extends C10711xR0 implements InterfaceC6987iE<Integer>, InterfaceC2796Dv1<Integer> {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final C11197zR0 a1 = new C11197zR0(1, 0);

    /* renamed from: o.zR0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C11197zR0 a() {
            return C11197zR0.a1;
        }

        public a() {
        }
    }

    public C11197zR0(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: B */
    public Integer i() {
        if (k() != Integer.MAX_VALUE) {
            return Integer.valueOf(k() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: F */
    public Integer h() {
        return Integer.valueOf(k());
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: G */
    public Integer d() {
        return Integer.valueOf(j());
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(Integer num) {
        return w(num.intValue());
    }

    @Override // o.C10711xR0
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C11197zR0) {
            if (!isEmpty() || !((C11197zR0) obj).isEmpty()) {
                C11197zR0 c11197zR0 = (C11197zR0) obj;
                if (j() == c11197zR0.j() && k() == c11197zR0.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.C10711xR0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (j() * 31) + k();
    }

    @Override // o.C10711xR0, o.InterfaceC6987iE
    public boolean isEmpty() {
        if (j() > k()) {
            return true;
        }
        return false;
    }

    @Override // o.C10711xR0
    @NotNull
    public String toString() {
        return j() + ".." + k();
    }

    public boolean w(int i) {
        if (j() <= i && i <= k()) {
            return true;
        }
        return false;
    }

    @InterfaceC9150r20(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static /* synthetic */ void D() {
    }
}
