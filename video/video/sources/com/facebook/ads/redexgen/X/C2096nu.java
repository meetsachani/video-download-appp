package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.nu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2096nu implements DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public H9 A00;
    public InterfaceC2033ms A01;
    public final HD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, C8077mf.D, C8077mf.z, C8077mf.n, C8077mf.y, C8077mf.G, 89, C8077mf.m, 28, C8077mf.B, C8077mf.G, 89, 13, 17, 28, 89, 10, 13, C8077mf.m, 28, C8077mf.B, C8077mf.x, 87, 2, 35, 34, C3307Iz.a0, 108, 35, 42, 108, 56, 36, C3307Iz.a0, 108, C3307Iz.e0, 58, C3307Iz.e0, C3307Iz.X, 32, C3307Iz.e0, C3307Iz.f0, 32, C3307Iz.a0, 108, C3307Iz.a0, 52, 56, 62, C3307Iz.e0, 47, 56, 35, 62, ED2.a, 108, 100};
    }

    static {
        A01();
    }

    public C2096nu(HD hd) {
        this.A02 = hd;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r9.A8n() != r19) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r9.A8n() != r19) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        r0 = false;
     */
    @Override // com.facebook.ads.redexgen.X.DD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC2178pF interfaceC2178pF, Uri uri, Map<String, List<String>> map, long j, long j2, HA ha) throws IOException {
        C05859f c05859f = new C05859f(interfaceC2178pF, j, j2);
        this.A01 = c05859f;
        if (this.A00 != null) {
            return;
        }
        H9[] extractors = this.A02.A5O(uri, map);
        boolean z = false;
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                H9 h9 = extractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.A00 == null) {
                    }
                } catch (Throwable th) {
                    AbstractC04543y.A08((this.A00 != null || c05859f.A8n() == j) ? true : true);
                    c05859f.AIl();
                    throw th;
                }
                if (h9.AK5(c05859f)) {
                    this.A00 = h9;
                    AbstractC04543y.A08((this.A00 != null || c05859f.A8n() == j) ? true : true);
                    c05859f.AIl();
                } else {
                    if (this.A00 == null) {
                    }
                    boolean z2 = true;
                    AbstractC04543y.A08(z2);
                    c05859f.AIl();
                    i++;
                }
            }
            if (this.A00 == null) {
                throw new C2071nV(A00(24, 34, 2) + C5C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC04543y.A01(uri));
            }
        }
        H9 h92 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h92.AAC(ha);
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final int AHM(HV hv) throws IOException {
        return ((H9) AbstractC04543y.A01(this.A00)).AHL((InterfaceC2033ms) AbstractC04543y.A01(this.A01), hv);
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final void AJ6(long j, long j2) {
        ((H9) AbstractC04543y.A01(this.A00)).AJ6(j, j2);
    }
}
