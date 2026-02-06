package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpl;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzak extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbpl c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public zzak(zzaz zzazVar, Context context, zzbpl zzbplVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = zzbplVar;
        this.d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC5670cr1
    public final /* synthetic */ Object a() {
        return new zzblf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.N3(ObjectWrapper.V3(this.b), this.c, ModuleDescriptor.MODULE_VERSION, new zzbks(this.d));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        Context context = this.b;
        try {
            return ((zzblb) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaj
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object b(Object obj) {
                    return zzbla.W7((IBinder) obj);
                }
            })).I6(ObjectWrapper.V3(context), this.c, ModuleDescriptor.MODULE_VERSION, new zzbks(this.d));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
