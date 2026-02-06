package com.google.android.gms.internal.ads;

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
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AD1;
import o.C10034ug1;
import o.C10323vs;
import o.C8326ng1;
import o.C8813pg1;
import o.C9056qg1;
import o.C9305rg1;
import o.C9548sg1;
import o.C9791tg1;
import o.ES1;
import o.HS1;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;
import o.J8;

@ES1(31)
/* loaded from: classes2.dex */
public final class zzoy implements zzmm, zzoz {
    public final Context X;
    public final PlaybackSession Y0;
    public final zzpa Z;
    @InterfaceC11300zs1
    public String e1;
    @InterfaceC11300zs1
    public PlaybackMetrics.Builder f1;
    public int g1;
    @InterfaceC11300zs1
    public zzba j1;
    @InterfaceC11300zs1
    public zzox k1;
    @InterfaceC11300zs1
    public zzox l1;
    @InterfaceC11300zs1
    public zzox m1;
    @InterfaceC11300zs1
    public zzz n1;
    @InterfaceC11300zs1
    public zzz o1;
    @InterfaceC11300zs1
    public zzz p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public int t1;
    public int u1;
    public boolean v1;
    public final Executor Y = zzdd.a();
    public final zzbk a1 = new zzbk();
    public final zzbj b1 = new zzbj();
    public final HashMap d1 = new HashMap();
    public final HashMap c1 = new HashMap();
    public final long Z0 = SystemClock.elapsedRealtime();
    public int h1 = 0;
    public int i1 = 0;

    public zzoy(Context context, PlaybackSession playbackSession) {
        this.X = context.getApplicationContext();
        this.Y0 = playbackSession;
        zzor zzorVar = new zzor(zzor.h);
        this.Z = zzorVar;
        zzorVar.f(this);
    }

