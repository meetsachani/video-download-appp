package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.KM1;

/* loaded from: classes.dex */
public class ZM2 extends YM2 {
    public static final int l = 22;
    public static final int m = 23;
    public static final String n = "androidx.work.multiprocess.RemoteWorkManagerClient";
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public InterfaceC3748Nl2 d;
    public List<InterfaceC6579gY1> e;
    public C10187vI1 f;
    public C10425wG1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public volatile AbstractC8272nR1 j;
    public static final String k = AbstractC6949i41.f("WorkManagerImpl");

    /* renamed from: o  reason: collision with root package name */
    public static ZM2 f682o = null;
    public static ZM2 p = null;
    public static final Object q = new Object();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ E22 X;
        public final /* synthetic */ C10425wG1 Y;

        public a(final E22 val$future, final C10425wG1 val$preferenceUtils) {
            this.X = val$future;
            this.Y = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.p(Long.valueOf(this.Y.a()));
            } catch (Throwable th) {
                this.X.q(th);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements InterfaceC6490gB0<List<C8501oN2.c>, TM2> {
        public b() {
        }

        @Override // o.InterfaceC6490gB0
        /* renamed from: a */
        public TM2 apply(List<C8501oN2.c> input) {
            if (input != null && input.size() > 0) {
                return input.get(0).a();
            }
            return null;
        }
    }

    public ZM2(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(KM1.a.workmanager_test_configuration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (o.ZM2.p != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        o.ZM2.p = new o.ZM2(r4, r5, new o.C5072aN2(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        o.ZM2.f682o = o.ZM2.p;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(Context context, androidx.work.a configuration) {
        synchronized (q) {
            try {
                ZM2 zm2 = f682o;
                if (zm2 != null && p != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    @Deprecated
    public static ZM2 G() {
        synchronized (q) {
            try {
                ZM2 zm2 = f682o;
                if (zm2 != null) {
                    return zm2;
                }
                return p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ZM2 H(Context context) {
        ZM2 G;
        synchronized (q) {
            try {
                G = G();
                if (G == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof a.c) {
                        A(applicationContext, ((a.c) applicationContext).a());
                        G = H(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G;
    }

    public static void S(ZM2 delegate) {
        synchronized (q) {
            f682o = delegate;
        }
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 B() {
        RunnableC10927yK1 runnableC10927yK1 = new RunnableC10927yK1(this);
        this.d.o(runnableC10927yK1);
        return runnableC10927yK1.a();
    }

    public List<InterfaceC6579gY1> C(Context context, androidx.work.a configuration, InterfaceC3748Nl2 taskExecutor) {
        return Arrays.asList(C7792lY1.a(context, this), new ME0(context, configuration, taskExecutor, this));
    }

    public PM2 D(String uniqueWorkName, EnumC3335Jg0 existingPeriodicWorkPolicy, DC1 periodicWork) {
        EnumC3433Kg0 enumC3433Kg0;
        if (existingPeriodicWorkPolicy == EnumC3335Jg0.KEEP) {
            enumC3433Kg0 = EnumC3433Kg0.KEEP;
        } else {
            enumC3433Kg0 = EnumC3433Kg0.REPLACE;
        }
        return new PM2(this, uniqueWorkName, enumC3433Kg0, Collections.singletonList(periodicWork));
    }

    public Context E() {
        return this.a;
    }

    public androidx.work.a F() {
        return this.b;
    }

    public C10425wG1 I() {
        return this.g;
    }

    public C10187vI1 J() {
        return this.f;
    }

    public AbstractC8272nR1 K() {
        if (this.j == null) {
            synchronized (q) {
                try {
                    if (this.j == null) {
                        Y();
                        if (this.j == null && !TextUtils.isEmpty(this.b.c())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        return this.j;
    }

    public List<InterfaceC6579gY1> L() {
        return this.e;
    }

    public WorkDatabase M() {
        return this.c;
    }

    public LiveData<List<TM2>> N(List<String> workSpecIds) {
        return J11.a(this.c.L().D(workSpecIds), C8501oN2.u, this.d);
    }

    public InterfaceC3748Nl2 O() {
        return this.d;
    }

    public final void P(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, WorkDatabase workDatabase, List<InterfaceC6579gY1> schedulers, C10187vI1 processor) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = configuration;
        this.d = workTaskExecutor;
        this.c = workDatabase;
        this.e = schedulers;
        this.f = processor;
        this.g = new C10425wG1(workDatabase);
        this.h = false;
        if (!applicationContext.isDeviceProtectedStorage()) {
            this.d.o(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void Q() {
        synchronized (q) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void R() {
        C2558Bk2.b(E());
        M().L().p();
        C7792lY1.b(F(), M(), L());
    }

    public void T(BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (q) {
            try {
                this.i = rescheduleReceiverResult;
                if (this.h) {
                    rescheduleReceiverResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void U(String workSpecId) {
        V(workSpecId, null);
    }

    public void V(String workSpecId, WorkerParameters.a runtimeExtras) {
        this.d.o(new RunnableC6096ec2(this, workSpecId, runtimeExtras));
    }

    public void W(String workSpecId) {
        this.d.o(new RunnableC5858dd2(this, workSpecId, true));
    }

    public void X(String workSpecId) {
        this.d.o(new RunnableC5858dd2(this, workSpecId, false));
    }

    public final void Y() {
        try {
            this.j = (AbstractC8272nR1) Class.forName(n).getConstructor(Context.class, ZM2.class).newInstance(this.a, this);
        } catch (Throwable th) {
            AbstractC6949i41.c().a(k, "Unable to initialize multi-process support", th);
        }
    }

    @Override // o.YM2
    public OM2 a(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work) {
        if (!work.isEmpty()) {
            return new PM2(this, uniqueWorkName, existingWorkPolicy, work);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // o.YM2
    public OM2 c(List<C11069yv1> work) {
        if (!work.isEmpty()) {
            return new PM2(this, work);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 e() {
        AbstractRunnableC7649ky b2 = AbstractRunnableC7649ky.b(this);
        this.d.o(b2);
        return b2.f();
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 f(final String tag) {
        AbstractRunnableC7649ky e = AbstractRunnableC7649ky.e(tag, this);
        this.d.o(e);
        return e.f();
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 g(String uniqueWorkName) {
        AbstractRunnableC7649ky d = AbstractRunnableC7649ky.d(uniqueWorkName, this, true);
        this.d.o(d);
        return d.f();
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 h(UUID id) {
        AbstractRunnableC7649ky c = AbstractRunnableC7649ky.c(id, this);
        this.d.o(c);
        return c.f();
    }

    @Override // o.YM2
    public PendingIntent i(UUID id) {
        int i;
        Intent a2 = androidx.work.impl.foreground.a.a(this.a, id.toString());
        if (C2775Dq.k()) {
            i = 167772160;
        } else {
            i = C10323vs.Q0;
        }
        return PendingIntent.getService(this.a, 0, a2, i);
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 j(List<? extends AbstractC7753lN2> requests) {
        if (!requests.isEmpty()) {
            return new PM2(this, requests).c();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 l(String uniqueWorkName, EnumC3335Jg0 existingPeriodicWorkPolicy, DC1 periodicWork) {
        return D(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).c();
    }

    @Override // o.YM2
    public InterfaceC3395Jv1 m(String uniqueWorkName, EnumC3433Kg0 existingWorkPolicy, List<C11069yv1> work) {
        return new PM2(this, uniqueWorkName, existingWorkPolicy, work).c();
    }

    @Override // o.YM2
    public InterfaceFutureC8411o11<Long> q() {
        E22 u = E22.u();
        this.d.o(new a(u, this.g));
        return u;
    }

    @Override // o.YM2
    public LiveData<Long> r() {
        return this.g.b();
    }

    @Override // o.YM2
    public InterfaceFutureC8411o11<TM2> s(UUID id) {
        AbstractRunnableC4201Sc2<TM2> c = AbstractRunnableC4201Sc2.c(this, id);
        this.d.m().execute(c);
        return c.f();
    }

    @Override // o.YM2
    public LiveData<TM2> t(UUID id) {
        return J11.a(this.c.L().D(Collections.singletonList(id.toString())), new b(), this.d);
    }

    @Override // o.YM2
    public InterfaceFutureC8411o11<List<TM2>> u(C7026iN2 workQuery) {
        AbstractRunnableC4201Sc2<List<TM2>> e = AbstractRunnableC4201Sc2.e(this, workQuery);
        this.d.m().execute(e);
        return e.f();
    }

    @Override // o.YM2
    public InterfaceFutureC8411o11<List<TM2>> v(String tag) {
        AbstractRunnableC4201Sc2<List<TM2>> b2 = AbstractRunnableC4201Sc2.b(this, tag);
        this.d.m().execute(b2);
        return b2.f();
    }

    @Override // o.YM2
    public LiveData<List<TM2>> w(String tag) {
        return J11.a(this.c.L().y(tag), C8501oN2.u, this.d);
    }

    @Override // o.YM2
    public InterfaceFutureC8411o11<List<TM2>> x(String uniqueWorkName) {
        AbstractRunnableC4201Sc2<List<TM2>> d = AbstractRunnableC4201Sc2.d(this, uniqueWorkName);
        this.d.m().execute(d);
        return d.f();
    }

    @Override // o.YM2
    public LiveData<List<TM2>> y(String uniqueWorkName) {
        return J11.a(this.c.L().w(uniqueWorkName), C8501oN2.u, this.d);
    }

    @Override // o.YM2
    public LiveData<List<TM2>> z(C7026iN2 workQuery) {
        return J11.a(this.c.H().a(C7756lO1.b(workQuery)), C8501oN2.u, this.d);
    }

    public ZM2(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, WorkDatabase.B(context.getApplicationContext(), workTaskExecutor.m(), useTestDatabase));
    }

    public ZM2(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, WorkDatabase database) {
        Context applicationContext = context.getApplicationContext();
        AbstractC6949i41.e(new AbstractC6949i41.a(configuration.j()));
        List<InterfaceC6579gY1> C = C(applicationContext, configuration, workTaskExecutor);
        P(context, configuration, workTaskExecutor, database, C, new C10187vI1(context, configuration, workTaskExecutor, database, C));
    }

    public ZM2(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, WorkDatabase workDatabase, List<InterfaceC6579gY1> schedulers, C10187vI1 processor) {
        P(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }
}
