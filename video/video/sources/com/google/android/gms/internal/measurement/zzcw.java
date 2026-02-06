package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcw extends zzbu implements zzcu {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeLong(j);
        o1(23, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.d(O0, bundle);
        o1(9, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeLong(j);
        o1(43, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeLong(j);
        o1(24, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void generateEventId(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(22, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getAppInstanceId(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(20, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCachedAppInstanceId(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(19, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.c(O0, zzcvVar);
        o1(10, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenClass(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(17, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenName(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(16, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getGmpAppId(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(21, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getMaxUserProperties(String str, zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        zzbw.c(O0, zzcvVar);
        o1(6, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getSessionId(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(46, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getTestFlag(zzcv zzcvVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        O0.writeInt(i);
        o1(38, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getUserProperties(String str, String str2, boolean z, zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.e(O0, z);
        zzbw.c(O0, zzcvVar);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initForTests(Map map) throws RemoteException {
        Parcel O0 = O0();
        O0.writeMap(map);
        o1(37, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        zzbw.d(O0, zzddVar);
        O0.writeLong(j);
        o1(1, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void isDataCollectionEnabled(zzcv zzcvVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzcvVar);
        o1(40, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.d(O0, bundle);
        zzbw.e(O0, z);
        zzbw.e(O0, z2);
        O0.writeLong(j);
        o1(2, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.d(O0, bundle);
        zzbw.c(O0, zzcvVar);
        O0.writeLong(j);
        o1(3, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        O0.writeInt(i);
        O0.writeString(str);
        zzbw.c(O0, iObjectWrapper);
        zzbw.c(O0, iObjectWrapper2);
        zzbw.c(O0, iObjectWrapper3);
        o1(33, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        zzbw.d(O0, bundle);
        O0.writeLong(j);
        o1(27, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeLong(j);
        o1(28, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeLong(j);
        o1(29, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeLong(j);
        o1(30, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcv zzcvVar, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        zzbw.c(O0, zzcvVar);
        O0.writeLong(j);
        o1(31, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeLong(j);
        o1(25, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeLong(j);
        o1(26, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void performAction(Bundle bundle, zzcv zzcvVar, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        zzbw.c(O0, zzcvVar);
        O0.writeLong(j);
        o1(32, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzdaVar);
        o1(35, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeLong(j);
        o1(12, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        O0.writeLong(j);
        o1(8, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        O0.writeLong(j);
        o1(44, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        O0.writeLong(j);
        o1(45, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, iObjectWrapper);
        O0.writeString(str);
        O0.writeString(str2);
        O0.writeLong(j);
        o1(15, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel O0 = O0();
        zzbw.e(O0, z);
        o1(39, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel O0 = O0();
        zzbw.d(O0, bundle);
        o1(42, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setEventInterceptor(zzda zzdaVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzdaVar);
        o1(34, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setInstanceIdProvider(zzdb zzdbVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzdbVar);
        o1(18, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel O0 = O0();
        zzbw.e(O0, z);
        O0.writeLong(j);
        o1(11, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeLong(j);
        o1(13, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeLong(j);
        o1(14, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeLong(j);
        o1(7, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        zzbw.c(O0, iObjectWrapper);
        zzbw.e(O0, z);
        O0.writeLong(j);
        o1(4, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel O0 = O0();
        zzbw.c(O0, zzdaVar);
        o1(36, O0);
    }
}
