package o;

import android.graphics.Bitmap;
import java.util.HashMap;
import o.WE1;

/* renamed from: o.co  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5656co {
    public final InterfaceC5877di1 a;
    public final InterfaceC4931Zn b;
    public final VV c;
    public RunnableC5414bo d;

    public C5656co(InterfaceC5877di1 interfaceC5877di1, InterfaceC4931Zn interfaceC4931Zn, VV vv) {
        this.a = interfaceC5877di1;
        this.b = interfaceC4931Zn;
        this.c = vv;
    }

    public static int b(WE1 we1) {
        return SD2.h(we1.d(), we1.b(), we1.a());
    }

    public VE1 a(WE1... we1Arr) {
        long e = (this.a.e() - this.a.d()) + this.b.e();
        int i = 0;
        for (WE1 we1 : we1Arr) {
            i += we1.c();
        }
        float f = ((float) e) / i;
        HashMap hashMap = new HashMap();
        for (WE1 we12 : we1Arr) {
            hashMap.put(we12, Integer.valueOf(Math.round(we12.c() * f) / b(we12)));
        }
        return new VE1(hashMap);
    }

    public void c(WE1.a... aVarArr) {
        Bitmap.Config config;
        RunnableC5414bo runnableC5414bo = this.d;
        if (runnableC5414bo != null) {
            runnableC5414bo.b();
        }
        WE1[] we1Arr = new WE1[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            WE1.a aVar = aVarArr[i];
            if (aVar.b() == null) {
                if (this.c == VV.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                aVar.c(config);
            }
            we1Arr[i] = aVar.a();
        }
        RunnableC5414bo runnableC5414bo2 = new RunnableC5414bo(this.b, this.a, a(we1Arr));
        this.d = runnableC5414bo2;
        SD2.z(runnableC5414bo2);
    }
}
