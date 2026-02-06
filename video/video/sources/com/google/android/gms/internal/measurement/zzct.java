package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class zzct extends zzbx implements zzcu {
    public zzct() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcu asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzcu) {
            return (zzcu) queryLocalInterface;
        }
        return new zzcw(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean O0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcv zzcvVar = null;
        zzcv zzcvVar2 = null;
        zzcv zzcvVar3 = null;
        zzcv zzcvVar4 = null;
        zzda zzdaVar = null;
        zzda zzdaVar2 = null;
        zzda zzdaVar3 = null;
        zzcv zzcvVar5 = null;
        zzcv zzcvVar6 = null;
        zzcv zzcvVar7 = null;
        zzcv zzcvVar8 = null;
        zzcv zzcvVar9 = null;
        zzcv zzcvVar10 = null;
        zzdb zzdbVar = null;
        zzcv zzcvVar11 = null;
        zzcv zzcvVar12 = null;
        zzcv zzcvVar13 = null;
        zzcv zzcvVar14 = null;
        zzcv zzcvVar15 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                zzbw.f(parcel);
                initialize(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (zzdd) zzbw.a(parcel, zzdd.CREATOR), readLong);
                break;
            case 2:
                boolean h = zzbw.h(parcel);
                boolean h2 = zzbw.h(parcel);
                long readLong2 = parcel.readLong();
                zzbw.f(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzbw.a(parcel, Bundle.CREATOR), h, h2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzcv) {
                        zzcvVar = (zzcv) queryLocalInterface;
                    } else {
                        zzcvVar = new zzcx(readStrongBinder);
                    }
                }
                long readLong3 = parcel.readLong();
                zzbw.f(parcel);
                logEventAndBundle(readString, readString2, bundle, zzcvVar, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                boolean h3 = zzbw.h(parcel);
                long readLong4 = parcel.readLong();
                zzbw.f(parcel);
                setUserProperty(readString3, readString4, g1, h3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean h4 = zzbw.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzcv) {
                        zzcvVar15 = (zzcv) queryLocalInterface2;
                    } else {
                        zzcvVar15 = new zzcx(readStrongBinder2);
                    }
                }
                zzbw.f(parcel);
                getUserProperties(readString5, readString6, h4, zzcvVar15);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzcv) {
                        zzcvVar14 = (zzcv) queryLocalInterface3;
                    } else {
                        zzcvVar14 = new zzcx(readStrongBinder3);
                    }
                }
                zzbw.f(parcel);
                getMaxUserProperties(readString7, zzcvVar14);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbw.f(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                zzbw.f(parcel);
                setConditionalUserProperty((Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                zzbw.f(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzbw.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzcv) {
                        zzcvVar13 = (zzcv) queryLocalInterface4;
                    } else {
                        zzcvVar13 = new zzcx(readStrongBinder4);
                    }
                }
                zzbw.f(parcel);
                getConditionalUserProperties(readString9, readString10, zzcvVar13);
                break;
            case 11:
                boolean h5 = zzbw.h(parcel);
                long readLong7 = parcel.readLong();
                zzbw.f(parcel);
                setMeasurementEnabled(h5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                zzbw.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                zzbw.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                zzbw.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbw.f(parcel);
                setCurrentScreen(g12, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzcv) {
                        zzcvVar12 = (zzcv) queryLocalInterface5;
                    } else {
                        zzcvVar12 = new zzcx(readStrongBinder5);
                    }
                }
                zzbw.f(parcel);
                getCurrentScreenName(zzcvVar12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzcv) {
                        zzcvVar11 = (zzcv) queryLocalInterface6;
                    } else {
                        zzcvVar11 = new zzcx(readStrongBinder6);
                    }
                }
                zzbw.f(parcel);
                getCurrentScreenClass(zzcvVar11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzdb) {
                        zzdbVar = (zzdb) queryLocalInterface7;
                    } else {
                        zzdbVar = new zzde(readStrongBinder7);
                    }
                }
                zzbw.f(parcel);
                setInstanceIdProvider(zzdbVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzcv) {
                        zzcvVar10 = (zzcv) queryLocalInterface8;
                    } else {
                        zzcvVar10 = new zzcx(readStrongBinder8);
                    }
                }
                zzbw.f(parcel);
                getCachedAppInstanceId(zzcvVar10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzcv) {
                        zzcvVar9 = (zzcv) queryLocalInterface9;
                    } else {
                        zzcvVar9 = new zzcx(readStrongBinder9);
                    }
                }
                zzbw.f(parcel);
                getAppInstanceId(zzcvVar9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzcv) {
                        zzcvVar8 = (zzcv) queryLocalInterface10;
                    } else {
                        zzcvVar8 = new zzcx(readStrongBinder10);
                    }
                }
                zzbw.f(parcel);
                getGmpAppId(zzcvVar8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzcv) {
                        zzcvVar7 = (zzcv) queryLocalInterface11;
                    } else {
                        zzcvVar7 = new zzcx(readStrongBinder11);
                    }
                }
                zzbw.f(parcel);
                generateEventId(zzcvVar7);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbw.f(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbw.f(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbw.f(parcel);
                onActivityStarted(g13, readLong14);
                break;
            case 26:
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbw.f(parcel);
                onActivityStopped(g14, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                zzbw.f(parcel);
                onActivityCreated(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbw.f(parcel);
                onActivityDestroyed(g15, readLong17);
                break;
            case 29:
                IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbw.f(parcel);
                onActivityPaused(g16, readLong18);
                break;
            case 30:
                IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbw.f(parcel);
                onActivityResumed(g17, readLong19);
                break;
            case 31:
                IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzcv) {
                        zzcvVar6 = (zzcv) queryLocalInterface12;
                    } else {
                        zzcvVar6 = new zzcx(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                zzbw.f(parcel);
                onActivitySaveInstanceState(g18, zzcvVar6, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzcv) {
                        zzcvVar5 = (zzcv) queryLocalInterface13;
                    } else {
                        zzcvVar5 = new zzcx(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                zzbw.f(parcel);
                performAction(bundle2, zzcvVar5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g111 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbw.f(parcel);
                logHealthData(readInt, readString15, g19, g110, g111);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzda) {
                        zzdaVar3 = (zzda) queryLocalInterface14;
                    } else {
                        zzdaVar3 = new zzdc(readStrongBinder14);
                    }
                }
                zzbw.f(parcel);
                setEventInterceptor(zzdaVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzda) {
                        zzdaVar2 = (zzda) queryLocalInterface15;
                    } else {
                        zzdaVar2 = new zzdc(readStrongBinder15);
                    }
                }
                zzbw.f(parcel);
                registerOnMeasurementEventListener(zzdaVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzda) {
                        zzdaVar = (zzda) queryLocalInterface16;
                    } else {
                        zzdaVar = new zzdc(readStrongBinder16);
                    }
                }
                zzbw.f(parcel);
                unregisterOnMeasurementEventListener(zzdaVar);
                break;
            case 37:
                HashMap b = zzbw.b(parcel);
                zzbw.f(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzcv) {
                        zzcvVar4 = (zzcv) queryLocalInterface17;
                    } else {
                        zzcvVar4 = new zzcx(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                zzbw.f(parcel);
                getTestFlag(zzcvVar4, readInt2);
                break;
            case 39:
                boolean h6 = zzbw.h(parcel);
                zzbw.f(parcel);
                setDataCollectionEnabled(h6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzcv) {
                        zzcvVar3 = (zzcv) queryLocalInterface18;
                    } else {
                        zzcvVar3 = new zzcx(readStrongBinder18);
                    }
                }
                zzbw.f(parcel);
                isDataCollectionEnabled(zzcvVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                zzbw.f(parcel);
                setDefaultEventParameters((Bundle) zzbw.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                zzbw.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                zzbw.f(parcel);
                setConsent((Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                zzbw.f(parcel);
                setConsentThirdParty((Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof zzcv) {
                        zzcvVar2 = (zzcv) queryLocalInterface19;
                    } else {
                        zzcvVar2 = new zzcx(readStrongBinder19);
                    }
                }
                zzbw.f(parcel);
                getSessionId(zzcvVar2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
