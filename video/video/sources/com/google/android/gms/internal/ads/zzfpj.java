package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfpj {
    public final zzayj a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public zzfpj(@InterfaceC5670cr1 zzayj zzayjVar, @InterfaceC5670cr1 File file, @InterfaceC5670cr1 File file2, @InterfaceC5670cr1 File file3) {
        this.a = zzayjVar;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final zzayj a() {
        return this.a;
    }

    public final File b() {
        return this.c;
    }

    public final File c() {
        return this.b;
    }

    public final boolean d(long j) {
        if (this.a.t2() - (System.currentTimeMillis() / 1000) < 3600) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] e() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        zzgxk U;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                zzgxk zzgxkVar = zzgxk.Y;
                ArrayList arrayList = new ArrayList();
                int i = 256;
                while (true) {
                    byte[] bArr3 = new byte[i];
                    int i2 = 0;
                    while (i2 < i) {
                        int read = fileInputStream.read(bArr3, i2, i - i2);
                        if (read == -1) {
                            break;
                        }
                        i2 += read;
                    }
                    if (i2 == 0) {
                        U = null;
                    } else {
                        U = zzgxk.U(bArr3, 0, i2);
                    }
                    if (U == null) {
                        break;
                    }
                    arrayList.add(U);
                    i = Math.min(i + i, 8192);
                }
                bArr2 = zzgxk.Q(arrayList).d();
                IOUtils.b(fileInputStream);
            } catch (IOException unused2) {
                IOUtils.b(fileInputStream);
                bArr2 = null;
                this.e = bArr2;
                bArr = this.e;
                if (bArr != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                IOUtils.b(fileInputStream2);
                throw th;
            }
            this.e = bArr2;
        }
        bArr = this.e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
