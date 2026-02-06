package o;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C8501oN2;
import o.InterfaceC3395Jv1;
import o.TM2;

/* renamed from: o.dd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC5856dd0 implements Runnable {
    public static final String Z = AbstractC6949i41.f("EnqueueRunnable");
    public final PM2 X;
    public final C3688Mv1 Y = new C3688Mv1();

    public RunnableC5856dd0(PM2 workContinuation) {
        this.X = workContinuation;
    }

    public static boolean b(PM2 workContinuation) {
        boolean c = c(workContinuation.n(), workContinuation.m(), (String[]) PM2.s(workContinuation).toArray(new String[0]), workContinuation.k(), workContinuation.i());
        workContinuation.r();
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(ZM2 workManagerImpl, List<? extends AbstractC7753lN2> workList, String[] prerequisiteIds, String name, EnumC3433Kg0 existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Iterator<? extends AbstractC7753lN2> it;
        boolean z6;
        boolean z7;
        String[] strArr = prerequisiteIds;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase M = workManagerImpl.M();
        if (strArr != null && strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = false;
            z3 = false;
            z4 = true;
            for (String str : strArr) {
                C8501oN2 j = M.L().j(str);
                if (j == null) {
                    AbstractC6949i41.c().b(Z, String.format("Prerequisite %s doesn't exist; not enqueuing", str), new Throwable[0]);
                    return false;
                }
                TM2.a aVar = j.b;
                if (aVar == TM2.a.SUCCEEDED) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 &= z7;
                if (aVar == TM2.a.FAILED) {
                    z3 = true;
                } else if (aVar == TM2.a.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(name);
        if (!isEmpty && !z) {
            List<C8501oN2.b> r = M.L().r(name);
            if (!r.isEmpty()) {
                if (existingWorkPolicy != EnumC3433Kg0.APPEND && existingWorkPolicy != EnumC3433Kg0.APPEND_OR_REPLACE) {
                    if (existingWorkPolicy == EnumC3433Kg0.KEEP) {
                        for (C8501oN2.b bVar : r) {
                            TM2.a aVar2 = bVar.b;
                            if (aVar2 == TM2.a.ENQUEUED || aVar2 == TM2.a.RUNNING) {
                                return false;
                            }
                            while (r2.hasNext()) {
                            }
                        }
                    }
                    AbstractRunnableC7649ky.d(name, workManagerImpl, false).run();
                    InterfaceC8744pN2 L = M.L();
                    for (C8501oN2.b bVar2 : r) {
                        L.a(bVar2.a);
                    }
                    z5 = true;
                    it = workList.iterator();
                    while (it.hasNext()) {
                        AbstractC7753lN2 next = it.next();
                        C8501oN2 d = next.d();
                        if (z && !z4) {
                            if (z3) {
                                d.b = TM2.a.FAILED;
                            } else if (z2) {
                                d.b = TM2.a.CANCELLED;
                            } else {
                                d.b = TM2.a.BLOCKED;
                            }
                        } else if (!d.d()) {
                            d.n = currentTimeMillis;
                        } else {
                            d.n = 0L;
                        }
                        if (Build.VERSION.SDK_INT <= 25) {
                            g(d);
                        }
                        if (d.b == TM2.a.ENQUEUED) {
                            z5 = true;
                        }
                        M.L().b(d);
                        if (z) {
                            int length = strArr.length;
                            int i = 0;
                            while (i < length) {
                                M.C().d(new C7667l20(next.b(), strArr[i]));
                                i++;
                                strArr = strArr;
                                it = it;
                            }
                        }
                        String[] strArr2 = strArr;
                        Iterator<? extends AbstractC7753lN2> it2 = it;
                        for (String str2 : next.c()) {
                            M.M().a(new C9236rN2(str2, next.b()));
                        }
                        if (!isEmpty) {
                            M.J().c(new C5315bN2(name, next.b()));
                        }
                        strArr = strArr2;
                        it = it2;
                    }
                    return z5;
                }
                InterfaceC8171n20 C = M.C();
                List arrayList = new ArrayList();
                for (C8501oN2.b bVar3 : r) {
                    if (!C.c(bVar3.a)) {
                        TM2.a aVar3 = bVar3.b;
                        if (aVar3 == TM2.a.SUCCEEDED) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z8 = z6 & z4;
                        if (aVar3 == TM2.a.FAILED) {
                            z3 = true;
                        } else if (aVar3 == TM2.a.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(bVar3.a);
                        z4 = z8;
                    }
                }
                if (existingWorkPolicy == EnumC3433Kg0.APPEND_OR_REPLACE && (z2 || z3)) {
                    InterfaceC8744pN2 L2 = M.L();
                    for (C8501oN2.b bVar4 : L2.r(name)) {
                        L2.a(bVar4.a);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z2 = false;
                    z3 = false;
                }
                strArr = (String[]) arrayList.toArray(strArr);
                if (strArr.length > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        z5 = false;
        it = workList.iterator();
        while (it.hasNext()) {
        }
        return z5;
    }

    public static boolean e(PM2 workContinuation) {
        List<PM2> l = workContinuation.l();
        boolean z = false;
        if (l != null) {
            boolean z2 = false;
            for (PM2 pm2 : l) {
                if (!pm2.q()) {
                    z2 |= e(pm2);
                } else {
                    AbstractC6949i41.c().h(Z, String.format("Already enqueued work ids (%s).", TextUtils.join(C6566gU0.h, pm2.j())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(workContinuation) | z;
    }

    public static void g(C8501oN2 workSpec) {
        XK xk = workSpec.j;
        String str = workSpec.c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (xk.f() || xk.i()) {
                b.a aVar = new b.a();
                aVar.c(workSpec.e).q(ConstraintTrackingWorker.g1, str);
                workSpec.c = ConstraintTrackingWorker.class.getName();
                workSpec.e = aVar.a();
            }
        }
    }

    public static boolean h(ZM2 workManager, String className) {
        try {
            Class<?> cls = Class.forName(className);
            for (InterfaceC6579gY1 interfaceC6579gY1 : workManager.L()) {
                if (cls.isAssignableFrom(interfaceC6579gY1.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase M = this.X.n().M();
        M.c();
        try {
            boolean e = e(this.X);
            M.A();
            return e;
        } finally {
            M.i();
        }
    }

    public InterfaceC3395Jv1 d() {
        return this.Y;
    }

    public void f() {
        ZM2 n = this.X.n();
        C7792lY1.b(n.F(), n.M(), n.L());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.X.o()) {
                if (a()) {
                    C3107Gx1.c(this.X.n().E(), RescheduleReceiver.class, true);
                    f();
                }
                this.Y.a(InterfaceC3395Jv1.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.X));
        } catch (Throwable th) {
            this.Y.a(new InterfaceC3395Jv1.b.a(th));
        }
    }
}
