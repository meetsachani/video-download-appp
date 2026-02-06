package o;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public abstract class HE0 {
    public Paint a;

    public HE0() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
    }

    public abstract void a(Canvas canvas);

    public void b(int i) {
        this.a.setAlpha(i);
    }

    public void c(int i) {
        this.a.setColor(i);
    }

    public void d(Paint.Style style) {
        this.a.setStyle(style);
    }

    public void e(float f) {
        this.a.setStrokeWidth(f);
    }
}
