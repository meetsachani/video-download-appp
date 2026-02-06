package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8557od0;
import o.InterfaceC8710pF0;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzct {
    @InterfaceC5056aJ2
    public zzhf Y = null;
    @InterfaceC8710pF0("listenerMap")
    public final Map<Integer, zzil> Z = new C2531Be();

    /* loaded from: classes3.dex */
    public class zza implements zzim {
        public com.google.android.gms.internal.measurement.zzda a;

        public zza(com.google.android.gms.internal.measurement.zzda zzdaVar) {
            this.a = zzdaVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzim
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.e1(str, str2, bundle, j);
            } catch (RemoteException e) {
                zzhf zzhfVar = AppMeasurementDynamiteService.this.Y;
                if (zzhfVar != null) {
                    zzhfVar.j().L().b("Event interceptor threw exception", e);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class zzb implements zzil {
        public com.google.android.gms.internal.measurement.zzda a;

        public zzb(com.google.android.gms.internal.measurement.zzda zzdaVar) {
            this.a = zzdaVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzil
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.e1(str, str2, bundle, j);
            } catch (RemoteException e) {
                zzhf zzhfVar = AppMeasurementDynamiteService.this.Y;
                if (zzhfVar != null) {
                    zzhfVar.j().L().b("Event listener threw exception", e);
                }
            }
        }
    }

    @InterfaceC8557od0({"scion"})
    public final void a() {
        if (this.Y != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(@InterfaceC5670cr1 String str, long j) throws RemoteException {
        a();
        this.Y.y().z(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle) throws RemoteException {
        a();
        this.Y.H().Y(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long j) throws RemoteException {
        a();
        this.Y.H().S(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(@InterfaceC5670cr1 String str, long j) throws RemoteException {
        a();
        this.Y.y().D(str, j);
    }

    public final void g1(com.google.android.gms.internal.measurement.zzcv zzcvVar, String str) {
        a();
        this.Y.L().R(zzcvVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        long P0 = this.Y.L().P0();
        a();
        this.Y.L().P(zzcvVar, P0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        this.Y.l().D(new zzi(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        g1(zzcvVar, this.Y.H().j0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        this.Y.l().D(new zzl(this, zzcvVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        g1(zzcvVar, this.Y.H().k0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        g1(zzcvVar, this.Y.H().l0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        g1(zzcvVar, this.Y.H().m0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        this.Y.H();
        Preconditions.l(str);
        a();
        this.Y.L().O(zzcvVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        zziq H = this.Y.H();
        H.l().D(new zzjq(H, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcv zzcvVar, int i) throws RemoteException {
        a();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        this.Y.L().T(zzcvVar, this.Y.H().f0().booleanValue());
                        return;
                    }
                    this.Y.L().O(zzcvVar, this.Y.H().h0().intValue());
                    return;
                }
                zznd L = this.Y.L();
                double doubleValue = this.Y.H().g0().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    zzcvVar.v0(bundle);
                    return;
                } catch (RemoteException e) {
                    L.a.j().L().b("Error returning double value to wrapper", e);
                    return;
                }
            }
            this.Y.L().P(zzcvVar, this.Y.H().i0().longValue());
            return;
        }
        this.Y.L().R(zzcvVar, this.Y.H().n0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        this.Y.l().D(new zzj(this, zzcvVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(@InterfaceC5670cr1 Map map) throws RemoteException {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdd zzddVar, long j) throws RemoteException {
        zzhf zzhfVar = this.Y;
        if (zzhfVar == null) {
            this.Y = zzhf.c((Context) Preconditions.r((Context) ObjectWrapper.o1(iObjectWrapper)), zzddVar, Long.valueOf(j));
        } else {
            zzhfVar.j().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcv zzcvVar) throws RemoteException {
        a();
        this.Y.l().D(new zzn(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        a();
        this.Y.H().a0(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcv zzcvVar, long j) throws RemoteException {
        Bundle bundle2;
        a();
        Preconditions.l(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString(CrashlyticsAnalyticsListener.c, FirebaseMessaging.r);
        this.Y.l().D(new zzk(this, zzcvVar, new zzbg(str2, new zzbb(bundle), FirebaseMessaging.r, j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int i, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 IObjectWrapper iObjectWrapper, @InterfaceC5670cr1 IObjectWrapper iObjectWrapper2, @InterfaceC5670cr1 IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object o1;
        Object o12;
        a();
        Object obj = null;
        if (iObjectWrapper == null) {
            o1 = null;
        } else {
            o1 = ObjectWrapper.o1(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            o12 = null;
        } else {
            o12 = ObjectWrapper.o1(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.o1(iObjectWrapper3);
        }
        this.Y.j().z(i, true, false, str, o1, o12, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, @InterfaceC5670cr1 Bundle bundle, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityCreated((Activity) ObjectWrapper.o1(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityDestroyed((Activity) ObjectWrapper.o1(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityPaused((Activity) ObjectWrapper.o1(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityResumed((Activity) ObjectWrapper.o1(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcv zzcvVar, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        Bundle bundle = new Bundle();
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivitySaveInstanceState((Activity) ObjectWrapper.o1(iObjectWrapper), bundle);
        }
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.Y.j().L().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityStarted((Activity) ObjectWrapper.o1(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        a();
        zzjx zzjxVar = this.Y.H().c;
        if (zzjxVar != null) {
            this.Y.H().p0();
            zzjxVar.onActivityStopped((Activity) ObjectWrapper.o1(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcv zzcvVar, long j) throws RemoteException {
        a();
        zzcvVar.v0(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzil zzilVar;
        a();
        synchronized (this.Z) {
            try {
                zzilVar = this.Z.get(Integer.valueOf(zzdaVar.a()));
                if (zzilVar == null) {
                    zzilVar = new zzb(zzdaVar);
                    this.Z.put(Integer.valueOf(zzdaVar.a()), zzilVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Y.H().M(zzilVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long j) throws RemoteException {
        a();
        zziq H = this.Y.H();
        H.U(null);
        H.l().D(new zzjk(H, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(@InterfaceC5670cr1 Bundle bundle, long j) throws RemoteException {
        a();
        if (bundle == null) {
            this.Y.j().G().a("Conditional user property must not be null");
        } else {
            this.Y.H().I(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(@InterfaceC5670cr1 final Bundle bundle, final long j) throws RemoteException {
        a();
        final zziq H = this.Y.H();
        H.l().G(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziw
            @Override // java.lang.Runnable
            public final void run() {
                zziq zziqVar = zziq.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zziqVar.p().G())) {
                    zziqVar.H(bundle2, 0, j2);
                } else {
                    zziqVar.j().M().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(@InterfaceC5670cr1 Bundle bundle, long j) throws RemoteException {
        a();
        this.Y.H().H(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, long j) throws RemoteException {
        a();
        this.Y.I().H((Activity) ObjectWrapper.o1(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        a();
        zziq H = this.Y.H();
        H.v();
        H.l().D(new zzjb(H, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(@InterfaceC5670cr1 Bundle bundle) {
        final Bundle bundle2;
        a();
        final zziq H = this.Y.H();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        H.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzit
            @Override // java.lang.Runnable
            public final void run() {
                zziq.this.G(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        a();
        zza zzaVar = new zza(zzdaVar);
        if (this.Y.l().J()) {
            this.Y.H().N(zzaVar);
        } else {
            this.Y.l().D(new zzm(this, zzaVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdb zzdbVar) throws RemoteException {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        a();
        this.Y.H().S(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long j) throws RemoteException {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        a();
        zziq H = this.Y.H();
        H.l().D(new zzjd(H, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(@InterfaceC5670cr1 final String str, long j) throws RemoteException {
        a();
        final zziq H = this.Y.H();
        if (str != null && TextUtils.isEmpty(str)) {
            H.a.j().L().a("User ID must be non-empty or null");
            return;
        }
        H.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final void run() {
                zziq zziqVar = zziq.this;
                if (zziqVar.p().K(str)) {
                    zziqVar.p().I();
                }
            }
        });
        H.d0(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        a();
        this.Y.H().d0(str, str2, ObjectWrapper.o1(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzil remove;
        a();
        synchronized (this.Z) {
            remove = this.Z.remove(Integer.valueOf(zzdaVar.a()));
        }
        if (remove == null) {
            remove = new zzb(zzdaVar);
        }
        this.Y.H().w0(remove);
    }
}
