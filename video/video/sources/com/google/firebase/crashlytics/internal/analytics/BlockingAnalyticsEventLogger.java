package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    public static final String g = "_ae";
    public final CrashlyticsOriginAnalyticsEventLogger a;
    public final int b;
    public final TimeUnit c;
    public CountDownLatch e;
    public final Object d = new Object();
    public boolean f = false;

    public BlockingAnalyticsEventLogger(@InterfaceC5670cr1 CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.a = crashlyticsOriginAnalyticsEventLogger;
        this.b = i;
        this.c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Bundle bundle) {
        synchronized (this.d) {
            try {
                Logger f = Logger.f();
                f.k("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.a(str, bundle);
                Logger.f().k("Awaiting app exception callback from Analytics...");
                try {
                    if (this.e.await(this.b, this.c)) {
                        this.f = true;
                        Logger.f().k("App exception callback received from Analytics listener.");
                    } else {
                        Logger.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
