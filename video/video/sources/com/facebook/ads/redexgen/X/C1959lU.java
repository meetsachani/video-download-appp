package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.lU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1959lU implements H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.facebook.ads.redexgen.X.HD
        public final H9[] A5N() {
            return C1959lU.A00();
        }

        @Override // com.facebook.ads.redexgen.X.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C1958lT A02 = new C1958lT();
    public final C04774v A01 = new C04774v(16384);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C1959lU()};
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AAC(HA ha) {
        this.A02.A5c(ha, new LG(0, 1));
        ha.A6O();
        ha.AJ7(new C2028mn(C10323vs.b));
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final int AHL(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        int read = interfaceC2033ms.read(this.A01.A0l(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(read);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AJ6(long j, long j2) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final boolean AK5(InterfaceC2033ms interfaceC2033ms) throws IOException {
        C04774v c04774v = new C04774v(10);
        int length = 0;
        while (true) {
            byte[] A0l = c04774v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC2033ms.AGt(A0l, 0, 10);
            c04774v.A0f(0);
            if (c04774v.A0K() != 4801587) {
                interfaceC2033ms.AIl();
                interfaceC2033ms.A47(length);
                int i = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC2033ms.AGt(c04774v.A0l(), 0, 7);
                    c04774v.A0f(0);
                    int headerPosition = c04774v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC2033ms.AIl();
                        i++;
                        if (i - length >= 8192) {
                            return false;
                        }
                        interfaceC2033ms.A47(i);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC0771Gu.A02(c04774v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC2033ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c04774v.A0g(3);
                int A0H = c04774v.A0H();
                length += A0H + 10;
                interfaceC2033ms.A47(A0H);
            }
        }
    }
}
