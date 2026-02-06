package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C3342Ji;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* renamed from: o.Ge0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3033Ge0 {

    @InterfaceC6615gi.a
    /* renamed from: o.Ge0$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final a a(String str, int i) {
            e().put(str, String.valueOf(i));
            return this;
        }

        public final a b(String str, long j) {
            e().put(str, String.valueOf(j));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract AbstractC3033Ge0 d();

        public abstract Map<String, String> e();

        public abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(C10988yb0 c10988yb0);

        public abstract a i(long j);

        public abstract a j(String str);

        public abstract a k(long j);
    }

    public static a a() {
        return new C3342Ji.b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public abstract Map<String, String> c();

    @InterfaceC11300zs1
    public abstract Integer d();

    public abstract C10988yb0 e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public final String j(String str, String str2) {
        String str3 = c().get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    @Deprecated
    public byte[] k() {
        return e().a();
    }

    public abstract String l();

    public abstract long m();

    public a n() {
        return new C3342Ji.b().j(l()).g(d()).h(e()).i(f()).k(m()).f(new HashMap(c()));
    }
}
