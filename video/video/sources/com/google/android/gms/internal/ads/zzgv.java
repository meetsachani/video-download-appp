package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgv extends zzfz {
    @InterfaceC11300zs1
    public RandomAccessFile e;
    @InterfaceC11300zs1
    public Uri f;
    public long g;
    public boolean h;

    public zzgv() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzgu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = zzeu.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                A(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzgu(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzgu {
        Uri uri = zzglVar.a;
        this.f = uri;
        h(zzglVar);
        int i = 2006;
        try {
            String path = uri.getPath();
            if (path != null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.e = randomAccessFile;
                try {
                    long j = zzglVar.e;
                    randomAccessFile.seek(j);
                    long j2 = zzglVar.f;
                    if (j2 == -1) {
                        j2 = this.e.length() - j;
                    }
                    this.g = j2;
                    if (j2 >= 0) {
                        this.h = true;
                        i(zzglVar);
                        return this.g;
                    }
                    throw new zzgu(null, null, 2008);
                } catch (IOException e) {
                    throw new zzgu(e, 2000);
                }
            }
            throw null;
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new zzgu(e2, i);
            }
            throw new zzgu(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new zzgu(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzgu(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzgu {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    g();
                }
            } catch (IOException e) {
                throw new zzgu(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                g();
            }
            throw th;
        }
    }
}
