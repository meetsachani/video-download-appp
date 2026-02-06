package o;

import android.content.Context;

/* renamed from: o.Jp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3372Jp1 extends NK<C3568Lp1> {
    public static final String e = AbstractC6949i41.f("NetworkNotRoamingCtrlr");

    public C3372Jp1(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(C3479Kr2.c(context, taskExecutor).d());
    }

    @Override // o.NK
    public boolean b(C8501oN2 workSpec) {
        if (workSpec.j.b() == EnumC3763Np1.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // o.NK
    /* renamed from: i */
    public boolean c(C3568Lp1 state) {
        if (state.a() && state.c()) {
            return false;
        }
        return true;
    }
}
