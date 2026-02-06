package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzgcu;
import java.util.ArrayList;
import java.util.Iterator;
import o.InterfaceC7866lr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzar implements zzgcu {
    public final /* synthetic */ zzbua a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzau c;

    public zzar(zzau zzauVar, zzbua zzbuaVar, boolean z) {
        this.a = zzbuaVar;
        this.b = z;
        this.c = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        try {
            zzbua zzbuaVar = this.a;
            String message = th.getMessage();
            zzbuaVar.u("Internal error: " + message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(@InterfaceC7866lr1 Object obj) {
        boolean z;
        String str;
        Uri w8;
        zzfjr zzfjrVar;
        zzfjr zzfjrVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.a.A0(arrayList);
            zzau zzauVar = this.c;
            z = zzauVar.h1;
            if (!z && !this.b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (zzauVar.n8(uri)) {
                    str = zzauVar.q1;
                    w8 = zzau.w8(uri, str, "1");
                    zzfjrVar = zzauVar.g1;
                    zzfjrVar.d(w8.toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F7)).booleanValue()) {
                        zzfjrVar2 = zzauVar.g1;
                        zzfjrVar2.d(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }
}
