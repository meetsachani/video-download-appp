package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.AD1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfy extends zzfz {
    public final AssetManager e;
    @InterfaceC11300zs1
    public Uri f;
    @InterfaceC11300zs1
    public InputStream g;
    public long h;
    public boolean i;

    public zzfy(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws zzfx {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfx(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        String str = zzeu.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        A(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws zzfx {
        int i;
        try {
            Uri uri = zzglVar.a;
            this.f = uri;
            String path = uri.getPath();
            if (path != null) {
                if (path.startsWith("/android_asset/")) {
                    path = path.substring(15);
                } else if (path.startsWith(RemoteSettings.i)) {
                    path = path.substring(1);
                }
                h(zzglVar);
                InputStream open = this.e.open(path, 1);
                this.g = open;
                long j = zzglVar.e;
                if (open.skip(j) >= j) {
                    long j2 = zzglVar.f;
                    if (j2 != -1) {
                        this.h = j2;
                    } else {
                        long available = this.g.available();
                        this.h = available;
                        if (available == 2147483647L) {
                            this.h = -1L;
                        }
                    }
                    this.i = true;
                    i(zzglVar);
                    return this.h;
                }
                throw new zzfx(null, 2008);
            }
            throw null;
        } catch (zzfx e) {
            throw e;
        } catch (IOException e2) {
            if (true != (e2 instanceof FileNotFoundException)) {
                i = 2000;
            } else {
                i = AD1.h1;
            }
            throw new zzfx(e2, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws zzfx {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    g();
                }
            } catch (IOException e) {
                throw new zzfx(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
            throw th;
        }
    }
}
