package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class M22 {
    public static final int i = 68;
    public static final int j = 20;
    public static final int k = 0;
    public static final int[] l = new int[3];
    public static final float[] m = {0.0f, 0.5f, 1.0f};
    public static final int[] n = new int[4];

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f539o = {0.0f, 0.0f, 0.5f, 1.0f};
    @InterfaceC5670cr1
    public final Paint a;
    @InterfaceC5670cr1
    public final Paint b;
    @InterfaceC5670cr1
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g;
    public final Paint h;

    public M22() {
        this(-16777216);
    }

    public void a(@InterfaceC5670cr1 Canvas canvas, @InterfaceC11300zs1 Matrix matrix, @InterfaceC5670cr1 RectF rectF, int i2, float f, float f2) {
        boolean z;
        float f3;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.g;
        if (z) {
            int[] iArr = n;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
            f3 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f3 = f;
            path.arcTo(rectF, f3, f2);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = n;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / width);
        float[] fArr = f539o;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f3, f2, true, this.b);
        canvas.restore();
    }

    public void b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC11300zs1 Matrix matrix, @InterfaceC5670cr1 RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = l;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public void c(@InterfaceC5670cr1 Canvas canvas, @InterfaceC11300zs1 Matrix matrix, @InterfaceC5670cr1 RectF rectF, int i2, float f, float f2, @InterfaceC5670cr1 float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        float f3 = f;
        float f4 = f2;
        a(canvas, matrix, rectF, i2, f3, f4);
        Path path = this.g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f3, f4);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.h);
        canvas.drawPath(path, this.a);
        canvas.restore();
    }

    @InterfaceC5670cr1
    public Paint d() {
        return this.a;
    }

    public void e(int i2) {
        this.d = C9205rG.D(i2, 68);
        this.e = C9205rG.D(i2, 20);
        this.f = C9205rG.D(i2, 0);
        this.a.setColor(this.d);
    }

    public M22(int i2) {
        this.g = new Path();
        Paint paint = new Paint();
        this.h = paint;
        this.a = new Paint();
        e(i2);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }
}
