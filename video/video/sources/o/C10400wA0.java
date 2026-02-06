package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.wA0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10400wA0 extends com.google.android.material.carousel.a {
    @Override // com.google.android.material.carousel.a
    @InterfaceC5670cr1
    public com.google.android.material.carousel.c g(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, @InterfaceC5670cr1 View view) {
        int b;
        int i;
        int i2;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (interfaceC8157mz.g()) {
            b = interfaceC8157mz.a();
            i = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            b = interfaceC8157mz.b();
            i = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        float f = i + i2;
        float f2 = b;
        return com.google.android.material.carousel.b.e(view.getContext(), f, b, new C4687Xd(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f2 + f, f2), 1, f2));
    }
}
