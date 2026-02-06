package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.9H  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9H {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2242qI A07;
    public final boolean A08;
    public final InterfaceC04403k[] A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, C3307Iz.Z, 32, 52, C3307Iz.e0, 53, 0, 52, C3307Iz.X, 40, C3307Iz.f0, C8077mf.u, 40, 47, 42, 40, ED2.a, 35, C3307Iz.Y, C3307Iz.f0, C8077mf.m, ED2.a, C3307Iz.f0, 35, C3307Iz.X, C8077mf.H, 56, C3307Iz.c0, C3307Iz.a0, C3307Iz.V, 112, 106, 57, 62, C3307Iz.c0, 62, 47, 119, 111, C3307Iz.f0, 102, 106, C3307Iz.c0, ED2.a, C3307Iz.f0, 35, C3307Iz.X, C8077mf.H, 56, C3307Iz.c0, C3307Iz.a0, C3307Iz.V, C8077mf.m, C3307Iz.Y, C3307Iz.Y, C3307Iz.X, C3307Iz.a0, C3307Iz.c0, 62, 47, C3307Iz.f0, 100, C3307Iz.e0, 47, 62, 98, 99, 119, 111, C3307Iz.f0};
    }

    static {
        A07();
    }

    public C9H(C2242qI c2242qI, int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC04403k[] interfaceC04403kArr, boolean z) {
        this.A07 = c2242qI;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A09 = interfaceC04403kArr;
        this.A08 = z;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2248qQ c2248qQ, boolean z) {
        if (z) {
            return A00();
        }
        return c2248qQ.A01().A00;
    }

    private AudioTrack A02(C2248qQ c2248qQ, int i) {
        int A04 = C5C.A04(c2248qQ.A05);
        if (i != 0) {
            return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1, i);
        }
        return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z, C2248qQ c2248qQ, int i) {
        if (C5C.A02 >= 29) {
            return A05(z, c2248qQ, i);
        }
        if (C5C.A02 >= 21) {
            return A04(z, c2248qQ, i);
        }
        AudioTrack A02 = A02(c2248qQ, i);
        String[] strArr = A0B;
        if (strArr[5].length() != strArr[7].length()) {
            String[] strArr2 = A0B;
            strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
            strArr2[7] = "OM";
            return A02;
        }
        throw new RuntimeException();
    }

    private AudioTrack A04(boolean z, C2248qQ c2248qQ, int i) {
        AudioFormat A0D;
        AudioAttributes A01 = A01(c2248qQ, z);
        A0D = C2123oM.A0D(this.A06, this.A02, this.A03);
        return new AudioTrack(A01, A0D, this.A00, 1, i);
    }

    private AudioTrack A05(boolean z, C2248qQ c2248qQ, int i) {
        AudioFormat A0D;
        A0D = C2123oM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2248qQ, z);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(A0D);
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z2 = false;
        }
        AudioTrack build = sessionId.setOffloadedPlayback(z2).build();
        String[] strArr = A0B;
        if (strArr[4].length() != strArr[2].length()) {
            A0B[1] = "btQ69Jh";
            return build;
        }
        throw new RuntimeException();
    }

    public final long A08(long j) {
        return (1000000 * j) / this.A06;
    }

    public final long A09(long j) {
        return (1000000 * j) / this.A07.A0G;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z, C2248qQ c2248qQ, int i) throws C05778t {
        try {
            AudioTrack A03 = A03(z, c2248qQ, i);
            C2123oM.A0M().incrementAndGet();
            int state = A03.getState();
            if (state == 1) {
                return A03;
            }
            try {
                A03.release();
                C2123oM.A0M().decrementAndGet();
            } catch (Exception e) {
                AbstractC04624g.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C2123oM.A0M().get())), e);
            }
            throw new C05778t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C2123oM.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new C05778t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e2, C2123oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final C05758r A0B() {
        return new Object(this.A03, this.A06, this.A02, this.A08, this.A04 == 1, this.A00) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = r1;
                this.A03 = r2;
                this.A01 = r3;
                this.A05 = r4;
                this.A04 = r5;
                this.A00 = r6;
            }
        };
    }

    public final C9H A0C(int i) {
        return new C9H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C9H c9h) {
        return c9h.A04 == this.A04 && c9h.A03 == this.A03 && c9h.A06 == this.A06 && c9h.A02 == this.A02 && c9h.A05 == this.A05;
    }
}
