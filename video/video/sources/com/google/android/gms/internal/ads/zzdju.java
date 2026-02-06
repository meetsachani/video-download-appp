package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.C9998uW1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzdju implements View.OnClickListener {
    public final zzdns X;
    public final Clock Y;
    @InterfaceC11300zs1
    public zzbjw Y0;
    @InterfaceC11300zs1
    public zzbhx Z;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public String Z0;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public Long a1;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public WeakReference b1;

    public zzdju(zzdns zzdnsVar, Clock clock) {
        this.X = zzdnsVar;
        this.Y = clock;
    }

    @InterfaceC11300zs1
    public final zzbhx a() {
        return this.Z;
    }

    public final void b() {
        if (this.Z != null && this.a1 != null) {
            d();
            try {
                this.Z.d();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
    }

    public final void c(final zzbhx zzbhxVar) {
        this.Z = zzbhxVar;
        zzbjw zzbjwVar = this.Y0;
        if (zzbjwVar != null) {
            this.X.n("/unconfirmedClick", zzbjwVar);
        }
        zzbjw zzbjwVar2 = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzdju zzdjuVar = zzdju.this;
                try {
                    zzdjuVar.a1 = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhx zzbhxVar2 = zzbhxVar;
                zzdjuVar.Z0 = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhxVar2 == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhxVar2.S(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                }
            }
        };
        this.Y0 = zzbjwVar2;
        this.X.l("/unconfirmedClick", zzbjwVar2);
    }

    public final void d() {
        View view;
        this.Z0 = null;
        this.a1 = null;
        WeakReference weakReference = this.b1;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener(null);
            this.b1 = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.b1;
        if (weakReference != null && weakReference.get() == view) {
            if (this.Z0 != null && this.a1 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.Z0);
                hashMap.put(C9998uW1.c, String.valueOf(this.Y.a() - this.a1.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.X.j("sendMessageToNativeJs", hashMap);
            }
            d();
        }
    }
}
