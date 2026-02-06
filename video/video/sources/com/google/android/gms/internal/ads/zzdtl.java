package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdtl extends zzbkx {
    public final zzdto X;
    public final zzdtj Y;
    public final Map Z = new HashMap();

    public zzdtl(zzdto zzdtoVar, zzdtj zzdtjVar) {
        this.X = zzdtoVar;
        this.Y = zzdtjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.ads.internal.client.zzm X7(Map map) {
        char c;
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.b(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.e(arrayList);
                        break;
                    case 2:
                        zznVar.d(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zznVar.h(1);
                            break;
                        } else {
                            zznVar.h(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zznVar.i(1);
                            break;
                        } else {
                            zznVar.i(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.q.contains(nextString)) {
                            break;
                        } else {
                            zznVar.f(nextString);
                            break;
                        }
                    case 6:
                        zznVar.c(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm a = zznVar.a();
        Bundle bundle2 = a.h1;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = a.Z;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(a.X, a.Y, bundle3, a.Y0, a.Z0, a.a1, a.b1, a.c1, a.d1, a.e1, a.f1, a.g1, bundle2, a.i1, a.j1, a.k1, a.l1, a.m1, a.n1, a.o1, a.p1, a.q1, a.r1, a.s1, a.t1, a.u1);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void S(String str) throws RemoteException {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ka)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("Received H5 gmsg: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        com.google.android.gms.ads.internal.zzv.v();
        Map q = com.google.android.gms.ads.internal.util.zzs.q(parse);
        String str2 = (String) q.get("action");
        if (TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzo.b("H5 gmsg did not contain an action");
            return;
        }
        int hashCode = str2.hashCode();
        char c = 65535;
        if (hashCode != 579053441) {
            if (hashCode == 871091088 && str2.equals("initialize")) {
                z = false;
            }
            z = true;
        } else {
            if (str2.equals("dispose_all")) {
                z = true;
            }
            z = true;
        }
        if (z) {
            if (!z) {
                String str3 = (String) q.get("obj_id");
                try {
                    Objects.requireNonNull(str3);
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 393881811:
                            if (str2.equals("create_interstitial_ad")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            Map map = this.Z;
                            if (map.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.la)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.g("Could not create H5 ad, too many existing objects");
                                this.Y.i(parseLong);
                                return;
                            }
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not create H5 ad, object ID already exists");
                                this.Y.i(parseLong);
                                return;
                            }
                            String str4 = (String) q.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzo.g("Could not create H5 ad, missing ad unit id");
                                this.Y.i(parseLong);
                                return;
                            }
                            zzdtf b = this.X.b();
                            b.a(parseLong);
                            b.w(str4);
                            map.put(valueOf, b.c().a());
                            this.Y.h(parseLong);
                            com.google.android.gms.ads.internal.util.zze.k("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            zzdte zzdteVar = (zzdte) this.Z.get(Long.valueOf(parseLong));
                            if (zzdteVar == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not load H5 ad, object ID does not exist");
                                this.Y.f(parseLong);
                                return;
                            }
                            zzdteVar.b(X7(q));
                            return;
                        case 2:
                            zzdte zzdteVar2 = (zzdte) this.Z.get(Long.valueOf(parseLong));
                            if (zzdteVar2 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not show H5 ad, object ID does not exist");
                                this.Y.f(parseLong);
                                return;
                            }
                            zzdteVar2.c();
                            return;
                        case 3:
                            Map map2 = this.Z;
                            if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.la)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.g("Could not create H5 ad, too many existing objects");
                                this.Y.i(parseLong);
                                return;
                            }
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not create H5 ad, object ID already exists");
                                this.Y.i(parseLong);
                                return;
                            }
                            String str5 = (String) q.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzo.g("Could not create H5 ad, missing ad unit id");
                                this.Y.i(parseLong);
                                return;
                            }
                            zzdtf b2 = this.X.b();
                            b2.a(parseLong);
                            b2.w(str5);
                            map2.put(valueOf2, b2.c().b());
                            this.Y.h(parseLong);
                            com.google.android.gms.ads.internal.util.zze.k("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            zzdte zzdteVar3 = (zzdte) this.Z.get(Long.valueOf(parseLong));
                            if (zzdteVar3 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not load H5 ad, object ID does not exist");
                                this.Y.q(parseLong);
                                return;
                            }
                            zzdteVar3.b(X7(q));
                            return;
                        case 5:
                            zzdte zzdteVar4 = (zzdte) this.Z.get(Long.valueOf(parseLong));
                            if (zzdteVar4 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not show H5 ad, object ID does not exist");
                                this.Y.q(parseLong);
                                return;
                            }
                            zzdteVar4.c();
                            return;
                        case 6:
                            Map map3 = this.Z;
                            Long valueOf3 = Long.valueOf(parseLong);
                            zzdte zzdteVar5 = (zzdte) map3.get(valueOf3);
                            if (zzdteVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdteVar5.a();
                            map3.remove(valueOf3);
                            com.google.android.gms.ads.internal.util.zze.k("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            com.google.android.gms.ads.internal.util.client.zzo.b("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                    return;
                }
            }
            Map map4 = this.Z;
            for (zzdte zzdteVar6 : map4.values()) {
                zzdteVar6.a();
            }
            map4.clear();
            return;
        }
        this.Z.clear();
        this.Y.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void d() {
        this.Z.clear();
    }
}
