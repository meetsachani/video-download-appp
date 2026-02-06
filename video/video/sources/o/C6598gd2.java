package o;

import android.content.Context;

/* renamed from: o.gd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6598gd2 extends NK<Boolean> {
    public C6598gd2(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).e());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        return workSpec.j.i();
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(Boolean isStorageNotLow) {
        return !isStorageNotLow.booleanValue();
    }
}
