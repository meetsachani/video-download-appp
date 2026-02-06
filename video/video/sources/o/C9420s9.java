package o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.s9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9420s9 extends AbstractC5159al<C8706pE0, C8706pE0> {
    public C9420s9(List<LX0<C8706pE0>> list) {
        super((List) e(list));
    }

    public static LX0<C8706pE0> d(LX0<C8706pE0> lx0) {
        C8706pE0 c8706pE0 = lx0.b;
        C8706pE0 c8706pE02 = lx0.c;
        if (c8706pE0 != null && c8706pE02 != null && c8706pE0.e().length != c8706pE02.e().length) {
            float[] f = f(c8706pE0.e(), c8706pE02.e());
            return lx0.b(c8706pE0.b(f), c8706pE02.b(f));
        }
        return lx0;
    }

    public static List<LX0<C8706pE0>> e(List<LX0<C8706pE0>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, d(list.get(i)));
        }
        return list;
    }

    public static float[] f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // o.H9
    public AbstractC7840ll<C8706pE0, C8706pE0> a() {
        return new C9198rE0(this.a);
    }

    @Override // o.AbstractC5159al, o.H9
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // o.AbstractC5159al, o.H9
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // o.AbstractC5159al
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
