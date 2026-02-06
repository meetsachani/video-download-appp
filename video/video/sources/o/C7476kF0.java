package o;

import java.util.ArrayList;
import java.util.List;
import o.AbstractC4609Wh2;

/* renamed from: o.kF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7476kF0 {
    public static List<C4512Vh2> a(int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(h());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(e());
        }
        if (z) {
            arrayList.addAll(i());
        }
        if (z2 && i == 0) {
            arrayList.addAll(c());
        }
        if (i == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public static List<C4512Vh2> b() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar, aVar2));
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.JPEG;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar3, aVar));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar2));
        AbstractC4609Wh2.a aVar3 = AbstractC4609Wh2.a.RECORD;
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar3));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar3));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar2, aVar3));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar3));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar3, aVar3));
        arrayList.add(c4512Vh28);
        return arrayList;
    }

    public static List<C4512Vh2> c() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar2));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh23);
        return arrayList;
    }

    public static List<C4512Vh2> d() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.YUV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.s1440p;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.PRIV;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.JPEG;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar3, aVar));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.s720p;
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar3, aVar));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh28);
        C4512Vh2 c4512Vh29 = new C4512Vh2();
        c4512Vh29.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh29.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh29);
        return arrayList;
    }

    public static List<C4512Vh2> e() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar2));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh24.a(AbstractC4609Wh2.a(AbstractC4609Wh2.b.JPEG, aVar2));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        AbstractC4609Wh2.a aVar3 = AbstractC4609Wh2.a.VGA;
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar3));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar3));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh26);
        return arrayList;
    }

    public static List<C4512Vh2> f() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.JPEG;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.YUV;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar3, aVar));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar2));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar3, aVar2));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar2, aVar));
        arrayList.add(c4512Vh28);
        return arrayList;
    }

    public static List<C4512Vh2> g() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.VGA;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar2));
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        AbstractC4609Wh2.a aVar3 = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar2, aVar3));
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.RAW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar3, aVar3));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar2));
        c4512Vh22.a(AbstractC4609Wh2.a(AbstractC4609Wh2.b.JPEG, aVar3));
        c4512Vh22.a(AbstractC4609Wh2.a(bVar3, aVar3));
        arrayList.add(c4512Vh22);
        return arrayList;
    }

    public static List<C4512Vh2> h() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.RECORD;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar2));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar2));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar2));
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.JPEG;
        c4512Vh24.a(AbstractC4609Wh2.a(bVar3, aVar2));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar2));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar3, AbstractC4609Wh2.a.MAXIMUM));
        arrayList.add(c4512Vh26);
        return arrayList;
    }

    public static List<C4512Vh2> i() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.RAW;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh22.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.YUV;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        c4512Vh27.a(AbstractC4609Wh2.a(bVar2, aVar2));
        AbstractC4609Wh2.b bVar4 = AbstractC4609Wh2.b.JPEG;
        c4512Vh27.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.a(bVar3, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar));
        arrayList.add(c4512Vh28);
        return arrayList;
    }

    public static List<C4512Vh2> j() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.s1440p;
        c4512Vh2.a(AbstractC4609Wh2.b(bVar, aVar, 4L));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.YUV;
        c4512Vh22.a(AbstractC4609Wh2.b(bVar2, aVar, 4L));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.RECORD;
        c4512Vh23.a(AbstractC4609Wh2.b(bVar, aVar2, 3L));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.b(bVar2, aVar2, 3L));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.JPEG;
        AbstractC4609Wh2.a aVar3 = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh25.a(AbstractC4609Wh2.b(bVar3, aVar3, 2L));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.b(bVar2, aVar3, 2L));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        AbstractC4609Wh2.a aVar4 = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh27.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh27.a(AbstractC4609Wh2.b(bVar3, aVar3, 2L));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh28.a(AbstractC4609Wh2.b(bVar2, aVar3, 2L));
        arrayList.add(c4512Vh28);
        C4512Vh2 c4512Vh29 = new C4512Vh2();
        c4512Vh29.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh29.a(AbstractC4609Wh2.b(bVar, aVar2, 3L));
        arrayList.add(c4512Vh29);
        C4512Vh2 c4512Vh210 = new C4512Vh2();
        c4512Vh210.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh210.a(AbstractC4609Wh2.b(bVar2, aVar2, 3L));
        arrayList.add(c4512Vh210);
        C4512Vh2 c4512Vh211 = new C4512Vh2();
        c4512Vh211.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh211.a(AbstractC4609Wh2.b(bVar2, aVar4, 1L));
        arrayList.add(c4512Vh211);
        C4512Vh2 c4512Vh212 = new C4512Vh2();
        c4512Vh212.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh212.a(AbstractC4609Wh2.b(bVar, aVar2, 3L));
        c4512Vh212.a(AbstractC4609Wh2.b(bVar3, aVar2, 2L));
        arrayList.add(c4512Vh212);
        C4512Vh2 c4512Vh213 = new C4512Vh2();
        c4512Vh213.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh213.a(AbstractC4609Wh2.b(bVar2, aVar2, 3L));
        c4512Vh213.a(AbstractC4609Wh2.b(bVar3, aVar2, 2L));
        arrayList.add(c4512Vh213);
        C4512Vh2 c4512Vh214 = new C4512Vh2();
        c4512Vh214.a(AbstractC4609Wh2.b(bVar, aVar4, 1L));
        c4512Vh214.a(AbstractC4609Wh2.b(bVar2, aVar4, 1L));
        c4512Vh214.a(AbstractC4609Wh2.b(bVar3, aVar3, 2L));
        arrayList.add(c4512Vh214);
        return arrayList;
    }

    public static List<C4512Vh2> k() {
        ArrayList arrayList = new ArrayList();
        C4512Vh2 c4512Vh2 = new C4512Vh2();
        AbstractC4609Wh2.b bVar = AbstractC4609Wh2.b.YUV;
        AbstractC4609Wh2.a aVar = AbstractC4609Wh2.a.ULTRA_MAXIMUM;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar, aVar));
        AbstractC4609Wh2.b bVar2 = AbstractC4609Wh2.b.PRIV;
        AbstractC4609Wh2.a aVar2 = AbstractC4609Wh2.a.PREVIEW;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar2, aVar2));
        AbstractC4609Wh2.a aVar3 = AbstractC4609Wh2.a.RECORD;
        c4512Vh2.a(AbstractC4609Wh2.a(bVar2, aVar3));
        arrayList.add(c4512Vh2);
        C4512Vh2 c4512Vh22 = new C4512Vh2();
        AbstractC4609Wh2.b bVar3 = AbstractC4609Wh2.b.JPEG;
        c4512Vh22.a(AbstractC4609Wh2.a(bVar3, aVar));
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh22.a(AbstractC4609Wh2.a(bVar2, aVar3));
        arrayList.add(c4512Vh22);
        C4512Vh2 c4512Vh23 = new C4512Vh2();
        AbstractC4609Wh2.b bVar4 = AbstractC4609Wh2.b.RAW;
        c4512Vh23.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh23.a(AbstractC4609Wh2.a(bVar2, aVar3));
        arrayList.add(c4512Vh23);
        C4512Vh2 c4512Vh24 = new C4512Vh2();
        c4512Vh24.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh24.a(AbstractC4609Wh2.a(bVar2, aVar2));
        AbstractC4609Wh2.a aVar4 = AbstractC4609Wh2.a.MAXIMUM;
        c4512Vh24.a(AbstractC4609Wh2.a(bVar3, aVar4));
        arrayList.add(c4512Vh24);
        C4512Vh2 c4512Vh25 = new C4512Vh2();
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh25.a(AbstractC4609Wh2.a(bVar3, aVar4));
        arrayList.add(c4512Vh25);
        C4512Vh2 c4512Vh26 = new C4512Vh2();
        c4512Vh26.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh26.a(AbstractC4609Wh2.a(bVar3, aVar4));
        arrayList.add(c4512Vh26);
        C4512Vh2 c4512Vh27 = new C4512Vh2();
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh27.a(AbstractC4609Wh2.a(bVar, aVar4));
        arrayList.add(c4512Vh27);
        C4512Vh2 c4512Vh28 = new C4512Vh2();
        c4512Vh28.a(AbstractC4609Wh2.a(bVar3, aVar));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh28.a(AbstractC4609Wh2.a(bVar, aVar4));
        arrayList.add(c4512Vh28);
        C4512Vh2 c4512Vh29 = new C4512Vh2();
        c4512Vh29.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh29.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh29.a(AbstractC4609Wh2.a(bVar, aVar4));
        arrayList.add(c4512Vh29);
        C4512Vh2 c4512Vh210 = new C4512Vh2();
        c4512Vh210.a(AbstractC4609Wh2.a(bVar, aVar));
        c4512Vh210.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh210.a(AbstractC4609Wh2.a(bVar4, aVar4));
        arrayList.add(c4512Vh210);
        C4512Vh2 c4512Vh211 = new C4512Vh2();
        c4512Vh211.a(AbstractC4609Wh2.a(bVar3, aVar));
        c4512Vh211.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh211.a(AbstractC4609Wh2.a(bVar4, aVar4));
        arrayList.add(c4512Vh211);
        C4512Vh2 c4512Vh212 = new C4512Vh2();
        c4512Vh212.a(AbstractC4609Wh2.a(bVar4, aVar));
        c4512Vh212.a(AbstractC4609Wh2.a(bVar2, aVar2));
        c4512Vh212.a(AbstractC4609Wh2.a(bVar4, aVar4));
        arrayList.add(c4512Vh212);
        return arrayList;
    }
}
