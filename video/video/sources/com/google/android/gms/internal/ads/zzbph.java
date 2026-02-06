package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes2.dex */
public final class zzbph extends zzbpk {
    @Override // com.google.android.gms.internal.ads.zzbpl
    public final zzbpo I(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbph.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbqm((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbqm((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.b("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new zzbqm(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new zzbqm(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final zzbrk Q(String str) throws RemoteException {
        return new zzbrx((RtbAdapter) Class.forName(str, false, zzbro.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean p0(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbph.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpl
    public final boolean u(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbph.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
