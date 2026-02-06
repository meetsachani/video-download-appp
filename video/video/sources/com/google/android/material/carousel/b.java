package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.c;
import o.C4687Xd;
import o.C7025iN1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class b {
    public static float a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    public static c c(@InterfaceC5670cr1 Context context, float f, int i, @InterfaceC5670cr1 C4687Xd c4687Xd) {
        int i2;
        float f2;
        float f3;
        int i3;
        int i4;
        int i5;
        float min = Math.min(f(context) + f, c4687Xd.f);
        float f4 = min / 2.0f;
        float f5 = 0.0f - f4;
        float b = b(0.0f, c4687Xd.b, c4687Xd.c);
        float j = j(0.0f, a(b, c4687Xd.b, (int) Math.floor(c4687Xd.c / 2.0f)), c4687Xd.b, c4687Xd.c);
        float b2 = b(j, c4687Xd.e, c4687Xd.d);
        float j2 = j(j, a(b2, c4687Xd.e, (int) Math.floor(c4687Xd.d / 2.0f)), c4687Xd.e, c4687Xd.d);
        float b3 = b(j2, c4687Xd.f, c4687Xd.g);
        float j3 = j(j2, a(b3, c4687Xd.f, c4687Xd.g), c4687Xd.f, c4687Xd.g);
        float b4 = b(j3, c4687Xd.e, c4687Xd.d);
        float b5 = b(j(j3, a(b4, c4687Xd.e, (int) Math.ceil(c4687Xd.d / 2.0f)), c4687Xd.e, c4687Xd.d), c4687Xd.b, c4687Xd.c);
        float f6 = i + f4;
        float b6 = a.b(min, c4687Xd.f, f);
        float b7 = a.b(c4687Xd.b, c4687Xd.f, f);
        float b8 = a.b(c4687Xd.e, c4687Xd.f, f);
        c.b a = new c.b(c4687Xd.f, i).a(f5, b6, min);
        if (c4687Xd.c > 0) {
            f2 = 2.0f;
            f3 = b6;
            a.g(b, b7, c4687Xd.b, (int) Math.floor(i2 / 2.0f));
        } else {
            f2 = 2.0f;
            f3 = b6;
        }
        if (c4687Xd.d > 0) {
            a.g(b2, b8, c4687Xd.e, (int) Math.floor(i3 / f2));
        }
        a.h(b3, 0.0f, c4687Xd.f, c4687Xd.g, true);
        if (c4687Xd.d > 0) {
            a.g(b4, b8, c4687Xd.e, (int) Math.ceil(i4 / f2));
        }
        if (c4687Xd.c > 0) {
            a.g(b5, b7, c4687Xd.b, (int) Math.ceil(i5 / f2));
        }
        a.a(f6, f3, min);
        return a.i();
    }

    public static c d(@InterfaceC5670cr1 Context context, float f, int i, @InterfaceC5670cr1 C4687Xd c4687Xd, int i2) {
        if (i2 == 1) {
            return c(context, f, i, c4687Xd);
        }
        return e(context, f, i, c4687Xd);
    }

    public static c e(@InterfaceC5670cr1 Context context, float f, int i, @InterfaceC5670cr1 C4687Xd c4687Xd) {
        float min = Math.min(f(context) + f, c4687Xd.f);
        float f2 = min / 2.0f;
        float f3 = 0.0f - f2;
        float b = b(0.0f, c4687Xd.f, c4687Xd.g);
        float j = j(0.0f, a(b, c4687Xd.f, c4687Xd.g), c4687Xd.f, c4687Xd.g);
        float b2 = b(j, c4687Xd.e, c4687Xd.d);
        float b3 = b(j(j, b2, c4687Xd.e, c4687Xd.d), c4687Xd.b, c4687Xd.c);
        float f4 = i + f2;
        float b4 = a.b(min, c4687Xd.f, f);
        float b5 = a.b(c4687Xd.b, c4687Xd.f, f);
        float b6 = a.b(c4687Xd.e, c4687Xd.f, f);
        c.b h = new c.b(c4687Xd.f, i).a(f3, b4, min).h(b, 0.0f, c4687Xd.f, c4687Xd.g, true);
        if (c4687Xd.d > 0) {
            h.b(b2, b6, c4687Xd.e);
        }
        int i2 = c4687Xd.c;
        if (i2 > 0) {
            h.g(b3, b5, c4687Xd.b, i2);
        }
        h.a(f4, b4, min);
        return h.i();
    }

    public static float f(@InterfaceC5670cr1 Context context) {
        return context.getResources().getDimension(C7025iN1.f.m3_carousel_gone_size);
    }

    public static float g(@InterfaceC5670cr1 Context context) {
        return context.getResources().getDimension(C7025iN1.f.m3_carousel_small_item_size_max);
    }

    public static float h(@InterfaceC5670cr1 Context context) {
        return context.getResources().getDimension(C7025iN1.f.m3_carousel_small_item_size_min);
    }

    public static int i(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
