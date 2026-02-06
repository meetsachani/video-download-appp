package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzard implements zzare {
    public static final Logger b = Logger.getLogger(zzard.class.getName());
    public final ThreadLocal a = new zzarc(this);

    @Override // com.google.android.gms.internal.ads.zzare
    public final zzarh a(zzhfh zzhfhVar, zzari zzariVar) throws IOException {
        int B5;
        long j;
        String str;
        long b2 = zzhfhVar.b();
        ThreadLocal threadLocal = this.a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            B5 = zzhfhVar.B5((ByteBuffer) threadLocal.get());
            if (B5 == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long e = zzarg.e((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (e < 8 && e > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (e == 1) {
                        ThreadLocal threadLocal2 = this.a;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        zzhfhVar.B5((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        j = zzarg.f((ByteBuffer) threadLocal2.get()) - 16;
                    } else if (e == 0) {
                        j = zzhfhVar.c() - zzhfhVar.b();
                    } else {
                        j = e - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ThreadLocal threadLocal3 = this.a;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzhfhVar.B5((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) threadLocal3.get()).position() - 16; position < ((ByteBuffer) threadLocal3.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    if (zzariVar instanceof zzarh) {
                        str = ((zzarh) zzariVar).a();
                    } else {
                        str = "";
                    }
                    zzarh b3 = b(str2, bArr, str);
                    ThreadLocal threadLocal4 = this.a;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    b3.d(zzhfhVar, (ByteBuffer) threadLocal4.get(), j2, this);
                    return b3;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (B5 >= 0);
        zzhfhVar.w(b2);
        throw new EOFException();
    }

    public abstract zzarh b(String str, byte[] bArr, String str2);
}
