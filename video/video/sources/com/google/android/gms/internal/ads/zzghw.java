package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzghw extends zzgfk {
    public final zzghy a;
    public final zzgwp b;
    @InterfaceC10571ws1
    public final Integer c;

    public zzghw(zzghy zzghyVar, zzgwp zzgwpVar, @InterfaceC10571ws1 Integer num) {
        this.a = zzghyVar;
        this.b = zzgwpVar;
        this.c = num;
    }

    public static zzghw c(zzghy zzghyVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgwp b;
        if (zzghyVar.b() == zzghx.b) {
            if (num != null) {
                b = zzgwp.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzghyVar.b() == zzghx.c) {
            if (num == null) {
                b = zzgwp.b(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzghyVar.b().toString()));
        }
        return new zzghw(zzghyVar, b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk, com.google.android.gms.internal.ads.zzgek
    public final /* synthetic */ zzgex a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final zzgwp b() {
        return this.b;
    }

    public final zzghy d() {
        return this.a;
    }

    public final Integer e() {
        return this.c;
    }
}
