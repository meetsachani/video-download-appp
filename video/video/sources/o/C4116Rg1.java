package o;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$OutputConsumer;
import android.media.MediaParser$SeekableInputReader;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.C10833xx0;

@ES1(30)
@Deprecated
/* renamed from: o.Rg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4116Rg1 implements SH0 {
    public static final PH0 i = new PH0() { // from class: o.Qg1
        @Override // o.PH0
        public final SH0 a(Uri uri, C10833xx0 c10833xx0, List list, C10071up2 c10071up2, Map map, InterfaceC4421Uj0 interfaceC4421Uj0, ND1 nd1) {
            return C4116Rg1.g(uri, c10833xx0, list, c10071up2, map, interfaceC4421Uj0, nd1);
        }
    };
    public final C4568Vw1 a;
    public final C7520kQ0 b = new C7520kQ0();
    public final MediaParser c;
    public final C10833xx0 d;
    public final boolean e;
    public final AbstractC5317bO0<MediaFormat> f;
    public final ND1 g;
    public int h;

    /* renamed from: o.Rg1$b */
    /* loaded from: classes2.dex */
    public static final class b implements MediaParser$SeekableInputReader {
        public final InterfaceC4421Uj0 a;
        public int b;

        public long getLength() {
            return this.a.getLength();
        }

        public long getPosition() {
            return this.a.n();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int r = this.a.r(bArr, i, i2);
            this.b += r;
            return r;
        }

        public void seekToPosition(long j) {
            throw new UnsupportedOperationException();
        }

        public b(InterfaceC4421Uj0 interfaceC4421Uj0) {
            this.a = interfaceC4421Uj0;
        }
    }

    public C4116Rg1(MediaParser mediaParser, C4568Vw1 c4568Vw1, C10833xx0 c10833xx0, boolean z, AbstractC5317bO0<MediaFormat> abstractC5317bO0, int i2, ND1 nd1) {
        this.c = mediaParser;
        this.a = c4568Vw1;
        this.e = z;
        this.f = abstractC5317bO0;
        this.d = c10833xx0;
        this.g = nd1;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SH0 g(Uri uri, C10833xx0 c10833xx0, List list, C10071up2 c10071up2, Map map, InterfaceC4421Uj0 interfaceC4421Uj0, ND1 nd1) {
        boolean z;
        String parserName;
        if (C4940Zp0.a(c10833xx0.g1) == 13) {
            return new C9833tr(new BK2(c10833xx0.Z, c10071up2), c10833xx0, c10071up2);
        }
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                r.g(C4313Tg1.b((C10833xx0) list.get(i2)));
            }
        } else {
            r.g(C4313Tg1.b(new C10833xx0.b().g0(C4128Rj1.x0).G()));
        }
        AbstractC5317bO0 e = r.e();
        C4568Vw1 c4568Vw1 = new C4568Vw1();
        if (list == null) {
            list = AbstractC5317bO0.L();
        }
        c4568Vw1.n(list);
        c4568Vw1.q(c10071up2);
        MediaParser h = h(c4568Vw1, c10833xx0, z, e, nd1, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        b bVar = new b(interfaceC4421Uj0);
        h.advance(bVar);
        parserName = h.getParserName();
        c4568Vw1.p(parserName);
        return new C4116Rg1(h, c4568Vw1, c10833xx0, z, e, bVar.b, nd1);
    }

    @SuppressLint({"WrongConstant"})
    public static MediaParser h(MediaParser$OutputConsumer mediaParser$OutputConsumer, C10833xx0 c10833xx0, boolean z, AbstractC5317bO0<MediaFormat> abstractC5317bO0, ND1 nd1, String... strArr) {
        MediaParser createByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], mediaParser$OutputConsumer) : MediaParser.create(mediaParser$OutputConsumer, strArr);
        createByName.setParameter(C4313Tg1.g, abstractC5317bO0);
        createByName.setParameter(C4313Tg1.f, Boolean.valueOf(z));
        Boolean bool = Boolean.TRUE;
        createByName.setParameter(C4313Tg1.a, bool);
        createByName.setParameter(C4313Tg1.c, bool);
        createByName.setParameter(C4313Tg1.h, bool);
        createByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        createByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = c10833xx0.d1;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(C4128Rj1.c(str))) {
                createByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!"video/avc".equals(C4128Rj1.o(str))) {
                createByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        if (TD2.a >= 31) {
            C4313Tg1.a(createByName, nd1);
        }
        return createByName;
    }

    @Override // o.SH0
    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean advance;
        interfaceC4421Uj0.t(this.h);
        this.h = 0;
        this.b.c(interfaceC4421Uj0, interfaceC4421Uj0.getLength());
        advance = this.c.advance(this.b);
        return advance;
    }

    @Override // o.SH0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.a.m(interfaceC4518Vj0);
    }

    @Override // o.SH0
    public void c() {
        MediaParser.SeekPoint seekPoint;
        MediaParser mediaParser = this.c;
        seekPoint = MediaParser.SeekPoint.START;
        mediaParser.seek(seekPoint);
    }

    @Override // o.SH0
    public boolean d() {
        String parserName;
        parserName = this.c.getParserName();
        if (!"android.media.mediaparser.FragmentedMp4Parser".equals(parserName) && !"android.media.mediaparser.TsParser".equals(parserName)) {
            return false;
        }
        return true;
    }

    @Override // o.SH0
    public boolean e() {
        String parserName;
        parserName = this.c.getParserName();
        if (!"android.media.mediaparser.Ac3Parser".equals(parserName) && !"android.media.mediaparser.Ac4Parser".equals(parserName) && !"android.media.mediaparser.AdtsParser".equals(parserName) && !"android.media.mediaparser.Mp3Parser".equals(parserName)) {
            return false;
        }
        return true;
    }

    @Override // o.SH0
    public SH0 f() {
        String parserName;
        C9542sf.i(!d());
        C4568Vw1 c4568Vw1 = this.a;
        C10833xx0 c10833xx0 = this.d;
        boolean z = this.e;
        AbstractC5317bO0<MediaFormat> abstractC5317bO0 = this.f;
        ND1 nd1 = this.g;
        parserName = this.c.getParserName();
        return new C4116Rg1(h(c4568Vw1, c10833xx0, z, abstractC5317bO0, nd1, parserName), this.a, this.d, this.e, this.f, 0, this.g);
    }
}
