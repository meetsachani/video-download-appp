package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class US1 {
    public static final int e = 0;
    public static final int f = 1;
    public final C8807pf a;
    public final WS1 b;
    public final SS1 c;
    public final int d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public US1(C8807pf c8807pf, WS1 ws1, SS1 ss1, int i) {
        this.a = c8807pf;
        this.b = ws1;
        this.c = ss1;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public C8807pf b() {
        return this.a;
    }

    public SS1 c() {
        return this.c;
    }

    public WS1 d() {
        return this.b;
    }

    /* loaded from: classes.dex */
    public static final class b {
        public C8807pf a;
        public WS1 b;
        public SS1 c;
        public int d;

        public b() {
            this.a = C8807pf.e;
            this.b = null;
            this.c = null;
            this.d = 0;
        }

        public static b b(US1 us1) {
            return new b(us1);
        }

        public US1 a() {
            return new US1(this.a, this.b, this.c, this.d);
        }

        public b c(int i) {
            this.d = i;
            return this;
        }

        public b d(C8807pf c8807pf) {
            this.a = c8807pf;
            return this;
        }

        public b e(SS1 ss1) {
            this.c = ss1;
            return this;
        }

        public b f(WS1 ws1) {
            this.b = ws1;
            return this;
        }

        public b(US1 us1) {
            this.a = C8807pf.e;
            this.b = null;
            this.c = null;
            this.d = 0;
            this.a = us1.b();
            this.b = us1.d();
            this.c = us1.c();
            this.d = us1.a();
        }
    }
}
