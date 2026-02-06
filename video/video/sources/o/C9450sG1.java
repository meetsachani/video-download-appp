package o;

import android.content.Context;
import java.util.List;

/* renamed from: o.sG1 */
/* loaded from: classes.dex */
public final class C9450sG1 {

    /* renamed from: o.sG1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Context, List<? extends AU<AbstractC10668xG1>>> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final List<AU<AbstractC10668xG1>> invoke(Context context) {
            C6562gT0.p(context, "it");
            return C8222nF.H();
        }
    }

    public static final InterfaceC11186zO1<Context, PU<AbstractC10668xG1>> a(String str, HR1<AbstractC10668xG1> hr1, HA0<? super Context, ? extends List<? extends AU<AbstractC10668xG1>>> ha0, InterfaceC9974uQ interfaceC9974uQ) {
        C6562gT0.p(str, "name");
        C6562gT0.p(ha0, "produceMigrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        return new C10179vG1(str, hr1, ha0, interfaceC9974uQ);
    }

    public static /* synthetic */ InterfaceC11186zO1 b(String str, HR1 hr1, HA0 ha0, InterfaceC9974uQ interfaceC9974uQ, int i, Object obj) {
        if ((i & 2) != 0) {
            hr1 = null;
        }
        if ((i & 4) != 0) {
            ha0 = a.X;
        }
        if ((i & 8) != 0) {
            C8909q40 c8909q40 = C8909q40.a;
            interfaceC9974uQ = C10217vQ.a(C8909q40.c().M(C8088mh2.c(null, 1, null)));
        }
        return a(str, hr1, ha0, interfaceC9974uQ);
    }
}
