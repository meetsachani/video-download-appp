package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nn */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2089nn implements FL, InterfaceC0664Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C04905i A01;
    public InterfaceC0780Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C05939p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C2089nn(C05939p c05939p, Uri uri, InterfaceC2178pF interfaceC2178pF, DD dd, HA ha, AnonymousClass48 anonymousClass48) {
        this.A0D = c05939p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC2178pF);
        this.A09 = dd;
        this.A0A = ha;
        this.A07 = anonymousClass48;
    }

    public static /* synthetic */ long A00(C2089nn c2089nn) {
        return c2089nn.A05;
    }

    public static /* synthetic */ long A01(C2089nn c2089nn) {
        return c2089nn.A00;
    }

    public static /* synthetic */ C04905i A02(C2089nn c2089nn) {
        return c2089nn.A01;
    }

    public static /* synthetic */ AG A03(C2089nn c2089nn) {
        return c2089nn.A08;
    }

    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    public static /* synthetic */ void A05(C2089nn c2089nn, long j, long j2) {
        c2089nn.A04(j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.FL
    public final void A4r() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.X.FL
    public final void AAr() throws IOException {
        String str;
        IcyHeaders icyHeaders;
        IcyHeaders icyHeaders2;
        long j;
        Handler handler;
        Runnable runnable;
        IcyHeaders icyHeaders3;
        IcyHeaders icyHeaders4;
        C2242qI c2242qI;
        int i = 0;
        while (i == 0 && !this.A0C) {
            try {
                long j2 = this.A0B.A00;
                Uri uri = this.A06;
                str = this.A0D.A0b;
                this.A01 = new C04905i(uri, j2, -1L, str);
                long AGi = this.A08.AGi(this.A01);
                if (AGi != -1) {
                    AGi += j2;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC2178pF interfaceC2178pF = this.A08;
                icyHeaders = this.A0D.A09;
                if (icyHeaders != null) {
                    icyHeaders3 = this.A0D.A09;
                    if (icyHeaders3.A01 != -1) {
                        AG ag = this.A08;
                        icyHeaders4 = this.A0D.A09;
                        interfaceC2178pF = new InterfaceC2178pF(ag, icyHeaders4.A01, this) { // from class: com.facebook.ads.redexgen.X.9r
                            public int A00;
                            public final int A01;
                            public final InterfaceC2178pF A02;
                            public final InterfaceC0664Cp A03;
                            public final byte[] A04;

                            {
                                AbstractC04543y.A07(r4 > 0);
                                this.A02 = ag;
                                this.A01 = r4;
                                this.A03 = this;
                                this.A04 = new byte[1];
                                this.A00 = r4;
                            }

                            private boolean A00() throws IOException {
                                int bytesRead = this.A02.read(this.A04, 0, 1);
                                if (bytesRead == -1) {
                                    return false;
                                }
                                int bytesRead2 = this.A04[0];
                                int metadataLength = (bytesRead2 & 255) << 4;
                                if (metadataLength == 0) {
                                    return true;
                                }
                                int i2 = 0;
                                int i3 = metadataLength;
                                byte[] bArr = new byte[metadataLength];
                                while (i3 > 0) {
                                    int bytesRead3 = this.A02.read(bArr, i2, i3);
                                    if (bytesRead3 == -1) {
                                        return false;
                                    }
                                    i2 += bytesRead3;
                                    i3 -= bytesRead3;
                                }
                                while (metadataLength > 0) {
                                    int bytesRead4 = metadataLength - 1;
                                    if (bArr[bytesRead4] != 0) {
                                        break;
                                    }
                                    metadataLength--;
                                }
                                if (metadataLength > 0) {
                                    this.A03.AE5(new C04774v(bArr, metadataLength));
                                }
                                return true;
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                            public final void A43(InterfaceC05015t interfaceC05015t) {
                                AbstractC04543y.A01(interfaceC05015t);
                                this.A02.A43(interfaceC05015t);
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                            public final Map<String, List<String>> A8t() {
                                return this.A02.A8t();
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                            public final Uri A9P() {
                                return this.A02.A9P();
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                            public final long AGi(C04905i c04905i) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                            public final void close() {
                                throw new UnsupportedOperationException();
                            }

                            @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
                            public final int read(byte[] bArr, int i2, int i3) throws IOException {
                                if (this.A00 == 0) {
                                    if (!A00()) {
                                        return -1;
                                    }
                                    this.A00 = this.A01;
                                }
                                int read = this.A02.read(bArr, i2, Math.min(this.A00, i3));
                                if (read != -1) {
                                    int bytesRead = this.A00;
                                    this.A00 = bytesRead - read;
                                }
                                return read;
                            }
                        };
                        this.A02 = this.A0D.A0Z();
                        InterfaceC0780Hd interfaceC0780Hd = this.A02;
                        c2242qI = C05939p.A0g;
                        interfaceC0780Hd.A6e(c2242qI);
                    }
                }
                this.A09.AAB(interfaceC2178pF, this.A06, this.A08.A8t(), j2, AGi, this.A0A);
                icyHeaders2 = this.A0D.A09;
                if (icyHeaders2 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j2, this.A00);
                    this.A03 = false;
                }
                while (i == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        i = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        j = this.A0D.A0M;
                        if (position > j + j2) {
                            j2 = position;
                            this.A07.A02();
                            handler = this.A0D.A0O;
                            runnable = this.A0D.A0a;
                            handler.post(runnable);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    long A7a = this.A09.A7a();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (A7a != -1) {
                        this.A0B.A00 = this.A09.A7a();
                    }
                }
                AbstractC04855d.A00(this.A08);
            } catch (Throwable th) {
                if (i != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                AbstractC04855d.A00(this.A08);
                throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0664Cp
    public final void AE5(C04774v c04774v) {
        long A03;
        long max;
        if (this.A04) {
            A03 = this.A0D.A03(true);
            max = Math.max(A03, this.A00);
        } else {
            max = this.A00;
        }
        int A07 = c04774v.A07();
        InterfaceC0780Hd interfaceC0780Hd = (InterfaceC0780Hd) AbstractC04543y.A01(this.A02);
        interfaceC0780Hd.AIr(c04774v, A07);
        interfaceC0780Hd.AIu(max, 1, A07, 0, null);
        this.A04 = true;
    }
}
