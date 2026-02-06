package o;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import o.AbstractC7373jp2;
import o.C3773Nr2;
import o.HD1;
import o.J8;
import o.TD0;

@Deprecated
/* renamed from: o.Ie0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3229Ie0 implements J8 {
    public static final String o0 = "EventLogger";
    public static final int p0 = 3;
    public static final NumberFormat q0;
    public final String k0;
    public final AbstractC7373jp2.d l0;
    public final AbstractC7373jp2.b m0;
    public final long n0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        q0 = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public C3229Ie0() {
        this(o0);
    }

    public static String B0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "?";
                        }
                        return "END_OF_MEDIA_ITEM";
                    }
                    return "REMOTE";
                }
                return "AUDIO_BECOMING_NOISY";
            }
            return "AUDIO_FOCUS_LOSS";
        }
        return "USER_REQUEST";
    }

    public static String C0(int i) {
        if (i != 0) {
            if (i != 1) {
                return "?";
            }
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return XH0.M;
    }

    public static String D0(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "?";
                }
                return "ALL";
            }
            return "ONE";
        }
        return "OFF";
    }

    public static String E0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "?";
                    }
                    return "ENDED";
                }
                return "READY";
            }
            return "BUFFERING";
        }
        return "IDLE";
    }

    public static String F0(long j) {
        if (j == C10323vs.b) {
            return "?";
        }
        return q0.format(((float) j) / 1000.0f);
    }

    public static String G0(int i) {
        if (i != 0) {
            if (i != 1) {
                return "?";
            }
            return "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    public static String H0(boolean z) {
        if (z) {
            return "[X]";
        }
        return "[ ]";
    }

    public static String i0(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "?";
                    }
                    return "PLAYLIST_CHANGED";
                }
                return "SEEK";
            }
            return "AUTO";
        }
        return "REPEAT";
    }

    public static String m(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "?";
                            }
                            return "INTERNAL";
                        }
                        return C5722d40.r1;
                    }
                    return "SKIP";
                }
                return "SEEK_ADJUSTMENT";
            }
            return "SEEK";
        }
        return "AUTO_TRANSITION";
    }

    @Override // o.J8
    public void A(J8.b bVar, C10519wf1 c10519wf1) {
        K0(bVar, "downstreamFormat", C10833xx0.k(c10519wf1.c));
    }

    @Override // o.J8
    public void D(J8.b bVar, C8775pW c8775pW) {
        J0(bVar, "videoDisabled");
    }

    @Override // o.J8
    public void E(J8.b bVar, Object obj, long j) {
        K0(bVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // o.J8
    public void F(J8.b bVar, String str, long j) {
        K0(bVar, "audioDecoderInitialized", str);
    }

    public void I0(String str) {
        I31.b(this.k0, str);
    }

    public final void J0(J8.b bVar, String str) {
        I0(r(bVar, str, null, null));
    }

    public final void K0(J8.b bVar, String str, String str2) {
        I0(r(bVar, str, str2, null));
    }

    @Override // o.J8
    public void L(J8.b bVar) {
        J0(bVar, "drmKeysLoaded");
    }

    public void L0(String str) {
        I31.d(this.k0, str);
    }

    @Override // o.J8
    public void M(J8.b bVar, @InterfaceC11300zs1 C8322nf1 c8322nf1, int i) {
        I0("mediaItem [" + V(bVar) + ", reason=" + i0(i) + C6566gU0.g);
    }

    public final void M0(J8.b bVar, String str, String str2, @InterfaceC11300zs1 Throwable th) {
        L0(r(bVar, str, str2, th));
    }

    public final void N0(J8.b bVar, String str, @InterfaceC11300zs1 Throwable th) {
        L0(r(bVar, str, null, th));
    }

    public final void O0(J8.b bVar, String str, Exception exc) {
        M0(bVar, "internalError", str, exc);
    }

    @Override // o.J8
    public void P(J8.b bVar, HD1.k kVar, HD1.k kVar2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(m(i));
        sb.append(", PositionInfo:old [");
        sb.append("mediaItem=");
        sb.append(kVar.Z);
        sb.append(", period=");
        sb.append(kVar.a1);
        sb.append(", pos=");
        sb.append(kVar.b1);
        if (kVar.d1 != -1) {
            sb.append(", contentPos=");
            sb.append(kVar.c1);
            sb.append(", adGroup=");
            sb.append(kVar.d1);
            sb.append(", ad=");
            sb.append(kVar.e1);
        }
        sb.append("], PositionInfo:new [");
        sb.append("mediaItem=");
        sb.append(kVar2.Z);
        sb.append(", period=");
        sb.append(kVar2.a1);
        sb.append(", pos=");
        sb.append(kVar2.b1);
        if (kVar2.d1 != -1) {
            sb.append(", contentPos=");
            sb.append(kVar2.c1);
            sb.append(", adGroup=");
            sb.append(kVar2.d1);
            sb.append(", ad=");
            sb.append(kVar2.e1);
        }
        sb.append(C6566gU0.g);
        K0(bVar, "positionDiscontinuity", sb.toString());
    }

    public final void P0(C4224Si1 c4224Si1, String str) {
        for (int i = 0; i < c4224Si1.e(); i++) {
            I0(str + c4224Si1.d(i));
        }
    }

    @Override // o.J8
    public void T(J8.b bVar, int i, long j) {
        K0(bVar, "droppedFrames", Integer.toString(i));
    }

    @Override // o.J8
    public void U(J8.b bVar, boolean z) {
        K0(bVar, "loading", Boolean.toString(z));
    }

    public final String V(J8.b bVar) {
        String str = "window=" + bVar.c;
        if (bVar.d != null) {
            str = str + ", period=" + bVar.b.g(bVar.d.a);
            if (bVar.d.c()) {
                str = (str + ", adGroup=" + bVar.d.b) + ", ad=" + bVar.d.c;
            }
        }
        return "eventTime=" + F0(bVar.a - this.n0) + ", mediaPos=" + F0(bVar.e) + C6566gU0.h + str;
    }

    @Override // o.J8
    public void W(J8.b bVar) {
        J0(bVar, "drmKeysRestored");
    }

    @Override // o.J8
    public void Y(J8.b bVar, String str, long j) {
        K0(bVar, "videoDecoderInitialized", str);
    }

    @Override // o.J8
    public void a(J8.b bVar) {
        J0(bVar, "drmSessionReleased");
    }

    @Override // o.J8
    public void a0(J8.b bVar, boolean z) {
        K0(bVar, "isPlaying", Boolean.toString(z));
    }

    @Override // o.J8
    public void b(J8.b bVar, boolean z, int i) {
        K0(bVar, "playWhenReady", z + C6566gU0.h + B0(i));
    }

    @Override // o.J8
    public void d(J8.b bVar, int i, int i2) {
        K0(bVar, "surfaceSize", i + C6566gU0.h + i2);
    }

    @Override // o.J8
    public void e(J8.b bVar, AD1 ad1) {
        N0(bVar, "playerFailed", ad1);
    }

    @Override // o.J8
    public void g(J8.b bVar, C4224Si1 c4224Si1) {
        I0("metadata [" + V(bVar));
        P0(c4224Si1, TD0.a.Y0);
        I0(C6566gU0.g);
    }

    @Override // o.J8
    public void h(J8.b bVar, int i) {
        K0(bVar, "playbackSuppressionReason", C0(i));
    }

    @Override // o.J8
    public void h0(J8.b bVar) {
        J0(bVar, "drmKeysRemoved");
    }

    @Override // o.J8
    public void k(J8.b bVar, String str) {
        K0(bVar, "videoDecoderReleased", str);
    }

    @Override // o.J8
    public void l(J8.b bVar, C9546sg c9546sg) {
        K0(bVar, "audioAttributes", c9546sg.X + "," + c9546sg.Y + "," + c9546sg.Z + "," + c9546sg.Y0);
    }

    @Override // o.J8
    public void m0(J8.b bVar, float f) {
        K0(bVar, "volume", Float.toString(f));
    }

    @Override // o.J8
    public void n0(J8.b bVar, DD1 dd1) {
        K0(bVar, "playbackParameters", dd1.toString());
    }

    @Override // o.J8
    public void o(J8.b bVar, int i) {
        K0(bVar, "audioSessionId", Integer.toString(i));
    }

    @Override // o.J8
    public void p(J8.b bVar, int i) {
        K0(bVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // o.J8
    public void p0(J8.b bVar, int i, long j, long j2) {
        M0(bVar, "audioTrackUnderrun", i + C6566gU0.h + j + C6566gU0.h + j2, null);
    }

    @Override // o.J8
    public void q(J8.b bVar, String str) {
        K0(bVar, "audioDecoderReleased", str);
    }

    @Override // o.J8
    public void q0(J8.b bVar, C8775pW c8775pW) {
        J0(bVar, "audioDisabled");
    }

    public final String r(J8.b bVar, String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Throwable th) {
        String g;
        String str3 = str + " [" + V(bVar);
        if (th instanceof AD1) {
            str3 = str3 + ", errorCode=" + ((AD1) th).f();
        }
        if (str2 != null) {
            str3 = str3 + C6566gU0.h + str2;
        }
        if (!TextUtils.isEmpty(I31.g(th))) {
            str3 = str3 + "\n  " + g.replace("\n", "\n  ") + '\n';
        }
        return str3 + C6566gU0.g;
    }

    @Override // o.J8
    public void r0(J8.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
        O0(bVar, "loadError", iOException);
    }

    @Override // o.J8
    public void s(J8.b bVar, C8775pW c8775pW) {
        J0(bVar, "audioEnabled");
    }

    @Override // o.J8
    public void s0(J8.b bVar, C8775pW c8775pW) {
        J0(bVar, "videoEnabled");
    }

    @Override // o.J8
    public void t(J8.b bVar, C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
        K0(bVar, "audioInputFormat", C10833xx0.k(c10833xx0));
    }

    @Override // o.J8
    public void t0(J8.b bVar, int i) {
        int n = bVar.b.n();
        int w = bVar.b.w();
        I0("timeline [" + V(bVar) + ", periodCount=" + n + ", windowCount=" + w + ", reason=" + G0(i));
        for (int i2 = 0; i2 < Math.min(n, 3); i2++) {
            bVar.b.k(i2, this.m0);
            I0("  period [" + F0(this.m0.o()) + C6566gU0.g);
        }
        if (n > 3) {
            I0("  ...");
        }
        for (int i3 = 0; i3 < Math.min(w, 3); i3++) {
            bVar.b.u(i3, this.l0);
            I0("  window [" + F0(this.l0.g()) + ", seekable=" + this.l0.c1 + ", dynamic=" + this.l0.d1 + C6566gU0.g);
        }
        if (w > 3) {
            I0("  ...");
        }
        I0(C6566gU0.g);
    }

    @Override // o.J8
    public void u(J8.b bVar, boolean z) {
        K0(bVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // o.J8
    public void u0(J8.b bVar, C3773Nr2 c3773Nr2) {
        C4224Si1 c4224Si1;
        I0("tracks [" + V(bVar));
        AbstractC5317bO0<C3773Nr2.a> c = c3773Nr2.c();
        for (int i = 0; i < c.size(); i++) {
            C3773Nr2.a aVar = c.get(i);
            I0("  group [");
            for (int i2 = 0; i2 < aVar.X; i2++) {
                I0("    " + H0(aVar.l(i2)) + " Track:" + i2 + C6566gU0.h + C10833xx0.k(aVar.d(i2)) + ", supported=" + TD2.n0(aVar.f(i2)));
            }
            I0("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < c.size(); i3++) {
            C3773Nr2.a aVar2 = c.get(i3);
            for (int i4 = 0; !z && i4 < aVar2.X; i4++) {
                if (aVar2.l(i4) && (c4224Si1 = aVar2.d(i4).e1) != null && c4224Si1.e() > 0) {
                    I0("  Metadata [");
                    P0(c4224Si1, "    ");
                    I0("  ]");
                    z = true;
                }
            }
        }
        I0(C6566gU0.g);
    }

    @Override // o.J8
    public void v(J8.b bVar, int i) {
        K0(bVar, "state", E0(i));
    }

    @Override // o.J8
    public void w(J8.b bVar, C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
        K0(bVar, "videoInputFormat", C10833xx0.k(c10833xx0));
    }

    @Override // o.J8
    public void w0(J8.b bVar, PG2 pg2) {
        K0(bVar, "videoSize", pg2.X + C6566gU0.h + pg2.Y);
    }

    @Override // o.J8
    public void x(J8.b bVar, Exception exc) {
        O0(bVar, "drmSessionManagerError", exc);
    }

    @Override // o.J8
    public void x0(J8.b bVar, boolean z) {
        K0(bVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // o.J8
    public void y(J8.b bVar, int i) {
        K0(bVar, "repeatMode", D0(i));
    }

    @Override // o.J8
    public void z(J8.b bVar, C10519wf1 c10519wf1) {
        K0(bVar, "upstreamDiscarded", C10833xx0.k(c10519wf1.c));
    }

    public C3229Ie0(String str) {
        this.k0 = str;
        this.l0 = new AbstractC7373jp2.d();
        this.m0 = new AbstractC7373jp2.b();
        this.n0 = SystemClock.elapsedRealtime();
    }

    @Deprecated
    public C3229Ie0(@InterfaceC11300zs1 AbstractC7692l81 abstractC7692l81) {
        this(o0);
    }

    @Deprecated
    public C3229Ie0(@InterfaceC11300zs1 AbstractC7692l81 abstractC7692l81, String str) {
        this(str);
    }

    @Override // o.J8
    public void G(J8.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    @Override // o.J8
    public void c0(J8.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    @Override // o.J8
    public void v0(J8.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    @Override // o.J8
    public void z0(J8.b bVar, int i, long j, long j2) {
    }
}
