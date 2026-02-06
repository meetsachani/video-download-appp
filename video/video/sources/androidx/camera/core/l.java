package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.b;
import java.util.concurrent.Executor;
import o.C7693l82;
import o.InterfaceC8499oN0;

/* loaded from: classes.dex */
public class l implements InterfaceC8499oN0 {
    public final InterfaceC8499oN0 d;
    public final Surface e;
    public b.a f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final b.a g = new b.a() { // from class: o.nX1
        @Override // androidx.camera.core.b.a
        public final void b(androidx.camera.core.g gVar) {
            androidx.camera.core.l.h(androidx.camera.core.l.this, gVar);
        }
    };

    public l(InterfaceC8499oN0 interfaceC8499oN0) {
        this.d = interfaceC8499oN0;
        this.e = interfaceC8499oN0.getSurface();
    }

    public static /* synthetic */ void b(l lVar, InterfaceC8499oN0.a aVar, InterfaceC8499oN0 interfaceC8499oN0) {
        lVar.getClass();
        aVar.a(lVar);
    }

    public static /* synthetic */ void h(l lVar, g gVar) {
        b.a aVar;
        synchronized (lVar.a) {
            try {
                int i = lVar.b - 1;
                lVar.b = i;
                if (lVar.c && i == 0) {
                    lVar.close();
                }
                aVar = lVar.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(gVar);
        }
    }

    @Override // o.InterfaceC8499oN0
    public g a() {
        g n;
        synchronized (this.a) {
            n = n(this.d.a());
        }
        return n;
    }

    @Override // o.InterfaceC8499oN0
    public int c() {
        int c;
        synchronized (this.a) {
            c = this.d.c();
        }
        return c;
    }

    @Override // o.InterfaceC8499oN0
    public void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC8499oN0
    public void d() {
        synchronized (this.a) {
            this.d.d();
        }
    }

    @Override // o.InterfaceC8499oN0
    public int e() {
        int e;
        synchronized (this.a) {
            e = this.d.e();
        }
        return e;
    }

    @Override // o.InterfaceC8499oN0
    public void f(final InterfaceC8499oN0.a aVar, Executor executor) {
        synchronized (this.a) {
            this.d.f(new InterfaceC8499oN0.a() { // from class: o.mX1
                @Override // o.InterfaceC8499oN0.a
                public final void a(InterfaceC8499oN0 interfaceC8499oN0) {
                    androidx.camera.core.l.b(androidx.camera.core.l.this, aVar, interfaceC8499oN0);
                }
            }, executor);
        }
    }

    @Override // o.InterfaceC8499oN0
    public g g() {
        g n;
        synchronized (this.a) {
            n = n(this.d.g());
        }
        return n;
    }

    @Override // o.InterfaceC8499oN0
    public int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.d.getHeight();
        }
        return height;
    }

    @Override // o.InterfaceC8499oN0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.d.getSurface();
        }
        return surface;
    }

    @Override // o.InterfaceC8499oN0
    public int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.d.getWidth();
        }
        return width;
    }

    public int i() {
        int e;
        synchronized (this.a) {
            e = this.d.e() - this.b;
        }
        return e;
    }

    public InterfaceC8499oN0 j() {
        InterfaceC8499oN0 interfaceC8499oN0;
        synchronized (this.a) {
            interfaceC8499oN0 = this.d;
        }
        return interfaceC8499oN0;
    }

    public boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public void l() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.d.d();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(b.a aVar) {
        synchronized (this.a) {
            this.f = aVar;
        }
    }

    public final g n(g gVar) {
        if (gVar != null) {
            this.b++;
            C7693l82 c7693l82 = new C7693l82(gVar);
            c7693l82.a(this.g);
            return c7693l82;
        }
        return null;
    }
}
