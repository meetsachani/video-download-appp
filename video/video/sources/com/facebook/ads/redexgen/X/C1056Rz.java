package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import o.C3307Iz;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Rz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1056Rz implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C1673gi A03;
    public VX A04;
    public C05256r A05;
    public boolean A06;
    public boolean A07;
    public NativeAd A08;
    public final E0 A0D = new E0() { // from class: com.facebook.ads.redexgen.X.7K
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(E1 e1) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onPrepared();
        }
    };
    public final E2 A0C = new E2() { // from class: com.facebook.ads.redexgen.X.7J
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(E3 e3) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            if (C1056Rz.this.A08 != null) {
                UK.A0L(C1056Rz.this.A08.getInternalNativeAd()).A1o(true, true);
            }
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onPlayed();
        }
    };
    public final E4 A0B = new E4() { // from class: com.facebook.ads.redexgen.X.7I
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4B c4b) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onPaused();
        }
    };
    public final AbstractC0697Dx A0E = new AbstractC0697Dx() { // from class: com.facebook.ads.redexgen.X.7H
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C0698Dy c0698Dy) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onSeek();
        }
    };
    public final EA A09 = new EA() { // from class: com.facebook.ads.redexgen.X.7G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4K c4k) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            MediaViewVideoRenderer mediaViewVideoRenderer2;
            MediaViewVideoRenderer mediaViewVideoRenderer3;
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onCompleted();
            mediaViewVideoRenderer2 = C1056Rz.this.A00;
            if (!C1123Up.A1j(mediaViewVideoRenderer2.getContext())) {
                return;
            }
            mediaViewVideoRenderer3 = C1056Rz.this.A00;
            mediaViewVideoRenderer3.play(VideoStartReason.AUTO_STARTED);
        }
    };
    public final AbstractC0691Dr A0F = new AbstractC0691Dr() { // from class: com.facebook.ads.redexgen.X.7F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C0692Ds c0692Ds) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onVolumeChanged();
        }
    };
    public final E8 A0A = new E8() { // from class: com.facebook.ads.redexgen.X.7D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(E9 e9) {
            MediaViewVideoRenderer mediaViewVideoRenderer;
            if (C1056Rz.this.A08 != null) {
                UK.A0L(C1056Rz.this.A08.getInternalNativeAd()).A1o(false, true);
            }
            mediaViewVideoRenderer = C1056Rz.this.A00;
            mediaViewVideoRenderer.onError();
        }
    };
    public C1043Rm A02 = new C1043Rm();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{31, 56, 32, 55, 58, ED2.a, 50, 118, 0, ED2.a, 51, C3307Iz.V, 118, 53, 57, 56, C3307Iz.X, 34, 36, 35, 53, 34, 57, 36, 118, C3307Iz.Y, 55, 36, 55, 59, C3307Iz.X, 118, 34, 47, C3307Iz.Y, 51, QC1.w, 126, 72, 72, 70, 68, 67, 74, 13, 64, 88, 94, 89, 13, 79, 72, 13, 93, 95, 72, 78, 72, 73, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 1, 13, 76, 67, 73, 13, 75, 66, 65, 65, 66, 90, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 73, 68, 94, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 3, C3307Iz.Y, C3307Iz.c0, 49, C3307Iz.Z, C3307Iz.d0, C3307Iz.X, 35, C3307Iz.X, C3307Iz.Z, 17, C3307Iz.Z, C3307Iz.Z, C3307Iz.a0, 98, C3307Iz.V, 35, C3307Iz.f0, C3307Iz.f0, C3307Iz.Z, C3307Iz.Y, 98, 53, C3307Iz.c0, 54, 42, C3307Iz.e0, 55, 54, 98, C3307Iz.Z, C3307Iz.d0, C3307Iz.X, 35, C3307Iz.X, C3307Iz.Z, 17, C3307Iz.Z, C3307Iz.Z, C3307Iz.a0, 108, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, C3307Iz.a0, 106, 104, 101, 101, 108, 109, C3307Iz.a0, 126, 96, 125, 97, 102, 124, 125, C3307Iz.a0, 109, 96, 122, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, C3307Iz.Z};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            UK.A0L(this.A08.getInternalNativeAd()).A1o(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            VX vx = this.A04;
            if (A0H[6].length() != 3) {
                throw new RuntimeException();
            }
            A0H[6] = "qaG";
            vx.AKY();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C1673gi A16 = ((UK) nativeAd.getInternalNativeAd()).A16();
        C1673gi adObjectContext = this.A03;
        adObjectContext.A0L(A16);
        S2 s2 = (S2) nativeAd.getNativeAdApi();
        this.A05.setClientToken(UK.A0L(nativeAd.getInternalNativeAd()).A1H());
        this.A05.setVideoMPD(s2.A02());
        this.A05.setVideoURI(s2.A03());
        C1864ju A12 = UK.A0L(nativeAd.getInternalNativeAd()).A12();
        if (A12 != null) {
            this.A05.setVideoProgressReportIntervalMs(A12.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = s2.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AJZ(nativeAd);
        }
    }

    public final void A05(VA va) {
        this.A05.setAdEventManager(va);
    }

    public final void A06(VX vx) {
        this.A04 = vx;
    }

    public final void A07(InterfaceC1228Yv interfaceC1228Yv) {
        this.A05.setListener(interfaceC1228Yv);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0W();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                String str = A0I;
                String A01 = A01(127, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                Log.w(str, A01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0e(Y6.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 10));
                return;
            }
            return;
        }
        this.A06 = true;
        this.A07 = EnumC1615fm.A0A.equals(this.A05.getState());
        this.A05.A0i(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C1673gi A03;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1673gi) {
            A03 = (C1673gi) context;
        } else {
            A03 = C1046Rp.A03(context);
        }
        this.A03 = A03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new C05256r(A03);
                break;
            case 1:
                this.A05 = new C05256r(A03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new C05256r(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new C05256r(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        EnumC1183Xc.A04(this.A05, EnumC1183Xc.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0i(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0e(Y6.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i) {
        if (!this.A06) {
            boolean isDebugBuild = AdInternalSettings.isDebugBuild();
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (isDebugBuild) {
                Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0a(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == EnumC1615fm.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
