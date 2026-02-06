package o;

import java.util.concurrent.Executor;
import o.InterfaceC8826pj2;

/* loaded from: classes2.dex */
public class WM2 {
    public final Executor a;
    public final InterfaceC4207Se0 b;
    public final InterfaceC8257nN2 c;
    public final InterfaceC8826pj2 d;

    @RP0
    public WM2(Executor executor, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8257nN2 interfaceC8257nN2, InterfaceC8826pj2 interfaceC8826pj2) {
        this.a = executor;
        this.b = interfaceC4207Se0;
        this.c = interfaceC8257nN2;
        this.d = interfaceC8826pj2;
    }

    public static /* synthetic */ Object a(WM2 wm2) {
        for (Nt2 nt2 : wm2.b.g1()) {
            wm2.c.b(nt2, 1);
        }
        return null;
    }

    public static /* synthetic */ void b(WM2 wm2) {
        wm2.d.a(new InterfaceC8826pj2.a() { // from class: o.VM2
            @Override // o.InterfaceC8826pj2.a
            public final Object execute() {
                return WM2.a(WM2.this);
            }
        });
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: o.UM2
            @Override // java.lang.Runnable
            public final void run() {
                WM2.b(WM2.this);
            }
        });
    }
}
