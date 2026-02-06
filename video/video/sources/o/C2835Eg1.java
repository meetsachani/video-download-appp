package o;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC6493gC;

@ES1(30)
@Deprecated
/* renamed from: o.Eg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2835Eg1 implements InterfaceC6493gC {
    public static final String d1 = "MediaPrsrChunkExtractor";
    public static final InterfaceC6493gC.a e1 = new InterfaceC6493gC.a() { // from class: o.Dg1
        @Override // o.InterfaceC6493gC.a
        public final InterfaceC6493gC a(int i, C10833xx0 c10833xx0, boolean z, List list, InterfaceC10568wr2 interfaceC10568wr2, ND1 nd1) {
            return C2835Eg1.b(i, c10833xx0, z, list, interfaceC10568wr2, nd1);
        }
    };
    public final C4568Vw1 X;
    public final C7520kQ0 Y;
    public final b Y0;
    public final MediaParser Z;
    public final W70 Z0;
    public long a1;
    @InterfaceC11300zs1
    public InterfaceC6493gC.b b1;
    @InterfaceC11300zs1
    public C10833xx0[] c1;

    @SuppressLint({"WrongConstant"})
    public C2835Eg1(int i, C10833xx0 c10833xx0, List<C10833xx0> list, ND1 nd1) {
        String str;
        MediaParser createByName;
        C4568Vw1 c4568Vw1 = new C4568Vw1(c10833xx0, i, true);
        this.X = c4568Vw1;
        this.Y = new C7520kQ0();
        if (C4128Rj1.r((String) C9542sf.g(c10833xx0.f1))) {
            str = "android.media.mediaparser.MatroskaParser";
        } else {
            str = "android.media.mediaparser.FragmentedMp4Parser";
        }
        c4568Vw1.p(str);
        createByName = MediaParser.createByName(str, c4568Vw1);
        this.Z = createByName;
        Boolean bool = Boolean.TRUE;
        createByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        createByName.setParameter(C4313Tg1.a, bool);
        createByName.setParameter(C4313Tg1.b, bool);
        createByName.setParameter(C4313Tg1.c, bool);
        createByName.setParameter(C4313Tg1.d, bool);
        createByName.setParameter(C4313Tg1.e, bool);
        createByName.setParameter(C4313Tg1.f, bool);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(C4313Tg1.b(list.get(i2)));
        }
        this.Z.setParameter(C4313Tg1.g, arrayList);
        if (TD2.a >= 31) {
            C4313Tg1.a(this.Z, nd1);
        }
        this.X.n(list);
        this.Y0 = new b();
        this.Z0 = new W70();
        this.a1 = C10323vs.b;
    }

    public static /* synthetic */ InterfaceC6493gC b(int i, C10833xx0 c10833xx0, boolean z, List list, InterfaceC10568wr2 interfaceC10568wr2, ND1 nd1) {
        if (!C4128Rj1.s(c10833xx0.f1)) {
            return new C2835Eg1(i, c10833xx0, list, nd1);
        }
        return null;
    }

    @Override // o.InterfaceC6493gC
    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean advance;
        k();
        this.Y.c(interfaceC4421Uj0, interfaceC4421Uj0.getLength());
        advance = this.Z.advance(this.Y);
        return advance;
    }

    @Override // o.InterfaceC6493gC
    public void c(@InterfaceC11300zs1 InterfaceC6493gC.b bVar, long j, long j2) {
        this.b1 = bVar;
        this.X.o(j2);
        this.X.m(this.Y0);
        this.a1 = j;
    }

    @Override // o.InterfaceC6493gC
    @InterfaceC11300zs1
    public C6979iC d() {
        return this.X.c();
    }

    @Override // o.InterfaceC6493gC
    @InterfaceC11300zs1
    public C10833xx0[] e() {
        return this.c1;
    }

    @Override // o.InterfaceC6493gC
    public void g() {
        this.Z.release();
    }

    public final void k() {
        Pair seekPoints;
        MediaParser.SeekMap d = this.X.d();
        long j = this.a1;
        if (j != C10323vs.b && d != null) {
            MediaParser mediaParser = this.Z;
            seekPoints = d.getSeekPoints(j);
            mediaParser.seek(C3042Gg1.a(seekPoints.first));
            this.a1 = C10323vs.b;
        }
    }

    /* renamed from: o.Eg1$b */
    /* loaded from: classes2.dex */
    public class b implements InterfaceC4518Vj0 {
        public b() {
        }

        @Override // o.InterfaceC4518Vj0
        public InterfaceC10568wr2 b(int i, int i2) {
            if (C2835Eg1.this.b1 == null) {
                return C2835Eg1.this.Z0;
            }
            return C2835Eg1.this.b1.b(i, i2);
        }

        @Override // o.InterfaceC4518Vj0
        public void n() {
            C2835Eg1 c2835Eg1 = C2835Eg1.this;
            c2835Eg1.c1 = c2835Eg1.X.h();
        }

        @Override // o.InterfaceC4518Vj0
        public void p(KZ1 kz1) {
        }
    }
}
