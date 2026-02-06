package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
final class zzaox extends zzaoy {
    public final byte[] Y;

    public zzaox(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.Y = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaoy, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.Y;
    }
}
