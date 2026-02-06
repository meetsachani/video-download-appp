package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import o.C3771Nr1;
import o.C6562gT0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class a0 implements ServiceConnection {
    @NotNull
    public final Context X;
    @NotNull
    public final Handler Y;
    public boolean Y0;
    @Nullable
    public b Z;
    @Nullable
    public Messenger Z0;
    public final int a1;
    public final int b1;
    @NotNull
    public final String c1;
    public final int d1;
    @Nullable
    public final String e1;

    /* loaded from: classes2.dex */
    public static final class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        C6562gT0.p(message, "message");
                        a0.this.e(message);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@Nullable Bundle bundle);
    }

    public a0(@NotNull Context context, int i, int i2, int i3, @NotNull String str, @Nullable String str2) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.a1 = i;
        this.b1 = i2;
        this.c1 = str;
        this.d1 = i3;
        this.e1 = str2;
        this.Y = new a();
    }

    public final void a(Bundle bundle) {
        if (this.Y0) {
            this.Y0 = false;
            b bVar = this.Z;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    public final void b() {
        this.Y0 = false;
    }

    @NotNull
    public final Context c() {
        return this.X;
    }

    @Nullable
    public final String d() {
        return this.e1;
    }

    public final void e(@NotNull Message message) {
        C6562gT0.p(message, "message");
        if (message.what == this.b1) {
            Bundle data = message.getData();
            if (data.getString(Z.K0) != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.X.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public abstract void f(@NotNull Bundle bundle);

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putString(Z.r0, this.c1);
        String str = this.e1;
        if (str != null) {
            bundle.putString(Z.x0, str);
        }
        f(bundle);
        Message obtain = Message.obtain((Handler) null, this.a1);
        obtain.arg1 = this.d1;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.Y);
        try {
            Messenger messenger = this.Z0;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void h(@Nullable b bVar) {
        this.Z = bVar;
    }

    public final boolean i() {
        synchronized (this) {
            boolean z = false;
            if (this.Y0) {
                return false;
            }
            Z z2 = Z.a;
            if (Z.x(this.d1) == -1) {
                return false;
            }
            Intent m = Z.m(c());
            if (m != null) {
                z = true;
                this.Y0 = true;
                c().bindService(m, this, 1);
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
        C6562gT0.p(componentName, "name");
        C6562gT0.p(iBinder, C3771Nr1.Q0);
        this.Z0 = new Messenger(iBinder);
        g();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        C6562gT0.p(componentName, "name");
        this.Z0 = null;
        try {
            this.X.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
