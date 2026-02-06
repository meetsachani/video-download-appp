package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.a32  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4992a32 {
    public static final float j = 270.0f;
    public static final float k = 180.0f;
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final List<h> g = new ArrayList();
    public final List<j> h = new ArrayList();
    public boolean i;

    /* renamed from: o.a32$a */
    /* loaded from: classes3.dex */
    public class a extends j {
        public final /* synthetic */ List c;
        public final /* synthetic */ Matrix d;

        public a(List list, Matrix matrix) {
            this.c = list;
            this.d = matrix;
        }

        @Override // o.C4992a32.j
        public void a(Matrix matrix, M22 m22, int i, Canvas canvas) {
            for (j jVar : this.c) {
                jVar.a(this.d, m22, i, canvas);
            }
        }
    }

    /* renamed from: o.a32$b */
    /* loaded from: classes3.dex */
    public static class b extends j {
        public final e c;

        public b(e eVar) {
            this.c = eVar;
        }

        @Override // o.C4992a32.j
        public void a(Matrix matrix, @InterfaceC5670cr1 M22 m22, int i, @InterfaceC5670cr1 Canvas canvas) {
            m22.a(canvas, matrix, new RectF(this.c.k(), this.c.o(), this.c.l(), this.c.j()), i, this.c.m(), this.c.n());
        }
    }

    /* renamed from: o.a32$c */
    /* loaded from: classes3.dex */
    public static class c extends j {
        public final g c;
        public final g d;
        public final float e;
        public final float f;

        public c(g gVar, g gVar2, float f, float f2) {
            this.c = gVar;
            this.d = gVar2;
            this.e = f;
            this.f = f2;
        }

        @Override // o.C4992a32.j
        public void a(Matrix matrix, M22 m22, int i, Canvas canvas) {
            int i2;
            float e = e();
            if (e <= 0.0f) {
                double hypot = Math.hypot(this.c.b - this.e, this.c.c - this.f);
                double hypot2 = Math.hypot(this.d.b - this.c.b, this.d.c - this.c.c);
                float min = (float) Math.min(i, Math.min(hypot, hypot2));
                double d = min;
                double tan = Math.tan(Math.toRadians((-e) / 2.0f)) * d;
                if (hypot > tan) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                    this.a.set(matrix);
                    this.a.preTranslate(this.e, this.f);
                    this.a.preRotate(d());
                    i2 = i;
                    m22.b(canvas, this.a, rectF, i2);
                } else {
                    i2 = i;
                }
                float f = min * 2.0f;
                RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                this.a.set(matrix);
                this.a.preTranslate(this.c.b, this.c.c);
                this.a.preRotate(d());
                this.a.preTranslate((float) ((-tan) - d), (-2.0f) * min);
                m22.c(canvas, this.a, rectF2, (int) min, 450.0f, e, new float[]{(float) (d + tan), f});
                if (hypot2 > tan) {
                    RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                    this.a.set(matrix);
                    this.a.preTranslate(this.c.b, this.c.c);
                    this.a.preRotate(c());
                    this.a.preTranslate((float) tan, 0.0f);
                    m22.b(canvas, this.a, rectF3, i2);
                }
            }
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.d.c - this.c.c) / (this.d.b - this.c.b)));
        }

        public float d() {
            return (float) Math.toDegrees(Math.atan((this.c.c - this.f) / (this.c.b - this.e)));
        }

        public float e() {
            float c = ((c() - d()) + 360.0f) % 360.0f;
            if (c <= 180.0f) {
                return c;
            }
            return c - 360.0f;
        }
    }

    /* renamed from: o.a32$d */
    /* loaded from: classes3.dex */
    public static class d extends j {
        public final g c;
        public final float d;
        public final float e;

        public d(g gVar, float f, float f2) {
            this.c = gVar;
            this.d = f;
            this.e = f2;
        }

        @Override // o.C4992a32.j
        public void a(Matrix matrix, @InterfaceC5670cr1 M22 m22, int i, @InterfaceC5670cr1 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.c.c - this.e, this.c.b - this.d), 0.0f);
            this.a.set(matrix);
            this.a.preTranslate(this.d, this.e);
            this.a.preRotate(c());
            m22.b(canvas, this.a, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.c.c - this.e) / (this.c.b - this.d)));
        }
    }

    /* renamed from: o.a32$e */
    /* loaded from: classes3.dex */
    public static class e extends h {
        public static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public e(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        @Override // o.C4992a32.h
        public void a(@InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.d;
        }

        public final float m() {
            return this.f;
        }

        public final float n() {
            return this.g;
        }

        public final float o() {
            return this.c;
        }

        public final void p(float f) {
            this.e = f;
        }

        public final void q(float f) {
            this.b = f;
        }

        public final void r(float f) {
            this.d = f;
        }

        public final void s(float f) {
            this.f = f;
        }

        public final void t(float f) {
            this.g = f;
        }

        public final void u(float f) {
            this.c = f;
        }
    }

    /* renamed from: o.a32$f */
    /* loaded from: classes3.dex */
    public static class f extends h {
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;

        public f(float f, float f2, float f3, float f4, float f5, float f6) {
            h(f);
            j(f2);
            i(f3);
            k(f4);
            l(f5);
            m(f6);
        }

        @Override // o.C4992a32.h
        public void a(@InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }

        public final float b() {
            return this.b;
        }

        public final float c() {
            return this.d;
        }

        public final float d() {
            return this.c;
        }

        public final float e() {
            return this.c;
        }

        public final float f() {
            return this.f;
        }

        public final float g() {
            return this.g;
        }

        public final void h(float f) {
            this.b = f;
        }

        public final void i(float f) {
            this.d = f;
        }

        public final void j(float f) {
            this.c = f;
        }

        public final void k(float f) {
            this.e = f;
        }

        public final void l(float f) {
            this.f = f;
        }

        public final void m(float f) {
            this.g = f;
        }
    }

    /* renamed from: o.a32$g */
    /* loaded from: classes3.dex */
    public static class g extends h {
        public float b;
        public float c;

        @Override // o.C4992a32.h
        public void a(@InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: o.a32$h */
    /* loaded from: classes3.dex */
    public static abstract class h {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: o.a32$i */
    /* loaded from: classes3.dex */
    public static class i extends h {
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;

        private float h() {
            return this.d;
        }

        private float i() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f) {
            this.e = f;
        }

        @Override // o.C4992a32.h
        public void a(@InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }

        public final float f() {
            return this.b;
        }

        public final float g() {
            return this.c;
        }

        public final void j(float f) {
            this.b = f;
        }

        public final void k(float f) {
            this.c = f;
        }
    }

    /* renamed from: o.a32$j */
    /* loaded from: classes3.dex */
    public static abstract class j {
        public static final Matrix b = new Matrix();
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, M22 m22, int i, Canvas canvas);

        public final void b(M22 m22, int i, Canvas canvas) {
            a(b, m22, i, canvas);
        }
    }

    public C4992a32() {
        q(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z;
        float f8;
        e eVar = new e(f2, f3, f4, f5);
        eVar.s(f6);
        eVar.t(f7);
        this.g.add(eVar);
        b bVar = new b(eVar);
        float f9 = f6 + f7;
        if (f7 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        if (z) {
            f8 = (180.0f + f9) % 360.0f;
        } else {
            f8 = f9;
        }
        c(bVar, f6, f8);
        double d2 = f9;
        u(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        v(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (h() != f2) {
            float h2 = ((f2 - h()) + 360.0f) % 360.0f;
            if (h2 > 180.0f) {
                return;
            }
            e eVar = new e(j(), k(), j(), k());
            eVar.s(h());
            eVar.t(h2);
            this.h.add(new b(eVar));
            s(f2);
        }
    }

    public final void c(j jVar, float f2, float f3) {
        b(f2);
        this.h.add(jVar);
        s(f3);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.g.get(i2).a(matrix, path);
        }
    }

    public boolean e() {
        return this.i;
    }

    @InterfaceC5670cr1
    public j f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    public void g(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.g.add(new f(f2, f3, f4, f5, f6, f7));
        this.i = true;
        u(f6);
        v(f7);
    }

    public final float h() {
        return this.e;
    }

    public final float i() {
        return this.f;
    }

    public float j() {
        return this.c;
    }

    public float k() {
        return this.d;
    }

    public float l() {
        return this.a;
    }

    public float m() {
        return this.b;
    }

    public void n(float f2, float f3) {
        g gVar = new g();
        gVar.b = f2;
        gVar.c = f3;
        this.g.add(gVar);
        d dVar = new d(gVar, j(), k());
        c(dVar, dVar.c() + 270.0f, dVar.c() + 270.0f);
        u(f2);
        v(f3);
    }

    public void o(float f2, float f3, float f4, float f5) {
        if ((Math.abs(f2 - j()) < 0.001f && Math.abs(f3 - k()) < 0.001f) || (Math.abs(f2 - f4) < 0.001f && Math.abs(f3 - f5) < 0.001f)) {
            n(f4, f5);
            return;
        }
        g gVar = new g();
        gVar.b = f2;
        gVar.c = f3;
        this.g.add(gVar);
        g gVar2 = new g();
        gVar2.b = f4;
        gVar2.c = f5;
        this.g.add(gVar2);
        c cVar = new c(gVar, gVar2, j(), k());
        if (cVar.e() > 0.0f) {
            n(f2, f3);
            n(f4, f5);
            return;
        }
        c(cVar, cVar.d() + 270.0f, cVar.c() + 270.0f);
        u(f4);
        v(f5);
    }

    public void p(float f2, float f3, float f4, float f5) {
        i iVar = new i();
        iVar.j(f2);
        iVar.k(f3);
        iVar.l(f4);
        iVar.m(f5);
        this.g.add(iVar);
        this.i = true;
        u(f4);
        v(f5);
    }

    public void q(float f2, float f3) {
        r(f2, f3, 270.0f, 0.0f);
    }

    public void r(float f2, float f3, float f4, float f5) {
        w(f2);
        x(f3);
        u(f2);
        v(f3);
        s(f4);
        t((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public final void s(float f2) {
        this.e = f2;
    }

    public final void t(float f2) {
        this.f = f2;
    }

    public final void u(float f2) {
        this.c = f2;
    }

    public final void v(float f2) {
        this.d = f2;
    }

    public final void w(float f2) {
        this.a = f2;
    }

    public final void x(float f2) {
        this.b = f2;
    }

    public C4992a32(float f2, float f3) {
        q(f2, f3);
    }
}
