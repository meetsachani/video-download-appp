package o;

import android.content.Context;

/* renamed from: o.gm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6631gm extends NK<Boolean> {
    public C6631gm(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).a());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        return workSpec.j.g();
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(Boolean isBatteryCharging) {
        return !isBatteryCharging.booleanValue();
    }
}
