package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzfde {
    @InterfaceC5056aJ2
    public zzfde() {
        try {
            zzgfb.a();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.k("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.t().x(e, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        byte[] bArr;
        try {
            zzget e = zzget.e(zzgen.a(zzgnf.b().a("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgeh.b(e, zzgeg.b(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.k("Failed to generate key".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzv.t().x(e2, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    @InterfaceC10571ws1
    public static final String b(byte[] bArr, byte[] bArr2, @InterfaceC10571ws1 String str, zzdrx zzdrxVar) {
        zzget c;
        if (str != null && (c = c(str)) != null) {
            try {
                byte[] a = ((zzgee) c.g(zzgfj.a(), zzgee.class)).a(bArr, bArr2);
                zzdrxVar.b().put("ds", "1");
                return new String(a, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.k("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzv.t().x(e, "CryptoUtils.decrypt");
                zzdrxVar.b().put("dsf", e.toString());
            }
        }
        return null;
    }

    @InterfaceC10571ws1
    public static final zzget c(String str) {
        try {
            try {
                return zzgeh.a(zzgef.b(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.k("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.t().x(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
