package o;

import android.content.Context;

/* renamed from: o.hk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6869hk2 implements InterfaceC6579gY1 {
    public static final String Y = AbstractC6949i41.f("SystemAlarmScheduler");
    public final Context X;

    public C6869hk2(Context context) {
        this.X = context.getApplicationContext();
    }

    @Override // o.InterfaceC6579gY1
    public void a(C8501oN2... workSpecs) {
        for (C8501oN2 c8501oN2 : workSpecs) {
            b(c8501oN2);
        }
    }

    public final void b(C8501oN2 workSpec) {
        AbstractC6949i41.c().a(Y, String.format("Scheduling work with workSpecId %s", workSpec.a), new Throwable[0]);
        this.X.startService(androidx.work.impl.background.systemalarm.a.f(this.X, workSpec.a));
    }

    @Override // o.InterfaceC6579gY1
    public void c(String workSpecId) {
        this.X.startService(androidx.work.impl.background.systemalarm.a.g(this.X, workSpecId));
    }

    @Override // o.InterfaceC6579gY1
    public boolean d() {
        return true;
    }
}
