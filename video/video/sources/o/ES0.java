package o;

import java.util.Objects;
import java.util.concurrent.Executor;
import o.C3679Mt;
import o.InterfaceC7024iN0;

/* loaded from: classes.dex */
public class ES0 {
    public final Executor a;
    public final InterfaceC7024iN0 b;
    public final InterfaceC10929yL<Throwable> c;

    public ES0(AbstractC4078Qw abstractC4078Qw) {
        boolean z;
        if (abstractC4078Qw.f() == 4) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.a(z);
        this.a = abstractC4078Qw.c();
        InterfaceC7024iN0 d = abstractC4078Qw.d();
        Objects.requireNonNull(d);
        this.b = d;
        this.c = abstractC4078Qw.b();
    }

    public static /* synthetic */ Object a(final ES0 es0, final InterfaceC7024iN0.b bVar, final C3679Mt.a aVar) {
        es0.a.execute(new Runnable() { // from class: o.CS0
            @Override // java.lang.Runnable
            public final void run() {
                ES0.b(ES0.this, bVar, aVar);
            }
        });
        return "InternalImageProcessor#process " + bVar.hashCode();
    }

    public static /* synthetic */ void b(ES0 es0, InterfaceC7024iN0.b bVar, C3679Mt.a aVar) {
        es0.getClass();
        try {
            aVar.c(es0.b.a(bVar));
        } catch (C7993mI1 e) {
            es0.c.accept(e);
            aVar.f(e);
        }
    }

    public InterfaceC7024iN0.c c(final InterfaceC7024iN0.b bVar) throws DM0 {
        try {
            return (InterfaceC7024iN0.c) C3679Mt.a(new C3679Mt.c() { // from class: o.DS0
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return ES0.a(ES0.this, bVar, aVar);
                }
            }).get();
        } catch (Exception e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new DM0(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
