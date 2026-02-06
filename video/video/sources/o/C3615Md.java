package o;

import android.graphics.Canvas;
import android.graphics.RectF;

/* renamed from: o.Md  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3615Md extends HE0 {
    public RectF b;
    public float c;
    public float d;
    public boolean e;

    @Override // o.HE0
    public void a(Canvas canvas) {
        canvas.drawArc(this.b, this.c, this.d, this.e, this.a);
    }

    public float f() {
        return this.c;
    }

    public void g(RectF rectF) {
        this.b = rectF;
    }

    public void h(float f) {
        this.c = f;
    }

    public void i(float f) {
        this.d = f;
    }

    public void j(boolean z) {
        this.e = z;
    }
}
