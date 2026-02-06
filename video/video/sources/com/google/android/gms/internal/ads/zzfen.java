package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import o.C4500Ve2;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzfen implements zzfem {
    public final Object[] a;

    public zzfen(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, int i, String str2, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzmVar.Y));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(zzmVar.Z));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzmVar.Z.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzmVar.Y0));
        }
        if (hashSet.contains("keywords")) {
            List list = zzmVar.Z0;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzmVar.a1));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzmVar.b1));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzmVar.c1));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzmVar.d1);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.s)) {
            Location location = zzmVar.f1;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzmVar.g1);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(zzmVar.h1));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(zzmVar.i1));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzmVar.j1;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzmVar.k1);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzmVar.l1);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzmVar.m1));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzmVar.o1));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzmVar.p1);
        }
        if (hashSet.contains("orientation")) {
            if (zzxVar != null) {
                arrayList.add(Integer.valueOf(zzxVar.X));
            } else {
                arrayList.add(null);
            }
        }
        this.a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = a((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfen)) {
            return false;
        }
        return Arrays.equals(this.a, ((zzfen) obj).a);
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = this.a;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        return "[PoolKey#" + hashCode + C4500Ve2.b + arrays + C6566gU0.g;
    }
}
