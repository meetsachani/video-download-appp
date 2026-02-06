package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.uH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9939uH0 extends com.google.android.material.carousel.a {
    public static final int[] d = {1};
    public static final int[] e = {0, 1};
    public int c = 0;

    @Override // com.google.android.material.carousel.a
    @InterfaceC5670cr1
    public com.google.android.material.carousel.c g(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, @InterfaceC5670cr1 View view) {
        int[] iArr;
        int i;
        int[] iArr2;
        int[] iArr3;
        int b = interfaceC8157mz.b();
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (interfaceC8157mz.g()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float d2 = d() + f;
        float max = Math.max(c() + f, d2);
        float f2 = b;
        float min = Math.min(measuredWidth + f, f2);
        float d3 = C9293rd1.d((measuredWidth / 3.0f) + f, d2 + f, max + f);
        float f3 = (min + d3) / 2.0f;
        int i2 = 0;
        int[] iArr4 = f2 < 2.0f * d2 ? new int[]{0} : d;
        int max2 = (int) Math.max(1.0d, Math.floor((f2 - (com.google.android.material.carousel.b.i(iArr) * max)) / min));
        int ceil = (((int) Math.ceil(f2 / min)) - max2) + 1;
        int[] iArr5 = new int[ceil];
        for (int i3 = 0; i3 < ceil; i3++) {
            iArr5[i3] = max2 + i3;
        }
        if (interfaceC8157mz.e() == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            iArr2 = com.google.android.material.carousel.a.a(iArr4);
        } else {
            iArr2 = iArr4;
        }
        if (i != 0) {
            iArr3 = com.google.android.material.carousel.a.a(e);
        } else {
            iArr3 = e;
        }
        C4687Xd c = C4687Xd.c(f2, d3, d2, max, iArr2, f3, iArr3, min, iArr5);
        this.c = c.e();
        if (c.e() > interfaceC8157mz.f()) {
            c = C4687Xd.c(f2, d3, d2, max, iArr4, f3, e, min, iArr5);
        } else {
            i2 = i;
        }
        return com.google.android.material.carousel.b.d(view.getContext(), f, b, c, i2);
    }

    @Override // com.google.android.material.carousel.a
    public boolean j(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, int i) {
        if (interfaceC8157mz.e() == 1) {
            if ((i < this.c && interfaceC8157mz.f() >= this.c) || (i >= this.c && interfaceC8157mz.f() < this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
