package o;

import java.io.IOException;

/* loaded from: classes.dex */
public class PY0 {
    public static final C3151Hj0 e = C3151Hj0.d();
    public AbstractC8616os a;
    public C3151Hj0 b;
    public volatile InterfaceC3540Li1 c;
    public volatile AbstractC8616os d;

    public PY0(C3151Hj0 c3151Hj0, AbstractC8616os abstractC8616os) {
        a(c3151Hj0, abstractC8616os);
        this.b = c3151Hj0;
        this.a = abstractC8616os;
    }

    public static void a(C3151Hj0 c3151Hj0, AbstractC8616os abstractC8616os) {
        if (c3151Hj0 != null) {
            if (abstractC8616os != null) {
                return;
            }
            throw new NullPointerException("found null ByteString");
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    public static PY0 e(InterfaceC3540Li1 interfaceC3540Li1) {
        PY0 py0 = new PY0();
        py0.m(interfaceC3540Li1);
        return py0;
    }

    public static InterfaceC3540Li1 j(InterfaceC3540Li1 interfaceC3540Li1, AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) {
        try {
            return interfaceC3540Li1.x().B3(abstractC8616os, c3151Hj0).build();
        } catch (C9258rT0 unused) {
            return interfaceC3540Li1;
        }
    }

    public void b() {
        this.a = null;
        this.c = null;
        this.d = null;
    }

    public boolean c() {
        AbstractC8616os abstractC8616os = this.d;
        AbstractC8616os abstractC8616os2 = AbstractC8616os.Z0;
        if (abstractC8616os != abstractC8616os2) {
            if (this.c == null) {
                AbstractC8616os abstractC8616os3 = this.a;
                if (abstractC8616os3 != null && abstractC8616os3 != abstractC8616os2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public void d(InterfaceC3540Li1 interfaceC3540Li1) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c != null) {
                    return;
                }
                try {
                    if (this.a != null) {
                        this.c = interfaceC3540Li1.k1().g(this.a, this.b);
                        this.d = this.a;
                    } else {
                        this.c = interfaceC3540Li1;
                        this.d = AbstractC8616os.Z0;
                    }
                } catch (C9258rT0 unused) {
                    this.c = interfaceC3540Li1;
                    this.d = AbstractC8616os.Z0;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PY0)) {
            return false;
        }
        PY0 py0 = (PY0) obj;
        InterfaceC3540Li1 interfaceC3540Li1 = this.c;
        InterfaceC3540Li1 interfaceC3540Li12 = py0.c;
        if (interfaceC3540Li1 == null && interfaceC3540Li12 == null) {
            return n().equals(py0.n());
        }
        if (interfaceC3540Li1 != null && interfaceC3540Li12 != null) {
            return interfaceC3540Li1.equals(interfaceC3540Li12);
        }
        if (interfaceC3540Li1 != null) {
            return interfaceC3540Li1.equals(py0.g(interfaceC3540Li1.u0()));
        }
        return g(interfaceC3540Li12.u0()).equals(interfaceC3540Li12);
    }

    public int f() {
        if (this.d != null) {
            return this.d.size();
        }
        AbstractC8616os abstractC8616os = this.a;
        if (abstractC8616os != null) {
            return abstractC8616os.size();
        }
        if (this.c != null) {
            return this.c.N();
        }
        return 0;
    }

    public InterfaceC3540Li1 g(InterfaceC3540Li1 interfaceC3540Li1) {
        d(interfaceC3540Li1);
        return this.c;
    }

    public void h(PY0 py0) {
        AbstractC8616os abstractC8616os;
        if (py0.c()) {
            return;
        }
        if (c()) {
            k(py0);
            return;
        }
        if (this.b == null) {
            this.b = py0.b;
        }
        AbstractC8616os abstractC8616os2 = this.a;
        if (abstractC8616os2 != null && (abstractC8616os = py0.a) != null) {
            this.a = abstractC8616os2.l(abstractC8616os);
        } else if (this.c == null && py0.c != null) {
            m(j(py0.c, this.a, this.b));
        } else if (this.c != null && py0.c == null) {
            m(j(this.c, py0.a, py0.b));
        } else {
            m(this.c.x().q3(py0.c).build());
        }
    }

    public int hashCode() {
        return 1;
    }

    public void i(KE ke, C3151Hj0 c3151Hj0) throws IOException {
        if (c()) {
            l(ke.x(), c3151Hj0);
            return;
        }
        if (this.b == null) {
            this.b = c3151Hj0;
        }
        AbstractC8616os abstractC8616os = this.a;
        if (abstractC8616os != null) {
            l(abstractC8616os.l(ke.x()), this.b);
            return;
        }
        try {
            m(this.c.x().y3(ke, c3151Hj0).build());
        } catch (C9258rT0 unused) {
        }
    }

    public void k(PY0 py0) {
        this.a = py0.a;
        this.c = py0.c;
        this.d = py0.d;
        C3151Hj0 c3151Hj0 = py0.b;
        if (c3151Hj0 != null) {
            this.b = c3151Hj0;
        }
    }

    public void l(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) {
        a(c3151Hj0, abstractC8616os);
        this.a = abstractC8616os;
        this.b = c3151Hj0;
        this.c = null;
        this.d = null;
    }

    public InterfaceC3540Li1 m(InterfaceC3540Li1 interfaceC3540Li1) {
        InterfaceC3540Li1 interfaceC3540Li12 = this.c;
        this.a = null;
        this.d = null;
        this.c = interfaceC3540Li1;
        return interfaceC3540Li12;
    }

    public AbstractC8616os n() {
        if (this.d != null) {
            return this.d;
        }
        AbstractC8616os abstractC8616os = this.a;
        if (abstractC8616os != null) {
            return abstractC8616os;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = AbstractC8616os.Z0;
                } else {
                    this.d = this.c.G();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(NN2 nn2, int i) throws IOException {
        if (this.d != null) {
            nn2.e(i, this.d);
            return;
        }
        AbstractC8616os abstractC8616os = this.a;
        if (abstractC8616os != null) {
            nn2.e(i, abstractC8616os);
        } else if (this.c != null) {
            nn2.A(i, this.c);
        } else {
            nn2.e(i, AbstractC8616os.Z0);
        }
    }

    public PY0() {
    }
}
