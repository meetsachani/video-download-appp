package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcw {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        String str = zzeu.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static ArrayList a(Spanned spanned) {
        zzcy[] zzcyVarArr;
        zzda[] zzdaVarArr;
        zzdb[] zzdbVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzcy zzcyVar : (zzcy[]) spanned.getSpans(0, spanned.length(), zzcy.class)) {
            arrayList.add(b(spanned, zzcyVar, 1, zzcyVar.a()));
        }
        for (zzda zzdaVar : (zzda[]) spanned.getSpans(0, spanned.length(), zzda.class)) {
            arrayList.add(b(spanned, zzdaVar, 2, zzdaVar.a()));
        }
        for (zzcx zzcxVar : (zzcx[]) spanned.getSpans(0, spanned.length(), zzcx.class)) {
            arrayList.add(b(spanned, zzcxVar, 3, null));
        }
        for (zzdb zzdbVar : (zzdb[]) spanned.getSpans(0, spanned.length(), zzdb.class)) {
            arrayList.add(b(spanned, zzdbVar, 4, zzdbVar.a()));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i, @InterfaceC11300zs1 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
