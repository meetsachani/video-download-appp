package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbma;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzer extends zzbma {
    public final /* synthetic */ zzet X;

    public /* synthetic */ zzer(zzet zzetVar, zzes zzesVar) {
        this.X = zzetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void K0(List list) throws RemoteException {
        Object obj;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InitializationStatus a;
        zzet zzetVar = this.X;
        obj = zzetVar.a;
        synchronized (obj) {
            zzetVar.d = false;
            zzetVar.e = true;
            arrayList2 = zzetVar.c;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = zzetVar.c;
            arrayList3.clear();
        }
        a = zzet.a(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).a(a);
        }
    }
}
