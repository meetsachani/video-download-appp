package o;

import java.util.concurrent.CancellationException;
import o.C3679Mt;

/* renamed from: o.bQ */
/* loaded from: classes.dex */
public final class C5324bQ {

    /* renamed from: o.bQ$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ C3679Mt.a<T> X;
        public final /* synthetic */ J10<T> Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C3679Mt.a<T> aVar, J10<? extends T> j10) {
            super(1);
            this.X = aVar;
            this.Y = j10;
        }

        public final void c(Throwable th) {
            if (th != null) {
                if (th instanceof CancellationException) {
                    this.X.d();
                    return;
                } else {
                    this.X.f(th);
                    return;
                }
            }
            this.X.c(this.Y.p());
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    public static final <T> InterfaceFutureC8411o11<T> b(final J10<? extends T> j10, final Object obj) {
        C6562gT0.p(j10, "<this>");
        InterfaceFutureC8411o11<T> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.aQ
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                Object d;
                d = C5324bQ.d(J10.this, obj, aVar);
                return d;
            }
        });
        C6562gT0.o(a2, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a2;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(J10 j10, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(j10, obj);
    }

    public static final Object d(J10 j10, Object obj, C3679Mt.a aVar) {
        C6562gT0.p(j10, "$this_asListenableFuture");
        C6562gT0.p(aVar, "completer");
        j10.i0(new a(aVar, j10));
        return obj;
    }
}
