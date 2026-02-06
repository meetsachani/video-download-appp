package com.google.android.gms.internal.measurement;

import android.net.Uri;
import o.C9654t62;
import o.InterfaceC10571ws1;

/* loaded from: classes3.dex */
public final class zzgc implements zzgh {
    public final C9654t62<String, C9654t62<String, String>> a;

    public zzgc(C9654t62<String, C9654t62<String, String>> c9654t62) {
        this.a = c9654t62;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[RETURN] */
    @Override // com.google.android.gms.internal.measurement.zzgh
    @InterfaceC10571ws1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(@InterfaceC10571ws1 Uri uri, @InterfaceC10571ws1 String str, @InterfaceC10571ws1 String str2, String str3) {
        C9654t62<String, String> c9654t62;
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            c9654t62 = null;
            if (c9654t62 != null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return c9654t62.get(str3);
        }
        c9654t62 = this.a.get(str);
        if (c9654t62 != null) {
        }
    }
}
