package o;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: o.vG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10179vG1 implements InterfaceC11186zO1<Context, PU<AbstractC10668xG1>> {
    public final String a;
    public final HR1<AbstractC10668xG1> b;
    public final HA0<Context, List<AU<AbstractC10668xG1>>> c;
    public final InterfaceC9974uQ d;
    public final Object e;
    public volatile PU<AbstractC10668xG1> f;

    /* renamed from: o.vG1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<File> {
        public final /* synthetic */ Context X;
        public final /* synthetic */ C10179vG1 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C10179vG1 c10179vG1) {
            super(0);
            this.X = context;
            this.Y = c10179vG1;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final File invoke() {
            Context context = this.X;
            C6562gT0.o(context, "applicationContext");
            return C9936uG1.a(context, this.Y.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10179vG1(String str, HR1<AbstractC10668xG1> hr1, HA0<? super Context, ? extends List<? extends AU<AbstractC10668xG1>>> ha0, InterfaceC9974uQ interfaceC9974uQ) {
        C6562gT0.p(str, "name");
        C6562gT0.p(ha0, "produceMigrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        this.a = str;
        this.b = hr1;
        this.c = ha0;
        this.d = interfaceC9974uQ;
        this.e = new Object();
    }

    @Override // o.InterfaceC11186zO1
    /* renamed from: d */
    public PU<AbstractC10668xG1> a(Context context, TW0<?> tw0) {
        PU<AbstractC10668xG1> pu;
        C6562gT0.p(context, "thisRef");
        C6562gT0.p(tw0, "property");
        PU<AbstractC10668xG1> pu2 = this.f;
        if (pu2 == null) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        Context applicationContext = context.getApplicationContext();
                        C9693tG1 c9693tG1 = C9693tG1.a;
                        HR1<AbstractC10668xG1> hr1 = this.b;
                        HA0<Context, List<AU<AbstractC10668xG1>>> ha0 = this.c;
                        C6562gT0.o(applicationContext, "applicationContext");
                        this.f = c9693tG1.b(hr1, ha0.invoke(applicationContext), this.d, new a(applicationContext, this));
                    }
                    pu = this.f;
                    C6562gT0.m(pu);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pu;
        }
        return pu2;
    }
}
