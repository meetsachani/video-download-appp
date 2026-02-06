package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzbxv;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzb {
    public final Context a;
    public boolean b;
    @InterfaceC11300zs1
    public final zzbxv c;
    public final zzbut d = new zzbut(false, Collections.EMPTY_LIST);

    public zzb(Context context, @InterfaceC11300zs1 zzbxv zzbxvVar, @InterfaceC11300zs1 zzbut zzbutVar) {
        this.a = context;
        this.c = zzbxvVar;
    }

    public final void a() {
        this.b = true;
    }

    public final void b(@InterfaceC11300zs1 String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            zzbxv zzbxvVar = this.c;
            if (zzbxvVar != null) {
                zzbxvVar.b(str, null, 3);
                return;
            }
            zzbut zzbutVar = this.d;
            if (zzbutVar.X && (list = zzbutVar.Y) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.a;
                        zzv.v();
                        com.google.android.gms.ads.internal.util.zzs.m(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.b;
    }

    public final boolean d() {
        zzbxv zzbxvVar = this.c;
        return (zzbxvVar != null && zzbxvVar.a().a1) || this.d.X;
    }
}
