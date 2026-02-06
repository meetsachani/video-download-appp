package o;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import o.C6665gu1;

/* renamed from: o.y70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10874y70 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e;

    public C10874y70() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.d) > 0) {
            paint.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, this.d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(C6665gu1.b bVar) {
        if (Color.alpha(this.d) > 0) {
            bVar.d = this;
        } else {
            bVar.d = null;
        }
    }

    public void c(int i, Paint paint) {
        int l = C6006eE2.l(Color.alpha(this.d), C4713Xj1.d(i, 0, 255));
        if (l > 0) {
            paint.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(l, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
            return;
        }
        paint.clearShadowLayer();
    }

    public void d(int i, C6665gu1.b bVar) {
        C10874y70 c10874y70 = new C10874y70(this);
        bVar.d = c10874y70;
        c10874y70.i(i);
    }

    public int e() {
        return this.d;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.c;
    }

    public float h() {
        return this.a;
    }

    public void i(int i) {
        this.d = Color.argb(Math.round((Color.alpha(this.d) * C4713Xj1.d(i, 0, 255)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public boolean j(C10874y70 c10874y70) {
        if (this.a == c10874y70.a && this.b == c10874y70.b && this.c == c10874y70.c && this.d == c10874y70.d) {
            return true;
        }
        return false;
    }

    public void k(int i) {
        this.d = i;
    }

    public void l(float f) {
        this.b = f;
    }

    public void m(float f) {
        this.c = f;
    }

    public void n(float f) {
        this.a = f;
    }

    public void o(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }

    public C10874y70(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = null;
    }

    public C10874y70(C10874y70 c10874y70) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = c10874y70.a;
        this.b = c10874y70.b;
        this.c = c10874y70.c;
        this.d = c10874y70.d;
        this.e = null;
    }
}
