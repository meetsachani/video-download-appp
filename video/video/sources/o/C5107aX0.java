package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.aX0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5107aX0 {
    @NotNull
    public static final a c = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final C5107aX0 d = new C5107aX0(null, null);
    @Nullable
    public final EnumC5350bX0 a;
    @Nullable
    public final XW0 b;

    /* renamed from: o.aX0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final C5107aX0 a(@NotNull XW0 xw0) {
            C6562gT0.p(xw0, "type");
            return new C5107aX0(EnumC5350bX0.Y, xw0);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C5107aX0 b(@NotNull XW0 xw0) {
            C6562gT0.p(xw0, "type");
            return new C5107aX0(EnumC5350bX0.Z, xw0);
        }

        @NotNull
        public final C5107aX0 c() {
            return C5107aX0.d;
        }

        @InterfaceC9511sW0
        @NotNull
        public final C5107aX0 e(@NotNull XW0 xw0) {
            C6562gT0.p(xw0, "type");
            return new C5107aX0(EnumC5350bX0.X, xw0);
        }

        public a() {
        }

        @HK1
        public static /* synthetic */ void d() {
        }
    }

    /* renamed from: o.aX0$b */
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

    public C5107aX0(@Nullable EnumC5350bX0 enumC5350bX0, @Nullable XW0 xw0) {
        boolean z;
        String str;
        this.a = enumC5350bX0;
        this.b = xw0;
        if (enumC5350bX0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z == (xw0 == null)) {
            return;
        }
        if (enumC5350bX0 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC5350bX0 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C5107aX0 c(@NotNull XW0 xw0) {
        return c.a(xw0);
    }

    public static /* synthetic */ C5107aX0 e(C5107aX0 c5107aX0, EnumC5350bX0 enumC5350bX0, XW0 xw0, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC5350bX0 = c5107aX0.a;
        }
        if ((i & 2) != 0) {
            xw0 = c5107aX0.b;
        }
        return c5107aX0.d(enumC5350bX0, xw0);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C5107aX0 f(@NotNull XW0 xw0) {
        return c.b(xw0);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C5107aX0 i(@NotNull XW0 xw0) {
        return c.e(xw0);
    }

    @Nullable
    public final EnumC5350bX0 a() {
        return this.a;
    }

    @Nullable
    public final XW0 b() {
        return this.b;
    }

    @NotNull
    public final C5107aX0 d(@Nullable EnumC5350bX0 enumC5350bX0, @Nullable XW0 xw0) {
        return new C5107aX0(enumC5350bX0, xw0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5107aX0)) {
            return false;
        }
        C5107aX0 c5107aX0 = (C5107aX0) obj;
        if (this.a == c5107aX0.a && C6562gT0.g(this.b, c5107aX0.b)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final XW0 g() {
        return this.b;
    }

    @Nullable
    public final EnumC5350bX0 h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        EnumC5350bX0 enumC5350bX0 = this.a;
        int i = 0;
        if (enumC5350bX0 == null) {
            hashCode = 0;
        } else {
            hashCode = enumC5350bX0.hashCode();
        }
        int i2 = hashCode * 31;
        XW0 xw0 = this.b;
        if (xw0 != null) {
            i = xw0.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        int i;
        EnumC5350bX0 enumC5350bX0 = this.a;
        if (enumC5350bX0 == null) {
            i = -1;
        } else {
            i = b.a[enumC5350bX0.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + this.b;
                    }
                    throw new C3865Oq1();
                }
                return "in " + this.b;
            }
            return String.valueOf(this.b);
        }
        return "*";
    }
}
