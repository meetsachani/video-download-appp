package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzar extends zzal implements zzak {
    @InterfaceC5299bJ2
    public final List<zzaq> Y0;
    @InterfaceC5299bJ2
    public final List<String> Z;
    @InterfaceC5299bJ2
    public zzh Z0;

    public zzar(zzar zzarVar) {
        super(zzarVar.X);
        ArrayList arrayList = new ArrayList(zzarVar.Z.size());
        this.Z = arrayList;
        arrayList.addAll(zzarVar.Z);
        ArrayList arrayList2 = new ArrayList(zzarVar.Y0.size());
        this.Y0 = arrayList2;
        arrayList2.addAll(zzarVar.Y0);
        this.Z0 = zzarVar.Z0;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        zzh d = this.Z0.d();
        for (int i = 0; i < this.Z.size(); i++) {
            if (i < list.size()) {
                d.e(this.Z.get(i), zzhVar.b(list.get(i)));
            } else {
                d.e(this.Z.get(i), zzaq.i);
            }
        }
        for (zzaq zzaqVar : this.Y0) {
            zzaq b = d.b(zzaqVar);
            if (b instanceof zzat) {
                b = d.b(zzaqVar);
            }
            if (b instanceof zzaj) {
                return ((zzaj) b).a();
            }
        }
        return zzaq.i;
    }

    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzar(this);
    }

    public zzar(String str, List<zzaq> list, List<zzaq> list2, zzh zzhVar) {
        super(str);
        this.Z = new ArrayList();
        this.Z0 = zzhVar;
        if (!list.isEmpty()) {
            for (zzaq zzaqVar : list) {
                this.Z.add(zzaqVar.e());
            }
        }
        this.Y0 = new ArrayList(list2);
    }
}
