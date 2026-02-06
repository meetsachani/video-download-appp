package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC6181ey;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
class WithinAppServiceConnection implements ServiceConnection {
    public final Context X;
    public final Intent Y;
    public final Queue<BindRequest> Y0;
    public final ScheduledExecutorService Z;
    @InterfaceC11300zs1
    public WithinAppServiceBinder Z0;
    @InterfaceC8710pF0("this")
    public boolean a1;

    /* loaded from: classes3.dex */
    public static class BindRequest {
        public final Intent a;
        public final TaskCompletionSource<Void> b = new TaskCompletionSource<>();

        public BindRequest(Intent intent) {
            this.a = intent;
        }

        public static /* synthetic */ void b(BindRequest bindRequest) {
            bindRequest.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + bindRequest.a.getAction() + " finishing.");
            bindRequest.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.o
                @Override // java.lang.Runnable
                public final void run() {
                    WithinAppServiceConnection.BindRequest.b(WithinAppServiceConnection.BindRequest.this);
                }
            }, 20L, TimeUnit.SECONDS);
            e().f(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.p
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        public void d() {
            this.b.e(null);
        }

        public Task<Void> e() {
            return this.b.a();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @InterfaceC8710pF0("this")
    public final void a() {
        while (!this.Y0.isEmpty()) {
            this.Y0.poll().d();
        }
    }

    public final synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.Y0.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                WithinAppServiceBinder withinAppServiceBinder = this.Z0;
                if (withinAppServiceBinder != null && withinAppServiceBinder.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.Z0.b(this.Y0.poll());
                } else {
                    d();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC6181ey
    public synchronized Task<Void> c(Intent intent) {
        BindRequest bindRequest;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            bindRequest = new BindRequest(intent);
            bindRequest.c(this.Z);
            this.Y0.add(bindRequest);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return bindRequest.e();
    }

    @InterfaceC8710pF0("this")
    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.a1);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.a1) {
            this.a1 = true;
            try {
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
            if (ConnectionTracker.b().a(this.X, this.Y, this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
            this.a1 = false;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.a1 = false;
            if (!(iBinder instanceof WithinAppServiceBinder)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.Z0 = (WithinAppServiceBinder) iBinder;
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    @InterfaceC5056aJ2
    public WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.Y0 = new ArrayDeque();
        this.a1 = false;
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext;
        this.Y = new Intent(str).setPackage(applicationContext.getPackageName());
        this.Z = scheduledExecutorService;
    }
}
