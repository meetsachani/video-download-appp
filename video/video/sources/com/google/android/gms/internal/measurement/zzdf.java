package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import o.InterfaceC10697xN2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public class zzdf {
    public static volatile zzdf j;
    public final String a;
    public final Clock b;
    public final ExecutorService c;
    public final AppMeasurementSdk d;
    @InterfaceC8710pF0("listenerList")
    public final List<Pair<com.google.android.gms.measurement.internal.zzil, zzb>> e;
    public int f;
    public boolean g;
    public String h;
    public volatile zzcu i;

    /* loaded from: classes3.dex */
    public abstract class zza implements Runnable {
        public final long X;
        public final long Y;
        public final boolean Z;

        public zza(zzdf zzdfVar) {
            this(true);
        }

        public abstract void a() throws RemoteException;

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzdf.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                zzdf.this.v(e, false, this.Z);
                b();
            }
        }

        public zza(boolean z) {
            this.X = zzdf.this.b.a();
            this.Y = zzdf.this.b.b();
            this.Z = z;
        }
    }

    /* loaded from: classes3.dex */
    public static class zzb extends zzcz {
        public final com.google.android.gms.measurement.internal.zzil Y;

        public zzb(com.google.android.gms.measurement.internal.zzil zzilVar) {
            this.Y = zzilVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final int a() {
            return System.identityHashCode(this.Y);
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final void e1(String str, String str2, Bundle bundle, long j) {
            this.Y.a(str, str2, bundle, j);
        }
    }

    /* loaded from: classes3.dex */
    public static class zzc extends zzcz {
        public final com.google.android.gms.measurement.internal.zzim Y;

        public zzc(com.google.android.gms.measurement.internal.zzim zzimVar) {
            this.Y = zzimVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final int a() {
            return System.identityHashCode(this.Y);
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final void e1(String str, String str2, Bundle bundle, long j) {
            this.Y.a(str, str2, bundle, j);
        }
    }

    /* loaded from: classes3.dex */
    public class zzd implements Application.ActivityLifecycleCallbacks {
        public zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdf.this.o(new zzeo(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzdf.this.o(new zzet(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzdf.this.o(new zzes(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzdf.this.o(new zzep(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzcs zzcsVar = new zzcs();
            zzdf.this.o(new zzeu(this, activity, zzcsVar));
            Bundle g1 = zzcsVar.g1(50L);
            if (g1 != null) {
                bundle.putAll(g1);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzdf.this.o(new zzeq(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzdf.this.o(new zzer(this, activity));
        }
    }

    public zzdf(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str != null && P(str2, str3)) {
            this.a = str;
        } else {
            this.a = "FA";
        }
        this.b = DefaultClock.d();
        this.c = zzch.a().a(new zzdr(this), zzcq.a);
        this.d = new AppMeasurementSdk(this);
        this.e = new ArrayList();
        if (K(context) && !Z()) {
            this.h = null;
            this.g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!P(str2, str3)) {
            this.h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.h = str2;
        }
        o(new zzdi(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzd());
        }
    }

    public static boolean K(Context context) {
        if (new com.google.android.gms.measurement.internal.zzgz(context, com.google.android.gms.measurement.internal.zzgz.a(context)).b(FirebaseOptions.i) == null) {
            return false;
        }
        return true;
    }

    public static zzdf f(@InterfaceC5670cr1 Context context) {
        return g(context, null, null, null, null);
    }

    public static zzdf g(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.r(context);
        if (j == null) {
            synchronized (zzdf.class) {
                try {
                    if (j == null) {
                        j = new zzdf(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final void A(String str, String str2, Object obj, boolean z) {
        o(new zzen(this, str, str2, obj, z));
    }

    public final void B(boolean z) {
        o(new zzeh(this, z));
    }

    public final AppMeasurementSdk D() {
        return this.d;
    }

    public final void F(Bundle bundle) {
        o(new zzdn(this, bundle));
    }

    public final void G(com.google.android.gms.measurement.internal.zzil zzilVar) {
        Pair<com.google.android.gms.measurement.internal.zzil, zzb> pair;
        Preconditions.r(zzilVar);
        synchronized (this.e) {
            int i = 0;
            while (true) {
                try {
                    if (i < this.e.size()) {
                        if (zzilVar.equals(this.e.get(i).first)) {
                            pair = this.e.get(i);
                            break;
                        }
                        i++;
                    } else {
                        pair = null;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.a, "OnEventListener had not been registered.");
                return;
            }
            this.e.remove(pair);
            zzb zzbVar = (zzb) pair.second;
            if (this.i != null) {
                try {
                    this.i.unregisterOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            o(new zzem(this, zzbVar));
        }
    }

    public final void H(String str) {
        o(new zzdu(this, str));
    }

    public final void I(String str, String str2) {
        A(null, str, str2, false);
    }

    public final void J(String str, String str2, Bundle bundle) {
        z(str, str2, bundle, true, true, null);
    }

    @InterfaceC10697xN2
    public final Long L() {
        zzcs zzcsVar = new zzcs();
        o(new zzef(this, zzcsVar));
        return zzcsVar.V3(120000L);
    }

    public final void M(Bundle bundle) {
        o(new zzdq(this, bundle));
    }

    public final void N(String str) {
        o(new zzdt(this, str));
    }

    public final boolean P(String str, String str2) {
        if (str2 != null && str != null && !Z()) {
            return true;
        }
        return false;
    }

    public final String Q() {
        return this.h;
    }

    public final void R(Bundle bundle) {
        o(new zzek(this, bundle));
    }

    public final void S(String str) {
        o(new zzdm(this, str));
    }

    @InterfaceC10697xN2
    public final String T() {
        zzcs zzcsVar = new zzcs();
        o(new zzeg(this, zzcsVar));
        return zzcsVar.r4(120000L);
    }

    public final String U() {
        zzcs zzcsVar = new zzcs();
        o(new zzdv(this, zzcsVar));
        return zzcsVar.r4(50L);
    }

    public final String V() {
        zzcs zzcsVar = new zzcs();
        o(new zzea(this, zzcsVar));
        return zzcsVar.r4(500L);
    }

    public final String W() {
        zzcs zzcsVar = new zzcs();
        o(new zzdx(this, zzcsVar));
        return zzcsVar.r4(500L);
    }

    public final String X() {
        zzcs zzcsVar = new zzcs();
        o(new zzdw(this, zzcsVar));
        return zzcsVar.r4(500L);
    }

    public final void Y() {
        o(new zzdp(this));
    }

    public final boolean Z() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int a(String str) {
        zzcs zzcsVar = new zzcs();
        o(new zzed(this, str, zzcsVar));
        Integer num = (Integer) zzcs.o1(zzcsVar.g1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        zzcs zzcsVar = new zzcs();
        o(new zzdy(this, zzcsVar));
        Long V3 = zzcsVar.V3(500L);
        if (V3 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            int i = this.f + 1;
            this.f = i;
            return nextLong + i;
        }
        return V3.longValue();
    }

    public final Bundle c(Bundle bundle, boolean z) {
        zzcs zzcsVar = new zzcs();
        o(new zzeb(this, bundle, zzcsVar));
        if (z) {
            return zzcsVar.g1(5000L);
        }
        return null;
    }

    public final zzcu d(Context context, boolean z) {
        try {
            return zzct.asInterface(DynamiteModule.e(context, DynamiteModule.i, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            v(e, true, false);
            return null;
        }
    }

    public final Object h(int i) {
        zzcs zzcsVar = new zzcs();
        o(new zzei(this, zzcsVar, i));
        return zzcs.o1(zzcsVar.g1(15000L), Object.class);
    }

    public final List<Bundle> i(String str, String str2) {
        zzcs zzcsVar = new zzcs();
        o(new zzdj(this, str, str2, zzcsVar));
        List<Bundle> list = (List) zzcs.o1(zzcsVar.g1(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public final Map<String, Object> j(String str, String str2, boolean z) {
        zzcs zzcsVar = new zzcs();
        o(new zzdz(this, str, str2, z, zzcsVar));
        Bundle g1 = zzcsVar.g1(5000L);
        if (g1 != null && g1.size() != 0) {
            HashMap hashMap = new HashMap(g1.size());
            for (String str3 : g1.keySet()) {
                Object obj = g1.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }

    public final void k(int i, String str, Object obj, Object obj2, Object obj3) {
        o(new zzec(this, false, 5, str, obj, null, null));
    }

    public final void l(long j2) {
        o(new zzds(this, j2));
    }

    public final void m(Activity activity, String str, String str2) {
        o(new zzdl(this, activity, str, str2));
    }

    public final void n(Bundle bundle) {
        o(new zzdh(this, bundle));
    }

    public final void o(zza zzaVar) {
        this.c.execute(zzaVar);
    }

    public final void s(com.google.android.gms.measurement.internal.zzil zzilVar) {
        Preconditions.r(zzilVar);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    if (zzilVar.equals(this.e.get(i).first)) {
                        Log.w(this.a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzb zzbVar = new zzb(zzilVar);
            this.e.add(new Pair<>(zzilVar, zzbVar));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            o(new zzej(this, zzbVar));
        }
    }

    public final void t(com.google.android.gms.measurement.internal.zzim zzimVar) {
        zzc zzcVar = new zzc(zzimVar);
        if (this.i != null) {
            try {
                this.i.setEventInterceptor(zzcVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        o(new zzee(this, zzcVar));
    }

    public final void u(Boolean bool) {
        o(new zzdo(this, bool));
    }

    public final void v(Exception exc, boolean z, boolean z2) {
        zzdf zzdfVar;
        Exception exc2;
        this.g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzdfVar = this;
            exc2 = exc;
            zzdfVar.k(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            zzdfVar = this;
            exc2 = exc;
        }
        Log.w(zzdfVar.a, "Error with data collection. Data lost.", exc2);
    }

    public final void w(@InterfaceC5670cr1 String str, Bundle bundle) {
        z(null, str, bundle, false, true, null);
    }

    public final void x(String str, String str2, Bundle bundle) {
        o(new zzdk(this, str, str2, bundle));
    }

    public final void y(String str, String str2, Bundle bundle, long j2) {
        z(str, str2, bundle, true, false, Long.valueOf(j2));
    }

    public final void z(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        o(new zzel(this, l, str, str2, bundle, z, z2));
    }
}
