package o;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: o.Ha0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3115Ha0 extends ReplacementSpan {
    public final C11074yw2 Y;
    public final Paint.FontMetricsInt X = new Paint.FontMetricsInt();
    public short Z = -1;
    public short Y0 = -1;
    public float Z0 = 1.0f;

    public AbstractC3115Ha0(C11074yw2 c11074yw2) {
        C10907yF1.m(c11074yw2, "rasterizer cannot be null");
        this.Y = c11074yw2;
    }

    public final int a() {
        return this.Y0;
    }

    public final int b() {
        return d().g();
    }

    public final float c() {
        return this.Z0;
    }

    public final C11074yw2 d() {
        return this.Y;
    }

    public final int e() {
        return this.Z;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.X);
        Paint.FontMetricsInt fontMetricsInt2 = this.X;
        this.Z0 = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.Y.f();
        this.Y0 = (short) (this.Y.f() * this.Z0);
        short k = (short) (this.Y.k() * this.Z0);
        this.Z = k;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.X;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k;
    }
}
