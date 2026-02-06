package o;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import o.C9665t91;

/* loaded from: classes3.dex */
public class B81 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final P22 d = P22.l();
    public O22 e;

    public void a(Canvas canvas) {
        canvas.clipPath(this.a);
    }

    public void b(float f, O22 o22, O22 o222, RectF rectF, RectF rectF2, RectF rectF3, C9665t91.e eVar) {
        O22 p = C3095Gt2.p(o22, o222, rectF, rectF3, eVar.d(), eVar.c(), f);
        this.e = p;
        this.d.d(p, 1.0f, rectF2, this.b);
        this.d.d(this.e, 1.0f, rectF3, this.c);
        this.a.op(this.b, this.c, Path.Op.UNION);
    }

    public O22 c() {
        return this.e;
    }

    public Path d() {
        return this.a;
    }
}
