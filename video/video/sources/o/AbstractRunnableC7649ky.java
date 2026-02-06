package o;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import o.InterfaceC3395Jv1;
import o.TM2;

/* renamed from: o.ky  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC7649ky implements Runnable {
    public final C3688Mv1 X = new C3688Mv1();

    /* renamed from: o.ky$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC7649ky {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ UUID Z;

        public a(final ZM2 val$workManagerImpl, final UUID val$id) {
            this.Y = val$workManagerImpl;
            this.Z = val$id;
        }

        @Override // o.AbstractRunnableC7649ky
        public void i() {
            WorkDatabase M = this.Y.M();
            M.c();
            try {
                a(this.Y, this.Z.toString());
                M.A();
                M.i();
                h(this.Y);
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* renamed from: o.ky$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC7649ky {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ String Z;

        public b(final ZM2 val$workManagerImpl, final String val$tag) {
            this.Y = val$workManagerImpl;
            this.Z = val$tag;
        }

        @Override // o.AbstractRunnableC7649ky
        public void i() {
            WorkDatabase M = this.Y.M();
            M.c();
            try {
                for (String str : M.L().l(this.Z)) {
                    a(this.Y, str);
                }
                M.A();
                M.i();
                h(this.Y);
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* renamed from: o.ky$c */
    /* loaded from: classes.dex */
    public class c extends AbstractRunnableC7649ky {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ boolean Y0;
        public final /* synthetic */ String Z;

        public c(final ZM2 val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
            this.Y = val$workManagerImpl;
            this.Z = val$name;
            this.Y0 = val$allowReschedule;
        }

        @Override // o.AbstractRunnableC7649ky
        public void i() {
            WorkDatabase M = this.Y.M();
            M.c();
            try {
                for (String str : M.L().g(this.Z)) {
                    a(this.Y, str);
                }
                M.A();
                M.i();
                if (this.Y0) {
                    h(this.Y);
                }
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* renamed from: o.ky$d */
    /* loaded from: classes.dex */
    public class d extends AbstractRunnableC7649ky {
        public final /* synthetic */ ZM2 Y;

        public d(final ZM2 val$workManagerImpl) {
            this.Y = val$workManagerImpl;
        }

        @Override // o.AbstractRunnableC7649ky
        public void i() {
            WorkDatabase M = this.Y.M();
            M.c();
            try {
                for (String str : M.L().z()) {
                    a(this.Y, str);
                }
                new C10425wG1(this.Y.M()).e(System.currentTimeMillis());
                M.A();
                M.i();
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    public static AbstractRunnableC7649ky b(final ZM2 workManagerImpl) {
        return new d(workManagerImpl);
    }

    public static AbstractRunnableC7649ky c(final UUID id, final ZM2 workManagerImpl) {
        return new a(workManagerImpl, id);
    }

    public static AbstractRunnableC7649ky d(final String name, final ZM2 workManagerImpl, final boolean allowReschedule) {
        return new c(workManagerImpl, name, allowReschedule);
    }

    public static AbstractRunnableC7649ky e(final String tag, final ZM2 workManagerImpl) {
        return new b(workManagerImpl, tag);
    }

    public void a(ZM2 workManagerImpl, String workSpecId) {
        g(workManagerImpl.M(), workSpecId);
        workManagerImpl.J().m(workSpecId);
        for (InterfaceC6579gY1 interfaceC6579gY1 : workManagerImpl.L()) {
            interfaceC6579gY1.c(workSpecId);
        }
    }

    public InterfaceC3395Jv1 f() {
        return this.X;
    }

    public final void g(WorkDatabase workDatabase, String workSpecId) {
        InterfaceC8744pN2 L = workDatabase.L();
        InterfaceC8171n20 C = workDatabase.C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            TM2.a i = L.i(str);
            if (i != TM2.a.SUCCEEDED && i != TM2.a.FAILED) {
                L.t(TM2.a.CANCELLED, str);
            }
            linkedList.addAll(C.a(str));
        }
    }

    public void h(ZM2 workManagerImpl) {
        C7792lY1.b(workManagerImpl.F(), workManagerImpl.M(), workManagerImpl.L());
    }

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.X.a(InterfaceC3395Jv1.a);
        } catch (Throwable th) {
            this.X.a(new InterfaceC3395Jv1.b.a(th));
        }
    }
}
