package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* renamed from: o.uf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10028uf extends AbstractC5887dl {
    public final AssetManager f;
    @InterfaceC11300zs1
    public Uri g;
    @InterfaceC11300zs1
    public InputStream h;
    public long i;
    public boolean j;

    /* renamed from: o.uf$a */
    /* loaded from: classes2.dex */
    public static final class a extends LU {
        @Deprecated
        public a(IOException iOException) {
            super(iOException, 2000);
        }

        public a(@InterfaceC11300zs1 Throwable th, int i) {
            super(th, i);
        }
    }

    public C10028uf(Context context) {
        super(false);
        this.f = context.getAssets();
    }

    @Override // o.FU
    public long a(OU ou) throws a {
        int i;
        try {
            Uri uri = ou.a;
            this.g = uri;
            String str = (String) C9542sf.g(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(RemoteSettings.i)) {
                str = str.substring(1);
            }
            A(ou);
            InputStream open = this.f.open(str, 1);
            this.h = open;
            if (open.skip(ou.g) >= ou.g) {
                long j = ou.h;
                if (j != -1) {
                    this.i = j;
                } else {
                    long available = this.h.available();
                    this.i = available;
                    if (available == 2147483647L) {
                        this.i = -1L;
                    }
                }
                this.j = true;
                B(ou);
                return this.i;
            }
            throw new a(null, 2008);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = AD1.h1;
            } else {
                i = 2000;
            }
            throw new a(e2, i);
        }
    }

    @Override // o.FU
    public void close() throws a {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.h;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.h = null;
            if (this.j) {
                this.j = false;
                z();
            }
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.g;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int read = ((InputStream) TD2.o(this.h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        y(read);
        return read;
    }
}
