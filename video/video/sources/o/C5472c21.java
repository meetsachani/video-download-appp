package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: o.c21  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5472c21 {
    public static final C8774pV1[] d;
    public static final C3841Ok1[] e;
    @InterfaceC5670cr1
    public C5715d21 a;
    @InterfaceC5670cr1
    public final Path b = new Path();
    @InterfaceC5670cr1
    public final Matrix c = new Matrix();

    /* renamed from: o.c21$a */
    /* loaded from: classes3.dex */
    public static class a {
        @JF
        public int a;
        public float b;
        public float c;
    }

    static {
        C8774pV1[] c8774pV1Arr = {C4588Wc1.S(C4588Wc1.E, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.y, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.r, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.n, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.t, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.v, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), C4588Wc1.S(C4588Wc1.m, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        d = c8774pV1Arr;
        e = new C3841Ok1[c8774pV1Arr.length];
        int i = 0;
        while (true) {
            C8774pV1[] c8774pV1Arr2 = d;
            if (i < c8774pV1Arr2.length) {
                int i2 = i + 1;
                e[i] = new C3841Ok1(c8774pV1Arr2[i], c8774pV1Arr2[i2 % c8774pV1Arr2.length]);
                i = i2;
            } else {
                return;
            }
        }
    }

    public C5472c21(@InterfaceC5670cr1 C5715d21 c5715d21) {
        this.a = c5715d21;
    }

    public void a(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.a.a) {
            float min = Math.min(rect.width() / e(), rect.height() / d());
            canvas.scale(min, min);
        }
        canvas.clipRect((-e()) / 2.0f, (-d()) / 2.0f, e() / 2.0f, d() / 2.0f);
        canvas.rotate(-90.0f);
    }

    public void b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @JF int i, @BR0(from = 0, to = 255) int i2) {
        C5715d21 c5715d21 = this.a;
        float min = Math.min(c5715d21.c, c5715d21.d) / 2.0f;
        paint.setColor(C9179r91.a(i, i2));
        paint.setStyle(Paint.Style.FILL);
        C5715d21 c5715d212 = this.a;
        int i3 = c5715d212.c;
        int i4 = c5715d212.d;
        canvas.drawRoundRect(new RectF((-i3) / 2.0f, (-i4) / 2.0f, i3 / 2.0f, i4 / 2.0f), min, min, paint);
    }

    public void c(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 a aVar, @BR0(from = 0, to = 255) int i) {
        paint.setColor(C9179r91.a(aVar.a, i));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(aVar.c);
        this.b.rewind();
        int floor = (int) Math.floor(aVar.b);
        C3841Ok1[] c3841Ok1Arr = e;
        int e2 = C8801pd1.e(floor, c3841Ok1Arr.length);
        C8420o32.b(c3841Ok1Arr[e2], aVar.b - floor, this.b);
        Matrix matrix = this.c;
        int i2 = this.a.b;
        matrix.setScale(i2 / 2.0f, i2 / 2.0f);
        this.b.transform(this.c);
        canvas.drawPath(this.b, paint);
        canvas.restore();
    }

    public int d() {
        C5715d21 c5715d21 = this.a;
        return Math.max(c5715d21.c, c5715d21.b);
    }

    public int e() {
        C5715d21 c5715d21 = this.a;
        return Math.max(c5715d21.d, c5715d21.b);
    }
}
