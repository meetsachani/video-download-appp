package o;

import android.graphics.Color;
import android.graphics.Matrix;
import o.AbstractC7840ll;

/* loaded from: classes.dex */
public class B70 implements AbstractC7840ll.b {
    public static final float i = 0.017453292f;
    public static final float j = 0.33f;
    public final AbstractC8588ol a;
    public final AbstractC7840ll.b b;
    public final AbstractC7840ll<Integer, Integer> c;
    public final C8629ov0 d;
    public final C8629ov0 e;
    public final C8629ov0 f;
    public final C8629ov0 g;
    public Matrix h;

    /* loaded from: classes.dex */
    public class a extends O61<Float> {
        public final /* synthetic */ O61 d;

        public a(O61 o61) {
            this.d = o61;
        }

        @Override // o.O61
        /* renamed from: e */
        public Float a(C9410s61<Float> c9410s61) {
            Float f = (Float) this.d.a(c9410s61);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public B70(AbstractC7840ll.b bVar, AbstractC8588ol abstractC8588ol, C11117z70 c11117z70) {
        this.b = bVar;
        this.a = abstractC8588ol;
        AbstractC7840ll<Integer, Integer> a2 = c11117z70.a().a();
        this.c = a2;
        a2.a(this);
        abstractC8588ol.j(a2);
        C8629ov0 a3 = c11117z70.d().a();
        this.d = a3;
        a3.a(this);
        abstractC8588ol.j(a3);
        C8629ov0 a4 = c11117z70.b().a();
        this.e = a4;
        a4.a(this);
        abstractC8588ol.j(a4);
        C8629ov0 a5 = c11117z70.c().a();
        this.f = a5;
        a5.a(this);
        abstractC8588ol.j(a5);
        C8629ov0 a6 = c11117z70.e().a();
        this.g = a6;
        a6.a(this);
        abstractC8588ol.j(a6);
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.b.a();
    }

    public C10874y70 b(Matrix matrix, int i2) {
        float floatValue = this.f.h().floatValue();
        double r = this.e.r() * 0.017453292f;
        float sin = ((float) Math.sin(r)) * floatValue;
        float cos = ((float) Math.cos(r + 3.141592653589793d)) * floatValue;
        float floatValue2 = this.g.h().floatValue();
        int intValue = this.c.h().intValue();
        C10874y70 c10874y70 = new C10874y70(floatValue2 * 0.33f, sin, cos, Color.argb(Math.round((this.d.h().floatValue() * i2) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        c10874y70.o(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.x.i().invert(this.h);
        c10874y70.o(this.h);
        return c10874y70;
    }

    public void c(O61<Integer> o61) {
        this.c.o(o61);
    }

    public void d(O61<Float> o61) {
        this.e.o(o61);
    }

    public void e(O61<Float> o61) {
        this.f.o(o61);
    }

    public void f(O61<Float> o61) {
        if (o61 == null) {
            this.d.o(null);
        } else {
            this.d.o(new a(o61));
        }
    }

    public void g(O61<Float> o61) {
        this.g.o(o61);
    }
}
