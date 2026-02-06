package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class zzdrn {
    public static Bundle a(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
