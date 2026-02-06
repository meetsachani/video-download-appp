package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import o.C2926Fc;
import o.C3607Mb;
import o.C4200Sc1;
import o.C4485Vb;
import o.C4586Wc;
import o.C6342fd1;
import o.C8443o91;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.Y81;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends C4586Wc {
    @Override // o.C4586Wc
    @InterfaceC5670cr1
    public C3607Mb c(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        return new Y81(context, attributeSet);
    }

    @Override // o.C4586Wc
    @InterfaceC5670cr1
    public AppCompatButton d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // o.C4586Wc
    @InterfaceC5670cr1
    public C4485Vb e(Context context, AttributeSet attributeSet) {
        return new C8443o91(context, attributeSet);
    }

    @Override // o.C4586Wc
    @InterfaceC5670cr1
    public C2926Fc k(Context context, AttributeSet attributeSet) {
        return new C4200Sc1(context, attributeSet);
    }

    @Override // o.C4586Wc
    @InterfaceC5670cr1
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new C6342fd1(context, attributeSet);
    }
}
