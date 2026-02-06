package o;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class WU0 extends Service {
    public static final String c1 = "JobIntentService";
    public static final boolean d1 = false;
    public static final Object e1 = new Object();
    public static final HashMap<ComponentName, h> f1 = new HashMap<>();
    public b X;
    public h Y;
    public a Z;
    public final ArrayList<d> b1;
    public boolean Y0 = false;
    public boolean Z0 = false;
    public boolean a1 = false;

    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a = WU0.this.a();
                if (a != null) {
                    WU0.this.h(a.getIntent());
                    a.n();
                } else {
                    return null;
                }
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r1) {
            WU0.this.j();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            WU0.this.j();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        IBinder a();

        e b();
    }

    /* loaded from: classes.dex */
    public static final class c extends h {
        public final Context d;
        public final PowerManager.WakeLock e;
        public final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // o.WU0.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.g) {
                            this.g = true;
                            if (!this.h) {
                                this.e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // o.WU0.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.h) {
                        if (this.g) {
                            this.e.acquire(60000L);
                        }
                        this.h = false;
                        this.f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.WU0.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.f.acquire(600000L);
                        this.e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.WU0.h
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e {
        public final Intent a;
        public final int b;

        public d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // o.WU0.e
        public Intent getIntent() {
            return this.a;
        }

        @Override // o.WU0.e
        public void n() {
            WU0.this.stopSelf(this.b);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Intent getIntent();

        void n();
    }

    /* loaded from: classes.dex */
    public static final class f extends JobServiceEngine implements b {
        public static final String d = "JobServiceEngineImpl";
        public static final boolean e = false;
        public final WU0 a;
        public final Object b;
        public JobParameters c;

        /* loaded from: classes.dex */
        public final class a implements e {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // o.WU0.e
            public Intent getIntent() {
                Intent intent;
                intent = this.a.getIntent();
                return intent;
            }

            @Override // o.WU0.e
            public void n() {
                synchronized (f.this.b) {
                    try {
                        JobParameters jobParameters = f.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public f(WU0 wu0) {
            super(wu0);
            this.b = new Object();
            this.a = wu0;
        }

        @Override // o.WU0.b
        public IBinder a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // o.WU0.b
        public e b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters != null) {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.a.getClassLoader());
                            return new a(dequeueWork);
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends h {
        public final JobInfo d;
        public final JobScheduler e;

        public g(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // o.WU0.h
        public void a(Intent intent) {
            this.e.enqueue(this.d, C5586cV0.a(intent));
        }
    }

    public WU0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b1 = null;
        } else {
            this.b1 = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (e1) {
                h f2 = f(context, componentName, true, i);
                f2.b(i);
                f2.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class<?> cls, int i, Intent intent) {
        c(context, new ComponentName(context, cls), i, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z, int i) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f1;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    cVar = new g(context, componentName, i);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                cVar = new c(context, componentName);
            }
            hashMap.put(componentName, cVar);
            return cVar;
        }
        return hVar;
    }

    public e a() {
        b bVar = this.X;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.b1) {
            try {
                if (this.b1.size() > 0) {
                    return this.b1.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        a aVar = this.Z;
        if (aVar != null) {
            aVar.cancel(this.Y0);
        }
        this.Z0 = true;
        return i();
    }

    public void e(boolean z) {
        if (this.Z == null) {
            this.Z = new a();
            h hVar = this.Y;
            if (hVar != null && z) {
                hVar.d();
            }
            this.Z.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.Z0;
    }

    public abstract void h(Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.b1;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.Z = null;
                    ArrayList<d> arrayList2 = this.b1;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.a1) {
                        this.Y.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(boolean z) {
        this.Y0 = z;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.X;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.X = new f(this);
            this.Y = null;
            return;
        }
        this.X = null;
        this.Y = f(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.b1;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.a1 = true;
                this.Y.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.b1 != null) {
            this.Y.e();
            synchronized (this.b1) {
                ArrayList<d> arrayList = this.b1;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i2));
                e(true);
            }
            return 3;
        }
        return 2;
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public final ComponentName a;
        public boolean b;
        public int c;

        public h(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c == i) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }
}
