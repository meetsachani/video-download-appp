package o;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* renamed from: o.Dq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775Dq {
    public static final C2775Dq a = new C2775Dq();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    /* renamed from: o.Dq$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    @InterfaceC7780lU1(EnumC7796la.Y)
    /* renamed from: o.Dq$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    static {
        int i;
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 30) {
            i = a.a.a(30);
        } else {
            i = 0;
        }
        b = i;
        if (i4 >= 30) {
            i2 = a.a.a(31);
        } else {
            i2 = 0;
        }
        c = i2;
        if (i4 >= 30) {
            i3 = a.a.a(33);
        } else {
            i3 = 0;
        }
        d = i3;
        if (i4 >= 30) {
            i5 = a.a.a(1000000);
        }
        e = i5;
    }

    @InterfaceC9511sW0
    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 36) {
            if (i >= 35) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("Baklava", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    public static final boolean b() {
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    public static final boolean c() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    public static final boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    public static final boolean e() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    public static final boolean f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean g(String str, String str2) {
        C6562gT0.p(str, "codename");
        C6562gT0.p(str2, "buildCodename");
        if (C6562gT0.g("REL", str2)) {
            return false;
        }
        Integer h = h(str2);
        Integer h2 = h(str);
        if (h != null && h2 != null) {
            if (h.intValue() < h2.intValue()) {
                return false;
            }
            return true;
        } else if (h == null && h2 == null) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            C6562gT0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = str.toUpperCase(locale);
            C6562gT0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (upperCase.compareTo(upperCase2) < 0) {
                return false;
            }
            return true;
        } else if (h == null) {
            return false;
        } else {
            return true;
        }
    }

    public static final Integer h(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        C6562gT0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (C6562gT0.g(upperCase, "BAKLAVA")) {
            return 0;
        }
        return null;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    public static final boolean i() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    public static final boolean j() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    public static final boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("S", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    public static final boolean l() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            if (i >= 31) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("Sv2", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    public static final boolean m() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("Tiramisu", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    public static final boolean n() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("UpsideDownCake", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(message = "Android VanillaIceCream is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 35`.", replaceWith = @IR1(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    public static final boolean o() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                C6562gT0.o(str, "CODENAME");
                if (!g("VanillaIceCream", str)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
