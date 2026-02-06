package o;

import android.graphics.Matrix;
import o.C2540Bg0;

/* renamed from: o.Ov  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3881Ov implements YM0 {
    public final InterfaceC3784Nv a;

    public C3881Ov(InterfaceC3784Nv interfaceC3784Nv) {
        this.a = interfaceC3784Nv;
    }

    @Override // o.YM0
    public C4133Rk2 a() {
        return this.a.a();
    }

    @Override // o.YM0
    public void b(C2540Bg0.b bVar) {
        this.a.b(bVar);
    }

    @Override // o.YM0
    public long c() {
        return this.a.c();
    }

    @Override // o.YM0
    public Matrix d() {
        return new Matrix();
    }

    @Override // o.YM0
    public int e() {
        return 0;
    }

    public InterfaceC3784Nv f() {
        return this.a;
    }
}
