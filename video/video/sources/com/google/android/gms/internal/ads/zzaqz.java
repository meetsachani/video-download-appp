package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import o.C4317Th1;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public class zzaqz extends zzapu {
    public final Object h1;
    @InterfaceC8710pF0("mLock")
    @InterfaceC11300zs1
    public final zzapz i1;

    public zzaqz(int i, String str, zzapz zzapzVar, @InterfaceC11300zs1 zzapy zzapyVar) {
        super(i, str, zzapyVar);
        this.h1 = new Object();
        this.i1 = zzapzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    /* renamed from: E */
    public void t(String str) {
        zzapz zzapzVar;
        synchronized (this.h1) {
            zzapzVar = this.i1;
        }
        zzapzVar.b(str);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzaqa m(zzapq zzapqVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapqVar.b;
            Map map = zzapqVar.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals(C4317Th1.g)) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapqVar.b);
        }
        return zzaqa.b(str, zzaqr.b(zzapqVar));
    }
}
