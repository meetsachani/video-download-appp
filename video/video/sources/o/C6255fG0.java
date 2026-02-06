package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import java.util.HashMap;
import java.util.Map;
import o.C7025iN1;

/* renamed from: o.fG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6255fG0 {
    public static final String a = "fG0";

    @ES1(api = 30)
    public static void a(@InterfaceC5670cr1 Map<Integer, Integer> map, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC11300zs1 TypedArray typedArray2, @JF int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && BT1.b(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(C9179r91.o(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @InterfaceC5670cr1
    public static void b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C6510gG0 c6510gG0) {
        if (d()) {
            Map<Integer, Integer> c = c(context, c6510gG0);
            int e = c6510gG0.e(0);
            if (BT1.a(context, c) && e != 0) {
                C7851ln2.a(context, e);
            }
        }
    }

    @ES1(api = 30)
    public static Map<Integer, Integer> c(Context context, C6510gG0 c6510gG0) {
        int[] d;
        TypedArray typedArray;
        HashMap hashMap = new HashMap();
        int c = C9179r91.c(context, c6510gG0.b(), a);
        for (int i : c6510gG0.d()) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(C9179r91.o(C10201vM.g(context, i), c)));
        }
        C6012eG0 c2 = c6510gG0.c();
        if (c2 != null) {
            int[] d2 = c2.d();
            if (d2.length > 0) {
                int e = c2.e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d2);
                if (e != 0) {
                    typedArray = new ContextThemeWrapper(context, e).obtainStyledAttributes(d2);
                } else {
                    typedArray = null;
                }
                a(hashMap, obtainStyledAttributes, typedArray, c);
                obtainStyledAttributes.recycle();
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
        return hashMap;
    }

    @TB(api = 30)
    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public static Context e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C6510gG0 c6510gG0) {
        if (d()) {
            Map<Integer, Integer> c = c(context, c6510gG0);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, c6510gG0.e(C7025iN1.n.ThemeOverlay_Material3_HarmonizedColors_Empty));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (BT1.a(contextThemeWrapper, c)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }
}
