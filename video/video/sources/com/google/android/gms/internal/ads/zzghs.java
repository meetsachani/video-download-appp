package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzghs implements zzgee {
    public static final byte[] c = new byte[0];
    public static final Set d;
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final zzgee b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzghs(zzgtq zzgtqVar, zzgee zzgeeVar) throws GeneralSecurityException {
        if (d.contains(zzgtqVar.z2())) {
            this.a = zzgtqVar.z2();
            zzgto t2 = zzgtq.t2(zzgtqVar);
            t2.Y1(zzguq.RAW);
            zzgez.a(((zzgtq) t2.V1()).b1());
            this.b = zzgeeVar;
            return;
        }
        String z2 = zzgtqVar.z2();
        throw new IllegalArgumentException("Unsupported DEK key type: " + z2 + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= 4096 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] a = this.b.a(bArr3, c);
                String str = this.a;
                zzgxk zzgxkVar = zzgxk.Y;
                return ((zzgee) zzgng.a().b(zzgnj.c().a(zzgoi.a(str, zzgxk.U(a, 0, a.length), zzgtk.SYMMETRIC, zzguq.RAW, null), zzgej.a()), zzgee.class)).a(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
