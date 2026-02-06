package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.C9273rY;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.KS1;
import o.M82;

/* loaded from: classes3.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    public static volatile AnalyticsConnector c;
    @InterfaceC5056aJ2
    public final AppMeasurementSdk a;
    @InterfaceC5056aJ2
    public final Map<String, com.google.firebase.analytics.connector.internal.zza> b;

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.r(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static AnalyticsConnector h() {
        return i(FirebaseApp.p());
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static AnalyticsConnector i(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.l(AnalyticsConnector.class);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @KS1(allOf = {"android.permission.INTERNET", C9273rY.b, "android.permission.WAKE_LOCK"})
    public static AnalyticsConnector j(@InterfaceC5670cr1 FirebaseApp firebaseApp, @InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Subscriber subscriber) {
        Preconditions.r(firebaseApp);
        Preconditions.r(context);
        Preconditions.r(subscriber);
        Preconditions.r(context.getApplicationContext());
        if (c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.B()) {
                            subscriber.b(DataCollectionDefaultChange.class, new Executor() { // from class: com.google.firebase.analytics.connector.zza
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new EventHandler() { // from class: com.google.firebase.analytics.connector.zzb
                                @Override // com.google.firebase.events.EventHandler
                                public final void a(Event event) {
                                    AnalyticsConnectorImpl.k(event);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.A());
                        }
                        c = new AnalyticsConnectorImpl(zzdf.g(context, null, null, null, bundle).D());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void k(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.a()).a;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.r(c)).a.B(z);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void a(@InterfaceC5670cr1 AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (!com.google.firebase.analytics.connector.internal.zzb.h(conditionalUserProperty)) {
            return;
        }
        this.a.t(com.google.firebase.analytics.connector.internal.zzb.a(conditionalUserProperty));
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.zzb.m(str) || !com.google.firebase.analytics.connector.internal.zzb.e(str2, bundle) || !com.google.firebase.analytics.connector.internal.zzb.i(str, str2, bundle)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.zzb.d(str, str2, bundle);
        this.a.o(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Object obj) {
        if (!com.google.firebase.analytics.connector.internal.zzb.m(str) || !com.google.firebase.analytics.connector.internal.zzb.f(str, str2)) {
            return;
        }
        this.a.z(str, str2, obj);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(@M82(max = 24, min = 1) @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle) {
        if (str2 != null && !com.google.firebase.analytics.connector.internal.zzb.e(str2, bundle)) {
            return;
        }
        this.a.b(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    public Map<String, Object> d(boolean z) {
        return this.a.n(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    @InterfaceC10697xN2
    public int e(@M82(min = 1) @InterfaceC5670cr1 String str) {
        return this.a.m(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    public List<AnalyticsConnector.ConditionalUserProperty> f(@InterfaceC5670cr1 String str, @M82(max = 23, min = 1) @InterfaceC5670cr1 String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.g(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.zzb.b(bundle));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    public AnalyticsConnector.AnalyticsConnectorHandle g(@InterfaceC5670cr1 final String str, @InterfaceC5670cr1 AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzaVar;
        Preconditions.r(analyticsConnectorListener);
        if (!com.google.firebase.analytics.connector.internal.zzb.m(str) || m(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.a;
        if ("fiam".equals(str)) {
            zzaVar = new zze(appMeasurementSdk, analyticsConnectorListener);
        } else if ("clx".equals(str)) {
            zzaVar = new zzg(appMeasurementSdk, analyticsConnectorListener);
        } else {
            zzaVar = null;
        }
        if (zzaVar == null) {
            return null;
        }
        this.b.put(str, zzaVar);
        return new AnalyticsConnector.AnalyticsConnectorHandle() { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            public void a() {
                if (!AnalyticsConnectorImpl.this.m(str)) {
                    return;
                }
                AnalyticsConnector.AnalyticsConnectorListener a = AnalyticsConnectorImpl.this.b.get(str).a();
                if (a != null) {
                    a.a(0, null);
                }
                AnalyticsConnectorImpl.this.b.remove(str);
            }

            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            @KeepForSdk
            public void b() {
                if (AnalyticsConnectorImpl.this.m(str) && str.equals("fiam")) {
                    AnalyticsConnectorImpl.this.b.get(str).b();
                }
            }

            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            @KeepForSdk
            public void c(Set<String> set) {
                if (AnalyticsConnectorImpl.this.m(str) && str.equals("fiam") && set != null && !set.isEmpty()) {
                    AnalyticsConnectorImpl.this.b.get(str).c(set);
                }
            }
        };
    }

    public final boolean m(@InterfaceC5670cr1 String str) {
        if (!str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null) {
            return true;
        }
        return false;
    }
}
