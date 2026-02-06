package o;

import android.content.Context;
import android.os.Build;

/* renamed from: o.Bp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2577Bp1 extends NK<C3568Lp1> {
    public C2577Bp1(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).d());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        if (workSpec.j.b() == EnumC3763Np1.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(C3568Lp1 state) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!state.a() || !state.d()) {
                return true;
            }
            return false;
        }
        return !state.a();
    }
}
