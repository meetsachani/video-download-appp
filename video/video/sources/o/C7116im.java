package o;

import android.content.Context;

/* renamed from: o.im  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7116im extends NK<Boolean> {
    public C7116im(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).b());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        return workSpec.j.f();
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(Boolean isBatteryNotLow) {
        return !isBatteryNotLow.booleanValue();
    }
}
