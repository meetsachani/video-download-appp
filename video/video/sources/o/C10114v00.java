package o;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o.InterfaceC8826pj2;

/* renamed from: o.v00  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10114v00 implements InterfaceC6081eY1 {
    public static final Logger f = Logger.getLogger(Ut2.class.getName());
    public final InterfaceC8257nN2 a;
    public final Executor b;
    public final InterfaceC9562sk c;
    public final InterfaceC4207Se0 d;
    public final InterfaceC8826pj2 e;

    @RP0
    public C10114v00(Executor executor, InterfaceC9562sk interfaceC9562sk, InterfaceC8257nN2 interfaceC8257nN2, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8826pj2 interfaceC8826pj2) {
        this.b = executor;
        this.c = interfaceC9562sk;
        this.a = interfaceC8257nN2;
        this.d = interfaceC4207Se0;
        this.e = interfaceC8826pj2;
    }

    public static /* synthetic */ Object b(C10114v00 c10114v00, Nt2 nt2, AbstractC3033Ge0 abstractC3033Ge0) {
        c10114v00.d.R2(nt2, abstractC3033Ge0);
        c10114v00.a.b(nt2, 1);
        return null;
    }

    public static /* synthetic */ void c(final C10114v00 c10114v00, final Nt2 nt2, Xt2 xt2, AbstractC3033Ge0 abstractC3033Ge0) {
        c10114v00.getClass();
        try {
            InterfaceC3682Mt2 m = c10114v00.c.m(nt2.b());
            if (m == null) {
                String format = String.format("Transport backend '%s' is not registered", nt2.b());
                f.warning(format);
                xt2.a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC3033Ge0 b = m.b(abstractC3033Ge0);
            c10114v00.e.a(new InterfaceC8826pj2.a() { // from class: o.t00
                @Override // o.InterfaceC8826pj2.a
                public final Object execute() {
                    return C10114v00.b(C10114v00.this, nt2, b);
                }
            });
            xt2.a(null);
        } catch (Exception e) {
            Logger logger = f;
            logger.warning("Error scheduling event " + e.getMessage());
            xt2.a(e);
        }
    }

    @Override // o.InterfaceC6081eY1
    public void a(final Nt2 nt2, final AbstractC3033Ge0 abstractC3033Ge0, final Xt2 xt2) {
        this.b.execute(new Runnable() { // from class: o.s00
            @Override // java.lang.Runnable
            public final void run() {
                C10114v00.c(C10114v00.this, nt2, xt2, abstractC3033Ge0);
            }
        });
    }
}
