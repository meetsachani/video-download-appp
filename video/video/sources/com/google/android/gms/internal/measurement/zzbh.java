package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbh implements Comparator<zzaq> {
    public final /* synthetic */ zzal X;
    public final /* synthetic */ zzh Y;

    public zzbh(zzal zzalVar, zzh zzhVar) {
        this.X = zzalVar;
        this.Y = zzhVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaq zzaqVar, zzaq zzaqVar2) {
        zzaq zzaqVar3 = zzaqVar;
        zzaq zzaqVar4 = zzaqVar2;
        zzal zzalVar = this.X;
        zzh zzhVar = this.Y;
        if (zzaqVar3 instanceof zzax) {
            if (zzaqVar4 instanceof zzax) {
                return 0;
            }
            return 1;
        } else if (zzaqVar4 instanceof zzax) {
            return -1;
        } else {
            if (zzalVar == null) {
                return zzaqVar3.e().compareTo(zzaqVar4.e());
            }
            return (int) zzg.a(zzalVar.a(zzhVar, Arrays.asList(zzaqVar3, zzaqVar4)).d().doubleValue());
        }
    }
}
