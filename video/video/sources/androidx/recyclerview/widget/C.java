package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C4820Ym;

/* loaded from: classes.dex */
public class C {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 4;
    public static final int j = 4;
    public static final int k = 16;
    public static final int l = 32;
    public static final int m = 64;
    public static final int n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f51o = 256;
    public static final int p = 512;
    public static final int q = 1024;
    public static final int r = 12;
    public static final int s = 4096;
    public static final int t = 8192;
    public static final int u = 16384;
    public static final int v = 7;
    public final b a;
    public a b = new a();

    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public void a(int i) {
            this.a = i | this.a;
        }

        public boolean b() {
            int i = this.a;
            if ((i & 7) != 0 && (i & c(this.d, this.b)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (c(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & C4820Ym.b.f) != 0 && (i3 & (c(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 28672) != 0 && (i4 & (c(this.e, this.c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void d() {
            this.a = 0;
        }

        public void e(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public C(b bVar) {
        this.a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int i6;
        int c2 = this.a.c();
        int d2 = this.a.d();
        if (i3 > i2) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        View view = null;
        while (i2 != i3) {
            View a2 = this.a.a(i2);
            this.b.e(c2, d2, this.a.b(a2), this.a.e(a2));
            if (i4 != 0) {
                this.b.d();
                this.b.a(i4);
                if (this.b.b()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                this.b.d();
                this.b.a(i5);
                if (this.b.b()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        this.b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (i2 != 0) {
            this.b.d();
            this.b.a(i2);
            return this.b.b();
        }
        return false;
    }
}
