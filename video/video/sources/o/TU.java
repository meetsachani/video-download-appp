package o;

import android.content.Context;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class TU<T> implements InterfaceC11186zO1<Context, PU<T>> {
    public final String a;
    public final B12<T> b;
    public final HR1<T> c;
    public final HA0<Context, List<AU<T>>> d;
    public final InterfaceC9974uQ e;
    public final Object f;
    public volatile PU<T> g;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<File> {
        public final /* synthetic */ Context X;
        public final /* synthetic */ TU<T> Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, TU<T> tu) {
            super(0);
            this.X = context;
            this.Y = tu;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final File invoke() {
            Context context = this.X;
            C6562gT0.o(context, "applicationContext");
            return SU.a(context, this.Y.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TU(String str, B12<T> b12, HR1<T> hr1, HA0<? super Context, ? extends List<? extends AU<T>>> ha0, InterfaceC9974uQ interfaceC9974uQ) {
        C6562gT0.p(str, "fileName");
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(ha0, "produceMigrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        this.a = str;
        this.b = b12;
        this.c = hr1;
        this.d = ha0;
        this.e = interfaceC9974uQ;
        this.f = new Object();
    }

    @Override // o.InterfaceC11186zO1
    /* renamed from: d */
    public PU<T> a(Context context, TW0<?> tw0) {
        PU<T> pu;
        C6562gT0.p(context, "thisRef");
        C6562gT0.p(tw0, "property");
        PU<T> pu2 = this.g;
        if (pu2 == null) {
            synchronized (this.f) {
                try {
                    if (this.g == null) {
                        Context applicationContext = context.getApplicationContext();
                        B12<T> b12 = this.b;
                        HR1<T> hr1 = this.c;
                        HA0<Context, List<AU<T>>> ha0 = this.d;
                        C6562gT0.o(applicationContext, "applicationContext");
                        this.g = RU.a.b(b12, hr1, ha0.invoke(applicationContext), this.e, new a(applicationContext, this));
                    }
                    pu = this.g;
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
