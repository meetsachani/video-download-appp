package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.Od  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3811Od extends AbstractC9139qz1 {
    public static final float g = 0.0f;
    public static final float h = 70.0f;
    public static final float i = (float) Math.tan(Math.toRadians(35.0d));
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public C3811Od() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = i;
    }

    public static float h(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // o.AbstractC9139qz1
    public Path a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            if (f18 > f20) {
                f15 = f20;
            } else {
                f15 = 0.0f;
            }
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * sqrt) + f11;
            f6 = f12 + (sqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public void e(float f) {
        this.c = f;
        this.f = h(f);
    }

    public void f(float f) {
        this.a = f;
        this.d = h(f);
    }

    public void g(float f) {
        this.b = f;
        this.e = h(f);
    }

    public C3811Od(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(C5206aw2.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(C5206aw2.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(C5206aw2.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
