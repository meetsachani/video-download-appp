package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import o.AbstractC6949i41;
import o.C10192vJ2;
import o.NZ0;

/* loaded from: classes.dex */
public class SystemAlarmService extends NZ0 implements d.c {
    public static final String Y0 = AbstractC6949i41.f("SystemAlarmService");
    public d Y;
    public boolean Z;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void c() {
        this.Z = true;
        AbstractC6949i41.c().a(Y0, "All commands completed in dispatcher", new Throwable[0]);
        C10192vJ2.a();
        stopSelf();
    }

    public final void f() {
        d dVar = new d(this);
        this.Y = dVar;
        dVar.m(this);
    }

    @Override // o.NZ0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.Z = false;
    }

    @Override // o.NZ0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.Z = true;
        this.Y.j();
    }

    @Override // o.NZ0, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.Z) {
            AbstractC6949i41.c().d(Y0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.Y.j();
            f();
            this.Z = false;
        }
        if (intent != null) {
            this.Y.a(intent, startId);
            return 3;
        }
        return 3;
    }
}
