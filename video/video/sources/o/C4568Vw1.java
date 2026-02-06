package o;

import android.annotation.SuppressLint;
import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10833xx0;
import o.C6960i70;
import o.InterfaceC10568wr2;
import o.KZ1;

@ES1(30)
@SuppressLint({"Override"})
@Deprecated
/* renamed from: o.Vw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4568Vw1 implements MediaParser$OutputConsumer {
    public static final String A = "chunk-index-long-us-times";
    public static final Pattern B;
    public static final String u = "OConsumerAdapterV30";
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> v;
    public static final String w = "track-type-string";
    public static final String x = "chunk-index-int-sizes";
    public static final String y = "chunk-index-long-offsets";
    public static final String z = "chunk-index-long-us-durations";
    public final ArrayList<InterfaceC10568wr2> a;
    public final ArrayList<C10833xx0> b;
    public final ArrayList<MediaCodec.CryptoInfo> c;
    public final ArrayList<InterfaceC10568wr2.a> d;
    public final b e;
    public final boolean f;
    public final int g;
    @InterfaceC11300zs1
    public final C10833xx0 h;
    public InterfaceC4518Vj0 i;
    @InterfaceC11300zs1
    public MediaParser.SeekMap j;
    @InterfaceC11300zs1
    public MediaParser.SeekMap k;
    @InterfaceC11300zs1
    public String l;
    @InterfaceC11300zs1
    public C6979iC m;
    @InterfaceC11300zs1
    public C10071up2 n;

    /* renamed from: o  reason: collision with root package name */
    public List<C10833xx0> f650o;
    public int p;
    public long q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* renamed from: o.Vw1$b */
    /* loaded from: classes2.dex */
    public static final class b implements CU {
        @InterfaceC11300zs1
        public MediaParser$InputReader b;

        public b() {
        }

        @Override // o.CU
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            read = C4665Ww1.a(TD2.o(this.b)).read(bArr, i, i2);
            return read;
        }
    }

    /* renamed from: o.Vw1$c */
    /* loaded from: classes2.dex */
    public static final class c implements KZ1 {
        public final MediaParser.SeekMap d;

        public c(MediaParser.SeekMap seekMap) {
            this.d = seekMap;
        }

        public static MZ1 a(MediaParser.SeekPoint seekPoint) {
            long j;
            long j2;
            j = seekPoint.timeMicros;
            j2 = seekPoint.position;
            return new MZ1(j, j2);
        }

        @Override // o.KZ1
        public KZ1.a e(long j) {
            Pair seekPoints;
            seekPoints = this.d.getSeekPoints(j);
            Object obj = seekPoints.first;
            if (obj == seekPoints.second) {
                return new KZ1.a(a(C3042Gg1.a(obj)));
            }
            return new KZ1.a(a(C3042Gg1.a(obj)), a(C3042Gg1.a(seekPoints.second)));
        }

        @Override // o.KZ1
        public boolean h() {
            boolean isSeekable;
            isSeekable = this.d.isSeekable();
            return isSeekable;
        }

        @Override // o.KZ1
        public long i() {
            long durationMicros;
            durationMicros = this.d.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return C10323vs.b;
        }
    }

    static {
        MediaParser.SeekPoint seekPoint;
        MediaParser.SeekPoint seekPoint2;
        seekPoint = MediaParser.SeekPoint.START;
        seekPoint2 = MediaParser.SeekPoint.START;
        v = Pair.create(seekPoint, seekPoint2);
        B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public C4568Vw1() {
        this(null, -2, false);
    }

    public static int e(MediaFormat mediaFormat, String str, int i) {
        int integer;
        integer = mediaFormat.getInteger(str, 0);
        if (integer == 0) {
            return 0;
        }
        return i;
    }

    public static List<byte[]> f(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            int i2 = i + 1;
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(C7818lf1.c(byteBuffer));
            i = i2;
        }
    }

    public static String g(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    c2 = 2;
                    break;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    c2 = 3;
                    break;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    c2 = 4;
                    break;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    c2 = 5;
                    break;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    c2 = 6;
                    break;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    c2 = 7;
                    break;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    c2 = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                return C4128Rj1.f;
            case 1:
                return C4128Rj1.h0;
            case 2:
                return C4128Rj1.f601o;
            case 3:
                return "audio/mp4a-latm";
            case 4:
                return C4128Rj1.N;
            case 5:
                return C4128Rj1.r;
            case 7:
                return C4128Rj1.Q;
            case '\b':
                return C4128Rj1.b0;
            case '\t':
                return C4128Rj1.e0;
            case '\n':
                return "video/webm";
            case 11:
                return C4128Rj1.T;
            case '\f':
                return C4128Rj1.I;
            case '\r':
                return C4128Rj1.v;
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    public static int j(MediaFormat mediaFormat) {
        return e(mediaFormat, "is-forced-subtitle", 2) | e(mediaFormat, "is-autoselect", 4) | e(mediaFormat, "is-default", 1);
    }

    @InterfaceC11300zs1
    public static C6960i70 s(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 DrmInitData drmInitData) {
        int schemeInitDataCount;
        DrmInitData.SchemeInitData schemeInitDataAt;
        UUID uuid;
        if (drmInitData != null) {
            schemeInitDataCount = drmInitData.getSchemeInitDataCount();
            C6960i70.b[] bVarArr = new C6960i70.b[schemeInitDataCount];
            for (int i = 0; i < schemeInitDataCount; i++) {
                schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
                uuid = schemeInitDataAt.uuid;
                bVarArr[i] = new C6960i70.b(uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
            }
            return new C6960i70(str, bVarArr);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int u(@InterfaceC11300zs1 String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -450004177:
                if (str.equals("metadata")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 112202875:
                if (str.equals("video")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 5;
            case 1:
                return -1;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return C4128Rj1.l(str);
        }
    }

    public void a() {
        this.t = true;
    }

    public final void b(int i) {
        for (int size = this.a.size(); size <= i; size++) {
            this.a.add(null);
            this.b.add(null);
            this.c.add(null);
            this.d.add(null);
        }
    }

    @InterfaceC11300zs1
    public C6979iC c() {
        return this.m;
    }

    @InterfaceC11300zs1
    public MediaParser.SeekMap d() {
        return this.j;
    }

    @InterfaceC11300zs1
    public C10833xx0[] h() {
        if (!this.r) {
            return null;
        }
        C10833xx0[] c10833xx0Arr = new C10833xx0[this.b.size()];
        for (int i = 0; i < this.b.size(); i++) {
            c10833xx0Arr[i] = (C10833xx0) C9542sf.g(this.b.get(i));
        }
        return c10833xx0Arr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> i(long j) {
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints;
        MediaParser.SeekMap seekMap = this.k;
        if (seekMap != null) {
            seekPoints = seekMap.getSeekPoints(j);
            return seekPoints;
        }
        return v;
    }

    public final void k() {
        if (this.r && !this.s) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (this.a.get(i) == null) {
                    return;
                }
            }
            this.i.n();
            this.s = true;
        }
    }

    public final boolean l(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(x);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer asLongBuffer = ((ByteBuffer) C9542sf.g(mediaFormat.getByteBuffer(y))).asLongBuffer();
        LongBuffer asLongBuffer2 = ((ByteBuffer) C9542sf.g(mediaFormat.getByteBuffer(z))).asLongBuffer();
        LongBuffer asLongBuffer3 = ((ByteBuffer) C9542sf.g(mediaFormat.getByteBuffer(A))).asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        C6979iC c6979iC = new C6979iC(iArr, jArr, jArr2, jArr3);
        this.m = c6979iC;
        this.i.p(c6979iC);
        return true;
    }

    public void m(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.i = interfaceC4518Vj0;
    }

    public void n(List<C10833xx0> list) {
        this.f650o = list;
    }

    public void o(long j) {
        this.q = j;
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, @InterfaceC11300zs1 MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.q;
        if (j2 != C10323vs.b && j >= j2) {
            return;
        }
        C10071up2 c10071up2 = this.n;
        if (c10071up2 != null) {
            j = c10071up2.a(j);
        }
        ((InterfaceC10568wr2) C9542sf.g(this.a.get(i))).b(j, i2, i3, i4, r(i, cryptoInfo));
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        long length;
        b(i);
        this.e.b = mediaParser$InputReader;
        InterfaceC10568wr2 interfaceC10568wr2 = this.a.get(i);
        if (interfaceC10568wr2 == null) {
            interfaceC10568wr2 = this.i.b(i, -1);
            this.a.set(i, interfaceC10568wr2);
        }
        b bVar = this.e;
        length = mediaParser$InputReader.getLength();
        interfaceC10568wr2.c(bVar, (int) length, true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        long durationMicros;
        KZ1 cVar;
        if (this.f && this.j == null) {
            this.j = seekMap;
            return;
        }
        this.k = seekMap;
        durationMicros = seekMap.getDurationMicros();
        InterfaceC4518Vj0 interfaceC4518Vj0 = this.i;
        if (this.t) {
            if (durationMicros == -2147483648L) {
                durationMicros = C10323vs.b;
            }
            cVar = new KZ1.b(durationMicros);
        } else {
            cVar = new c(seekMap);
        }
        interfaceC4518Vj0.p(cVar);
    }

    public void onTrackCountFound(int i) {
        this.r = true;
        k();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        C10833xx0 c10833xx0;
        MediaFormat mediaFormat2;
        MediaFormat mediaFormat3;
        String string;
        mediaFormat = trackData.mediaFormat;
        if (!l(mediaFormat)) {
            b(i);
            InterfaceC10568wr2 interfaceC10568wr2 = this.a.get(i);
            if (interfaceC10568wr2 == null) {
                mediaFormat2 = trackData.mediaFormat;
                String string2 = mediaFormat2.getString(w);
                if (string2 == null) {
                    mediaFormat3 = trackData.mediaFormat;
                    string = mediaFormat3.getString("mime");
                } else {
                    string = string2;
                }
                int u2 = u(string);
                if (u2 == this.g) {
                    this.p = i;
                }
                InterfaceC10568wr2 b2 = this.i.b(i, u2);
                this.a.set(i, b2);
                if (string2 != null) {
                    return;
                }
                interfaceC10568wr2 = b2;
            }
            C10833xx0 t = t(trackData);
            C10833xx0 c10833xx02 = this.h;
            if (c10833xx02 != null && i == this.p) {
                c10833xx0 = t.l(c10833xx02);
            } else {
                c10833xx0 = t;
            }
            interfaceC10568wr2.a(c10833xx0);
            this.b.set(i, t);
            k();
        }
    }

    public void p(String str) {
        this.l = g(str);
    }

    public void q(C10071up2 c10071up2) {
        this.n = c10071up2;
    }

    @InterfaceC11300zs1
    public final InterfaceC10568wr2.a r(int i, @InterfaceC11300zs1 MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.c.get(i) == cryptoInfo) {
            return (InterfaceC10568wr2.a) C9542sf.g(this.d.get(i));
        }
        try {
            Matcher matcher = B.matcher(cryptoInfo.toString());
            matcher.find();
            i2 = Integer.parseInt((String) TD2.o(matcher.group(1)));
            i3 = Integer.parseInt((String) TD2.o(matcher.group(2)));
        } catch (RuntimeException e) {
            I31.e(u, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        InterfaceC10568wr2.a aVar = new InterfaceC10568wr2.a(cryptoInfo.mode, cryptoInfo.key, i2, i3);
        this.c.set(i, cryptoInfo);
        this.d.set(i, aVar);
        return aVar;
    }

    public final C10833xx0 t(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        int integer;
        DrmInitData drmInitData;
        int integer2;
        int integer3;
        float f;
        int integer4;
        int integer5;
        int integer6;
        int integer7;
        int integer8;
        int integer9;
        int integer10;
        int integer11;
        float f2;
        long j;
        mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        integer = mediaFormat.getInteger("caption-service-number", -1);
        C10833xx0.b bVar = new C10833xx0.b();
        String string2 = mediaFormat.getString("crypto-mode-fourcc");
        drmInitData = trackData.drmInitData;
        C10833xx0.b M = bVar.O(s(string2, drmInitData)).M(this.l);
        integer2 = mediaFormat.getInteger("bitrate", -1);
        C10833xx0.b b0 = M.b0(integer2);
        integer3 = mediaFormat.getInteger("channel-count", -1);
        C10833xx0.b K = b0.J(integer3).L(C7818lf1.d(mediaFormat)).g0(string).K(mediaFormat.getString("codecs-string"));
        f = mediaFormat.getFloat("frame-rate", -1.0f);
        C10833xx0.b R = K.R(f);
        integer4 = mediaFormat.getInteger("width", -1);
        C10833xx0.b n0 = R.n0(integer4);
        integer5 = mediaFormat.getInteger("height", -1);
        C10833xx0.b X = n0.S(integer5).V(f(mediaFormat)).X(mediaFormat.getString("language"));
        integer6 = mediaFormat.getInteger("max-input-size", -1);
        C10833xx0.b Y = X.Y(integer6);
        integer7 = mediaFormat.getInteger("exo-pcm-encoding", -1);
        C10833xx0.b a0 = Y.a0(integer7);
        int i = 0;
        integer8 = mediaFormat.getInteger("rotation-degrees", 0);
        C10833xx0.b f0 = a0.f0(integer8);
        integer9 = mediaFormat.getInteger("sample-rate", -1);
        C10833xx0.b i0 = f0.h0(integer9).i0(j(mediaFormat));
        integer10 = mediaFormat.getInteger("encoder-delay", 0);
        C10833xx0.b P = i0.P(integer10);
        integer11 = mediaFormat.getInteger("encoder-padding", 0);
        C10833xx0.b Q = P.Q(integer11);
        f2 = mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
        C10833xx0.b c0 = Q.c0(f2);
        j = mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE);
        C10833xx0.b H = c0.k0(j).H(integer);
        while (true) {
            if (i >= this.f650o.size()) {
                break;
            }
            C10833xx0 c10833xx0 = this.f650o.get(i);
            if (TD2.g(c10833xx0.g1, string) && c10833xx0.y1 == integer) {
                H.X(c10833xx0.Z).e0(c10833xx0.Z0).i0(c10833xx0.Y0).W(c10833xx0.Y).Z(c10833xx0.e1);
                break;
            }
            i++;
        }
        return H.G();
    }

    public C4568Vw1(@InterfaceC11300zs1 C10833xx0 c10833xx0, int i, boolean z2) {
        this.f = z2;
        this.h = c10833xx0;
        this.g = i;
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new b();
        this.i = new V70();
        this.q = C10323vs.b;
        this.f650o = AbstractC5317bO0.L();
    }
}
