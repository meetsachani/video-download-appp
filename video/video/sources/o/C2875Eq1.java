package o;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import o.InterfaceC8499oN0;

/* renamed from: o.Eq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2875Eq1 implements InterfaceC8499oN0 {
    public final InterfaceC8499oN0 a;
    public C9944uI1 b;

    public C2875Eq1(InterfaceC8499oN0 interfaceC8499oN0) {
        this.a = interfaceC8499oN0;
    }

    public static /* synthetic */ void b(C2875Eq1 c2875Eq1, InterfaceC8499oN0.a aVar, InterfaceC8499oN0 interfaceC8499oN0) {
        c2875Eq1.getClass();
        aVar.a(c2875Eq1);
    }

    @Override // o.InterfaceC8499oN0
    public androidx.camera.core.g a() {
        return i(this.a.a());
    }

    @Override // o.InterfaceC8499oN0
    public int c() {
        return this.a.c();
    }

    @Override // o.InterfaceC8499oN0
    public void close() {
        this.a.close();
    }

    @Override // o.InterfaceC8499oN0
    public void d() {
        this.a.d();
    }

    @Override // o.InterfaceC8499oN0
    public int e() {
        return this.a.e();
    }

    @Override // o.InterfaceC8499oN0
    public void f(final InterfaceC8499oN0.a aVar, Executor executor) {
        this.a.f(new InterfaceC8499oN0.a() { // from class: o.Dq1
            @Override // o.InterfaceC8499oN0.a
            public final void a(InterfaceC8499oN0 interfaceC8499oN0) {
                C2875Eq1.b(C2875Eq1.this, aVar, interfaceC8499oN0);
            }
        }, executor);
    }

    @Override // o.InterfaceC8499oN0
    public androidx.camera.core.g g() {
        return i(this.a.g());
    }

    @Override // o.InterfaceC8499oN0
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override // o.InterfaceC8499oN0
    public Surface getSurface() {
        return this.a.getSurface();
    }

    @Override // o.InterfaceC8499oN0
    public int getWidth() {
        return this.a.getWidth();
    }

    public void h(C9944uI1 c9944uI1) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Pending request should be null");
        this.b = c9944uI1;
    }

    public final androidx.camera.core.g i(androidx.camera.core.g gVar) {
        boolean z;
        if (gVar == null) {
            return null;
        }
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Pending request should not be null");
        C4133Rk2 a = C4133Rk2.a(new Pair(this.b.h(), this.b.g().get(0)));
        this.b = null;
        return new F22(gVar, new Size(gVar.getWidth(), gVar.getHeight()), new C3881Ov(new SI2(a, gVar.I4().c())));
    }
}
