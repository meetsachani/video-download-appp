package o;

import java.io.File;
import java.util.List;
import o.InterfaceC10233vU;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.fT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6308fT1 implements InterfaceC10233vU, InterfaceC9990uU.a<Object> {
    public final InterfaceC10233vU.a X;
    public final WV<?> Y;
    public int Y0 = -1;
    public int Z;
    public InterfaceC6575gX0 Z0;
    public List<InterfaceC7595kk1<File, ?>> a1;
    public int b1;
    public volatile InterfaceC7595kk1.a<?> c1;
    public File d1;
    public C6563gT1 e1;

    public C6308fT1(WV<?> wv, InterfaceC10233vU.a aVar) {
        this.Y = wv;
        this.X = aVar;
    }

    private boolean b() {
        if (this.b1 < this.a1.size()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10233vU
    public boolean a() {
        C5034aE0.a("ResourceCacheGenerator.startNext");
        try {
            List<InterfaceC6575gX0> c = this.Y.c();
            boolean z = false;
            if (c.isEmpty()) {
                C5034aE0.f();
                return false;
            }
            List<Class<?>> m = this.Y.m();
            if (m.isEmpty()) {
                if (File.class.equals(this.Y.r())) {
                    C5034aE0.f();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.Y.i() + " to " + this.Y.r());
            }
            while (true) {
                if (this.a1 != null && b()) {
                    this.c1 = null;
                    while (!z && b()) {
                        List<InterfaceC7595kk1<File, ?>> list = this.a1;
                        int i = this.b1;
                        this.b1 = i + 1;
                        this.c1 = list.get(i).b(this.d1, this.Y.t(), this.Y.f(), this.Y.k());
                        if (this.c1 != null && this.Y.u(this.c1.c.a())) {
                            this.c1.c.d(this.Y.l(), this);
                            z = true;
                        }
                    }
                    C5034aE0.f();
                    return z;
                }
                int i2 = this.Y0 + 1;
                this.Y0 = i2;
                if (i2 >= m.size()) {
                    int i3 = this.Z + 1;
                    this.Z = i3;
                    if (i3 >= c.size()) {
                        C5034aE0.f();
                        return false;
                    }
                    this.Y0 = 0;
                }
                InterfaceC6575gX0 interfaceC6575gX0 = c.get(this.Z);
                Class<?> cls = m.get(this.Y0);
                this.e1 = new C6563gT1(this.Y.b(), interfaceC6575gX0, this.Y.p(), this.Y.t(), this.Y.f(), this.Y.s(cls), cls, this.Y.k());
                File b = this.Y.d().b(this.e1);
                this.d1 = b;
                if (b != null) {
                    this.Z0 = interfaceC6575gX0;
                    this.a1 = this.Y.j(b);
                    this.b1 = 0;
                }
            }
        } catch (Throwable th) {
            C5034aE0.f();
            throw th;
        }
    }

    @Override // o.InterfaceC9990uU.a
    public void c(Exception exc) {
        this.X.g(this.e1, exc, this.c1.c, GU.RESOURCE_DISK_CACHE);
    }

    @Override // o.InterfaceC10233vU
    public void cancel() {
        InterfaceC7595kk1.a<?> aVar = this.c1;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // o.InterfaceC9990uU.a
    public void f(Object obj) {
        this.X.h(this.Z0, obj, this.c1.c, GU.RESOURCE_DISK_CACHE, this.e1);
    }
}
