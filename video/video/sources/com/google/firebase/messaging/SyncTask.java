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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SyncTask implements Runnable {
    public final long X;
    public final PowerManager.WakeLock Y;
    @InterfaceC5056aJ2
    @SuppressLint({"ThreadPoolCreation"})
    public ExecutorService Y0 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    public final FirebaseMessaging Z;

    @InterfaceC5056aJ2
    /* loaded from: classes3.dex */
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {
        @InterfaceC11300zs1
        public SyncTask a;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.a = syncTask;
        }

        public void a() {
            if (SyncTask.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.a;
            if (syncTask == null || !syncTask.d()) {
                return;
            }
            if (SyncTask.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.a.Z.s(this.a, 0L);
            this.a.b().unregisterReceiver(this);
            this.a = null;
        }
    }

    @InterfaceC5056aJ2
    @SuppressLint({"InvalidWakeLockTag"})
    public SyncTask(FirebaseMessaging firebaseMessaging, long j) {
        this.Z = firebaseMessaging;
        this.X = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.Y = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public Context b() {
        return this.Z.t();
    }

    public boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @InterfaceC5056aJ2
    public boolean e() throws IOException {
        try {
            if (this.Z.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (GmsRpc.h(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (ServiceStarter.b().e(b())) {
            this.Y.acquire();
        }
        try {
            try {
                this.Z.J(true);
                if (!this.Z.D()) {
                    this.Z.J(false);
                    if (!ServiceStarter.b().e(b())) {
                        return;
                    }
                } else if (ServiceStarter.b().d(b()) && !d()) {
                    new ConnectivityChangeReceiver(this).a();
                    if (!ServiceStarter.b().e(b())) {
                        return;
                    }
                } else {
                    if (e()) {
                        this.Z.J(false);
                    } else {
                        this.Z.N(this.X);
                    }
                    if (!ServiceStarter.b().e(b())) {
                        return;
                    }
                }
                this.Y.release();
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.Z.J(false);
                if (ServiceStarter.b().e(b())) {
                    this.Y.release();
                }
            }
        } catch (Throwable th) {
            if (ServiceStarter.b().e(b())) {
                this.Y.release();
            }
            throw th;
        }
    }
}
