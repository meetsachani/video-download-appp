package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Metadata;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn implements ServiceConnection {
    public zzp Z;
    public final /* synthetic */ zzu a1;
    public int X = 0;
    public final Messenger Y = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzk
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            zzn zznVar = zzn.this;
            synchronized (zznVar) {
                try {
                    zzr zzrVar = (zzr) zznVar.Z0.get(i);
                    if (zzrVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    zznVar.Z0.remove(i);
                    zznVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zzrVar.c(new zzs(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    zzrVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final Queue Y0 = new ArrayDeque();
    public final SparseArray Z0 = new SparseArray();

    public /* synthetic */ zzn(zzu zzuVar, zzm zzmVar) {
        this.a1 = zzuVar;
    }

    public final synchronized void a(int i, @InterfaceC11300zs1 String str) {
        b(i, str, null);
    }

    public final synchronized void b(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.X;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.X = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.X = 4;
                ConnectionTracker.b().c(zzu.a(this.a1), this);
                zzs zzsVar = new zzs(i, str, th);
                for (zzr zzrVar : this.Y0) {
                    zzrVar.c(zzsVar);
                }
                this.Y0.clear();
                for (int i3 = 0; i3 < this.Z0.size(); i3++) {
                    ((zzr) this.Z0.valueAt(i3)).c(zzsVar);
                }
                this.Z0.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        zzu.e(this.a1).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzr zzrVar;
                while (true) {
                    final zzn zznVar = zzn.this;
                    synchronized (zznVar) {
                        try {
                            if (zznVar.X == 2) {
                                if (zznVar.Y0.isEmpty()) {
                                    zznVar.f();
                                    return;
                                }
                                zzrVar = (zzr) zznVar.Y0.poll();
                                zznVar.Z0.put(zzrVar.a, zzrVar);
                                zzu.e(zznVar.a1).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzn.this.e(zzrVar.a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            } else {
                                return;
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzrVar)));
                    }
                    zzu zzuVar = zznVar.a1;
                    Messenger messenger = zznVar.Y;
                    int i = zzrVar.c;
                    Context a = zzu.a(zzuVar);
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = zzrVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzrVar.b());
                    bundle.putString("pkg", a.getPackageName());
                    bundle.putBundle("data", zzrVar.d);
                    obtain.setData(bundle);
                    try {
                        zznVar.Z.a(obtain);
                    } catch (RemoteException e) {
                        zznVar.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.X == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i) {
        zzr zzrVar = (zzr) this.Z0.get(i);
        if (zzrVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.Z0.remove(i);
            zzrVar.c(new zzs(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.X == 2 && this.Y0.isEmpty() && this.Z0.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.X = 3;
                ConnectionTracker.b().c(zzu.a(this.a1), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(zzr zzrVar) {
        boolean z;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.Y0.add(zzrVar);
                c();
                return true;
            }
            this.Y0.add(zzrVar);
            return true;
        }
        this.Y0.add(zzrVar);
        if (this.X == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.x(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.X = 1;
        Intent intent = new Intent(Metadata.i);
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.b().a(zzu.a(this.a1), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                zzu.e(this.a1).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzn.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzu.e(this.a1).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzn zznVar = zzn.this;
                IBinder iBinder2 = iBinder;
                synchronized (zznVar) {
                    if (iBinder2 == null) {
                        zznVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        zznVar.Z = new zzp(iBinder2);
                        zznVar.X = 2;
                        zznVar.c();
                    } catch (RemoteException e) {
                        zznVar.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzu.e(this.a1).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzn.this.a(2, "Service disconnected");
            }
        });
    }
}
