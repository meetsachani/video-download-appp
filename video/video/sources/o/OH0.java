package o;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.C4086Qy1;
import o.C6161et;
import o.SZ1;
import o.UH0;

@Deprecated
/* loaded from: classes2.dex */
public final class OH0 extends SZ1<WH0> {
    public OH0(C8322nf1 c8322nf1, C6161et.d dVar) {
        this(c8322nf1, dVar, new D6());
    }

    public final void l(List<Uri> list, List<OU> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(SZ1.f(list.get(i)));
        }
    }

    public final void m(UH0 uh0, UH0.e eVar, HashSet<Uri> hashSet, ArrayList<SZ1.c> arrayList) {
        String str = uh0.a;
        long j = uh0.h + eVar.Z0;
        String str2 = eVar.b1;
        if (str2 != null) {
            Uri f = RC2.f(str, str2);
            if (hashSet.add(f)) {
                arrayList.add(new SZ1.c(j, SZ1.f(f)));
            }
        }
        arrayList.add(new SZ1.c(j, new OU(RC2.f(str, eVar.X), eVar.d1, eVar.e1)));
    }

    @Override // o.SZ1
    /* renamed from: n */
    public List<SZ1.c> h(FU fu, WH0 wh0, boolean z) throws IOException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        if (wh0 instanceof VH0) {
            l(((VH0) wh0).d, arrayList);
        } else {
            arrayList.add(SZ1.f(Uri.parse(wh0.a)));
        }
        ArrayList<SZ1.c> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OU ou = (OU) it.next();
            arrayList2.add(new SZ1.c(0L, ou));
            try {
                UH0 uh0 = (UH0) g(fu, ou, z);
                List<UH0.e> list = uh0.r;
                UH0.e eVar = null;
                for (int i = 0; i < list.size(); i++) {
                    UH0.e eVar2 = list.get(i);
                    UH0.e eVar3 = eVar2.Y;
                    if (eVar3 != null && eVar3 != eVar) {
                        m(uh0, eVar3, hashSet, arrayList2);
                        eVar = eVar3;
                    }
                    m(uh0, eVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }

    public OH0(C8322nf1 c8322nf1, C6161et.d dVar, Executor executor) {
        this(c8322nf1, new XH0(), dVar, executor, 20000L);
    }

    @Deprecated
    public OH0(C8322nf1 c8322nf1, C4086Qy1.a<WH0> aVar, C6161et.d dVar, Executor executor) {
        this(c8322nf1, aVar, dVar, executor, 20000L);
    }

    public OH0(C8322nf1 c8322nf1, C4086Qy1.a<WH0> aVar, C6161et.d dVar, Executor executor, long j) {
        super(c8322nf1, aVar, dVar, executor, j);
    }
}
