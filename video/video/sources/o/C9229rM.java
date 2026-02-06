package o;

import android.content.Context;
import o.PT1;

/* renamed from: o.rM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9229rM {

    /* renamed from: o.rM$a */
    /* loaded from: classes.dex */
    public static final class a implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ InterfaceC8737pM X;
        public final /* synthetic */ b Y;

        public a(InterfaceC8737pM interfaceC8737pM, b bVar) {
            this.X = interfaceC8737pM;
            this.Y = bVar;
        }

        public final void c(Throwable th) {
            this.X.O(this.Y);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.rM$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3783Nu1 {
        public final /* synthetic */ InterfaceC8396ny<R> a;
        public final /* synthetic */ HA0<Context, R> b;

        public b(InterfaceC8396ny<R> interfaceC8396ny, HA0<Context, R> ha0) {
            this.a = interfaceC8396ny;
            this.b = ha0;
        }

        @Override // o.InterfaceC3783Nu1
        public void a(Context context) {
            Object b;
            C6562gT0.p(context, "context");
            HM hm = this.a;
            HA0<Context, R> ha0 = this.b;
            try {
                PT1.a aVar = PT1.Y;
                b = PT1.b(ha0.invoke(context));
            } catch (Throwable th) {
                PT1.a aVar2 = PT1.Y;
                b = PT1.b(RT1.a(th));
            }
            hm.q(b);
        }
    }

    public static final <R> Object a(InterfaceC8737pM interfaceC8737pM, HA0<Context, R> ha0, HM<R> hm) {
        Context v = interfaceC8737pM.v();
        if (v != null) {
            return ha0.invoke(v);
        }
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        b bVar = new b(c8883py, ha0);
        interfaceC8737pM.D(bVar);
        c8883py.X(new a(interfaceC8737pM, bVar));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    public static final <R> Object b(InterfaceC8737pM interfaceC8737pM, HA0<Context, R> ha0, HM<R> hm) {
        Context v = interfaceC8737pM.v();
        if (v != null) {
            return ha0.invoke(v);
        }
        UP0.e(0);
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        b bVar = new b(c8883py, ha0);
        interfaceC8737pM.D(bVar);
        c8883py.X(new a(interfaceC8737pM, bVar));
        C7458kA2 c7458kA2 = C7458kA2.a;
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        UP0.e(1);
        return A;
    }
}
