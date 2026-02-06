package o;

import android.content.Context;
import android.os.Build;

/* renamed from: o.Up1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4446Up1 extends NK<C3568Lp1> {
    public C4446Up1(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).d());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        if (workSpec.j.b() != EnumC3763Np1.UNMETERED) {
            if (Build.VERSION.SDK_INT < 30 || workSpec.j.b() != EnumC3763Np1.TEMPORARILY_UNMETERED) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(C3568Lp1 state) {
        if (state.a() && !state.b()) {
            return false;
        }
        return true;
    }
}