    @SuppressLint({"SwitchIntDef"})
    public static int A(int i) {
        switch (zzeu.G(i)) {
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

    private final void B() {
        long longValue;
        long longValue2;
        int i;
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f1;
        if (builder != null && this.v1) {
            builder.setAudioUnderrunCount(this.u1);
            this.f1.setVideoFramesDropped(this.s1);
            this.f1.setVideoFramesPlayed(this.t1);
            Long l = (Long) this.c1.get(this.e1);
            PlaybackMetrics.Builder builder2 = this.f1;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.d1.get(this.e1);
            PlaybackMetrics.Builder builder3 = this.f1;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f1;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            build = this.f1.build();
            this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    zzoy.this.Y0.reportPlaybackMetrics(build);
                }
            });
        }
        this.f1 = null;
        this.e1 = null;
        this.u1 = 0;
        this.s1 = 0;
        this.t1 = 0;
        this.n1 = null;
        this.o1 = null;
        this.p1 = null;
        this.v1 = false;
    }

    @InterfaceC11300zs1
    public static zzoy u(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a = C8326ng1.a(context.getSystemService("media_metrics"));
        if (a != null) {
            createPlaybackSession = a.createPlaybackSession();
            return new zzoy(context, createPlaybackSession);
        }
        return null;
    }

    public final void C(long j, @InterfaceC11300zs1 zzz zzzVar, int i) {
        int i2;
        if (Objects.equals(this.o1, zzzVar)) {
            return;
        }
        if (this.o1 == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        this.o1 = zzzVar;
        j(0, j, zzzVar, i3);
    }

    public final void D(long j, @InterfaceC11300zs1 zzz zzzVar, int i) {
        int i2;
        if (Objects.equals(this.p1, zzzVar)) {
            return;
        }
        if (this.p1 == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        this.p1 = zzzVar;
        j(2, j, zzzVar, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void a(zzmk zzmkVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzvb zzvbVar = zzmkVar.d;
        if (zzvbVar != null && zzvbVar.b()) {
            return;
        }
        B();
        this.e1 = str;
        playerName = C10034ug1.a().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.6.1");
        this.f1 = playerVersion;
        h(zzmkVar.b, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void b(zzmk zzmkVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void c(zzmk zzmkVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void d(zzmk zzmkVar, zzz zzzVar, zzib zzibVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void e(zzmk zzmkVar, zzcd zzcdVar) {
        zzox zzoxVar = this.k1;
        if (zzoxVar != null) {
            zzz zzzVar = zzoxVar.a;
            if (zzzVar.w == -1) {
                zzx b = zzzVar.b();
                b.J(zzcdVar.a);
                b.m(zzcdVar.b);
                this.k1 = new zzox(b.K(), 0, zzoxVar.c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void f(zzmk zzmkVar, String str, boolean z) {
        zzvb zzvbVar = zzmkVar.d;
        if ((zzvbVar == null || !zzvbVar.b()) && str.equals(this.e1)) {
            B();
        }
        this.c1.remove(str);
        this.d1.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void g(zzmk zzmkVar, zzz zzzVar, zzib zzibVar) {
    }

    @HS1({"metricsBuilder"})
    public final void h(zzbl zzblVar, @InterfaceC11300zs1 zzvb zzvbVar) {
        int a;
        PlaybackMetrics.Builder builder = this.f1;
        if (zzvbVar != null && (a = zzblVar.a(zzvbVar.a)) != -1) {
            zzbj zzbjVar = this.b1;
            int i = 0;
            zzblVar.d(a, zzbjVar, false);
            zzbk zzbkVar = this.a1;
            zzblVar.e(zzbjVar.c, zzbkVar, 0L);
            zzak zzakVar = zzbkVar.c.b;
            int i2 = 2;
            if (zzakVar != null) {
                int J = zzeu.J(zzakVar.a);
                if (J != 0) {
                    if (J != 1) {
                        if (J != 2) {
                            i = 1;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 5;
                    }
                } else {
                    i = 3;
                }
            }
            builder.setStreamType(i);
            long j = zzbkVar.l;
            if (j != C10323vs.b && !zzbkVar.j && !zzbkVar.h && !zzbkVar.b()) {
                builder.setMediaDurationMillis(zzeu.Q(j));
            }
            if (true != zzbkVar.b()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.v1 = true;
        }
    }

    public final void i(long j, @InterfaceC11300zs1 zzz zzzVar, int i) {
        int i2;
        if (Objects.equals(this.n1, zzzVar)) {
            return;
        }
        if (this.n1 == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        this.n1 = zzzVar;
        j(1, j, zzzVar, i3);
    }

    public final void j(int i, long j, @InterfaceC11300zs1 zzz zzzVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        int i3;
        String str;
        timeSinceCreatedMillis = C9548sg1.a(i).setTimeSinceCreatedMillis(j - this.Z0);
        if (zzzVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = zzzVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzzVar.f301o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzzVar.k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = zzzVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzzVar.v;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzzVar.w;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzzVar.E;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzzVar.F;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = zzzVar.d;
            if (str5 != null) {
                String str6 = zzeu.a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzzVar.x;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.v1 = true;
        build = timeSinceCreatedMillis.build();
        this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
            @Override // java.lang.Runnable
            public final void run() {
                zzoy.this.Y0.reportTrackChangeEvent(build);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void k(zzmk zzmkVar, zzux zzuxVar) {
        zzvb zzvbVar = zzmkVar.d;
        if (zzvbVar != null) {
            zzz zzzVar = zzuxVar.b;
            zzzVar.getClass();
            zzox zzoxVar = new zzox(zzzVar, 0, this.Z.g(zzmkVar.b, zzvbVar));
            int i = zzuxVar.a;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        this.m1 = zzoxVar;
                        return;
                    }
                } else {
                    this.l1 = zzoxVar;
                    return;
                }
            }
            this.k1 = zzoxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void l(zzmk zzmkVar, zzbf zzbfVar, zzbf zzbfVar2, int i) {
        if (i == 1) {
            this.q1 = true;
            i = 1;
        }
        this.g1 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void m(zzmk zzmkVar, zzia zziaVar) {
        this.s1 += zziaVar.g;
        this.t1 += zziaVar.e;
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void n(zzmk zzmkVar, zzba zzbaVar) {
        this.j1 = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void o(zzmk zzmkVar, int i, long j, long j2) {
        long longValue;
        zzvb zzvbVar = zzmkVar.d;
        if (zzvbVar != null) {
            String g = this.Z.g(zzmkVar.b, zzvbVar);
            HashMap hashMap = this.d1;
            Long l = (Long) hashMap.get(g);
            HashMap hashMap2 = this.c1;
            Long l2 = (Long) hashMap2.get(g);
            long j3 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap.put(g, Long.valueOf(longValue + j));
            if (l2 != null) {
                j3 = l2.longValue();
            }
            hashMap2.put(g, Long.valueOf(j3 + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void p(zzmk zzmkVar, zzus zzusVar, zzux zzuxVar, IOException iOException, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01eb, code lost:
        if (r12 != 1) goto L144;
     */
    @Override // com.google.android.gms.internal.ads.zzmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(zzbh zzbhVar, zzml zzmlVar) {
        int i;
        int i2;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        final NetworkEvent build2;
        boolean z;
        int i3;
        int i4;
        int errorCode;
        int H;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build3;
        zzs zzsVar;
        int i5;
        int i6;
        if (zzmlVar.b() != 0) {
            for (int i7 = 0; i7 < zzmlVar.b(); i7++) {
                int a = zzmlVar.a(i7);
                zzmk c = zzmlVar.c(a);
                if (a == 0) {
                    this.Z.c(c);
                } else if (a == 11) {
                    this.Z.a(c, this.g1);
                } else {
                    this.Z.b(c);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (zzmlVar.d(0)) {
                zzmk c2 = zzmlVar.c(0);
                if (this.f1 != null) {
                    h(c2.b, c2.d);
                }
            }
            if (zzmlVar.d(2) && this.f1 != null) {
                zzfyc a2 = zzbhVar.o().a();
                int size = a2.size();
                int i8 = 0;
                loop1: while (true) {
                    if (i8 < size) {
                        zzbs zzbsVar = (zzbs) a2.get(i8);
                        int i9 = 0;
                        while (true) {
                            i6 = i8 + 1;
                            if (i9 < zzbsVar.a) {
                                if (zzbsVar.d(i9) && (zzsVar = zzbsVar.b(i9).s) != null) {
                                    break loop1;
                                }
                                i9++;
                            }
                        }
                    } else {
                        zzsVar = null;
                        break;
                    }
                    i8 = i6;
                }
                if (zzsVar != null) {
                    PlaybackMetrics.Builder builder = this.f1;
                    String str = zzeu.a;
                    PlaybackMetrics.Builder a3 = C9305rg1.a(builder);
                    int i10 = 0;
                    while (true) {
                        if (i10 < zzsVar.Y0) {
                            UUID uuid = zzsVar.a(i10).Y;
                            if (uuid.equals(zzh.d)) {
                                i5 = 3;
                                break;
                            } else if (uuid.equals(zzh.e)) {
                                i5 = 2;
                                break;
                            } else if (uuid.equals(zzh.c)) {
                                i5 = 6;
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            i5 = 1;
                            break;
                        }
                    }
                    a3.setDrmType(i5);
                }
            }
            if (zzmlVar.d(1011)) {
                this.u1++;
            }
            zzba zzbaVar = this.j1;
            if (zzbaVar != null) {
                Context context = this.X;
                int i11 = zzbaVar.X;
                if (i11 == 1001) {
                    i4 = 20;
                } else {
                    zzik zzikVar = (zzik) zzbaVar;
                    if (zzikVar.Z == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i12 = zzikVar.b1;
                    Throwable cause = zzbaVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof zzgz) {
                            H = ((zzgz) cause).Z;
                            i4 = 5;
                        } else if ((cause instanceof zzgy) || (cause instanceof zzaz)) {
                            H = 0;
                            i4 = 11;
                        } else {
                            boolean z2 = cause instanceof zzgx;
                            if (!z2 && !(cause instanceof zzhh)) {
                                if (i11 == 1002) {
                                    i4 = 21;
                                } else if (cause instanceof zzru) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    if (cause2 instanceof MediaDrm.MediaDrmStateException) {
                                        errorCode = zzeu.H(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        i3 = A(errorCode);
                                        int i13 = i3;
                                        H = errorCode;
                                        i4 = i13;
                                    } else if (cause2 instanceof MediaDrmResetException) {
                                        i4 = 27;
                                    } else if (cause2 instanceof NotProvisionedException) {
                                        i4 = 24;
                                    } else if (cause2 instanceof DeniedByServerException) {
                                        i4 = 29;
                                    } else {
                                        if (!(cause2 instanceof zzse)) {
                                            i4 = cause2 instanceof zzrt ? 28 : 30;
                                        }
                                        H = 0;
                                        i4 = 23;
                                    }
                                } else if ((cause instanceof zzgu) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    if ((cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                        i4 = 32;
                                    } else {
                                        H = 0;
                                        i4 = 31;
                                    }
                                } else {
                                    H = 0;
                                    i4 = 9;
                                }
                            } else if (zzei.b(context).a() == 1) {
                                H = 0;
                                i4 = 3;
                            } else {
                                Throwable cause5 = cause.getCause();
                                if (cause5 instanceof UnknownHostException) {
                                    H = 0;
                                    i4 = 6;
                                } else if (cause5 instanceof SocketTimeoutException) {
                                    H = 0;
                                    i4 = 7;
                                } else if (z2 && ((zzgx) cause).Y == 1) {
                                    H = 0;
                                    i4 = 4;
                                } else {
                                    H = 0;
                                    i4 = 8;
                                }
                            }
                        }
                        timeSinceCreatedMillis3 = C9056qg1.a().setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                        subErrorCode = errorCode2.setSubErrorCode(H);
                        exception = subErrorCode.setException(zzbaVar);
                        build3 = exception.build();
                        this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzoy.this.Y0.reportPlaybackErrorEvent(build3);
                            }
                        });
                        this.v1 = true;
                        this.j1 = null;
                    } else {
                        if (z) {
                            i4 = 35;
                            if (i12 != 0) {
                            }
                        }
                        if (z && i12 == 3) {
                            i4 = 15;
                        } else {
                            if (!z || i12 != 2) {
                                if (cause instanceof zztf) {
                                    H = zzeu.H(((zztf) cause).Y0);
                                    i4 = 13;
                                    timeSinceCreatedMillis3 = C9056qg1.a().setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                                    subErrorCode = errorCode2.setSubErrorCode(H);
                                    exception = subErrorCode.setException(zzbaVar);
                                    build3 = exception.build();
                                    this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzoy.this.Y0.reportPlaybackErrorEvent(build3);
                                        }
                                    });
                                    this.v1 = true;
                                    this.j1 = null;
                                } else {
                                    i3 = 14;
                                    if (cause instanceof zztb) {
                                        errorCode = ((zztb) cause).X;
                                    } else if (cause instanceof OutOfMemoryError) {
                                        i4 = 14;
                                    } else if (cause instanceof zzqe) {
                                        errorCode = ((zzqe) cause).X;
                                        i3 = 17;
                                    } else if (cause instanceof zzqh) {
                                        errorCode = ((zzqh) cause).X;
                                        i3 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        i3 = A(errorCode);
                                    } else {
                                        i4 = 22;
                                    }
                                    int i132 = i3;
                                    H = errorCode;
                                    i4 = i132;
                                    timeSinceCreatedMillis3 = C9056qg1.a().setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                                    subErrorCode = errorCode2.setSubErrorCode(H);
                                    exception = subErrorCode.setException(zzbaVar);
                                    build3 = exception.build();
                                    this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzoy.this.Y0.reportPlaybackErrorEvent(build3);
                                        }
                                    });
                                    this.v1 = true;
                                    this.j1 = null;
                                }
                            }
                            H = 0;
                            i4 = 23;
                            timeSinceCreatedMillis3 = C9056qg1.a().setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                            subErrorCode = errorCode2.setSubErrorCode(H);
                            exception = subErrorCode.setException(zzbaVar);
                            build3 = exception.build();
                            this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzoy.this.Y0.reportPlaybackErrorEvent(build3);
                                }
                            });
                            this.v1 = true;
                            this.j1 = null;
                        }
                    }
                }
                H = 0;
                timeSinceCreatedMillis3 = C9056qg1.a().setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                subErrorCode = errorCode2.setSubErrorCode(H);
                exception = subErrorCode.setException(zzbaVar);
                build3 = exception.build();
                this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzoy.this.Y0.reportPlaybackErrorEvent(build3);
                    }
                });
                this.v1 = true;
                this.j1 = null;
            }
            if (zzmlVar.d(2)) {
                zzbt o2 = zzbhVar.o();
                boolean b = o2.b(2);
                boolean b2 = o2.b(1);
                boolean b3 = o2.b(3);
                if (!b && !b2) {
                    if (b3) {
                        b3 = true;
                    }
                }
                if (!b) {
                    i(elapsedRealtime, null, 0);
                }
                if (!b2) {
                    C(elapsedRealtime, null, 0);
                }
                if (!b3) {
                    D(elapsedRealtime, null, 0);
                }
            }
            if (s(this.k1)) {
                zzz zzzVar = this.k1.a;
                if (zzzVar.w != -1) {
                    i(elapsedRealtime, zzzVar, 0);
                    this.k1 = null;
                }
            }
            if (s(this.l1)) {
                C(elapsedRealtime, this.l1.a, 0);
                this.l1 = null;
            }
            if (s(this.m1)) {
                D(elapsedRealtime, this.m1.a, 0);
                this.m1 = null;
            }
            switch (zzei.b(this.X).a()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                case 8:
                default:
                    i = 1;
                    break;
                case 7:
                    i = 3;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 7;
                    break;
            }
            if (i != this.i1) {
                this.i1 = i;
                networkType = C9791tg1.a().setNetworkType(i);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                build2 = timeSinceCreatedMillis2.build();
                this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzoy.this.Y0.reportNetworkEvent(build2);
                    }
                });
            }
            if (zzbhVar.g() != 2) {
                this.q1 = false;
            }
            if (((zzmf) zzbhVar).A() == null) {
                this.r1 = false;
            } else if (zzmlVar.d(10)) {
                this.r1 = true;
            }
            int g = zzbhVar.g();
            if (this.q1) {
                i2 = 5;
            } else if (this.r1) {
                i2 = 13;
            } else {
                i2 = 4;
                if (g == 4) {
                    i2 = 11;
                } else if (g == 2) {
                    int i14 = this.h1;
                    if (i14 == 0 || i14 == 2 || i14 == 12) {
                        i2 = 2;
                    } else if (!zzbhVar.q()) {
                        i2 = 7;
                    } else if (zzbhVar.h() != 0) {
                        i2 = 10;
                    } else {
                        i2 = 6;
                    }
                } else if (g == 3) {
                    if (zzbhVar.q()) {
                        if (zzbhVar.h() != 0) {
                            i2 = 9;
                        } else {
                            i2 = 3;
                        }
                    }
                } else if (g == 1 && this.h1 != 0) {
                    i2 = 12;
                } else {
                    i2 = this.h1;
                }
            }
            if (this.h1 != i2) {
                this.h1 = i2;
                this.v1 = true;
                state = C8813pg1.a().setState(this.h1);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.Z0);
                build = timeSinceCreatedMillis.build();
                this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzoy.this.Y0.reportPlaybackStateEvent(build);
                    }
                });
            }
            if (zzmlVar.d(J8.h0)) {
                this.Z.e(zzmlVar.c(J8.h0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void r(zzmk zzmkVar, int i, long j) {
    }

    @InterfaceC8800pd0(expression = {"#1"}, result = true)
    public final boolean s(@InterfaceC11300zs1 zzox zzoxVar) {
        if (zzoxVar != null) {
            if (zzoxVar.c.equals(this.Z.d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final LogSessionId t() {
        LogSessionId sessionId;
        sessionId = this.Y0.getSessionId();
        return sessionId;
    }
}
