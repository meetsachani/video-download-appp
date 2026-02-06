package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzhfc implements zzarh {
    public static final zzhfn c1 = zzhfn.b(zzhfc.class);
    public final String X;
    public ByteBuffer Y0;
    public long Z0;
    public zzhfh b1;
    public long a1 = -1;
    public boolean Z = true;
    public boolean Y = true;

    public zzhfc(String str) {
        this.X = str;
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final String a() {
        return this.X;
    }

    public final synchronized void b() {
        String str;
        try {
            if (!this.Z) {
                try {
                    zzhfn zzhfnVar = c1;
                    String str2 = this.X;
                    if (str2.length() != 0) {
                        str = "mem mapping ".concat(str2);
                    } else {
                        str = new String("mem mapping ");
                    }
                    zzhfnVar.a(str);
                    this.Y0 = this.b1.T2(this.Z0, this.a1);
                    this.Z = true;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void d(zzhfh zzhfhVar, ByteBuffer byteBuffer, long j, zzare zzareVar) throws IOException {
        this.Z0 = zzhfhVar.b();
        byteBuffer.remaining();
        this.a1 = j;
        this.b1 = zzhfhVar;
        zzhfhVar.w(zzhfhVar.b() + j);
        this.Z = false;
        this.Y = false;
        e();
    }

    public final synchronized void e() {
        String str;
        try {
            b();
            zzhfn zzhfnVar = c1;
            String str2 = this.X;
            if (str2.length() != 0) {
                str = "parsing details of ".concat(str2);
            } else {
                str = new String("parsing details of ");
            }
            zzhfnVar.a(str);
            ByteBuffer byteBuffer = this.Y0;
            if (byteBuffer != null) {
                this.Y = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.Y0 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
