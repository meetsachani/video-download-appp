package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: o.uI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9944uI1 {
    public final f.l a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final InterfaceC9569sl2 f;
    public final String g;
    public final List<Integer> h = new ArrayList();
    public final InterfaceFutureC8411o11<Void> i;

    public C9944uI1(InterfaceC3108Gy interfaceC3108Gy, f.l lVar, Rect rect, int i, int i2, Matrix matrix, InterfaceC9569sl2 interfaceC9569sl2, InterfaceFutureC8411o11<Void> interfaceFutureC8411o11) {
        this.a = lVar;
        this.d = i2;
        this.c = i;
        this.b = rect;
        this.e = matrix;
        this.f = interfaceC9569sl2;
        this.g = String.valueOf(interfaceC3108Gy.hashCode());
        List<InterfaceC6185ez> a = interfaceC3108Gy.a();
        Objects.requireNonNull(a);
        for (InterfaceC6185ez interfaceC6185ez : a) {
            this.h.add(Integer.valueOf(interfaceC6185ez.getId()));
        }
        this.i = interfaceFutureC8411o11;
    }

    public InterfaceFutureC8411o11<Void> a() {
        return this.i;
    }

    public Rect b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public f.l d() {
        return this.a;
    }

    public int e() {
        return this.c;
    }

    public Matrix f() {
        return this.e;
    }

    public List<Integer> g() {
        return this.h;
    }

    public String h() {
        return this.g;
    }

    public boolean i() {
        return this.f.isAborted();
    }

    public boolean j() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public void k(DM0 dm0) {
        this.f.e(dm0);
    }

    public void l(f.m mVar) {
        this.f.a(mVar);
    }

    public void m(androidx.camera.core.g gVar) {
        this.f.b(gVar);
    }

    public void n() {
        this.f.d();
    }

    public void o(DM0 dm0) {
        this.f.c(dm0);
    }
}
