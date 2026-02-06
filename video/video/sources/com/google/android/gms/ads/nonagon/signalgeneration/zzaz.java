package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbyz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaz {
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final zzbyz c;

    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        String str;
        String str2;
        zzbyz zzbyzVar;
        str = zzaxVar.a;
        this.a = str;
        str2 = zzaxVar.b;
        this.b = str2;
        zzbyzVar = zzaxVar.c;
        this.c = zzbyzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbca.zza.EnumC0104zza a() {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return zzbca.zza.EnumC0104zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbca.zza.EnumC0104zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbca.zza.EnumC0104zza.AD_LOADER;
            }
            return zzbca.zza.EnumC0104zza.INTERSTITIAL;
        }
        return zzbca.zza.EnumC0104zza.BANNER;
    }

    @InterfaceC11300zs1
    public final zzbyz b() {
        return this.c;
    }

    public final String c() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    @InterfaceC11300zs1
    public final String d() {
        return this.b;
    }

    public final Set e() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
