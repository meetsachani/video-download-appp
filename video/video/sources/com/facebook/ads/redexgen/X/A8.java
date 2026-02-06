package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: assets/audience_network/classes2.dex */
public final class A8 implements InterfaceC2146oj {
    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public InterfaceC04333b A00;
    public C4X A01;
    public C04594d<AnonymousClass88> A02;
    public boolean A03;
    public final AnonymousClass45 A07;
    public final C2209pl A05 = new C2209pl();
    public final C2207pj A06 = new C2207pj();
    public final C8A A08 = new C8A(this.A05);
    public final SparseArray<AnonymousClass86> A04 = new SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @RequiresNonNull({"player"})
    private final AnonymousClass86 A03(final Timeline timeline, final int i, C2090no c2090no) {
        final C2090no c2090no2 = c2090no;
        if (timeline.A0N()) {
            c2090no2 = null;
        }
        final long A6J = this.A07.A6J();
        boolean z = true;
        boolean z2 = timeline.equals(this.A00.A7g()) && i == this.A00.A7b();
        if (c2090no2 != null && c2090no2.A00()) {
            if ((z2 && this.A00.A7Y() == c2090no2.A00 && this.A00.A7Z() == c2090no2.A01) ? false : false) {
                r9 = this.A00.A7e();
            }
        } else if (z2) {
            r9 = this.A00.A7T();
            String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            r9 = timeline.A0N() ? 0L : timeline.A0K(i, this.A06).A04();
            String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final C2090no A06 = this.A08.A06();
        final Timeline A7g = this.A00.A7g();
        final int A7b = this.A00.A7b();
        final long A7e = this.A00.A7e();
        final long A9J = this.A00.A9J();
        return new Object(A6J, timeline, i, c2090no2, r9, A7g, A7b, A06, A7e, A9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final Timeline A06;
            public final Timeline A07;
            public final C2090no A08;
            public final C2090no A09;

            {
                this.A04 = A6J;
                this.A07 = timeline;
                this.A01 = i;
                this.A09 = c2090no2;
                this.A03 = r6;
                this.A06 = A7g;
                this.A00 = A7b;
                this.A08 = A06;
                this.A02 = A7e;
                this.A05 = A9J;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AnonymousClass86 anonymousClass86 = (AnonymousClass86) obj;
                if (this.A04 == anonymousClass86.A04 && this.A01 == anonymousClass86.A01 && this.A03 == anonymousClass86.A03 && this.A00 == anonymousClass86.A00 && this.A02 == anonymousClass86.A02 && this.A05 == anonymousClass86.A05 && CB.A01(this.A07, anonymousClass86.A07) && CB.A01(this.A09, anonymousClass86.A09) && CB.A01(this.A06, anonymousClass86.A06) && CB.A01(this.A08, anonymousClass86.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return CB.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
            }
        };
    }

    public A8(AnonymousClass45 anonymousClass45) {
        this.A07 = (AnonymousClass45) AbstractC04543y.A01(anonymousClass45);
        this.A02 = new C04594d<>(C5C.A0d(), anonymousClass45, new InterfaceC04574b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final AnonymousClass86 A00() {
        return A04(this.A08.A06());
    }

    private AnonymousClass86 A01(int i, C2090no c2090no) {
        AbstractC04543y.A01(this.A00);
        boolean z = true;
        if (c2090no != null) {
            if (this.A08.A05(c2090no) == null) {
                z = false;
            }
            if (z) {
                return A04(c2090no);
            }
            return A03(Timeline.A02, i, c2090no);
        }
        Timeline A7g = this.A00.A7g();
        if (i >= A7g.A07()) {
            z = false;
        }
        if (!z) {
            A7g = Timeline.A02;
        }
        return A03(A7g, i, null);
    }

    private AnonymousClass86 A02(C2223pz c2223pz) {
        if (c2223pz instanceof AD) {
            AD ad = (AD) c2223pz;
            if (ad.A05 != null) {
                return A04(new C2090no(ad.A05));
            }
        }
        return A00();
    }

    private AnonymousClass86 A04(C2090no c2090no) {
        Timeline A05;
        AbstractC04543y.A01(this.A00);
        if (c2090no == null) {
            A05 = null;
        } else {
            A05 = this.A08.A05(c2090no);
        }
        if (c2090no == null || A05 == null) {
            int windowIndex = this.A00.A7b();
            Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(A05, A05.A0J(c2090no.A04, this.A05).A00, c2090no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(AnonymousClass86 anonymousClass86, int i, InterfaceC04564a<AnonymousClass88> interfaceC04564a) {
        this.A04.put(i, anonymousClass86);
        this.A02.A0A(i, interfaceC04564a);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2146oj
    public final void ACe() {
        if (!this.A03) {
            final AnonymousClass86 A00 = A00();
            this.A03 = true;
            A05(A00, -1, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void ADZ(final C2190pR c2190pR) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 27, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void ADa(final List<C2192pT> list) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 27, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.facebook.ads.redexgen.X.D9
    public final void ADk(int i, C2090no c2090no, final C0666Cs c0666Cs) {
        final AnonymousClass86 A01 = A01(i, c2090no);
        A05(A01, 1004, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.facebook.ads.redexgen.X.D9
    public final void AEb(int i, C2090no c2090no, final Cq cq, final C0666Cs c0666Cs) {
        final AnonymousClass86 A01 = A01(i, c2090no);
        A05(A01, 1002, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.facebook.ads.redexgen.X.D9
    public final void AEd(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2090no c2090no, final Cq cq, final C0666Cs c0666Cs, Object obj, Object obj2) {
        final AnonymousClass86 A01 = A01(i, c2090no);
        A05(A01, 1001, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.facebook.ads.redexgen.X.D9
    public final void AEg(int i, C2090no c2090no, final Cq cq, final C0666Cs c0666Cs, final IOException iOException, final boolean z) {
        final AnonymousClass86 A01 = A01(i, c2090no);
        A05(A01, 1003, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AFI(final C2221px c2221px) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 12, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AFK(final C2223pz c2223pz) {
        final AnonymousClass86 A02 = A02(c2223pz);
        A05(A02, 10, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AFM(final boolean z, final int i) {
        final AnonymousClass86 A00 = A00();
        A05(A00, -1, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AFt() {
        final AnonymousClass86 A00 = A00();
        A05(A00, -1, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AGA(Timeline timeline, final int i) {
        this.A08.A07((InterfaceC04333b) AbstractC04543y.A01(this.A00));
        final AnonymousClass86 A00 = A00();
        A05(A00, 0, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.facebook.ads.redexgen.X.C3U
    public final void AGE(final C2197pY c2197pY) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 2, new InterfaceC04564a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2146oj
    public final void AJf(final InterfaceC04333b interfaceC04333b, Looper looper) {
        boolean z;
        BP bp;
        if (this.A00 != null) {
            bp = this.A08.A03;
            if (!bp.isEmpty()) {
                z = false;
                AbstractC04543y.A08(z);
                this.A00 = (InterfaceC04333b) AbstractC04543y.A01(interfaceC04333b);
                this.A01 = this.A07.A5P(looper, null);
                this.A02 = this.A02.A07(looper, new InterfaceC04574b() { // from class: com.facebook.ads.redexgen.X.oZ
                });
            }
        }
        z = true;
        AbstractC04543y.A08(z);
        this.A00 = (InterfaceC04333b) AbstractC04543y.A01(interfaceC04333b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC04574b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
