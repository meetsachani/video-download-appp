package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.Nk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3743Nk1 {

    /* renamed from: o.Nk1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public final String a;
        public final C0207b b;
        public C0207b c;
        public boolean d;
        public boolean e;

        /* renamed from: o.Nk1$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends C0207b {
            public a() {
                super();
            }
        }

        /* renamed from: o.Nk1$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0207b {
            @MB
            public String a;
            @MB
            public Object b;
            @MB
            public C0207b c;

            public C0207b() {
            }
        }

        public static boolean u(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() != 0) {
                    return false;
                }
                return true;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof AbstractC4468Uv1) {
                    return !((AbstractC4468Uv1) obj).e();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        @InterfaceC6181ey
        public b a(String str, char c) {
            return m(str, String.valueOf(c));
        }

        @InterfaceC6181ey
        public b b(String str, double d) {
            return m(str, String.valueOf(d));
        }

        @InterfaceC6181ey
        public b c(String str, float f) {
            return m(str, String.valueOf(f));
        }

        @InterfaceC6181ey
        public b d(String str, int i) {
            return m(str, String.valueOf(i));
        }

        @InterfaceC6181ey
        public b e(String str, long j) {
            return m(str, String.valueOf(j));
        }

        @InterfaceC6181ey
        public b f(String str, @MB Object obj) {
            return j(str, obj);
        }

        @InterfaceC6181ey
        public b g(String str, boolean z) {
            return m(str, String.valueOf(z));
        }

        public final C0207b h() {
            C0207b c0207b = new C0207b();
            this.c.c = c0207b;
            this.c = c0207b;
            return c0207b;
        }

        public final b i(@MB Object obj) {
            h().b = obj;
            return this;
        }

        public final b j(String str, @MB Object obj) {
            C0207b h = h();
            h.b = obj;
            h.a = (String) C10664xF1.E(str);
            return this;
        }

        public final a k() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public final b l(Object obj) {
            k().b = obj;
            return this;
        }

        public final b m(String str, Object obj) {
            a k = k();
            k.b = obj;
            k.a = (String) C10664xF1.E(str);
            return this;
        }

        @InterfaceC6181ey
        public b n(char c) {
            return l(String.valueOf(c));
        }

        @InterfaceC6181ey
        public b o(double d) {
            return l(String.valueOf(d));
        }

        @InterfaceC6181ey
        public b p(float f) {
            return l(String.valueOf(f));
        }

        @InterfaceC6181ey
        public b q(int i) {
            return l(String.valueOf(i));
        }

        @InterfaceC6181ey
        public b r(long j) {
            return l(String.valueOf(j));
        }

        @InterfaceC6181ey
        public b s(@MB Object obj) {
            return i(obj);
        }

        @InterfaceC6181ey
        public b t(boolean z) {
            return l(String.valueOf(z));
        }

        public String toString() {
            boolean z = this.d;
            boolean z2 = this.e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (C0207b c0207b = this.b.c; c0207b != null; c0207b = c0207b.c) {
                Object obj = c0207b.b;
                if (!(c0207b instanceof a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && u(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c0207b.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = C6566gU0.h;
            }
            sb.append('}');
            return sb.toString();
        }

        @InterfaceC6181ey
        public b v() {
            this.d = true;
            return this;
        }

        public b(String str) {
            C0207b c0207b = new C0207b();
            this.b = c0207b;
            this.c = c0207b;
            this.d = false;
            this.e = false;
            this.a = (String) C10664xF1.E(str);
        }
    }

    public static <T> T a(@MB T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b d(String str) {
        return new b(str);
    }
}
