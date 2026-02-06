package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import o.AbstractC3914Pe1;
import o.AbstractC7373jp2;
import o.C3773Nr2;
import o.C4829Yo0;
import o.C5699cy2;
import o.C8322nf1;
import o.ED1;
import o.HD1;
import o.InterfaceC10186vI0;
import o.InterfaceC7201j70;
import o.InterfaceC7583kh1;
import o.InterfaceC9058qh;
import o.J8;
import o.KY;

@ES1(31)
@Deprecated
/* renamed from: o.Ag1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2443Ag1 implements J8, ED1.a {
    @InterfaceC11300zs1
    public b A0;
    @InterfaceC11300zs1
    public C10833xx0 B0;
    @InterfaceC11300zs1
    public C10833xx0 C0;
    @InterfaceC11300zs1
    public C10833xx0 D0;
    public boolean E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public int J0;
    public boolean K0;
    public final Context k0;
    public final ED1 l0;
    public final PlaybackSession m0;
    @InterfaceC11300zs1
    public String s0;
    @InterfaceC11300zs1
    public PlaybackMetrics.Builder t0;
    public int u0;
    @InterfaceC11300zs1
    public AD1 x0;
    @InterfaceC11300zs1
    public b y0;
    @InterfaceC11300zs1
    public b z0;
    public final AbstractC7373jp2.d o0 = new AbstractC7373jp2.d();
    public final AbstractC7373jp2.b p0 = new AbstractC7373jp2.b();
    public final HashMap<String, Long> r0 = new HashMap<>();
    public final HashMap<String, Long> q0 = new HashMap<>();
    public final long n0 = SystemClock.elapsedRealtime();
    public int v0 = 0;
    public int w0 = 0;

    /* renamed from: o.Ag1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: o.Ag1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final C10833xx0 a;
        public final int b;
        public final String c;

        public b(C10833xx0 c10833xx0, int i, String str) {
            this.a = c10833xx0;
            this.b = i;
            this.c = str;
        }
    }

    public C2443Ag1(Context context, PlaybackSession playbackSession) {
        this.k0 = context.getApplicationContext();
        this.m0 = playbackSession;
        C6932i00 c6932i00 = new C6932i00();
        this.l0 = c6932i00;
        c6932i00.c(this);
    }

    @InterfaceC11300zs1
    public static C2443Ag1 C0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a2 = C8326ng1.a(context.getSystemService("media_metrics"));
        if (a2 != null) {
            createPlaybackSession = a2.createPlaybackSession();
            return new C2443Ag1(context, createPlaybackSession);
        }
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int E0(int i) {
        switch (TD2.l0(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case AD1.A1 /* 6004 */:
                return 25;
            case AD1.B1 /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    @InterfaceC11300zs1
    public static C6960i70 F0(AbstractC5317bO0<C3773Nr2.a> abstractC5317bO0) {
        C6960i70 c6960i70;
        AbstractC6237fB2<C3773Nr2.a> it = abstractC5317bO0.iterator();
        while (it.hasNext()) {
            C3773Nr2.a next = it.next();
            for (int i = 0; i < next.X; i++) {
                if (next.l(i) && (c6960i70 = next.d(i).j1) != null) {
                    return c6960i70;
                }
            }
        }
        return null;
    }

    public static int G0(C6960i70 c6960i70) {
        for (int i = 0; i < c6960i70.Y0; i++) {
            UUID uuid = c6960i70.e(i).Y;
            if (uuid.equals(C10323vs.g2)) {
                return 3;
            }
            if (uuid.equals(C10323vs.h2)) {
                return 2;
            }
            if (uuid.equals(C10323vs.f2)) {
                return 6;
            }
        }
        return 1;
    }

    public static a H0(AD1 ad1, Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        if (ad1.X == 1001) {
            return new a(20, 0);
        }
        if (ad1 instanceof C3824Og0) {
            C3824Og0 c3824Og0 = (C3824Og0) ad1;
            if (c3824Og0.P1 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            i = c3824Og0.T1;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) C9542sf.g(ad1.getCause());
        if (th instanceof IOException) {
            if (th instanceof InterfaceC10186vI0.f) {
                return new a(5, ((InterfaceC10186vI0.f) th).c1);
            }
            if (!(th instanceof InterfaceC10186vI0.e) && !(th instanceof C3989Py1)) {
                boolean z3 = th instanceof InterfaceC10186vI0.d;
                if (!z3 && !(th instanceof C5699cy2.a)) {
                    if (ad1.X == 1002) {
                        return new a(21, 0);
                    }
                    if (th instanceof InterfaceC7201j70.a) {
                        Throwable th2 = (Throwable) C9542sf.g(th.getCause());
                        int i3 = TD2.a;
                        if (i3 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                            int m0 = TD2.m0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                            return new a(E0(m0), m0);
                        } else if (i3 >= 23 && (th2 instanceof MediaDrmResetException)) {
                            return new a(27, 0);
                        } else {
                            if (i3 >= 18 && (th2 instanceof NotProvisionedException)) {
                                return new a(24, 0);
                            }
                            if (i3 >= 18 && (th2 instanceof DeniedByServerException)) {
                                return new a(29, 0);
                            }
                            if (th2 instanceof C5513cC2) {
                                return new a(23, 0);
                            }
                            if (th2 instanceof KY.e) {
                                return new a(28, 0);
                            }
                            return new a(30, 0);
                        }
                    } else if ((th instanceof C4829Yo0.c) && (th.getCause() instanceof FileNotFoundException)) {
                        Throwable cause = ((Throwable) C9542sf.g(th.getCause())).getCause();
                        if (TD2.a >= 21 && (cause instanceof ErrnoException) && ((ErrnoException) cause).errno == OsConstants.EACCES) {
                            return new a(32, 0);
                        }
                        return new a(31, 0);
                    } else {
                        return new a(9, 0);
                    }
                } else if (C3958Pp1.d(context).f() == 1) {
                    return new a(3, 0);
                } else {
                    Throwable cause2 = th.getCause();
                    if (cause2 instanceof UnknownHostException) {
                        return new a(6, 0);
                    }
                    if (cause2 instanceof SocketTimeoutException) {
                        return new a(7, 0);
                    }
                    if (z3 && ((InterfaceC10186vI0.d) th).Y0 == 1) {
                        return new a(4, 0);
                    }
                    return new a(8, 0);
                }
            }
            if (z) {
                i2 = 10;
            } else {
                i2 = 11;
            }
            return new a(i2, 0);
        } else if (z2 && (i == 0 || i == 1)) {
            return new a(35, 0);
        } else {
            if (z2 && i == 3) {
                return new a(15, 0);
            }
            if (z2 && i == 2) {
                return new a(23, 0);
            }
            if (th instanceof AbstractC3914Pe1.b) {
                return new a(13, TD2.m0(((AbstractC3914Pe1.b) th).Y0));
            }
            if (th instanceof C3034Ge1) {
                return new a(14, TD2.m0(((C3034Ge1) th).Y));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC9058qh.b) {
                return new a(17, ((InterfaceC9058qh.b) th).X);
            }
            if (th instanceof InterfaceC9058qh.f) {
                return new a(18, ((InterfaceC9058qh.f) th).X);
            }
            if (TD2.a >= 16 && (th instanceof MediaCodec.CryptoException)) {
                int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
                return new a(E0(errorCode), errorCode);
            }
            return new a(22, 0);
        }
    }

    public static Pair<String, String> I0(String str) {
        String str2;
        String[] J1 = TD2.J1(str, "-");
        String str3 = J1[0];
        if (J1.length >= 2) {
            str2 = J1[1];
        } else {
            str2 = null;
        }
        return Pair.create(str3, str2);
    }

    public static int K0(Context context) {
        switch (C3958Pp1.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int L0(C8322nf1 c8322nf1) {
        C8322nf1.h hVar = c8322nf1.Y;
        if (hVar == null) {
            return 0;
        }
        int P0 = TD2.P0(hVar.X, hVar.Y);
        if (P0 != 0) {
            if (P0 != 1) {
                if (P0 != 2) {
                    return 1;
                }
                return 4;
            }
            return 5;
        }
        return 3;
    }

    public static int M0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return 1;
        }
        return 4;
    }

    @Override // o.J8
    public void A(J8.b bVar, C10519wf1 c10519wf1) {
        if (bVar.d != null) {
            b bVar2 = new b((C10833xx0) C9542sf.g(c10519wf1.c), c10519wf1.d, this.l0.b(bVar.b, (InterfaceC7583kh1.b) C9542sf.g(bVar.d)));
            int i = c10519wf1.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        this.A0 = bVar2;
                        return;
                    }
                } else {
                    this.z0 = bVar2;
                    return;
                }
            }
            this.y0 = bVar2;
        }
    }

    @InterfaceC8800pd0(expression = {"#1"}, result = true)
    public final boolean B0(@InterfaceC11300zs1 b bVar) {
        if (bVar != null && bVar.c.equals(this.l0.a())) {
            return true;
        }
        return false;
    }

    @Override // o.J8
    public void D(J8.b bVar, C8775pW c8775pW) {
        this.H0 += c8775pW.g;
        this.I0 += c8775pW.e;
    }

    public final void D0() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.t0;
        if (builder != null && this.K0) {
            builder.setAudioUnderrunCount(this.J0);
            this.t0.setVideoFramesDropped(this.H0);
            this.t0.setVideoFramesPlayed(this.I0);
            Long l = this.q0.get(this.s0);
            PlaybackMetrics.Builder builder2 = this.t0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = this.r0.get(this.s0);
            PlaybackMetrics.Builder builder3 = this.t0;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.t0;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            PlaybackSession playbackSession = this.m0;
            build = this.t0.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.t0 = null;
        this.s0 = null;
        this.J0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.K0 = false;
    }

    public LogSessionId J0() {
        LogSessionId sessionId;
        sessionId = this.m0.getSessionId();
        return sessionId;
    }

    public final void N0(J8.c cVar) {
        for (int i = 0; i < cVar.e(); i++) {
            int c = cVar.c(i);
            J8.b d = cVar.d(c);
            if (c == 0) {
                this.l0.f(d);
            } else if (c == 11) {
                this.l0.d(d, this.u0);
            } else {
                this.l0.g(d);
            }
        }
    }

    public final void O0(long j) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int K0 = K0(this.k0);
        if (K0 != this.w0) {
            this.w0 = K0;
            PlaybackSession playbackSession = this.m0;
            networkType = C9791tg1.a().setNetworkType(K0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j - this.n0);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    @Override // o.J8
    public void P(J8.b bVar, HD1.k kVar, HD1.k kVar2, int i) {
        if (i == 1) {
            this.E0 = true;
        }
        this.u0 = i;
    }

    public final void P0(long j) {
        boolean z;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        AD1 ad1 = this.x0;
        if (ad1 == null) {
            return;
        }
        Context context = this.k0;
        if (this.F0 == 4) {
            z = true;
        } else {
            z = false;
        }
        a H0 = H0(ad1, context, z);
        PlaybackSession playbackSession = this.m0;
        timeSinceCreatedMillis = C9056qg1.a().setTimeSinceCreatedMillis(j - this.n0);
        errorCode = timeSinceCreatedMillis.setErrorCode(H0.a);
        subErrorCode = errorCode.setSubErrorCode(H0.b);
        exception = subErrorCode.setException(ad1);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.K0 = true;
        this.x0 = null;
    }

    public final void Q0(HD1 hd1, J8.c cVar, long j) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (hd1.X() != 2) {
            this.E0 = false;
        }
        if (hd1.c() == null) {
            this.G0 = false;
        } else if (cVar.a(10)) {
            this.G0 = true;
        }
        int Y0 = Y0(hd1);
        if (this.v0 != Y0) {
            this.v0 = Y0;
            this.K0 = true;
            PlaybackSession playbackSession = this.m0;
            state = C8813pg1.a().setState(this.v0);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j - this.n0);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    public final void R0(HD1 hd1, J8.c cVar, long j) {
        if (cVar.a(2)) {
            C3773Nr2 L0 = hd1.L0();
            boolean f = L0.f(2);
            boolean f2 = L0.f(1);
            boolean f3 = L0.f(3);
            if (f || f2 || f3) {
                if (!f) {
                    W0(j, null, 0);
                }
                if (!f2) {
                    S0(j, null, 0);
                }
                if (!f3) {
                    U0(j, null, 0);
                }
            }
        }
        if (B0(this.y0)) {
            b bVar = this.y0;
            C10833xx0 c10833xx0 = bVar.a;
            if (c10833xx0.m1 != -1) {
                W0(j, c10833xx0, bVar.b);
                this.y0 = null;
            }
        }
        if (B0(this.z0)) {
            b bVar2 = this.z0;
            S0(j, bVar2.a, bVar2.b);
            this.z0 = null;
        }
        if (B0(this.A0)) {
            b bVar3 = this.A0;
            U0(j, bVar3.a, bVar3.b);
            this.A0 = null;
        }
    }

    public final void S0(long j, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i) {
        if (TD2.g(this.C0, c10833xx0)) {
            return;
        }
        if (this.C0 == null && i == 0) {
            i = 1;
        }
        this.C0 = c10833xx0;
        X0(0, j, c10833xx0, i);
    }

    public final void T0(HD1 hd1, J8.c cVar) {
        C6960i70 F0;
        if (cVar.a(0)) {
            J8.b d = cVar.d(0);
            if (this.t0 != null) {
                V0(d.b, d.d);
            }
        }
        if (cVar.a(2) && this.t0 != null && (F0 = F0(hd1.L0().c())) != null) {
            C9305rg1.a(TD2.o(this.t0)).setDrmType(G0(F0));
        }
        if (cVar.a(1011)) {
            this.J0++;
        }
    }

    public final void U0(long j, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i) {
        if (TD2.g(this.D0, c10833xx0)) {
            return;
        }
        if (this.D0 == null && i == 0) {
            i = 1;
        }
        this.D0 = c10833xx0;
        X0(2, j, c10833xx0, i);
    }

    @Override // o.ED1.a
    public void V(J8.b bVar, String str, boolean z) {
        InterfaceC7583kh1.b bVar2 = bVar.d;
        if ((bVar2 == null || !bVar2.c()) && str.equals(this.s0)) {
            D0();
        }
        this.q0.remove(str);
        this.r0.remove(str);
    }

    @HS1({"metricsBuilder"})
    public final void V0(AbstractC7373jp2 abstractC7373jp2, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        int g;
        int i;
        PlaybackMetrics.Builder builder = this.t0;
        if (bVar == null || (g = abstractC7373jp2.g(bVar.a)) == -1) {
            return;
        }
        abstractC7373jp2.k(g, this.p0);
        abstractC7373jp2.u(this.p0.Z, this.o0);
        builder.setStreamType(L0(this.o0.Z));
        AbstractC7373jp2.d dVar = this.o0;
        if (dVar.i1 != C10323vs.b && !dVar.g1 && !dVar.d1 && !dVar.k()) {
            builder.setMediaDurationMillis(this.o0.g());
        }
        if (this.o0.k()) {
            i = 2;
        } else {
            i = 1;
        }
        builder.setPlaybackType(i);
        this.K0 = true;
    }

    public final void W0(long j, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i) {
        if (TD2.g(this.B0, c10833xx0)) {
            return;
        }
        if (this.B0 == null && i == 0) {
            i = 1;
        }
        this.B0 = c10833xx0;
        X0(1, j, c10833xx0, i);
    }

    public final void X0(int i, long j, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = C9548sg1.a(i).setTimeSinceCreatedMillis(j - this.n0);
        if (c10833xx0 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(M0(i2));
            String str = c10833xx0.f1;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c10833xx0.g1;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c10833xx0.d1;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c10833xx0.c1;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c10833xx0.l1;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c10833xx0.m1;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c10833xx0.t1;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c10833xx0.u1;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c10833xx0.Z;
            if (str4 != null) {
                Pair<String, String> I0 = I0(str4);
                timeSinceCreatedMillis.setLanguage((String) I0.first);
                Object obj = I0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c10833xx0.n1;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.K0 = true;
        PlaybackSession playbackSession = this.m0;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final int Y0(HD1 hd1) {
        int X = hd1.X();
        if (this.E0) {
            return 5;
        }
        if (this.G0) {
            return 13;
        }
        if (X == 4) {
            return 11;
        }
        if (X == 2) {
            int i = this.v0;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (!hd1.u1()) {
                return 7;
            }
            if (hd1.Z0() != 0) {
                return 10;
            }
            return 6;
        } else if (X == 3) {
            if (!hd1.u1()) {
                return 4;
            }
            if (hd1.Z0() == 0) {
                return 3;
            }
            return 9;
        } else if (X == 1 && this.v0 != 0) {
            return 12;
        } else {
            return this.v0;
        }
    }

    @Override // o.J8
    public void e(J8.b bVar, AD1 ad1) {
        this.x0 = ad1;
    }

    @Override // o.J8
    public void g0(HD1 hd1, J8.c cVar) {
        if (cVar.e() != 0) {
            N0(cVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            T0(hd1, cVar);
            P0(elapsedRealtime);
            R0(hd1, cVar, elapsedRealtime);
            O0(elapsedRealtime);
            Q0(hd1, cVar, elapsedRealtime);
            if (cVar.a(J8.h0)) {
                this.l0.e(cVar.d(J8.h0));
            }
        }
    }

    @Override // o.ED1.a
    public void i0(J8.b bVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC7583kh1.b bVar2 = bVar.d;
        if (bVar2 != null && bVar2.c()) {
            return;
        }
        D0();
        this.s0 = str;
        playerName = C10034ug1.a().setPlayerName(C6361fi0.a);
        playerVersion = playerName.setPlayerVersion(C6361fi0.b);
        this.t0 = playerVersion;
        V0(bVar.b, bVar.d);
    }

    @Override // o.J8
    public void r0(J8.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
        this.F0 = c10519wf1.a;
    }

    @Override // o.J8
    public void w0(J8.b bVar, PG2 pg2) {
        b bVar2 = this.y0;
        if (bVar2 != null) {
            C10833xx0 c10833xx0 = bVar2.a;
            if (c10833xx0.m1 == -1) {
                this.y0 = new b(c10833xx0.b().n0(pg2.X).S(pg2.Y).G(), bVar2.b, bVar2.c);
            }
        }
    }

    @Override // o.J8
    public void z0(J8.b bVar, int i, long j, long j2) {
        long longValue;
        InterfaceC7583kh1.b bVar2 = bVar.d;
        if (bVar2 != null) {
            String b2 = this.l0.b(bVar.b, (InterfaceC7583kh1.b) C9542sf.g(bVar2));
            Long l = this.r0.get(b2);
            Long l2 = this.q0.get(b2);
            HashMap<String, Long> hashMap = this.r0;
            long j3 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap.put(b2, Long.valueOf(longValue + j));
            HashMap<String, Long> hashMap2 = this.q0;
            if (l2 != null) {
                j3 = l2.longValue();
            }
            hashMap2.put(b2, Long.valueOf(j3 + i));
        }
    }

    @Override // o.ED1.a
    public void m(J8.b bVar, String str) {
    }

    @Override // o.ED1.a
    public void r(J8.b bVar, String str, String str2) {
    }
}
