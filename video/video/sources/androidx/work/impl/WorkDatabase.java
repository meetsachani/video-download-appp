package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C6729hA0;
import o.InterfaceC10528wh2;
import o.InterfaceC10771xh2;
import o.InterfaceC5557cN2;
import o.InterfaceC6285fN2;
import o.InterfaceC8171n20;
import o.InterfaceC8715pG1;
import o.InterfaceC8744pN2;
import o.InterfaceC8747pO1;
import o.InterfaceC9479sN2;
import o.InterfaceC9808tk2;
import o.QM2;
import o.UU1;
import o.VU1;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends VU1 {
    public static final String n = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";

    /* renamed from: o  reason: collision with root package name */
    public static final String f66o = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    public static final long p = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    public class a implements InterfaceC10771xh2.c {
        public final /* synthetic */ Context a;

        public a(final Context val$context) {
            this.a = val$context;
        }

        @Override // o.InterfaceC10771xh2.c
        public InterfaceC10771xh2 a(InterfaceC10771xh2.b configuration) {
            InterfaceC10771xh2.b.a a = InterfaceC10771xh2.b.a(this.a);
            a.c(configuration.b).b(configuration.c).d(true);
            return new C6729hA0().a(a.a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends VU1.b {
        @Override // o.VU1.b
        public void c(InterfaceC10528wh2 db) {
            super.c(db);
            db.w0();
            try {
                db.K0(WorkDatabase.F());
                db.s1();
            } finally {
                db.W1();
            }
        }
    }

    public static WorkDatabase B(final Context context, Executor queryExecutor, boolean useTestDatabase) {
        VU1.a a2;
        if (useTestDatabase) {
            a2 = UU1.c(context, WorkDatabase.class).c();
        } else {
            a2 = UU1.a(context, WorkDatabase.class, QM2.d());
            a2.k(new a(context));
        }
        return (WorkDatabase) a2.m(queryExecutor).a(D()).b(androidx.work.impl.a.y).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.z).b(androidx.work.impl.a.A).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.B).b(androidx.work.impl.a.C).b(androidx.work.impl.a.D).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.E).h().d();
    }

    public static VU1.b D() {
        return new b();
    }

    public static long E() {
        return System.currentTimeMillis() - p;
    }

    public static String F() {
        return n + E() + f66o;
    }

    public abstract InterfaceC8171n20 C();

    public abstract InterfaceC8715pG1 G();

    public abstract InterfaceC8747pO1 H();

    public abstract InterfaceC9808tk2 I();

    public abstract InterfaceC5557cN2 J();

    public abstract InterfaceC6285fN2 K();

    public abstract InterfaceC8744pN2 L();

    public abstract InterfaceC9479sN2 M();
}
