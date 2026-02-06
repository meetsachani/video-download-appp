package o;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

@Deprecated
/* loaded from: classes2.dex */
public final class DU extends AbstractC5887dl {
    public static final String j = "data";
    @InterfaceC11300zs1
    public OU f;
    @InterfaceC11300zs1
    public byte[] g;
    public int h;
    public int i;

    public DU() {
        super(false);
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        A(ou);
        this.f = ou;
        Uri normalizeScheme = ou.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        C9542sf.b(equals, "Unsupported scheme: " + scheme);
        String[] J1 = TD2.J1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (J1.length == 2) {
            String str = J1[1];
            if (J1[0].contains(VU.c)) {
                try {
                    this.g = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw C3989Py1.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.g = TD2.G0(URLDecoder.decode(str, KB.a.name()));
            }
            long j2 = ou.g;
            byte[] bArr = this.g;
            if (j2 <= bArr.length) {
                int i = (int) j2;
                this.h = i;
                int length = bArr.length - i;
                this.i = length;
                long j3 = ou.h;
                if (j3 != -1) {
                    this.i = (int) Math.min(length, j3);
                }
                B(ou);
                long j4 = ou.h;
                if (j4 != -1) {
                    return j4;
                }
                return this.i;
            }
            this.g = null;
            throw new LU(2008);
        }
        throw C3989Py1.b("Unexpected URI format: " + normalizeScheme, null);
    }

    @Override // o.FU
    public void close() {
        if (this.g != null) {
            this.g = null;
            z();
        }
        this.f = null;
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        OU ou = this.f;
        if (ou != null) {
            return ou.a;
        }
        return null;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(TD2.o(this.g), this.h, bArr, i, min);
        this.h += min;
        this.i -= min;
        y(min);
        return min;
    }
}
