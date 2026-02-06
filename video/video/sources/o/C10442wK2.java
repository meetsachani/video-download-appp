package o;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: o.wK2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10442wK2 {
    public static final int A = 1;
    public static final int r = -1;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 0;
    @JF
    public int f;
    public int h;

    /* renamed from: o  reason: collision with root package name */
    public float f902o;
    public String a = "";
    public String b = "";
    public Set<String> c = Collections.EMPTY_SET;
    public String d = "";
    @InterfaceC11300zs1
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wK2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wK2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public static int C(int i, String str, @InterfaceC11300zs1 String str2, int i2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }

    public void A(String str) {
        this.d = str;
    }

    @InterfaceC6181ey
    public C10442wK2 B(boolean z2) {
        this.k = z2 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @InterfaceC11300zs1
    public String d() {
        return this.e;
    }

    public float e() {
        return this.f902o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, Set<String> set, @InterfaceC11300zs1 String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int C = C(C(C(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (C == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return C + (this.c.size() * 4);
    }

    public int i() {
        int i;
        int i2 = this.l;
        if (i2 == -1 && this.m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        if (this.j == 1) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.k == 1) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public C10442wK2 n(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 o(boolean z2) {
        this.l = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 p(boolean z2) {
        this.q = z2;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 q(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 r(@InterfaceC11300zs1 String str) {
        String g;
        if (str == null) {
            g = null;
        } else {
            g = C8077mf.g(str);
        }
        this.e = g;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 s(float f) {
        this.f902o = f;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 t(int i) {
        this.n = i;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 u(boolean z2) {
        this.m = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 v(boolean z2) {
        this.j = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C10442wK2 w(int i) {
        this.p = i;
        return this;
    }

    public void x(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    public void y(String str) {
        this.a = str;
    }

    public void z(String str) {
        this.b = str;
    }
}
