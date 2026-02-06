package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: o.pD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8704pD2 {
    public static final int j = 0;
    public final List<b> a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public boolean g;
    public int h;
    public boolean i;

    /* renamed from: o.pD2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        /* renamed from: o.pD2$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            public String a;
            public String b;
            public String c;

            public a() {
            }

            public b a() {
                String str;
                String str2;
                String str3 = this.a;
                if (str3 != null && !str3.trim().isEmpty() && (str = this.b) != null && !str.trim().isEmpty() && (str2 = this.c) != null && !str2.trim().isEmpty()) {
                    return new b(this.a, this.b, this.c);
                }
                throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
            }

            public a b(String str) {
                if (!str.trim().isEmpty()) {
                    this.a = str;
                    return this;
                }
                throw new IllegalArgumentException("Brand should not be blank.");
            }

            public a c(String str) {
                if (!str.trim().isEmpty()) {
                    this.c = str;
                    return this;
                }
                throw new IllegalArgumentException("FullVersion should not be blank.");
            }

            public a d(String str) {
                if (!str.trim().isEmpty()) {
                    this.b = str;
                    return this;
                }
                throw new IllegalArgumentException("MajorVersion should not be blank.");
            }

            public a(b bVar) {
                this.a = bVar.a();
                this.b = bVar.c();
                this.c = bVar.b();
            }
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        public String toString() {
            return this.a + "," + this.b + "," + this.c;
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public String a() {
        return this.e;
    }

    public int b() {
        return this.h;
    }

    public List<b> c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8704pD2)) {
            return false;
        }
        C8704pD2 c8704pD2 = (C8704pD2) obj;
        if (this.g == c8704pD2.g && this.h == c8704pD2.h && this.i == c8704pD2.i && Objects.equals(this.a, c8704pD2.a) && Objects.equals(this.b, c8704pD2.b) && Objects.equals(this.c, c8704pD2.c) && Objects.equals(this.d, c8704pD2.d) && Objects.equals(this.e, c8704pD2.e) && Objects.equals(this.f, c8704pD2.f)) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i));
    }

    public boolean i() {
        return this.i;
    }

    public C8704pD2(List<b> list, String str, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = i;
        this.i = z2;
    }

    /* renamed from: o.pD2$c */
    /* loaded from: classes.dex */
    public static final class c {
        public List<b> a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public int h;
        public boolean i;

        public c() {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
        }

        public C8704pD2 a() {
            return new C8704pD2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public c b(String str) {
            this.e = str;
            return this;
        }

        public c c(int i) {
            this.h = i;
            return this;
        }

        public c d(List<b> list) {
            this.a = list;
            return this;
        }

        public c e(String str) {
            if (str == null) {
                this.b = null;
                return this;
            } else if (!str.trim().isEmpty()) {
                this.b = str;
                return this;
            } else {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
        }

        public c f(boolean z) {
            this.g = z;
            return this;
        }

        public c g(String str) {
            this.f = str;
            return this;
        }

        public c h(String str) {
            if (str == null) {
                this.c = null;
                return this;
            } else if (!str.trim().isEmpty()) {
                this.c = str;
                return this;
            } else {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
        }

        public c i(String str) {
            this.d = str;
            return this;
        }

        public c j(boolean z) {
            this.i = z;
            return this;
        }

        public c(C8704pD2 c8704pD2) {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
            this.a = c8704pD2.c();
            this.b = c8704pD2.d();
            this.c = c8704pD2.f();
            this.d = c8704pD2.g();
            this.e = c8704pD2.a();
            this.f = c8704pD2.e();
            this.g = c8704pD2.h();
            this.h = c8704pD2.b();
            this.i = c8704pD2.i();
        }
    }
}
