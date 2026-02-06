package o;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes3.dex */
public class B60 extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new B60();

    public B60() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Override // android.util.Property
    @InterfaceC11300zs1
    /* renamed from: a */
    public Integer get(@InterfaceC5670cr1 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
