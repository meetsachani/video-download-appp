package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import o.C8920q7;

/* renamed from: com.facebook.ads.redexgen.X.nR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2067nR implements InterfaceC0712Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass45 A08;
    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final F6 A09;
    public final int A0A;

    public C2067nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2067nR(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, C8920q7.D, C8920q7.E, f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2067nR(F6 f6) {
        this(f6, -1, 10000, 25000, 25000, C8920q7.D, C8920q7.E, 0.75f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2067nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, AnonymousClass45 anonymousClass45) {
        this.A09 = f6;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C03821a A00(C2205pg c2205pg, int[] iArr, int i, F6 f6, BP<EU> bp) {
        return new C03821a(c2205pg, iArr, i, f6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Em
    public final InterfaceC2054nE[] A5b(C0711El[] c0711ElArr, F6 f6, C2090no c2090no, Timeline timeline) {
        InterfaceC2054nE A00;
        BP A01 = C03821a.A01(c0711ElArr);
        InterfaceC2054nE[] interfaceC2054nEArr = new InterfaceC2054nE[c0711ElArr.length];
        for (int i = 0; i < c0711ElArr.length; i++) {
            C0711El c0711El = c0711ElArr[i];
            if (c0711El != null && c0711El.A02.length != 0) {
                int length = c0711El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A00 = new C1Z(c0711El.A01, c0711El.A02[0], c0711El.A00);
                } else {
                    A00 = A00(c0711El.A01, c0711El.A02, c0711El.A00, f6, (BP) A01.get(i));
                }
                interfaceC2054nEArr[i] = A00;
            }
        }
        return interfaceC2054nEArr;
    }
}
