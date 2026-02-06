package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.yl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11027yl implements com.google.android.material.floatingactionbutton.b {
    public final Context a;
    @InterfaceC5670cr1
    public final ExtendedFloatingActionButton b;
    public final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    public final C7310ja d;
    @InterfaceC11300zs1
    public C9076ql1 e;
    @InterfaceC11300zs1
    public C9076ql1 f;

    /* renamed from: o.yl$a */
    /* loaded from: classes3.dex */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C5600ca.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f2.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC11027yl.this.b.f2.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f2.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC11027yl.this.b.f2.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C5600ca.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.k0(extendedFloatingActionButton.f2);
            } else {
                extendedFloatingActionButton.k0(valueOf);
            }
        }
    }

    public AbstractC11027yl(@InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton, C7310ja c7310ja) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = c7310ja;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @InterfaceC2591Bt
    public void a() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final C9076ql1 b() {
        C9076ql1 c9076ql1 = this.f;
        if (c9076ql1 != null) {
            return c9076ql1;
        }
        if (this.e == null) {
            this.e = C9076ql1.d(this.a, h());
        }
        return (C9076ql1) C10907yF1.l(this.e);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @InterfaceC11300zs1
    public C9076ql1 d() {
        return this.f;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void f(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @InterfaceC2591Bt
    public void g() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void i(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void j(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.f = c9076ql1;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public AnimatorSet k() {
        return o(b());
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @InterfaceC5670cr1
    public final List<Animator.AnimatorListener> l() {
        return this.c;
    }

    @InterfaceC5670cr1
    public AnimatorSet o(@InterfaceC5670cr1 C9076ql1 c9076ql1) {
        ArrayList arrayList = new ArrayList();
        if (c9076ql1.j("opacity")) {
            arrayList.add(c9076ql1.f("opacity", this.b, View.ALPHA));
        }
        if (c9076ql1.j("scale")) {
            arrayList.add(c9076ql1.f("scale", this.b, View.SCALE_Y));
            arrayList.add(c9076ql1.f("scale", this.b, View.SCALE_X));
        }
        if (c9076ql1.j("width")) {
            arrayList.add(c9076ql1.f("width", this.b, ExtendedFloatingActionButton.u2));
        }
        if (c9076ql1.j("height")) {
            arrayList.add(c9076ql1.f("height", this.b, ExtendedFloatingActionButton.v2));
        }
        if (c9076ql1.j("paddingStart")) {
            arrayList.add(c9076ql1.f("paddingStart", this.b, ExtendedFloatingActionButton.w2));
        }
        if (c9076ql1.j("paddingEnd")) {
            arrayList.add(c9076ql1.f("paddingEnd", this.b, ExtendedFloatingActionButton.x2));
        }
        if (c9076ql1.j("labelOpacity")) {
            arrayList.add(c9076ql1.f("labelOpacity", this.b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C7069ia.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @InterfaceC2591Bt
    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}
