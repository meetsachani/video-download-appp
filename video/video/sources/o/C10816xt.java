package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import o.C7025iN1;

/* renamed from: o.xt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10816xt {
    @InterfaceC5670cr1
    public final C10330vt a;
    @InterfaceC5670cr1
    public final C10330vt b;
    @InterfaceC5670cr1
    public final C10330vt c;
    @InterfaceC5670cr1
    public final C10330vt d;
    @InterfaceC5670cr1
    public final C10330vt e;
    @InterfaceC5670cr1
    public final C10330vt f;
    @InterfaceC5670cr1
    public final C10330vt g;
    @InterfaceC5670cr1
    public final Paint h;

    public C10816xt(@InterfaceC5670cr1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(X81.g(context, C7025iN1.c.materialCalendarStyle, com.google.android.material.datepicker.f.class.getCanonicalName()), C7025iN1.o.W5);
        this.a = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.b6, 0));
        this.g = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.Z5, 0));
        this.b = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.a6, 0));
        this.c = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.c6, 0));
        ColorStateList a = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.e6);
        this.d = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.g6, 0));
        this.e = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.f6, 0));
        this.f = C10330vt.a(context, obtainStyledAttributes.getResourceId(C7025iN1.o.h6, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
