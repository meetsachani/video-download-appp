package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfjn {
    public final zzegu a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final zzfch f;
    public final zzfci g;
    public final Clock h;
    public final zzavl i;

    public zzfjn(zzegu zzeguVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @InterfaceC11300zs1 zzfch zzfchVar, @InterfaceC11300zs1 zzfci zzfciVar, Clock clock, zzavl zzavlVar) {
        this.a = zzeguVar;
        this.b = versionInfoParcel.X;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = zzfchVar;
        this.g = zzfciVar;
        this.h = clock;
        this.i = zzavlVar;
    }

    public static String c(String str, String str2, @InterfaceC11300zs1 String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    @InterfaceC11300zs1
    public static String g(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (com.google.android.gms.ads.internal.util.client.zzl.k()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    public final List d(zzfcg zzfcgVar, @InterfaceC11300zs1 zzfbu zzfbuVar, List list) {
        return e(zzfcgVar, zzfbuVar, false, "", "", list);
    }

    public final List e(zzfcg zzfcgVar, @InterfaceC11300zs1 zzfbu zzfbuVar, boolean z, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = "1";
            boolean z2 = true;
            if (true == z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            String c = c(c(c((String) it.next(), "@gw_adlocid@", zzfcgVar.a.a.f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.b);
            if (zzfbuVar != null) {
                String c2 = c(c(c(c, "@gw_qdata@", zzfbuVar.y), "@gw_adnetid@", zzfbuVar.x), "@gw_allocid@", zzfbuVar.w);
                Context context = this.e;
                c = zzbyl.c(c2, context, zzfbuVar.W, zzfbuVar.w0);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Cd)).booleanValue() && zzfbuVar.e == 4) {
                    com.google.android.gms.ads.internal.zzv.v();
                    if (true != com.google.android.gms.ads.internal.util.zzs.h(context)) {
                        str4 = "0";
                    }
                    c = c(c, "@gw_aps@", str4);
                }
            }
            zzegu zzeguVar = this.a;
            String c3 = c(c(c(c(c, "@gw_adnetstatus@", zzeguVar.g()), "@gw_ttr@", Long.toString(zzeguVar.a(), 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (!z3) {
                if (isEmpty) {
                    arrayList.add(c3);
                }
            } else {
                z2 = z4;
            }
            if (this.i.f(Uri.parse(c3))) {
                Uri.Builder buildUpon = Uri.parse(c3).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c3 = buildUpon.build().toString();
            }
            arrayList.add(c3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[LOOP:0: B:13:0x0060->B:15:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List f(zzfbu zzfbuVar, List list, zzbvx zzbvxVar) {
        zzfch zzfchVar;
        zzfva d;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long a = this.h.a();
        try {
            String c = zzbvxVar.c();
            String num = Integer.toString(zzbvxVar.b());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P3)).booleanValue()) {
                zzfci zzfciVar = this.g;
                if (zzfciVar == null) {
                    d = zzfva.c();
                    String str = (String) d.a(new zzfur() { // from class: com.google.android.gms.internal.ads.zzfjl
                        @Override // com.google.android.gms.internal.ads.zzfur
                        public final Object apply(Object obj) {
                            String g;
                            g = zzfjn.g(((zzfch) obj).a);
                            return g;
                        }
                    }).b("");
                    String str2 = (String) d.a(new zzfur() { // from class: com.google.android.gms.internal.ads.zzfjm
                        @Override // com.google.android.gms.internal.ads.zzfur
                        public final Object apply(Object obj) {
                            String g;
                            g = zzfjn.g(((zzfch) obj).b);
                            return g;
                        }
                    }).b("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzbyl.c(c(c(c(c(c(c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(c)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.b), this.e, zzfbuVar.W, zzfbuVar.w0));
                    }
                    return arrayList;
                }
                zzfchVar = zzfciVar.a;
            } else {
                zzfchVar = this.f;
            }
            d = zzfva.d(zzfchVar);
            String str3 = (String) d.a(new zzfur() { // from class: com.google.android.gms.internal.ads.zzfjl
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    String g;
                    g = zzfjn.g(((zzfch) obj).a);
                    return g;
                }
            }).b("");
            String str22 = (String) d.a(new zzfur() { // from class: com.google.android.gms.internal.ads.zzfjm
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    String g;
                    g = zzfjn.g(((zzfch) obj).b);
                    return g;
                }
            }).b("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
