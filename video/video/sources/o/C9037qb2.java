package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.C4086Qy1;
import o.C6161et;
import o.C8322nf1;
import o.C9286rb2;
import o.SZ1;

@Deprecated
/* renamed from: o.qb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9037qb2 extends SZ1<C9286rb2> {
    public C9037qb2(C8322nf1 c8322nf1, C6161et.d dVar) {
        this(c8322nf1, dVar, new D6());
    }

    @Override // o.SZ1
    /* renamed from: l */
    public List<SZ1.c> h(FU fu, C9286rb2 c9286rb2, boolean z) {
        C9286rb2.b[] bVarArr;
        ArrayList arrayList = new ArrayList();
        for (C9286rb2.b bVar : c9286rb2.f) {
            for (int i = 0; i < bVar.j.length; i++) {
                for (int i2 = 0; i2 < bVar.k; i2++) {
                    arrayList.add(new SZ1.c(bVar.e(i2), new OU(bVar.a(i, i2))));
                }
            }
        }
        return arrayList;
    }

    public C9037qb2(C8322nf1 c8322nf1, C6161et.d dVar, Executor executor) {
        this(c8322nf1.b().L(TD2.L(((C8322nf1.h) C9542sf.g(c8322nf1.Y)).X)).a(), new C9529sb2(), dVar, executor, 20000L);
    }

    @Deprecated
    public C9037qb2(C8322nf1 c8322nf1, C4086Qy1.a<C9286rb2> aVar, C6161et.d dVar, Executor executor) {
        this(c8322nf1, aVar, dVar, executor, 20000L);
    }

    public C9037qb2(C8322nf1 c8322nf1, C4086Qy1.a<C9286rb2> aVar, C6161et.d dVar, Executor executor, long j) {
        super(c8322nf1, aVar, dVar, executor, j);
    }
}
