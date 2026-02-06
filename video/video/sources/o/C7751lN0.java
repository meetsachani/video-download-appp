package o;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: o.lN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7751lN0 {
    public boolean a;
    public boolean b;

    public static RectF c(RectF rectF, int i) {
        if (C5433bs2.h(i)) {
            return new RectF(0.0f, 0.0f, rectF.height(), rectF.width());
        }
        return new RectF(0.0f, 0.0f, rectF.width(), rectF.height());
    }

    public final RectF a(androidx.camera.core.g gVar) {
        if (this.a) {
            return new RectF(gVar.L3());
        }
        return new RectF(0.0f, 0.0f, gVar.getWidth(), gVar.getHeight());
    }

    public C6422fx1 b(androidx.camera.core.g gVar) {
        int d = d(gVar);
        RectF a = a(gVar);
        Matrix d2 = C5433bs2.d(a, c(a, d), d);
        d2.preConcat(C5433bs2.b(gVar.L3()));
        return new C6422fx1(d2, C5433bs2.m(gVar.L3()));
    }

    public final int d(androidx.camera.core.g gVar) {
        if (this.b) {
            return gVar.I4().e();
        }
        return 0;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.b;
    }

    public void g(boolean z) {
        this.a = z;
    }

    public void h(boolean z) {
        this.b = z;
    }
}
