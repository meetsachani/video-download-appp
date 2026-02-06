package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.b;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.AbstractC6949i41;
import o.C10323vs;
import o.C2558Bk2;
import o.C2775Dq;
import o.C3771Nr1;
import o.C5294bI1;
import o.C7792lY1;
import o.C7889lx0;
import o.C8150mx0;
import o.C8393nx0;
import o.C8501oN2;
import o.GP0;
import o.InterfaceC6285fN2;
import o.InterfaceC8744pN2;
import o.QM2;
import o.TM2;
import o.ZM2;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String Z0 = "ACTION_FORCE_STOP_RESCHEDULE";
    public static final int a1 = 3;
    public static final int b1 = -1;
    public static final long c1 = 300;
    public final Context X;
    public final ZM2 Y;
    public int Z = 0;
    public static final String Y0 = AbstractC6949i41.f("ForceStopRunnable");
    public static final long d1 = TimeUnit.DAYS.toMillis(3650);

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = AbstractC6949i41.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && ForceStopRunnable.Z0.equals(intent.getAction())) {
                AbstractC6949i41.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, ZM2 workManager) {
        this.X = context.getApplicationContext();
        this.Y = workManager;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction(Z0);
        return intent;
    }

    public static PendingIntent d(Context context, int flags) {
        return PendingIntent.getBroadcast(context, -1, c(context), flags);
    }

    public static void g(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C3771Nr1.K0);
        if (C2775Dq.k()) {
            i = 167772160;
        } else {
            i = C10323vs.Q0;
        }
        PendingIntent d = d(context, i);
        long currentTimeMillis = System.currentTimeMillis() + d1;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    public boolean a() {
        boolean z;
        boolean i = C2558Bk2.i(this.X, this.Y);
        WorkDatabase M = this.Y.M();
        InterfaceC8744pN2 L = M.L();
        InterfaceC6285fN2 K = M.K();
        M.c();
        try {
            List<C8501oN2> x = L.x();
            if (x != null && !x.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (C8501oN2 c8501oN2 : x) {
                    L.t(TM2.a.ENQUEUED, c8501oN2.a);
                    L.q(c8501oN2.a, -1L);
                }
            }
            K.c();
            M.A();
            M.i();
            if (!z && !i) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            M.i();
            throw th;
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            AbstractC6949i41.c().a(Y0, "Rescheduling Workers.", new Throwable[0]);
            this.Y.R();
            this.Y.I().f(false);
        } else if (e()) {
            AbstractC6949i41.c().a(Y0, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.Y.R();
        } else if (a) {
            AbstractC6949i41.c().a(Y0, "Found unfinished work, scheduling it.", new Throwable[0]);
            C7792lY1.b(this.Y.F(), this.Y.M(), this.Y.L());
        }
    }

    public boolean e() {
        int i;
        try {
            if (C2775Dq.k()) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            PendingIntent d = d(this.X, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List a = C7889lx0.a((ActivityManager) this.X.getSystemService(b.r), null, 0, 0);
                if (a != null && !a.isEmpty()) {
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        if (C8393nx0.a(C8150mx0.a(a.get(i2))) == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                g(this.X);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            AbstractC6949i41.c().h(Y0, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            AbstractC6949i41.c().h(Y0, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a F = this.Y.F();
        if (TextUtils.isEmpty(F.c())) {
            AbstractC6949i41.c().a(Y0, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = C5294bI1.b(this.X, F);
        AbstractC6949i41.c().a(Y0, String.format("Is default app process = %s", Boolean.valueOf(b)), new Throwable[0]);
        return b;
    }

    public boolean h() {
        return this.Y.I().c();
    }

    public void i(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (f()) {
                while (true) {
                    QM2.e(this.X);
                    AbstractC6949i41.c().a(Y0, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        i = this.Z + 1;
                        this.Z = i;
                        if (i >= 3) {
                            AbstractC6949i41 c = AbstractC6949i41.c();
                            String str = Y0;
                            c.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            GP0 d = this.Y.F().d();
                            if (d != null) {
                                AbstractC6949i41.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                                d.a(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            AbstractC6949i41.c().a(Y0, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                            i(this.Z * 300);
                        }
                    }
                    AbstractC6949i41.c().a(Y0, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                    i(this.Z * 300);
                }
            }
        } finally {
            this.Y.Q();
        }
    }
}
