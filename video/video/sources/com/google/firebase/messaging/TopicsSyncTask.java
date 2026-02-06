package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import o.C9273rY;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TopicsSyncTask implements Runnable {
    public static final Object a1 = new Object();
    @InterfaceC8710pF0("TOPIC_SYNC_TASK_LOCK")
    public static Boolean b1;
    @InterfaceC8710pF0("TOPIC_SYNC_TASK_LOCK")
    public static Boolean c1;
    public final Context X;
    public final Metadata Y;
    public final TopicsSubscriber Y0;
    public final PowerManager.WakeLock Z;
    public final long Z0;

    @InterfaceC5056aJ2
    /* loaded from: classes3.dex */
    public class ConnectivityChangeReceiver extends BroadcastReceiver {
        @InterfaceC8710pF0("this")
        @InterfaceC11300zs1
        public TopicsSyncTask a;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.a = topicsSyncTask;
        }

        public void a() {
            if (TopicsSyncTask.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            TopicsSyncTask.this.X.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                TopicsSyncTask topicsSyncTask = this.a;
                if (topicsSyncTask == null) {
                    return;
                }
                if (!topicsSyncTask.i()) {
                    return;
                }
                if (TopicsSyncTask.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.Y0.m(this.a, 0L);
                context.unregisterReceiver(this);
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.Y0 = topicsSubscriber;
        this.X = context;
        this.Z0 = j;
        this.Y = metadata;
        this.Z = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.b);
    }

    public static /* synthetic */ boolean b() {
        return j();
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (a1) {
            try {
                Boolean bool = c1;
                if (bool == null) {
                    booleanValue = g(context, C9273rY.b, bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                c1 = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (a1) {
            try {
                Boolean bool = b1;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                b1 = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean j() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final synchronized boolean i() {
        NetworkInfo networkInfo;
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.X.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z = true;
                }
            }
            z = false;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.X)) {
            this.Z.acquire(Constants.c);
        }
        try {
            try {
                try {
                    this.Y0.o(true);
                    if (!this.Y.g()) {
                        this.Y0.o(false);
                        if (h(this.X)) {
                            try {
                                this.Z.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else if (f(this.X) && !i()) {
                        new ConnectivityChangeReceiver(this).a();
                        if (h(this.X)) {
                            try {
                                this.Z.release();
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else {
                        if (this.Y0.s()) {
                            this.Y0.o(false);
                        } else {
                            this.Y0.t(this.Z0);
                        }
                        if (h(this.X)) {
                            this.Z.release();
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    this.Y0.o(false);
                    if (h(this.X)) {
                        this.Z.release();
                    }
                }
            } catch (Throwable th) {
                if (h(this.X)) {
                    try {
                        this.Z.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
