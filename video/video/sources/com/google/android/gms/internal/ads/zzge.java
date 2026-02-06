package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import o.InterfaceC11300zs1;
import o.VU;

/* loaded from: classes2.dex */
public final class zzge extends zzfz {
    @InterfaceC11300zs1
    public zzgl e;
    @InterfaceC11300zs1
    public byte[] f;
    public int g;
    public int h;

    public zzge() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = zzeu.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        A(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        h(zzglVar);
        this.e = zzglVar;
        Uri normalizeScheme = zzglVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdc.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzeu.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(VU.c)) {
                try {
                    this.f = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw zzaz.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
                }
            } else {
                this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j = zzglVar.e;
            int length = this.f.length;
            if (j <= length) {
                int i = (int) j;
                this.g = i;
                int i2 = length - i;
                this.h = i2;
                long j2 = zzglVar.f;
                int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                if (i3 != 0) {
                    this.h = (int) Math.min(i2, j2);
                }
                i(zzglVar);
                if (i3 != 0) {
                    return j2;
                }
                return this.h;
            }
            this.f = null;
            throw new zzgh(2008);
        }
        throw zzaz.b("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        zzgl zzglVar = this.e;
        if (zzglVar != null) {
            return zzglVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() {
        if (this.f != null) {
            this.f = null;
            g();
        }
        this.e = null;
    }
}
