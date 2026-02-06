package o;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.InterfaceC7493kJ1;

@ES1(30)
@Deprecated
/* renamed from: o.Og1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3825Og1 implements InterfaceC7493kJ1 {
    public static final InterfaceC7493kJ1.a e = new InterfaceC7493kJ1.a() { // from class: o.Ng1
        @Override // o.InterfaceC7493kJ1.a
        public final InterfaceC7493kJ1 a(ND1 nd1) {
            return new C3825Og1(nd1);
        }
    };
    public final C4568Vw1 a;
    public final C7520kQ0 b;
    public final MediaParser c;
    public String d;

    @SuppressLint({"WrongConstant"})
    public C3825Og1(ND1 nd1) {
        MediaParser create;
        C4568Vw1 c4568Vw1 = new C4568Vw1();
        this.a = c4568Vw1;
        this.b = new C7520kQ0();
        create = MediaParser.create(c4568Vw1, new String[0]);
        this.c = create;
        Boolean bool = Boolean.TRUE;
        create.setParameter(C4313Tg1.c, bool);
        create.setParameter(C4313Tg1.a, bool);
        create.setParameter(C4313Tg1.b, bool);
        this.d = "android.media.mediaparser.UNKNOWN";
        if (TD2.a >= 31) {
            C4313Tg1.a(create, nd1);
        }
    }

    @Override // o.InterfaceC7493kJ1
    public void a(long j, long j2) {
        long j3;
        Object obj;
        this.b.b(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> i = this.a.i(j2);
        MediaParser mediaParser = this.c;
        j3 = C3042Gg1.a(i.second).position;
        if (j3 == j) {
            obj = i.second;
        } else {
            obj = i.first;
        }
        mediaParser.seek(C3042Gg1.a(obj));
    }

    @Override // o.InterfaceC7493kJ1
    public int b(KE1 ke1) throws IOException {
        boolean advance;
        advance = this.c.advance(this.b);
        long a = this.b.a();
        ke1.a = a;
        if (!advance) {
            return -1;
        }
        if (a != -1) {
            return 1;
        }
        return 0;
    }

    @Override // o.InterfaceC7493kJ1
    public void c() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.d)) {
            this.a.a();
        }
    }

    @Override // o.InterfaceC7493kJ1
    public long d() {
        return this.b.getPosition();
    }

    @Override // o.InterfaceC7493kJ1
    public void e(CU cu, Uri uri, Map<String, List<String>> map, long j, long j2, InterfaceC4518Vj0 interfaceC4518Vj0) throws IOException {
        String parserName;
        String parserName2;
        String parserName3;
        this.a.m(interfaceC4518Vj0);
        this.b.c(cu, j2);
        this.b.b(j);
        parserName = this.c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.c.advance(this.b);
            parserName3 = this.c.getParserName();
            this.d = parserName3;
            this.a.p(parserName3);
        } else if (!parserName.equals(this.d)) {
            parserName2 = this.c.getParserName();
            this.d = parserName2;
            this.a.p(parserName2);
        }
    }

    @Override // o.InterfaceC7493kJ1
    public void g() {
        this.c.release();
    }
}
