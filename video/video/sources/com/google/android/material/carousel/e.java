package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import com.google.android.material.carousel.c;
import o.InterfaceC5670cr1;
import o.InterfaceC8157mz;

/* loaded from: classes3.dex */
public final class e extends a {
    public static final float c = 0.85f;

    @Override // com.google.android.material.carousel.a
    public a.EnumC0121a e() {
        return a.EnumC0121a.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.a
    @InterfaceC5670cr1
    public c g(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, @InterfaceC5670cr1 View view) {
        int b;
        float f;
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        } else {
            b = interfaceC8157mz.b();
        }
        int i = b;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f2 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC8157mz.g()) {
            f2 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f3 = measuredHeight;
        float f4 = f2;
        float f5 = f3 + f4;
        float f6 = b.f(view.getContext()) + f4;
        float f7 = b.f(view.getContext()) + f4;
        int max = Math.max(1, (int) Math.floor(f / f5));
        float f8 = i - (max * f5);
        if (interfaceC8157mz.e() == 1) {
            float f9 = f8 / 2.0f;
            return l(i, f4, f5, max, Math.max(Math.min(3.0f * f9, f5), d() + f4), f7, f9);
        }
        int i2 = 1;
        if (f8 <= 0.0f) {
            i2 = 0;
        }
        return m(view.getContext(), f4, i, f5, max, k(f6, f5, f8), i2, f7);
    }

    public final float k(float f, float f2, float f3) {
        float max = Math.max(1.5f * f3, f);
        float f4 = 0.85f * f2;
        if (max > f4) {
            max = Math.max(f4, f3 * 1.2f);
        }
        return Math.min(f2, max);
    }

    public final c l(int i, float f, float f2, int i2, float f3, float f4, float f5) {
        float min = Math.min(f4, f2);
        float b = a.b(min, f2, f);
        float b2 = a.b(f3, f2, f);
        float f6 = f3 / 2.0f;
        float f7 = (f5 + 0.0f) - f6;
        float f8 = f7 + f6;
        float f9 = min / 2.0f;
        float f10 = (i2 * f2) + f8;
        c.b h = new c.b(f2, i).a((f7 - f6) - f9, b, min).c(f7, b2, f3, false).h((f2 / 2.0f) + f8, 0.0f, f2, i2, true);
        h.c(f6 + f10, b2, f3, false);
        h.a(f10 + f3 + f9, b, min);
        return h.i();
    }

    public final c m(Context context, float f, int i, float f2, int i2, float f3, int i3, float f4) {
        float min = Math.min(f4, f2);
        float max = Math.max(min, 0.5f * f3);
        float b = a.b(max, f2, f);
        float b2 = a.b(min, f2, f);
        float b3 = a.b(f3, f2, f);
        float f5 = (i2 * f2) + 0.0f;
        c.b h = new c.b(f2, i).a(0.0f - (max / 2.0f), b, max).h(f2 / 2.0f, 0.0f, f2, i2, true);
        if (i3 > 0) {
            float f6 = (f3 / 2.0f) + f5;
            f5 += f3;
            h.c(f6, b3, f3, false);
        }
        h.a(f5 + (b.f(context) / 2.0f), b2, min);
        return h.i();
    }
}
