package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.UU1;

/* loaded from: classes.dex */
public class d {
    public final Context a;
    public final String b;
    public int c;
    public final androidx.room.c d;
    public final c.AbstractC0048c e;
    public androidx.room.b f;
    public final Executor g;
    public final androidx.room.a h = new a();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;
    public final Runnable m;

    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0045a {

        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0049a implements Runnable {
            public final /* synthetic */ String[] X;

            public RunnableC0049a(String[] strArr) {
                this.X = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d.h(this.X);
            }
        }

        public a() {
        }

        @Override // androidx.room.a
        public void Z1(String[] strArr) {
            d.this.g.execute(new RunnableC0049a(strArr));
        }
    }

    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f = b.a.O0(iBinder);
            d dVar = d.this;
            dVar.g.execute(dVar.k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.g.execute(dVar.l);
            d.this.f = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f;
                if (bVar != null) {
                    dVar.c = bVar.D5(dVar.h, dVar.b);
                    d dVar2 = d.this;
                    dVar2.d.a(dVar2.e);
                }
            } catch (RemoteException e) {
                Log.w(UU1.a, "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0050d implements Runnable {
        public RunnableC0050d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.d.k(dVar.e);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.d.k(dVar.e);
            try {
                d dVar2 = d.this;
                androidx.room.b bVar = dVar2.f;
                if (bVar != null) {
                    bVar.M7(dVar2.h, dVar2.c);
                }
            } catch (RemoteException e) {
                Log.w(UU1.a, "Cannot unregister multi-instance invalidation callback", e);
            }
            d dVar3 = d.this;
            dVar3.a.unbindService(dVar3.j);
        }
    }

    /* loaded from: classes.dex */
    public class f extends c.AbstractC0048c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0048c
        public boolean a() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0048c
        public void b(Set<String> set) {
            if (!d.this.i.get()) {
                try {
                    d dVar = d.this;
                    androidx.room.b bVar = dVar.f;
                    if (bVar != null) {
                        bVar.n4(dVar.c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w(UU1.a, "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    public d(Context context, String str, androidx.room.c cVar, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        this.k = new c();
        this.l = new RunnableC0050d();
        this.m = new e();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.d = cVar;
        this.g = executor;
        this.e = new f((String[]) cVar.a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }

    public void a() {
        if (this.i.compareAndSet(false, true)) {
            this.g.execute(this.m);
        }
    }
}
