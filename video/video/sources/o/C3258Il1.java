package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.Il1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3258Il1 extends com.google.android.material.carousel.a {
    public static final int[] d = {1};
    public static final int[] e = {1, 0};
    public int c = 0;

    @Override // com.google.android.material.carousel.a
    @InterfaceC5670cr1
    public com.google.android.material.carousel.c g(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, @InterfaceC5670cr1 View view) {
        boolean z;
        int b = interfaceC8157mz.b();
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC8157mz.g()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float d2 = d() + f;
        float max = Math.max(c() + f, d2);
        float f2 = b;
        float min = Math.min(measuredHeight + f, f2);
        float d3 = C9293rd1.d((measuredHeight / 3.0f) + f, d2 + f, max + f);
        float f3 = (min + d3) / 2.0f;
        int[] iArr = d;
        float f4 = 2.0f * d2;
        if (f2 <= f4) {
            iArr = new int[]{0};
        }
        int[] iArr2 = e;
        if (interfaceC8157mz.e() == 1) {
            iArr = com.google.android.material.carousel.a.a(iArr);
            iArr2 = com.google.android.material.carousel.a.a(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        float f5 = f;
        int ceil = (int) Math.ceil(f2 / min);
        int max2 = (ceil - ((int) Math.max(1.0d, Math.floor(((f2 - (com.google.android.material.carousel.b.i(iArr3) * f3)) - (com.google.android.material.carousel.b.i(iArr4) * max)) / min)))) + 1;
        int[] iArr5 = new int[max2];
        for (int i = 0; i < max2; i++) {
            iArr5[i] = ceil - i;
        }
        C4687Xd c = C4687Xd.c(f2, d3, d2, max, iArr4, f3, iArr3, min, iArr5);
        this.c = c.e();
        boolean k = k(c, interfaceC8157mz.f());
        int i2 = c.d;
        if (i2 == 0 && c.c == 0 && f2 > f4) {
            c.c = 1;
            z = true;
        } else {
            z = k;
        }
        if (z) {
            c = C4687Xd.c(f2, d3, d2, max, new int[]{c.c}, f3, new int[]{i2}, min, new int[]{c.g});
        }
        return com.google.android.material.carousel.b.d(view.getContext(), f5, b, c, interfaceC8157mz.e());
    }

    @Override // com.google.android.material.carousel.a
    public boolean j(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, int i) {
        if (i >= this.c || interfaceC8157mz.f() < this.c) {
            if (i >= this.c && interfaceC8157mz.f() < this.c) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean k(C4687Xd c4687Xd, int i) {
        boolean z;
        int e2 = c4687Xd.e() - i;
        if (e2 > 0 && (c4687Xd.c > 0 || c4687Xd.d > 1)) {
            z = true;
        } else {
            z = false;
        }
        while (e2 > 0) {
            int i2 = c4687Xd.c;
            if (i2 > 0) {
                c4687Xd.c = i2 - 1;
            } else {
                int i3 = c4687Xd.d;
                if (i3 > 1) {
                    c4687Xd.d = i3 - 1;
                }
            }
            e2--;
        }
        return z;
    }
}
