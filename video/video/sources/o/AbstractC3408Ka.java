package o;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Ka */
/* loaded from: classes.dex */
public abstract class AbstractC3408Ka implements GJ {
    public static final Set<AbstractC3408Ka> c = new HashSet();
    public final String a;
    public final String b;

    /* renamed from: o.Ka$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final Set<String> a = new HashSet(Arrays.asList(C7014iK2.d().a()));
    }

    /* renamed from: o.Ka$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC3408Ka {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            return true;
        }
    }

    /* renamed from: o.Ka$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC3408Ka {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            return true;
        }
    }

    /* renamed from: o.Ka$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC3408Ka {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            return false;
        }
    }

    /* renamed from: o.Ka$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC3408Ka {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 26) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Ka$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC3408Ka {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 27) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Ka$g */
    /* loaded from: classes.dex */
    public static class g extends AbstractC3408Ka {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Ka$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC3408Ka {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Ka$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC3408Ka {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return true;
            }
            return false;
        }
    }

    public AbstractC3408Ka(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public static Set<String> b() {
        return a.a;
    }

    public static Set<AbstractC3408Ka> e() {
        return Collections.unmodifiableSet(c);
    }

    @Override // o.GJ
    public String a() {
        return this.a;
    }

    public abstract boolean c();

    public boolean d() {
        return C7128ip.b(a.a, this.b);
    }

    @Override // o.GJ
    public boolean isSupported() {
        if (!c() && !d()) {
            return false;
        }
        return true;
    }
}
