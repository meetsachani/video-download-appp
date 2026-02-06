package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgye extends zzgyd {
    @Override // com.google.android.gms.internal.ads.zzgyd
    public final void a(Object obj) {
        ((zzgyo) obj).zza.g();
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final void b(zzhbx zzhbxVar, Map.Entry entry) throws IOException {
        zzgyp zzgypVar = (zzgyp) entry.getKey();
        if (zzgypVar.Z) {
            zzhbv zzhbvVar = zzhbv.Y;
            switch (zzgypVar.Y.ordinal()) {
                case 0:
                    zzhay.D(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 1:
                    zzhay.H(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 2:
                    zzhay.a(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 3:
                    zzhay.i(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 4:
                    zzhay.J(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 5:
                    zzhay.G(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 6:
                    zzhay.F(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 7:
                    zzhay.B(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 8:
                    zzhay.g(zzgypVar.X, (List) entry.getValue(), zzhbxVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzhay.I(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzhan.a().b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzhay.b(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzhan.a().b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzhay.C(zzgypVar.X, (List) entry.getValue(), zzhbxVar);
                    return;
                case 12:
                    zzhay.h(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 13:
                    zzhay.J(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 14:
                    zzhay.c(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 15:
                    zzhay.d(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 16:
                    zzhay.e(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                case 17:
                    zzhay.f(zzgypVar.X, (List) entry.getValue(), zzhbxVar, zzgypVar.Y0);
                    return;
                default:
                    return;
            }
        }
        zzhbv zzhbvVar2 = zzhbv.Y;
        switch (zzgypVar.Y.ordinal()) {
            case 0:
                zzhbxVar.p(zzgypVar.X, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhbxVar.G(zzgypVar.X, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhbxVar.m(zzgypVar.X, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhbxVar.M(zzgypVar.X, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhbxVar.d(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhbxVar.K(zzgypVar.X, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhbxVar.z(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhbxVar.l(zzgypVar.X, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhbxVar.k(zzgypVar.X, (String) entry.getValue());
                return;
            case 9:
                zzhbxVar.v(zzgypVar.X, entry.getValue(), zzhan.a().b(entry.getValue().getClass()));
                return;
            case 10:
                zzhbxVar.A(zzgypVar.X, entry.getValue(), zzhan.a().b(entry.getValue().getClass()));
                return;
            case 11:
                zzhbxVar.F(zzgypVar.X, (zzgxk) entry.getValue());
                return;
            case 12:
                zzhbxVar.x(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhbxVar.d(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhbxVar.s(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhbxVar.C(zzgypVar.X, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhbxVar.u(zzgypVar.X, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhbxVar.q(zzgypVar.X, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
