package o;

import android.content.Context;

/* loaded from: classes.dex */
public class BI {
    public static final BI f = new BI();
    public int a;
    public int b;
    public String c;
    public InterfaceC9457sI0 d;
    public InterfaceC10725xV e;

    public static BI d() {
        return f;
    }

    public int a() {
        if (this.b == 0) {
            synchronized (BI.class) {
                try {
                    if (this.b == 0) {
                        this.b = 20000;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public InterfaceC10725xV b() {
        if (this.e == null) {
            synchronized (BI.class) {
                try {
                    if (this.e == null) {
                        this.e = new C3376Jq1();
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public InterfaceC9457sI0 c() {
        if (this.d == null) {
            synchronized (BI.class) {
                try {
                    if (this.d == null) {
                        this.d = new C8297nZ();
                    }
                } finally {
                }
            }
        }
        return this.d.mo17clone();
    }

    public int e() {
        if (this.a == 0) {
            synchronized (BI.class) {
                try {
                    if (this.a == 0) {
                        this.a = 20000;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public String f() {
        if (this.c == null) {
            synchronized (BI.class) {
                try {
                    if (this.c == null) {
                        this.c = DK.e;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public void g(Context context, C11320zx1 c11320zx1) {
        InterfaceC10725xV c3376Jq1;
        this.a = c11320zx1.c();
        this.b = c11320zx1.a();
        this.c = c11320zx1.d();
        this.d = c11320zx1.b();
        if (c11320zx1.e()) {
            c3376Jq1 = new C4780Yc(context);
        } else {
            c3376Jq1 = new C3376Jq1();
        }
        this.e = c3376Jq1;
        if (c11320zx1.e()) {
            C11077yx1.d(30);
        }
    }
}
