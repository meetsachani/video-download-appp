package o;

import android.util.Property;
import android.view.ViewGroup;
import o.C7025iN1;

/* renamed from: o.cC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5510cC extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new C5510cC("childrenAlpha");

    public C5510cC(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @InterfaceC5670cr1
    /* renamed from: a */
    public Float get(@InterfaceC5670cr1 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C7025iN1.h.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C7025iN1.h.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
