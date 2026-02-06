package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C9273rY;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.KS1;
import o.M82;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public class AppMeasurement {
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String b = "crash";
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String c = "fcm";
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String d = "fiam";
    public static volatile AppMeasurement e;
    public final zza a;

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;
        @Keep
        @ShowFirstParty
        @InterfaceC5670cr1
        @KeepForSdk
        public String mAppId;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;
        @InterfaceC5670cr1
        @Keep
        public String mExpiredEventName;
        @InterfaceC5670cr1
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        @ShowFirstParty
        @InterfaceC5670cr1
        @KeepForSdk
        public String mName;
        @Keep
        @ShowFirstParty
        @InterfaceC5670cr1
        @KeepForSdk
        public String mOrigin;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;
        @InterfaceC5670cr1
        @Keep
        public String mTimedOutEventName;
        @InterfaceC5670cr1
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        @ShowFirstParty
        @InterfaceC5670cr1
        @KeepForSdk
        public String mTriggerEventName;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;
        @InterfaceC5670cr1
        @Keep
        public String mTriggeredEventName;
        @InterfaceC5670cr1
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;
        @Keep
        @ShowFirstParty
        @InterfaceC5670cr1
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @InterfaceC5056aJ2
        public ConditionalUserProperty(@InterfaceC5670cr1 Bundle bundle) {
            Preconditions.r(bundle);
            this.mAppId = (String) zzie.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzie.a(bundle, "origin", String.class, null);
            this.mName = (String) zzie.a(bundle, "name", String.class, null);
            this.mValue = zzie.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.d, String.class, null);
            this.mTriggerTimeout = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.e, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.f, String.class, null);
            this.mTimedOutEventParams = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.g, Bundle.class, null);
            this.mTriggeredEventName = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.h, String.class, null);
            this.mTriggeredEventParams = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.i, Bundle.class, null);
            this.mTimeToLive = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.j, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.k, String.class, null);
            this.mExpiredEventParams = (Bundle) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.l, Bundle.class, null);
            this.mActive = ((Boolean) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.n, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.m, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzie.a(bundle, AppMeasurementSdk.ConditionalUserProperty.f309o, Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(@InterfaceC5670cr1 ConditionalUserProperty conditionalUserProperty) {
            Preconditions.r(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object a = zzkf.a(obj);
                this.mValue = a;
                if (a == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface EventInterceptor extends zzim {
        @Override // com.google.android.gms.measurement.internal.zzim
        @ShowFirstParty
        @KeepForSdk
        @InterfaceC10697xN2
        void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface OnEventListener extends zzil {
        @Override // com.google.android.gms.measurement.internal.zzil
        @ShowFirstParty
        @KeepForSdk
        @InterfaceC10697xN2
        void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, long j);
    }

    /* loaded from: classes3.dex */
    public static abstract class zza implements zzjz {
        public abstract Map<String, Object> m(boolean z);

        public abstract Boolean n();

        public abstract Double o();

        public abstract Integer p();

        public abstract Long q();

        public abstract String r();

        private zza() {
        }
    }

    public AppMeasurement(zzhf zzhfVar) {
        this.a = new com.google.android.gms.measurement.zza(zzhfVar);
    }

    @Keep
    @Deprecated
    @KS1(allOf = {"android.permission.INTERNET", C9273rY.b, "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static AppMeasurement getInstance(@InterfaceC5670cr1 Context context) {
        return k(context, null, null);
    }

    @InterfaceC5056aJ2
    public static AppMeasurement k(Context context, String str, String str2) {
        if (e == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (e == null) {
                        zzjz l = l(context, null);
                        if (l != null) {
                            e = new AppMeasurement(l);
                        } else {
                            e = new AppMeasurement(zzhf.c(context, new zzdd(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static zzjz l(Context context, Bundle bundle) {
        return (zzjz) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Boolean a() {
        return this.a.n();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Double b() {
        return this.a.o();
    }

    @Keep
    public void beginAdUnitExposure(@M82(min = 1) @InterfaceC5670cr1 String str) {
        this.a.I(str);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Integer c() {
        return this.a.p();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@M82(max = 24, min = 1) @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Long d() {
        return this.a.q();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String e() {
        return this.a.r();
    }

    @Keep
    public void endAdUnitExposure(@M82(min = 1) @InterfaceC5670cr1 String str) {
        this.a.Q(str);
    }

    @InterfaceC10697xN2
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public Map<String, Object> f(boolean z) {
        return this.a.m(z);
    }

    @ShowFirstParty
    @KeepForSdk
    public void g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, long j) {
        this.a.e1(str, str2, bundle, j);
    }

    @Keep
    public long generateEventId() {
        return this.a.a();
    }

    @InterfaceC5670cr1
    @Keep
    public String getAppInstanceId() {
        return this.a.e();
    }

    @Keep
    @InterfaceC10697xN2
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@InterfaceC5670cr1 String str, @M82(max = 23, min = 1) @InterfaceC5670cr1 String str2) {
        int size;
        List<Bundle> c2 = this.a.c(str, str2);
        if (c2 == null) {
            size = 0;
        } else {
            size = c2.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : c2) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @InterfaceC5670cr1
    @Keep
    public String getCurrentScreenClass() {
        return this.a.g();
    }

    @InterfaceC5670cr1
    @Keep
    public String getCurrentScreenName() {
        return this.a.h();
    }

    @InterfaceC5670cr1
    @Keep
    public String getGmpAppId() {
        return this.a.i();
    }

    @Keep
    @InterfaceC10697xN2
    @ShowFirstParty
    @KeepForSdk
    public int getMaxUserProperties(@M82(min = 1) @InterfaceC5670cr1 String str) {
        return this.a.w(str);
    }

    @InterfaceC5056aJ2
    @Keep
    @InterfaceC10697xN2
    @InterfaceC5670cr1
    public Map<String, Object> getUserProperties(@InterfaceC5670cr1 String str, @M82(max = 24, min = 1) @InterfaceC5670cr1 String str2, boolean z) {
        return this.a.j(str, str2, z);
    }

    @ShowFirstParty
    @KeepForSdk
    public void h(@InterfaceC5670cr1 OnEventListener onEventListener) {
        this.a.f(onEventListener);
    }

    @ShowFirstParty
    @KeepForSdk
    @InterfaceC10697xN2
    public void i(@InterfaceC5670cr1 EventInterceptor eventInterceptor) {
        this.a.l(eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void j(@InterfaceC5670cr1 OnEventListener onEventListener) {
        this.a.k(onEventListener);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle) {
        this.a.d(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@InterfaceC5670cr1 ConditionalUserProperty conditionalUserProperty) {
        Preconditions.r(conditionalUserProperty);
        zza zzaVar = this.a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzie.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.d, str4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.e, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.f, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.g, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.h, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.i, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.j, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.k, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.l, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.m, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.n, conditionalUserProperty.mActive);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.f309o, conditionalUserProperty.mTriggeredTimestamp);
        zzaVar.v0(bundle);
    }

    public AppMeasurement(zzjz zzjzVar) {
        this.a = new zzc(zzjzVar);
    }
}
