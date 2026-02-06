package o;

import android.content.Context;
import android.os.Build;

/* renamed from: o.Ip1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3274Ip1 extends NK<C3568Lp1> {
    public static final String e = AbstractC6949i41.f("NetworkMeteredCtrlr");

    public C3274Ip1(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).d());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        if (workSpec.j.b() == EnumC3763Np1.METERED) {
            return true;
        }
        return false;
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(C3568Lp1 state) {
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC6949i41.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !state.a();
        } else if (!state.a() || !state.b()) {
            return true;
        } else {
            return false;
        }
    }
}
