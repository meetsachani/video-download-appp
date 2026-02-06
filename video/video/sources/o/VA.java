package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class VA extends TA implements InterfaceC6987iE<Character>, InterfaceC2796Dv1<Character> {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final VA a1 = new VA(1, 0);

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final VA a() {
            return VA.a1;
        }

        public a() {
        }
    }

    public VA(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // o.InterfaceC2796Dv1
    @NotNull
    /* renamed from: B */
    public Character i() {
        if (k() != 65535) {
            return Character.valueOf((char) (k() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: F */
    public Character h() {
        return Character.valueOf(k());
    }

    @Override // o.InterfaceC6987iE
    @NotNull
    /* renamed from: G */
    public Character d() {
        return Character.valueOf(j());
    }

    @Override // o.InterfaceC6987iE
    public /* bridge */ /* synthetic */ boolean e(Character ch) {
        return w(ch.charValue());
    }

    @Override // o.TA
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof VA) {
            if (!isEmpty() || !((VA) obj).isEmpty()) {
                VA va = (VA) obj;
                if (j() == va.j() && k() == va.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o.TA
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (j() * VN2.b) + k();
    }

    @Override // o.TA, o.InterfaceC6987iE
    public boolean isEmpty() {
        if (C6562gT0.t(j(), k()) > 0) {
            return true;
        }
        return false;
    }

    @Override // o.TA
    @NotNull
    public String toString() {
        return j() + ".." + k();
    }

    public boolean w(char c) {
        if (C6562gT0.t(j(), c) <= 0 && C6562gT0.t(c, k()) <= 0) {
            return true;
        }
        return false;
    }

    @InterfaceC9150r20(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC6480g82(version = "1.9")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static /* synthetic */ void D() {
    }
}
