package o;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.4")
/* loaded from: classes3.dex */
public final class Mv2 implements XW0 {
    @NotNull
    public static final a Z0 = new a(null);
    public static final int a1 = 1;
    public static final int b1 = 2;
    public static final int c1 = 4;
    @NotNull
    public final DW0 X;
    @NotNull
    public final List<C5107aX0> Y;
    public final int Y0;
    @Nullable
    public final XW0 Z;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5350bX0.values().length];
            try {
                iArr[EnumC5350bX0.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5350bX0.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5350bX0.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @InterfaceC6480g82(version = "1.6")
    public Mv2(@NotNull DW0 dw0, @NotNull List<C5107aX0> list, @Nullable XW0 xw0, int i) {
        C6562gT0.p(dw0, "classifier");
        C6562gT0.p(list, androidx.fragment.app.h.m);
        this.X = dw0;
        this.Y = list;
        this.Z = xw0;
        this.Y0 = i;
    }

    public static final CharSequence s(Mv2 mv2, C5107aX0 c5107aX0) {
        C6562gT0.p(c5107aX0, "it");
        return mv2.j(c5107aX0);
    }

    @Nullable
    public final XW0 B() {
        return this.Z;
    }

    @Override // o.XW0
    @NotNull
    public DW0 E() {
        return this.X;
    }

    @Override // o.XW0
    @NotNull
    public List<C5107aX0> Z() {
        return this.Y;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Mv2) {
            Mv2 mv2 = (Mv2) obj;
            if (C6562gT0.g(E(), mv2.E()) && C6562gT0.g(Z(), mv2.Z()) && C6562gT0.g(this.Z, mv2.Z) && this.Y0 == mv2.Y0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.InterfaceC10972yW0
    @NotNull
    public List<Annotation> getAnnotations() {
        return C8222nF.H();
    }

    public int hashCode() {
        return (((E().hashCode() * 31) + Z().hashCode()) * 31) + Integer.hashCode(this.Y0);
    }

    public final String j(C5107aX0 c5107aX0) {
        Mv2 mv2;
        String valueOf;
        int i;
        if (c5107aX0.h() == null) {
            return "*";
        }
        XW0 g = c5107aX0.g();
        if (g instanceof Mv2) {
            mv2 = (Mv2) g;
        } else {
            mv2 = null;
        }
        if (mv2 == null || (valueOf = mv2.r(true)) == null) {
            valueOf = String.valueOf(c5107aX0.g());
        }
        EnumC5350bX0 h = c5107aX0.h();
        if (h == null) {
            i = -1;
        } else {
            i = b.a[h.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "out " + valueOf;
                }
                throw new C3865Oq1();
            }
            return "in " + valueOf;
        }
        return valueOf;
    }

    @Override // o.XW0
    public boolean m() {
        if ((this.Y0 & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String r(boolean z) {
        AW0 aw0;
        String name;
        String p3;
        DW0 E = E();
        Class<?> cls = null;
        if (E instanceof AW0) {
            aw0 = (AW0) E;
        } else {
            aw0 = null;
        }
        if (aw0 != null) {
            cls = C6074eW0.e(aw0);
        }
        if (cls == null) {
            name = E().toString();
        } else if ((this.Y0 & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            name = v(cls);
        } else if (z && cls.isPrimitive()) {
            DW0 E2 = E();
            C6562gT0.n(E2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C6074eW0.g((AW0) E2).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (Z().isEmpty()) {
            p3 = "";
        } else {
            p3 = C10662xF.p3(Z(), C6566gU0.h, "<", ">", 0, null, new HA0() { // from class: o.Lv2
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    CharSequence s;
                    s = Mv2.s(Mv2.this, (C5107aX0) obj);
                    return s;
                }
            }, 24, null);
        }
        if (m()) {
            str = "?";
        }
        String str2 = name + p3 + str;
        XW0 xw0 = this.Z;
        if (xw0 instanceof Mv2) {
            String r = ((Mv2) xw0).r(true);
            if (!C6562gT0.g(r, str2)) {
                if (C6562gT0.g(r, str2 + '?')) {
                    return str2 + '!';
                }
                return '(' + str2 + ".." + r + ')';
            }
            return str2;
        }
        return str2;
    }

    @NotNull
    public String toString() {
        return r(false) + C6551gQ1.b;
    }

    public final String v(Class<?> cls) {
        if (C6562gT0.g(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (C6562gT0.g(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (C6562gT0.g(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (C6562gT0.g(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (C6562gT0.g(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (C6562gT0.g(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (C6562gT0.g(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        if (C6562gT0.g(cls, double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    public final int x() {
        return this.Y0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mv2(@NotNull DW0 dw0, @NotNull List<C5107aX0> list, boolean z) {
        this(dw0, list, null, z ? 1 : 0);
        C6562gT0.p(dw0, "classifier");
        C6562gT0.p(list, androidx.fragment.app.h.m);
    }

    @InterfaceC6480g82(version = "1.6")
    public static /* synthetic */ void C() {
    }

    @InterfaceC6480g82(version = "1.6")
    public static /* synthetic */ void y() {
    }
}
