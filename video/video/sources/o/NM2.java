package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import o.NK;

/* loaded from: classes.dex */
public class NM2 implements NK.a {
    public static final String d = AbstractC6949i41.f("WorkConstraintsTracker");
    public final MM2 a;
    public final NK<?>[] b;
    public final Object c;

    public NM2(Context context, InterfaceC3748Nl2 taskExecutor, MM2 callback) {
        Context applicationContext = context.getApplicationContext();
        this.a = callback;
        this.b = new NK[]{new C6631gm(applicationContext, taskExecutor), new C7116im(applicationContext, taskExecutor), new C6598gd2(applicationContext, taskExecutor), new C2577Bp1(applicationContext, taskExecutor), new C4446Up1(applicationContext, taskExecutor), new C3372Jp1(applicationContext, taskExecutor), new C3274Ip1(applicationContext, taskExecutor)};
        this.c = new Object();
    }

    @Override // o.NK.a
    public void a(List<String> workSpecIds) {
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : workSpecIds) {
                    if (c(str)) {
                        AbstractC6949i41.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                MM2 mm2 = this.a;
                if (mm2 != null) {
                    mm2.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.NK.a
    public void b(List<String> workSpecIds) {
        synchronized (this.c) {
            try {
                MM2 mm2 = this.a;
                if (mm2 != null) {
                    mm2.b(workSpecIds);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String workSpecId) {
        NK<?>[] nkArr;
        synchronized (this.c) {
            try {
                for (NK<?> nk : this.b) {
                    if (nk.d(workSpecId)) {
                        AbstractC6949i41.c().a(d, String.format("Work %s constrained by %s", workSpecId, nk.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable<C8501oN2> workSpecs) {
        synchronized (this.c) {
            try {
                for (NK<?> nk : this.b) {
                    nk.g(null);
                }
                for (NK<?> nk2 : this.b) {
                    nk2.e(workSpecs);
                }
                for (NK<?> nk3 : this.b) {
                    nk3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            try {
                for (NK<?> nk : this.b) {
                    nk.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NM2(MM2 callback, NK<?>[] controllers) {
        this.a = callback;
        this.b = controllers;
        this.c = new Object();
    }
}
