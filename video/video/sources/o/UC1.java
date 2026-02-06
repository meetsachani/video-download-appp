package o;

import o.P5;
import o.TC1;

/* loaded from: classes.dex */
public final class UC1 {
    public static final TC1 a(long j, P5.j.h hVar, int i, boolean z, P5.j.b bVar) {
        C6562gT0.p(hVar, "mediaType");
        C6562gT0.p(bVar, "defaultTab");
        return new TC1.a().f(hVar).d(i).g(z).c(bVar).b(j).a();
    }

    public static final TC1 b(P5.j.e eVar, long j, P5.j.h hVar, int i, boolean z, P5.j.b bVar) {
        C6562gT0.p(hVar, "mediaType");
        C6562gT0.p(bVar, "defaultTab");
        return new TC1.a().f(hVar).d(i).g(z).c(bVar).b(j).e(eVar).a();
    }

    public static final TC1 c(P5.j.e eVar, P5.j.h hVar, int i, boolean z, P5.j.b bVar) {
        C6562gT0.p(hVar, "mediaType");
        C6562gT0.p(bVar, "defaultTab");
        return new TC1.a().f(hVar).d(i).g(z).c(bVar).e(eVar).a();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ TC1 d(P5.j.h hVar) {
        C6562gT0.p(hVar, "mediaType");
        return new TC1.a().f(hVar).a();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ TC1 e(P5.j.h hVar, int i) {
        C6562gT0.p(hVar, "mediaType");
        return new TC1.a().f(hVar).d(i).a();
    }

    public static final TC1 f(P5.j.h hVar, int i, boolean z, P5.j.b bVar) {
        C6562gT0.p(hVar, "mediaType");
        C6562gT0.p(bVar, "defaultTab");
        return new TC1.a().f(hVar).d(i).g(z).c(bVar).a();
    }

    public static /* synthetic */ TC1 g(long j, P5.j.h hVar, int i, boolean z, P5.j.b bVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            hVar = P5.j.c.a;
        }
        P5.j.h hVar2 = hVar;
        if ((i2 & 4) != 0) {
            i = P5.i.b.a();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            bVar = P5.j.b.C0222b.a;
        }
        return a(j, hVar2, i3, z2, bVar);
    }

    public static /* synthetic */ TC1 h(P5.j.e eVar, long j, P5.j.h hVar, int i, boolean z, P5.j.b bVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            hVar = P5.j.c.a;
        }
        P5.j.h hVar2 = hVar;
        if ((i2 & 8) != 0) {
            i = P5.i.b.a();
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            bVar = P5.j.b.C0222b.a;
        }
        return b(eVar, j, hVar2, i3, z2, bVar);
    }

    public static /* synthetic */ TC1 i(P5.j.e eVar, P5.j.h hVar, int i, boolean z, P5.j.b bVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            hVar = P5.j.c.a;
        }
        if ((i2 & 4) != 0) {
            i = P5.i.b.a();
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            bVar = P5.j.b.C0222b.a;
        }
        return c(eVar, hVar, i, z, bVar);
    }

    public static /* synthetic */ TC1 j(P5.j.h hVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hVar = P5.j.c.a;
        }
        if ((i2 & 2) != 0) {
            i = P5.i.b.a();
        }
        return e(hVar, i);
    }

    public static /* synthetic */ TC1 k(P5.j.h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = P5.j.c.a;
        }
        return d(hVar);
    }

    public static /* synthetic */ TC1 l(P5.j.h hVar, int i, boolean z, P5.j.b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hVar = P5.j.c.a;
        }
        if ((i2 & 2) != 0) {
            i = P5.i.b.a();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            bVar = P5.j.b.C0222b.a;
        }
        return f(hVar, i, z, bVar);
    }
}
