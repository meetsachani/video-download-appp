package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC8148mw2;

/* loaded from: classes2.dex */
public final class zzcba extends zzcbc implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final Map r1;
    public final zzcbw a1;
    public final zzcbx b1;
    public final boolean c1;
    @InterfaceC11300zs1
    public final zzdsd d1;
    public int e1;
    public int f1;
    public MediaPlayer g1;
    public Uri h1;
    public int i1;
    public int j1;
    public int k1;
    public zzcbu l1;
    public final boolean m1;
    public int n1;
    public zzcbb o1;
    public boolean p1;
    public Integer q1;

    static {
        HashMap hashMap = new HashMap();
        r1 = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf((int) InterfaceC8148mw2.h.k), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf((int) InterfaceC8148mw2.h.l), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcba(Context context, zzcbw zzcbwVar, boolean z, boolean z2, zzcbv zzcbvVar, zzcbx zzcbxVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        super(context);
        this.e1 = 0;
        this.f1 = 0;
        this.p1 = false;
        this.q1 = null;
        this.a1 = zzcbwVar;
        this.b1 = zzcbxVar;
        this.m1 = z;
        this.c1 = z2;
        zzcbxVar.a(this);
        this.d1 = zzdsdVar;
    }

    public static /* synthetic */ void K(zzcba zzcbaVar, int i) {
        zzcbb zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            zzcbbVar.onWindowVisibilityChanged(i);
        }
    }

    public static /* bridge */ /* synthetic */ void M(zzcba zzcbaVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && zzcbaVar.a1 != null && mediaPlayer != null) {
            try {
                MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                if (trackInfo != null) {
                    HashMap hashMap = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType != 1) {
                                if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                    if (format.containsKey("mime")) {
                                        hashMap.put("audioMime", format.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                        hashMap.put("audioCodec", format.getString("codecs-string"));
                                    }
                                }
                            } else {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzcbaVar.q1 = valueOf;
                                        hashMap.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        hashMap.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                }
                            }
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        zzcbaVar.a1.q("onMetadataEvent", hashMap);
                    }
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdMediaPlayerView.reportMetadata");
            }
        }
    }

    public final void E() {
        zzdsd zzdsdVar;
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.h1 != null && surfaceTexture != null) {
            F(false);
            try {
                com.google.android.gms.ads.internal.zzv.p();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.g1 = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.g1.setOnCompletionListener(this);
                this.g1.setOnErrorListener(this);
                this.g1.setOnInfoListener(this);
                this.g1.setOnPreparedListener(this);
                this.g1.setOnVideoSizeChangedListener(this);
                this.k1 = 0;
                if (this.m1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xd)).booleanValue() && (zzdsdVar = this.d1) != null) {
                        zzdsc a = zzdsdVar.a();
                        a.b("action", "svp_ampv");
                        a.j();
                    }
                    zzcbu zzcbuVar = new zzcbu(getContext());
                    this.l1 = zzcbuVar;
                    zzcbuVar.d(surfaceTexture, getWidth(), getHeight());
                    zzcbu zzcbuVar2 = this.l1;
                    zzcbuVar2.start();
                    SurfaceTexture b = zzcbuVar2.b();
                    if (b != null) {
                        surfaceTexture = b;
                    } else {
                        this.l1.e();
                        this.l1 = null;
                    }
                }
                this.g1.setDataSource(getContext(), this.h1);
                com.google.android.gms.ads.internal.zzv.q();
                this.g1.setSurface(new Surface(surfaceTexture));
                this.g1.setAudioStreamType(3);
                this.g1.setScreenOnWhilePlaying(true);
                this.g1.prepareAsync();
                G(1);
            } catch (IOException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.h1)), e);
                onError(this.g1, 1, 0);
            } catch (IllegalArgumentException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.h1)), e);
                onError(this.g1, 1, 0);
            } catch (IllegalStateException e3) {
                e = e3;
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.h1)), e);
                onError(this.g1, 1, 0);
            }
        }
    }

    public final void F(boolean z) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView release");
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.e();
            this.l1 = null;
        }
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.g1.release();
            this.g1 = null;
            G(0);
            if (z) {
                this.f1 = 0;
            }
        }
    }

    public final void G(int i) {
        if (i == 3) {
            this.b1.c();
            this.Z0.b();
        } else if (this.e1 == 3) {
            this.b1.e();
            this.Z0.c();
        }
        this.e1 = i;
    }

    public final void H(float f) {
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    public final boolean I() {
        int i;
        return (this.g1 == null || (i = this.e1) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int i() {
        if (I()) {
            return this.g1.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int j() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT >= 26 && I()) {
            metrics = this.g1.getMetrics();
            return metrics.getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int k() {
        if (I()) {
            return this.g1.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int l() {
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final int m() {
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc, com.google.android.gms.internal.ads.zzcbz
    public final void n() {
        H(this.Z0.a());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long o() {
        return 0L;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.k1 = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView completion");
        G(5);
        this.f1 = 5;
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcat(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = r1;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        int i3 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.f1 = -1;
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcau(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = r1;
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.i1, i);
        int defaultSize2 = View.getDefaultSize(this.j1, i2);
        if (this.i1 > 0 && this.j1 > 0 && this.l1 == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.i1;
                    int i5 = i4 * size2;
                    int i6 = this.j1;
                    int i7 = size * i6;
                    if (i5 < i7) {
                        defaultSize = i5 / i6;
                        defaultSize2 = size2;
                    } else {
                        if (i5 > i7) {
                            defaultSize2 = i7 / i4;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i8 = (this.j1 * size) / this.i1;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.i1 * size2) / this.j1;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.i1;
                    int i10 = this.j1;
                    if (mode2 == Integer.MIN_VALUE && i10 > size2) {
                        i3 = (size2 * i9) / i10;
                    } else {
                        i3 = i9;
                        size2 = i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.c(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView prepared");
        G(2);
        this.b1.b();
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcas(this, mediaPlayer));
        this.i1 = mediaPlayer.getVideoWidth();
        this.j1 = mediaPlayer.getVideoHeight();
        int i = this.n1;
        if (i != 0) {
            v(i);
        }
        if (this.c1 && I() && this.g1.getCurrentPosition() > 0 && this.f1 != 3) {
            com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView nudging MediaPlayer");
            H(0.0f);
            this.g1.start();
            int currentPosition = this.g1.getCurrentPosition();
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            while (I() && this.g1.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzv.d().a() - a <= 250) {
            }
            this.g1.pause();
            n();
        }
        int i2 = this.i1;
        int i3 = this.j1;
        com.google.android.gms.ads.internal.util.client.zzo.f("AdMediaPlayerView stream dimensions: " + i2 + " x " + i3);
        if (this.f1 == 3) {
            u();
        }
        n();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView surface created");
        E();
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcav(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null && this.n1 == 0) {
            this.n1 = mediaPlayer.getCurrentPosition();
        }
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.e();
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcax(this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView surface changed");
        int i3 = this.f1;
        boolean z = false;
        if (this.i1 == i && this.j1 == i2) {
            z = true;
        }
        if (this.g1 != null && i3 == 3 && z) {
            int i4 = this.n1;
            if (i4 != 0) {
                v(i4);
            }
            u();
        }
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.c(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcaw(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.b1.f(this);
        this.Y0.a(surfaceTexture, this.o1);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.i1 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.j1 = videoHeight;
        if (this.i1 != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcar
            @Override // java.lang.Runnable
            public final void run() {
                zzcba.K(zzcba.this, i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long p() {
        if (this.q1 != null) {
            return (r() * this.k1) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final long r() {
        if (this.q1 != null) {
            return k() * this.q1.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final String s() {
        return "MediaPlayer".concat(true != this.m1 ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void t() {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView pause");
        if (I() && this.g1.isPlaying()) {
            this.g1.pause();
            G(4);
            com.google.android.gms.ads.internal.util.zzs.l.post(new zzcaz(this));
        }
        this.f1 = 4;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcba.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void u() {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView play");
        if (I()) {
            this.g1.start();
            G(3);
            this.Y0.b();
            com.google.android.gms.ads.internal.util.zzs.l.post(new zzcay(this));
        }
        this.f1 = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void v(int i) {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView seek " + i);
        if (I()) {
            this.g1.seekTo(i);
            this.n1 = 0;
            return;
        }
        this.n1 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void w(zzcbb zzcbbVar) {
        this.o1 = zzcbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void x(@InterfaceC11300zs1 String str) {
        Uri parse = Uri.parse(str);
        zzbbf m0 = zzbbf.m0(parse);
        if (m0 != null && m0.X == null) {
            return;
        }
        if (m0 != null) {
            parse = Uri.parse(m0.X);
        }
        this.h1 = parse;
        this.n1 = 0;
        E();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void y() {
        com.google.android.gms.ads.internal.util.zze.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.g1;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.g1.release();
            this.g1 = null;
            G(0);
            this.f1 = 0;
        }
        this.b1.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void z(float f, float f2) {
        zzcbu zzcbuVar = this.l1;
        if (zzcbuVar != null) {
            zzcbuVar.f(f, f2);
        }
    }
}
