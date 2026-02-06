package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.jK1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7254jK1 {
    public static final String d = "http";
    public static final String e = "https";
    public static final String f = "*";
    public static final String g = "direct://";
    public static final String h = "<local>";
    public static final String i = "<-loopback>";
    public List<b> a;
    public List<String> b;
    public boolean c;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jK1$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    public C7254jK1(List<b> list, List<String> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public List<String> a() {
        return Collections.unmodifiableList(this.b);
    }

    public List<b> b() {
        return Collections.unmodifiableList(this.a);
    }

    public boolean c() {
        return this.c;
    }

    /* renamed from: o.jK1$b */
    /* loaded from: classes.dex */
    public static final class b {
        public String a;
        public String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public b(String str) {
            this("*", str);
        }
    }

    /* renamed from: o.jK1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public List<b> a;
        public List<String> b;
        public boolean c;

        public a() {
            this.c = false;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public a a(String str) {
            this.b.add(str);
            return this;
        }

        public a b() {
            return c("*");
        }

        public a c(String str) {
            this.a.add(new b(str, C7254jK1.g));
            return this;
        }

        public a d(String str) {
            this.a.add(new b(str));
            return this;
        }

        public a e(String str, String str2) {
            this.a.add(new b(str2, str));
            return this;
        }

        public C7254jK1 f() {
            return new C7254jK1(i(), g(), k());
        }

        public final List<String> g() {
            return this.b;
        }

        public a h() {
            return a(C7254jK1.h);
        }

        public final List<b> i() {
            return this.a;
        }

        public a j() {
            return a(C7254jK1.i);
        }

        public final boolean k() {
            return this.c;
        }

        public a l(boolean z) {
            this.c = z;
            return this;
        }

        public a(C7254jK1 c7254jK1) {
            this.c = false;
            this.a = c7254jK1.b();
            this.b = c7254jK1.a();
            this.c = c7254jK1.c();
        }
    }
}
